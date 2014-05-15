package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class ItemArmorSolstice extends ItemArmor implements ISpecialArmor
{
    public ItemArmorSolstice(ArmorMaterial armorMaterial, int renderIndex, int armorType)
    {
        super(armorMaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        if (this.armorType == 0)
        {
            return String.format("item.%s.%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronHelmet");
        }
        else if (this.armorType == 1)
        {
            return String.format("item.%s.%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronChestPlate");
        }
        else if (this.armorType == 2)
        {
            return String.format("item.%s.%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronLeggings");
        }
        else if (this.armorType == 3)
        {
            return String.format("item.%s.%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronBoots");
        }

        return "blargh";
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
