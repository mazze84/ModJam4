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
        // Draw Month name
        fontRendererObj.drawString(StatCollector.translateToLocal(TimeHelper.getMonthName(tileEntityCalendar.getWorldObj().getWorldTime())), 28, 68, 4210752);

        // Draw Day labels
        int day = 0;
        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 7; i++)
            {
                day++;
                fontRendererObj.drawString("" + day, 31 + (i * 27), 80 + (j * 26), Integer.parseInt("ffffff", 16));
            }
        }

        // Draw X's over day's that have passed
        GL11.glColor4f(1f, 1f, 1f, 1f);
        this.mc.getTextureManager().bindTexture(Textures.GUI_CALENDAR);
        this.drawTexturedModalRect(32, 81, 240, 7, 15, 18);
        this.drawTexturedModalRect(59, 81, 240, 7, 15, 18);
        this.drawTexturedModalRect(59 + 27, 81, 240, 7, 15, 18);
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
