package com.teampapayamar.solstice.init;

import com.teampapayamar.solstice.item.*;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.util.ArmorType;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemArmorSolstice swimSuitHelm = new ItemArmorSwimSuit(ArmorType.HELMET);
    public static final ItemArmorSolstice swimSuitChest = new ItemArmorSwimSuit(ArmorType.CHEST);
    public static final ItemArmorSolstice swimSuitLegs = new ItemArmorSwimSuit(ArmorType.LEGS);
    public static final ItemArmorSolstice swimSuitBoots = new ItemArmorSwimSuit(ArmorType.BOOTS);

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

    public static final ItemArmorSolstice chainIronHelm = new ItemArmorChainIron(ArmorType.HELMET);
    public static final ItemArmorSolstice chainIronChest = new ItemArmorChainIron(ArmorType.CHEST);
    public static final ItemArmorSolstice chainIronLegs = new ItemArmorChainIron(ArmorType.LEGS);
    public static final ItemArmorSolstice chainIronBoots = new ItemArmorChainIron(ArmorType.BOOTS);

    public static final ItemArmorSolstice chainGoldHelm = new ItemArmorChainGold(ArmorType.HELMET);
    public static final ItemArmorSolstice chainGoldChest = new ItemArmorChainGold(ArmorType.CHEST);
    public static final ItemArmorSolstice chainGoldLegs = new ItemArmorChainGold(ArmorType.LEGS);
    public static final ItemArmorSolstice chainGoldBoots = new ItemArmorChainGold(ArmorType.BOOTS);
    
    public static final ItemSolstice thermometer = new ItemThermometer(Names.Item.THERMOMETER);

    public static void init()
    {
        GameRegistry.registerItem(swimSuitHelm, "item." + Names.Armor.SWIM_SUIT_ARMOR_HELM);
        GameRegistry.registerItem(swimSuitChest, "item." + Names.Armor.SWIM_SUIT_ARMOR_CHEST);
        GameRegistry.registerItem(swimSuitLegs, "item." + Names.Armor.SWIM_SUIT_ARMOR_LEGS);
        GameRegistry.registerItem(swimSuitBoots, "item." + Names.Armor.SWIM_SUIT_ARMOR_BOOTS);

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

        GameRegistry.registerItem(chainIronHelm, "item." + Names.Armor.CHAIN_IRON_HELM);
        GameRegistry.registerItem(chainIronChest, "item." + Names.Armor.CHAIN_IRON_CHEST);
        GameRegistry.registerItem(chainIronLegs, "item." + Names.Armor.CHAIN_IRON_LEGS);
        GameRegistry.registerItem(chainIronBoots, "item." + Names.Armor.CHAIN_IRON_BOOTS);

        GameRegistry.registerItem(chainGoldHelm, "item." + Names.Armor.CHAIN_GOLD_HELM);
        GameRegistry.registerItem(chainGoldChest, "item." + Names.Armor.CHAIN_GOLD_CHEST);
        GameRegistry.registerItem(chainGoldLegs, "item." + Names.Armor.CHAIN_GOLD_LEGS);
        GameRegistry.registerItem(chainGoldBoots, "item." + Names.Armor.CHAIN_GOLD_BOOTS);
        
        GameRegistry.registerItem(thermometer, "item." + Names.Item.THERMOMETER);
    }
}
