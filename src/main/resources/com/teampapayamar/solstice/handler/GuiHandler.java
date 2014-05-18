package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.client.gui.inventory.GuiCalendar;
import com.teampapayamar.solstice.inventory.ContainerCalendar;
import com.teampapayamar.solstice.reference.GuiIds;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == GuiIds.CALENDAR)
        {
            TileEntityCalendar tileEntityCalendar = (TileEntityCalendar) world.getTileEntity(x, y, z);
            return new ContainerCalendar(tileEntityCalendar);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == GuiIds.CALENDAR)
        {
            TileEntityCalendar tileEntityCalendar = (TileEntityCalendar) world.getTileEntity(x, y, z);
            return new GuiCalendar(tileEntityCalendar);
        }

        return null;
    }
}
