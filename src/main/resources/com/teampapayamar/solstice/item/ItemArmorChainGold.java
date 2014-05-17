package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.util.ArmorType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class ItemArmorChainGold extends ItemArmorSolstice
{
    public ItemArmorChainGold(int renderIndex, ArmorType armorType)
    {
        super(ArmorMaterial.CHAIN, renderIndex, armorType);
        // TODO Add a new ArmorMaterial for this armor
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return null;
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return 0;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {

    }
}
