package com.teampapayamar.solstice.proxy;

import com.teampapayamar.solstice.handler.LivingUpdateEventHandler;
import com.teampapayamar.solstice.handler.WorldTickEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy implements IProxy
{
    @Override
    public void registerEventHandlers()
    {
        FMLCommonHandler.instance().bus().register(new WorldTickEventHandler());
        MinecraftForge.EVENT_BUS.register(new LivingUpdateEventHandler());
    }
}
