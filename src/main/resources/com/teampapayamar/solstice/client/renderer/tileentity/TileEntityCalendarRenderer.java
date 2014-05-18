package com.teampapayamar.solstice.client.renderer.tileentity;

import com.teampapayamar.solstice.client.renderer.model.ModelCalendar;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

@SideOnly(Side.CLIENT)
public class TileEntityCalendarRenderer extends TileEntitySpecialRenderer
{
    private final ModelCalendar modelCalendar = new ModelCalendar();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float renderTick)
    {
        if (tileEntity instanceof TileEntityCalendar)
        {
            TileEntityCalendar tileEntityCalendar = (TileEntityCalendar) tileEntity;

            ForgeDirection orientation = null;

            if (tileEntityCalendar.getWorldObj() != null)
            {
                orientation = tileEntityCalendar.getOrientation();
            }
        }
    }
}
