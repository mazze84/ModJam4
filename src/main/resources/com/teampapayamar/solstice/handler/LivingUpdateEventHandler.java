package com.teampapayamar.solstice.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingUpdateEventHandler
{
    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
    {
//        if (event.entityLiving instanceof EntityPlayer && !event.entityLiving.worldObj.isRemote && ((EntityPlayer) event.entityLiving).worldObj.getWorldTime() % 20 == 0)
//        {
//            EntityPlayer entityPlayer = (EntityPlayer) event.entityLiving;
//
//            World world = entityPlayer.getEntityWorld();
//
//            LogHelper.info(TimeHelper.getSeasonName(world.getWorldTime()));
//
//            if (TimeHelper.getSeason(world.getWorldTime()) == 1)
//            {
//                // This is where we would potentially damage something based on the entity's temperature
//            }
//        }
    }
}
