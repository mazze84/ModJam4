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

            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glPushMatrix();
            renderTileEntityForOrientation(x, y, z, orientation);
            GL11.glRotatef(180f, 0f, 0f, 1f);
            modelCalendar.renderAll();
            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_CULL_FACE);
        }
    }

    private void renderTileEntityForOrientation(double x, double y, double z, ForgeDirection forgeDirection)
    {
        if (forgeDirection == ForgeDirection.SOUTH)
        {
            GL11.glTranslated(x + 0.5d, y + 1.35d, z + 0.51d);
            GL11.glRotatef(180f, 0f, 1f, 0f);
        }
        else if (forgeDirection == ForgeDirection.NORTH)
        {
            GL11.glTranslated(x + 0.5d, y + 1.35d, z + 0.49d);
            GL11.glRotatef(0f, 0f, 1f, 0f);
        }
        else if (forgeDirection == ForgeDirection.EAST)
        {
            GL11.glTranslated(x + 0.51d, y + 1.35d, z + 0.5d);
            GL11.glRotatef(270f, 0f, 1f, 0f);
        }
        else if (forgeDirection == ForgeDirection.WEST)
        {
            GL11.glTranslated(x + 0.49d, y + 1.35d, z + 0.5d);
            GL11.glRotatef(90f, 0f, 1f, 0f);
        }
    }
}
