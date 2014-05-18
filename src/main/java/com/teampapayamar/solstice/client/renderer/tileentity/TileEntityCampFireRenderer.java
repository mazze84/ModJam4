package com.teampapayamar.solstice.client.renderer.tileentity;

import com.teampapayamar.solstice.client.renderer.model.ModelCampFire;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import com.teampapayamar.solstice.tileentity.TileEntityCampFire;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class TileEntityCampFireRenderer extends TileEntitySpecialRenderer
{
    private final ModelCampFire modelCampFire = new ModelCampFire();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float renderTick)
    {
        if (tileEntity instanceof TileEntityCampFire)
        {
            TileEntityCampFire tileEntityCampFire = (TileEntityCampFire) tileEntity;

            ForgeDirection orientation = null;

            if (tileEntityCampFire.getWorldObj() != null)
            {
                orientation = tileEntityCampFire.getOrientation();
            }

            this.bindTexture(Textures.MODEL_CAMPFIRE);

            float angle = 0f;

            if (orientation != null)
            {
                if (orientation == ForgeDirection.SOUTH)
                {
                    angle = 180f;
                }
                else if (orientation == ForgeDirection.NORTH)
                {
                    angle = 0f;
                }
                else if (orientation == ForgeDirection.EAST)
                {
                    angle = 270f;
                }
                else if (orientation == ForgeDirection.WEST)
                {
                    angle = 90f;
                }
            }

            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glPushMatrix();
            GL11.glTranslated(x + 0.5f, y + 1.5f, z + 0.5f);
//            GL11.glScalef(0.04f, 0.04f, 0.04f);
            GL11.glRotatef(angle, 0f, 1f, 0f);
            GL11.glRotatef(180f, 0f, 0f, 1f);
            modelCampFire.renderAll();
            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_CULL_FACE);
        }
    }
}
