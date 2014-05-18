package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.block.BlockCalendar;
import com.teampapayamar.solstice.block.BlockCampFire;
import com.teampapayamar.solstice.block.BlockSolstice;
import com.teampapayamar.solstice.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockSolstice calendar = new BlockCalendar();
    public static final BlockSolstice campFire = new BlockCampFire();

    public static void init()
    {
        GameRegistry.registerBlock(calendar, "tile." + Names.Block.CALENDAR);
        GameRegistry.registerBlock(campFire, "tile." + Names.Block.CAMP_FIRE);
    }
}
