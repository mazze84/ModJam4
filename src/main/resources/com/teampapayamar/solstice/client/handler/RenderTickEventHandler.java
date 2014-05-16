package com.teampapayamar.solstice.client.handler;

import com.teampapayamar.solstice.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTickEventHandler
{
    @SubscribeEvent
    public void onRenderTickEvent(TickEvent.RenderTickEvent event)
    {

    }
}
