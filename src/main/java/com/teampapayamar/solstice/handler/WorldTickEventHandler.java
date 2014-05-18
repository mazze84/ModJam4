package com.teampapayamar.solstice.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class WorldTickEventHandler
{
    @SubscribeEvent
    public void onWorldTickEvent(TickEvent.WorldTickEvent event)
    {
//        if (event.world.getWorldTime() % 20 == 0)
//        {
//            LogHelper.info(TimeHelper.convertTicksToTimeString(event.world.getWorldTime()));
//        }
    }
}
