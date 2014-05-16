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

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "1.0")
public class Solstice
{
    @Mod.Instance("Solstice")
    public static Solstice instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();

        ModBlocks.init();

        PacketHandler.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerEventHandlers();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
