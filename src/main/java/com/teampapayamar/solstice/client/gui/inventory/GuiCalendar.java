package com.teampapayamar.solstice.client.gui.inventory;

import com.teampapayamar.solstice.inventory.ContainerCalendar;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import com.teampapayamar.solstice.util.TimeHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiCalendar extends GuiContainer
{
    private TileEntityCalendar tileEntityCalendar;

    public GuiCalendar(TileEntityCalendar tileEntityCalendar)
    {
        super(new ContainerCalendar(tileEntityCalendar));
        this.tileEntityCalendar = tileEntityCalendar;
        xSize = 239;
        ySize = 250;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        fontRendererObj.drawString(StatCollector.translateToLocal(TimeHelper.getMonthName(tileEntityCalendar.getWorldObj().getWorldTime())), 28, 68, 4210752);

        fontRendererObj.drawString("1", 30, 80, Integer.parseInt("ffffff", 16));
        fontRendererObj.drawString("2", 71, 80, Integer.parseInt("ffffff", 16));
        fontRendererObj.drawString("3", 95, 80, Integer.parseInt("ffffff", 16));
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
