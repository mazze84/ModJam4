package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.util.LogHelper;
import com.teampapayamar.solstice.util.TimeHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingUpdateEventHandler
{
    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
    {
        if (event.entityLiving instanceof EntityPlayer && ((EntityPlayer) event.entityLiving).worldObj.getWorldTime() % 20 == 0)
        {
            EntityPlayer entityPlayer = (EntityPlayer) event.entityLiving;

            World world = entityPlayer.getEntityWorld();

            LogHelper.info(TimeHelper.getSeasonName(world.getWorldTime()));
        }
    }
}
