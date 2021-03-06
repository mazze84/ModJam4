package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.util.LogHelper;
import com.teampapayamar.solstice.util.TimeHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandTime;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
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
                long worldTime = event.sender.getEntityWorld().getWorldTime();
                long newTime = ((worldTime / TimeHelper.TICKS_IN_DAY) * TimeHelper.TICKS_IN_DAY);
                event.parameters[0] = "add";

                if (event.parameters[1].equalsIgnoreCase("day"))
                {
                    if (worldTime % TimeHelper.TICKS_IN_DAY < 1000)
                    {
                        newTime = 1000 - (worldTime % TimeHelper.TICKS_IN_DAY);
                    }
                    else if (worldTime % TimeHelper.TICKS_IN_DAY > 1000)
                    {
                        newTime = (newTime + TimeHelper.TICKS_IN_DAY + 1000) - worldTime;
                    }
                }
                else if (event.parameters[1].equalsIgnoreCase("night"))
                {
                    if (worldTime % TimeHelper.TICKS_IN_DAY < 13000)
                    {
                        newTime = 13000 - (worldTime % TimeHelper.TICKS_IN_DAY);
                    }
                    else if (worldTime % TimeHelper.TICKS_IN_DAY > 13000)
                    {
                        newTime = (newTime + TimeHelper.TICKS_IN_DAY + 13000) - worldTime;
                    }
                }
                else
                {
                    int param = CommandBase.parseInt(event.sender, event.parameters[1]);

                    if (param < worldTime)
                    {
                        event.setCanceled(true);
                        event.sender.addChatMessage(new ChatComponentText("(Solstice) I'm sorry but you can't go back in time! Try '/time set [day|night]' or '/time add #'").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.GRAY)));
                    }
                }
                event.parameters[1] = "" + newTime;
            }
        }
    }
}
