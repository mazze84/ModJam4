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
        if (event.command instanceof CommandTime && event.parameters.length >= 2)
        {
            LogHelper.info(event.command);
            LogHelper.info(event.sender);

            for (String parameter : event.parameters)
            {
                LogHelper.info(parameter);
            }

            if (event.parameters[0].equalsIgnoreCase("set"))
            {
                if (event.parameters[1].equalsIgnoreCase("day"))
                {

                }
                else if (event.parameters[1].equalsIgnoreCase("night"))
                {

                }
            }
        }
    }
}
