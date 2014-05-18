package com.teampapayamar.solstice.proxy;

import com.teampapayamar.solstice.handler.CommandEventHandler;
import com.teampapayamar.solstice.handler.LivingUpdateEventHandler;
import com.teampapayamar.solstice.handler.PlayerInteractEventHandler;
import com.teampapayamar.solstice.handler.WorldTickEventHandler;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import com.teampapayamar.solstice.tileentity.TileEntityCampFire;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy
{
    @Override
    public void registerEventHandlers()
    {
        FMLCommonHandler.instance().bus().register(new WorldTickEventHandler());
        MinecraftForge.EVENT_BUS.register(new LivingUpdateEventHandler());
        MinecraftForge.EVENT_BUS.register(new CommandEventHandler());
        MinecraftForge.EVENT_BUS.register(new PlayerInteractEventHandler());
    }

    @Override
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityCalendar.class, "tile." + Names.Block.CALENDAR);
        GameRegistry.registerTileEntity(TileEntityCampFire.class, "tile." + Names.Block.CAMP_FIRE);
    }
}
