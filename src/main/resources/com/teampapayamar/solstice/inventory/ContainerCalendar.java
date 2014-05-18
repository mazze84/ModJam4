package com.teampapayamar.solstice.inventory;

import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerCalendar extends Container
{
    public ContainerCalendar(TileEntityCalendar tileEntityCalendar)
    {

    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer)
    {
        return true;
    }
}
