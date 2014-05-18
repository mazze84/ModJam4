package com.teampapayamar.solstice.client.renderer.tileentity;

import com.teampapayamar.solstice.client.renderer.model.ModelCalendar;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

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

            this.bindTexture(Textures.MODEL_CALENDAR);

            GL11.glPushMatrix();
                GL11.glTranslated(x + 0.49d, y + 1.35d, z + 0.5d);
                GL11.glRotatef(180f, 0f, 1f, 0f);
                GL11.glRotatef(180f, 0f, 0f, 1f);
                modelCalendar.renderAll();
            GL11.glPopMatrix();
        }
    }

//    private void renderCalendarByOrientation(double x, double y, double z, ForgeDirection orientation)
//    {
//        switch (orientation)
//        {
//            case SOUTH:
//            {
//
//            }
//            case NORTH:
//            {
//
//            }
//            case EAST:
//            {
//
//            }
//            case WEST:
//            {
//
//            }
//            default:
//            {
//
//            }
//        }
//    }
}
