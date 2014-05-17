package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.item.*;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.util.ArmorType;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemArmorSolstice woolArmorHelm = new ItemArmorWool(ArmorType.HELMET);
    public static final ItemArmorSolstice woolArmorChest = new ItemArmorWool(ArmorType.CHEST);
    public static final ItemArmorSolstice woolArmorLegs = new ItemArmorWool(ArmorType.LEGS);
    public static final ItemArmorSolstice woolArmorBoots = new ItemArmorWool(ArmorType.BOOTS);

    public static final ItemArmorSolstice woolIronHelm = new ItemArmorWoolIron(ArmorType.HELMET);
    public static final ItemArmorSolstice woolIronChest = new ItemArmorWoolIron(ArmorType.CHEST);
    public static final ItemArmorSolstice woolIronLegs = new ItemArmorWoolIron(ArmorType.LEGS);
    public static final ItemArmorSolstice woolIronBoots = new ItemArmorWoolIron(ArmorType.BOOTS);

    public static final ItemArmorSolstice woolGoldHelm = new ItemArmorWoolGold(ArmorType.HELMET);
    public static final ItemArmorSolstice woolGoldChest = new ItemArmorWoolGold(ArmorType.CHEST);
    public static final ItemArmorSolstice woolGoldLegs = new ItemArmorWoolGold(ArmorType.LEGS);
    public static final ItemArmorSolstice woolGoldBoots = new ItemArmorWoolGold(ArmorType.BOOTS);

    public static final ItemArmorSolstice woolDiamondHelm = new ItemArmorWoolDiamond(ArmorType.HELMET);
    public static final ItemArmorSolstice woolDiamondChest = new ItemArmorWoolDiamond(ArmorType.CHEST);
    public static final ItemArmorSolstice woolDiamondLegs = new ItemArmorWoolDiamond(ArmorType.LEGS);
    public static final ItemArmorSolstice woolDiamondBoots = new ItemArmorWoolDiamond(ArmorType.BOOTS);

    public static void init()
    {
        GameRegistry.registerItem(woolArmorHelm, "item." + Names.Armor.WOOL_ARMOR_HELM);
        GameRegistry.registerItem(woolArmorChest, "item." + Names.Armor.WOOL_ARMOR_CHEST);
        GameRegistry.registerItem(woolArmorLegs, "item." + Names.Armor.WOOL_ARMOR_LEGS);
        GameRegistry.registerItem(woolArmorBoots, "item." + Names.Armor.WOOL_ARMOR_BOOTS);

        GameRegistry.registerItem(woolIronHelm, "item." + Names.Armor.WOOL_LINED_IRON_HELM);
        GameRegistry.registerItem(woolIronChest, "item." + Names.Armor.WOOL_LINED_IRON_CHEST);
        GameRegistry.registerItem(woolIronLegs, "item." + Names.Armor.WOOL_LINED_IRON_LEGS);
        GameRegistry.registerItem(woolIronBoots, "item." + Names.Armor.WOOL_LINED_IRON_BOOTS);

        GameRegistry.registerItem(woolGoldHelm, "item." + Names.Armor.WOOL_LINED_GOLD_HELM);
        GameRegistry.registerItem(woolGoldChest, "item." + Names.Armor.WOOL_LINED_GOLD_CHEST);
        GameRegistry.registerItem(woolGoldLegs, "item." + Names.Armor.WOOL_LINED_GOLD_LEGS);
        GameRegistry.registerItem(woolGoldBoots, "item." + Names.Armor.WOOL_LINED_GOLD_BOOTS);

        GameRegistry.registerItem(woolDiamondHelm, "item." + Names.Armor.WOOL_LINED_DIAMOND_HELM);
        GameRegistry.registerItem(woolDiamondChest, "item." + Names.Armor.WOOL_LINED_DIAMOND_CHEST);
        GameRegistry.registerItem(woolDiamondLegs, "item." + Names.Armor.WOOL_LINED_DIAMOND_LEGS);
        GameRegistry.registerItem(woolDiamondBoots, "item." + Names.Armor.WOOL_LINED_DIAMOND_BOOTS);
    }
}
