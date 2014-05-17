package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.ArmorType;
import com.teampapayamar.solstice.util.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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
