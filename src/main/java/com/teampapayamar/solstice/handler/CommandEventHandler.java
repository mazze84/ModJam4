package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.command.CommandTime;
import net.minecraftforge.event.CommandEvent;

public class CommandEventHandler
{
    @SubscribeEvent
    public void onCommandEvent(CommandEvent event)
    {
        if (event.command instanceof CommandTime)
        {
            LogHelper.info(event.command);
        }
    }
}
