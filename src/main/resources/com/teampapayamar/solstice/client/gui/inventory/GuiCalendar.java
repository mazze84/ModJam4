package com.teampapayamar.solstice.client.gui.inventory;

import com.teampapayamar.solstice.inventory.ContainerCalendar;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiCalendar extends GuiContainer
{
    private TileEntityCalendar tileEntityCalendar;

    public GuiCalendar(TileEntityCalendar tileEntityCalendar)
    {
        super(new ContainerCalendar(tileEntityCalendar));
        this.tileEntityCalendar = tileEntityCalendar;
        xSize = 256;
        ySize = 256;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        this.mc.getTextureManager().bindTexture(Textures.GUI_CALENDAR);
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
}
