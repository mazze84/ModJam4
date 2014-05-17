package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Reference;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.ArmorType;
import com.teampapayamar.solstice.util.LogHelper;
import com.teampapayamar.solstice.util.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public abstract class ItemArmorSolstice extends ItemArmor implements ISpecialArmor
{
    public ItemArmorSolstice(ArmorMaterial armorMaterial, ArmorType armorType)
    {
        super(armorMaterial, 0, armorType.ordinal());
        this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s_%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s_%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)), getArmorTypeName(itemStack.getItem()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        LogHelper.info(String.format("%s%s_helm", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

        if (this.armorType == ArmorType.HELMET.ordinal())
        {
            itemIcon = iconRegister.registerIcon(String.format("%s%s_helm", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }
        else if (this.armorType == ArmorType.CHEST.ordinal())
        {
            itemIcon = iconRegister.registerIcon(String.format("%s%s_helm", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }
        else if (this.armorType == ArmorType.LEGS.ordinal())
        {
            itemIcon = iconRegister.registerIcon(String.format("%s%s_helm", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }
        else // this.armorType == ArmorType.BOOTS.ordinal()
        {
            itemIcon = iconRegister.registerIcon(String.format("%s%s_helm", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }
    }

    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            if (itemArmor.armorType == 0)
            {
                return "helm";
            }
            else if (itemArmor.armorType == 1)
            {
                return "chest";
            }
            else if (itemArmor.armorType == 2)
            {
                return "legs";
            }
            else if (itemArmor.armorType == 3)
            {
                return "boots";
            }
        }

        return "";
    }
}
