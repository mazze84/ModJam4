package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.block.BlockCalendar;
import com.teampapayamar.solstice.block.BlockCampFire;
import com.teampapayamar.solstice.block.BlockSeasonalFlower;
import com.teampapayamar.solstice.block.BlockSolstice;
import com.teampapayamar.solstice.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockSolstice calendar = new BlockCalendar();
    public static final BlockSolstice campFire = new BlockCampFire();
    
    public static final BlockSeasonalFlower rose = new BlockSeasonalFlower(Names.Block.ROSE);
    public static final BlockSeasonalFlower blue_orchid = new BlockSeasonalFlower(Names.Block.BLUE_ORCHID);
    public static final BlockSeasonalFlower allium = new BlockSeasonalFlower(Names.Block.ALLIUM);
    public static final BlockSeasonalFlower houstonia = new BlockSeasonalFlower(Names.Block.HOUSTONIA);
    public static final BlockSeasonalFlower tulip_red = new BlockSeasonalFlower(Names.Block.TULIP_RED);
    public static final BlockSeasonalFlower tulip_orange = new BlockSeasonalFlower(Names.Block.TULIP_ORANGE);
    public static final BlockSeasonalFlower tulip_white = new BlockSeasonalFlower(Names.Block.TULIP_WHITE);
    public static final BlockSeasonalFlower tulip_pink = new BlockSeasonalFlower(Names.Block.TULIP_PINK);
    public static final BlockSeasonalFlower oxeye_daisy = new BlockSeasonalFlower(Names.Block.OXEYE_DAISY);
    

    public static void init()
    {
        GameRegistry.registerBlock(calendar, "tile." + Names.Block.CALENDAR);
        GameRegistry.registerBlock(campFire, "tile." + Names.Block.CAMP_FIRE);
        
        GameRegistry.registerBlock(rose, "tile." + Names.Block.ROSE);
        GameRegistry.registerBlock(blue_orchid, "tile." + Names.Block.BLUE_ORCHID);
        GameRegistry.registerBlock(allium, "tile." + Names.Block.ALLIUM);
        GameRegistry.registerBlock(houstonia, "tile." + Names.Block.HOUSTONIA);
        GameRegistry.registerBlock(tulip_red, "tile." + Names.Block.TULIP_RED);
        GameRegistry.registerBlock(tulip_orange, "tile." + Names.Block.TULIP_ORANGE);
        GameRegistry.registerBlock(tulip_white, "tile." + Names.Block.TULIP_WHITE);
        GameRegistry.registerBlock(tulip_pink, "tile." + Names.Block.TULIP_PINK);
        GameRegistry.registerBlock(oxeye_daisy, "tile." + Names.Block.OXEYE_DAISY);
    }
}
