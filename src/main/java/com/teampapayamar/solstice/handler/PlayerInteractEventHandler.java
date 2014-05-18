package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.init.ModBlocks;
import com.teampapayamar.solstice.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.oredict.OreDictionary;

public class PlayerInteractEventHandler
{
    @SubscribeEvent
    public void onPlayerInteractEvent(PlayerInteractEvent event)
    {
        if (!event.entityPlayer.getEntityWorld().isRemote)
        {
            if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK)
            {
                int oreId = OreDictionary.getOreID(event.entityPlayer.getCurrentEquippedItem());

                if ((oreId != -1) && OreDictionary.getOreName(oreId).equals("stickWood") && event.entityPlayer.getCurrentEquippedItem().stackSize >= 6)
                {
                    event.entityPlayer.getCurrentEquippedItem().stackSize = event.entityPlayer.getCurrentEquippedItem().stackSize - 6;
                    event.entityPlayer.getEntityWorld().setBlock(event.x, event.y + 1, event.z, ModBlocks.campFire);
                }
            }
        }
    }
}
