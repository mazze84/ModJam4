package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.item.ItemArmorSolstice;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;

public class ModItems
{

    public static final ItemArmorSolstice woolLinedIronHelmet = new ItemArmorSolstice(ItemArmor.ArmorMaterial.IRON, 0, 0);
    public static final ItemArmorSolstice woolLinedIronChestPlate = new ItemArmorSolstice(ItemArmor.ArmorMaterial.IRON, 0, 1);
    public static final ItemArmorSolstice woolLinedIronLeggings = new ItemArmorSolstice(ItemArmor.ArmorMaterial.IRON, 0, 2);
    public static final ItemArmorSolstice woolLinedIronBoots = new ItemArmorSolstice(ItemArmor.ArmorMaterial.IRON, 0, 3);

    public static void init()
    {

    }
}
