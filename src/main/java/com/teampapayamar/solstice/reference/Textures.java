package com.teampapayamar.solstice.reference;

import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    /**
     * Armor Textures Layer1 contains Helm, Chest, and Boots Layer2 contains Legs
     */
    public static final String ARMOR_RESOURCE_LOCATION = RESOURCE_PREFIX + "textures/models/armor/";
    public static final String SWIM_SUIT_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "swimsuit_layer1.png";
    public static final String SWIM_SUIT_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "swimsuit_layer2.png";
    public static final String WOOL_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "woolarmor_layer1.png";
    public static final String WOOL_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "woolarmor_layer2.png";
    public static final String WOOL_LINED_IRON_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "wooliron_layer1.png";
    public static final String WOOL_LINED_IRON_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "wooliron_layer2.png";
    public static final String WOOL_LINED_GOLD_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "woolgold_layer1.png";
    public static final String WOOL_LINED_GOLD_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "woolgold_layer2.png";
    public static final String WOOL_LINED_DIAMOND_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "wooldiamond_layer1.png";
    public static final String WOOL_LINED_DIAMOND_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "wooldiamond_layer2.png";
    public static final String CHAIN_IRON_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "modironchainarmor_layer1.png";
    public static final String CHAIN_IRON_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "modironchainarmor_layer2.png";
    public static final String CHAIN_GOLD_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "modgoldchainarmor_layer1.png";
    public static final String CHAIN_GOLD_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "modgoldchainarmor_layer2.png";

        
    
    /**
     * Gui texture locations
     */
    public static final String GUI_RESOURCE_LOCATION = "textures/gui/";
    public static final ResourceLocation GUI_CALENDAR = getResourceLocation(GUI_RESOURCE_LOCATION + "calendar.png");
    public static final ResourceLocation GUI_CALENDAR_HIGHLIGHT = getResourceLocation(GUI_RESOURCE_LOCATION + "calendar_highlight.png");

    /**
     * Model texture locations
     */
    public static final String MODEL_RESOURCE_LOCATION = "textures/models/";
    public static final ResourceLocation MODEL_CALENDAR = getResourceLocation(MODEL_RESOURCE_LOCATION + "calendar.png");
    public static final ResourceLocation MODEL_CAMPFIRE = getResourceLocation(MODEL_RESOURCE_LOCATION + "campfire.png");

    private static ResourceLocation getResourceLocation(String location)
    {
        return new ResourceLocation(Reference.MOD_ID.toLowerCase(), location);
    }
}
