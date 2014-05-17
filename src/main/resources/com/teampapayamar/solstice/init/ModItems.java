package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.item.ItemArmorSolstice;
import com.teampapayamar.solstice.item.ItemArmorWool;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.util.ArmorType;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemArmorSolstice woolArmorHelm = new ItemArmorWool(0, ArmorType.HELMET);
    public static final ItemArmorSolstice woolArmorChest = new ItemArmorWool(0, ArmorType.CHEST);
    public static final ItemArmorSolstice woolArmorLegs = new ItemArmorWool(0, ArmorType.LEGS);
    public static final ItemArmorSolstice woolArmorBoots = new ItemArmorWool(0, ArmorType.BOOTS);

    public static void init()
    {
        GameRegistry.registerItem(woolArmorHelm, "item." + Names.Armor.WOOL_ARMOR_HELM);
        GameRegistry.registerItem(woolArmorChest, "item." + Names.Armor.WOOL_ARMOR_CHEST);
        GameRegistry.registerItem(woolArmorLegs, "item." + Names.Armor.WOOL_ARMOR_LEGS);
        GameRegistry.registerItem(woolArmorBoots, "item." + Names.Armor.WOOL_ARMOR_BOOTS);
    }
}
