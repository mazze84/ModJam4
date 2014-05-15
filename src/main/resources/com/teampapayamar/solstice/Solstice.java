package com.teampapayamar.solstice;

import com.teampapayamar.solstice.configuration.ConfigurationHandler;
import com.teampapayamar.solstice.init.ModBlocks;
import com.teampapayamar.solstice.init.ModItems;
import com.teampapayamar.solstice.network.PacketHandler;
import com.teampapayamar.solstice.proxy.IProxy;
import com.teampapayamar.solstice.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME)
public class Solstice
{
    @Mod.Instance("Solstice")
    public static Solstice instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.MOD_ID);

        // Initialize the items
        ModItems.init();

        // Initialize the blocks
        ModBlocks.init();

        // Initialize the packet handler
        PacketHandler.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
