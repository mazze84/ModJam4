package com.teampapayamar.solstice.item.crafting;

import com.teampapayamar.solstice.init.ModBlocks;
import com.teampapayamar.solstice.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void initRecipes()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.calendar, new Object[]{" s ", "pip", "ppp", 'p', new ItemStack(Items.paper), 'i', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE), 's', "slabWood"}));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolGoldHelm, new Object[]{"www", "whw", 'w', new ItemStack(Blocks.wool,1, OreDictionary.WILDCARD_VALUE), 'h', Items.golden_helmet}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolGoldChest, new Object[] {"w w","wcw", "www", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'c', Items.golden_chestplate}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolGoldLegs, new Object[] {"www","wlw", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'l', Items.golden_leggings}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolGoldBoots, new Object[] {"w w","wbw", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'b', Items.golden_boots}));
    
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolDiamondHelm, new Object[]{"www", "whw", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'h', Items.diamond_helmet}));
	    GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolDiamondChest, new Object[] {"w w","wcw", "www", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'c', Items.diamond_chestplate}));
	    GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolDiamondLegs, new Object[] {"www","wlw", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'l', Items.diamond_leggings}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolDiamondBoots, new Object[] {"w w","wbw", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'b', Items.diamond_boots}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolIronHelm, new Object[]{"www", "whw", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'h', Items.iron_helmet}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolIronChest, new Object[] {"w w","wcw", "www", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'c', Items.iron_chestplate}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolIronLegs, new Object[] {"www","wlw", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'l', Items.iron_leggings}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolIronBoots, new Object[] {"w w","wbw", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'b', Items.iron_boots}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolArmorHelm, new Object[]{"www", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolArmorChest, new Object[]{"w w", "www", "www", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolArmorLegs, new Object[]{"www", "w w", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woolArmorBoots, new Object[]{"w w", "w w", 'w', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)}));
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolGoldHelm), new Object[] { Items.golden_helmet, ModItems.woolArmorHelm });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolGoldChest), new Object[] { Items.golden_chestplate, ModItems.woolArmorChest });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolGoldLegs), new Object[] { Items.golden_leggings, ModItems.woolArmorLegs });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolGoldBoots), new Object[] { Items.golden_boots, ModItems.woolArmorBoots });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolIronHelm), new Object[] { Items.iron_helmet, ModItems.woolArmorHelm });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolIronChest), new Object[] { Items.iron_chestplate, ModItems.woolArmorChest });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolIronLegs), new Object[] { Items.iron_leggings, ModItems.woolArmorLegs });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolIronBoots), new Object[] { Items.iron_boots, ModItems.woolArmorBoots });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolDiamondHelm), new Object[] { Items.diamond_helmet, ModItems.woolArmorHelm });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolDiamondChest), new Object[] { Items.diamond_chestplate, ModItems.woolArmorChest });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolDiamondLegs), new Object[] { Items.diamond_leggings, ModItems.woolArmorLegs });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woolDiamondBoots), new Object[] { Items.diamond_boots, ModItems.woolArmorBoots });
        
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.swimSuitHelm, new Object[]{"www", "w w", 'w', Items.string}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.swimSuitChest, new Object[]{"w w", "www", "www", 'w', Items.string}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.swimSuitLegs, new Object[]{"www", "w w", "w w", 'w', Items.string}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.swimSuitBoots, new Object[]{"w w", "w w", 'w', Items.string}));
        
            }
}
