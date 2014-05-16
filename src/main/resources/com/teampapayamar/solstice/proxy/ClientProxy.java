package com.teampapayamar.solstice.proxy;

import com.teampapayamar.solstice.client.handler.RenderTickEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new RenderTickEventHandler());
    }
}
