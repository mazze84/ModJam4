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
    public String getUnlocalizedName(ItemStack itemStack)
    {
        if (itemStack.getItem() instanceof ItemArmorSolstice)
        {
            if (((ItemArmorSolstice) itemStack.getItem()).armorType == 0)
            {
                return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronHelmet");
            }
            else if (((ItemArmorSolstice) itemStack.getItem()).armorType == 1)
            {
                return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronChestPlate");
            }
            else if (((ItemArmorSolstice) itemStack.getItem()).armorType == 2)
            {
                return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronLeggings");
            }
            else if (((ItemArmorSolstice) itemStack.getItem()).armorType == 3)
            {
                return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), "woolLinedIronBoots");
            }
        }

        return "";
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
