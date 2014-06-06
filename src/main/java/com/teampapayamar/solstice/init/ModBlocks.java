package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.block.BlockCalendar;
import com.teampapayamar.solstice.block.BlockCampFire;
import com.teampapayamar.solstice.block.BlockSeasonalDoublePlantSeasonal;
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
    
    public static final BlockSeasonalDoublePlantSeasonal rose_bush = new BlockSeasonalDoublePlantSeasonal(Names.Block.ROSE_BUSH);
    public static final BlockSeasonalDoublePlantSeasonal sunflower = new BlockSeasonalDoublePlantSeasonal(Names.Block.SUNFLOWER);
    public static final BlockSeasonalDoublePlantSeasonal syringa = new BlockSeasonalDoublePlantSeasonal(Names.Block.SYRINGA);
    public static final BlockSeasonalDoublePlantSeasonal grass = new BlockSeasonalDoublePlantSeasonal(Names.Block.GRASS);
    public static final BlockSeasonalDoublePlantSeasonal fern = new BlockSeasonalDoublePlantSeasonal(Names.Block.FERN);
    public static final BlockSeasonalDoublePlantSeasonal paeonia = new BlockSeasonalDoublePlantSeasonal(Names.Block.PAEONIA);
    
    
  
    

    public static void init()
    {
        GameRegistry.registerBlock(calendar, "tile." + Names.Block.CALENDAR);
        GameRegistry.registerBlock(campFire, "tile." + Names.Block.CAMP_FIRE);
        
        GameRegistry.registerBlock(rose, "block." + Names.Block.ROSE);
        GameRegistry.registerBlock(blue_orchid, "block." + Names.Block.BLUE_ORCHID);
        GameRegistry.registerBlock(allium, "block." + Names.Block.ALLIUM);
        GameRegistry.registerBlock(houstonia, "block." + Names.Block.HOUSTONIA);
        GameRegistry.registerBlock(tulip_red, "block." + Names.Block.TULIP_RED);
        GameRegistry.registerBlock(tulip_orange, "block." + Names.Block.TULIP_ORANGE);
        GameRegistry.registerBlock(tulip_white, "block." + Names.Block.TULIP_WHITE);
        GameRegistry.registerBlock(tulip_pink, "block." + Names.Block.TULIP_PINK);
        GameRegistry.registerBlock(oxeye_daisy, "block." + Names.Block.OXEYE_DAISY);
        
        GameRegistry.registerBlock(rose_bush, "block." + Names.Block.ROSE_BUSH);
        GameRegistry.registerBlock(sunflower, "block." + Names.Block.SUNFLOWER);
        GameRegistry.registerBlock(syringa, "block." + Names.Block.SYRINGA);
        GameRegistry.registerBlock(grass, "block." + Names.Block.GRASS);
        GameRegistry.registerBlock(fern, "block." + Names.Block.FERN);
        GameRegistry.registerBlock(paeonia, "block." + Names.Block.PAEONIA);
        
    }
}
