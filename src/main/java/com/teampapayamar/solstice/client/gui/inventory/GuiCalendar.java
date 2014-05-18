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
        long worldTime = tileEntityCalendar.getWorldObj().getWorldTime();
        String monthName = StatCollector.translateToLocal(TimeHelper.getMonthName(worldTime));
        int dayOfMonth = TimeHelper.getDayOfMonth(worldTime) + 1;

        // Draw Month name
        fontRendererObj.drawString(TimeHelper.getYear(worldTime) + " AC", 28, 38, 4210752);
        fontRendererObj.drawString(monthName, 28, 66, 4210752);

        int day = 0;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                day++;

                // Draw Day labels
                fontRendererObj.drawString("" + day, 31 + (j * 27), 80 + (i * 26), Integer.parseInt("ffffff", 16));

                // Draw X's over day's that have passed
                if (day < dayOfMonth)
                {
                    GL11.glColor4f(1f, 1f, 1f, 1f);
                    this.mc.getTextureManager().bindTexture(Textures.GUI_CALENDAR);
                    this.drawTexturedModalRect(32 + (j * 27), 81 + (i * 26), 240, 7, 15, 18);
                }
                else if (day == dayOfMonth)
                {
                    GL11.glColor4f(1f, 1f, 1f, 1f);
                    this.mc.getTextureManager().bindTexture(Textures.GUI_CALENDAR_HIGHLIGHT);
                    this.drawTexturedModalRect(23 + (j * 27), 74 + (i * 26), 0, 0, 32, 32);
                }
            }
        }
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
