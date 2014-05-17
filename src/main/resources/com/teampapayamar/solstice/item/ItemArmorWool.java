package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.util.ArmorType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class ItemArmorWool extends ItemArmorSolstice
{
    public ItemArmorWool(ArmorType armorType)
    {
        super(ArmorMaterial.CLOTH, armorType);
        this.setUnlocalizedName(Names.Armor.WOOL_ARMOR);
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
