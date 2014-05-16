package com.teampapayamar.solstice.proxy;

import com.teampapayamar.solstice.handler.WorldTickEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy implements IProxy
{
    @Override
    public void registerEventHandlers()
    {
        FMLCommonHandler.instance().bus().register(new WorldTickEventHandler());
    }
}
