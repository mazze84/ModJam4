package com.teampapayamar.solstice.item.crafting;

import com.teampapayamar.solstice.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void initRecipes()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.calendar, new Object[]{" s ", "pip", "ppp", 'p', new ItemStack(Items.paper), 'i', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE), 's', "slabWood"}));
    }
}
