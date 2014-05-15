package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.item.ItemArmorSolstice;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;

public class ModItems
{
    public static final ItemArmor woolLinedIron = new ItemArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1);

    public static void init()
    {
        woolLinedIron.setTextureName("wooliron_layer1").setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);

        GameRegistry.registerItem(woolLinedIron, "item.wooliron");
    }
}
