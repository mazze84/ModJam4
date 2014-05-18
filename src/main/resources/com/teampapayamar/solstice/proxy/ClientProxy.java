package com.teampapayamar.solstice.proxy;

import com.teampapayamar.solstice.client.handler.RenderTickEventHandler;
import com.teampapayamar.solstice.client.renderer.tileentity.TileEntityCalendarRenderer;
import com.teampapayamar.solstice.client.renderer.tileentity.TileEntityCampFireRenderer;
import com.teampapayamar.solstice.reference.RenderIds;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import com.teampapayamar.solstice.tileentity.TileEntityCampFire;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initRenderingAndTextures()
    {
        RenderIds.calendar = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.campFire = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCalendar.class, new TileEntityCalendarRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCampFire.class, new TileEntityCampFireRenderer());
    }

    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new RenderTickEventHandler());
    }
}
