package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class PlayerInteractEventHandler
{
    @SubscribeEvent
    public void onPlayerInteractEvent(PlayerInteractEvent event)
    {
        LogHelper.info(event.useItem);
    }
}
