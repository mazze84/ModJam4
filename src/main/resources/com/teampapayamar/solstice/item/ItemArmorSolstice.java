package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.ArmorType;
import com.teampapayamar.solstice.util.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public abstract class ItemArmorSolstice extends ItemArmor implements ISpecialArmor
{
    protected static ArmorMaterial ArmorMaterialWool = EnumHelper.addArmorMaterial(Names.Armor.WOOL_ARMOR, 5, new int[]{1, 3, 2, 1}, 15);
    protected static ArmorMaterial ArmorMaterialWoolLinedIron = EnumHelper.addArmorMaterial(Names.Armor.WOOL_LINED_IRON_ARMOR, 15, new int[]{2, 5, 4, 1}, 12);
    protected static ArmorMaterial ArmorMaterialWoolLinedGold = EnumHelper.addArmorMaterial(Names.Armor.WOOL_LINED_GOLD_ARMOR, 7, new int[]{2, 5, 3, 1}, 25);
    protected static ArmorMaterial ArmorMaterialWoolLinedDiamond = EnumHelper.addArmorMaterial(Names.Armor.WOOL_LINED_DIAMOND_ARMOR, 33, new int[]{3, 8, 6, 3}, 10);

    protected static ArmorMaterial ArmorMaterialChainIron = EnumHelper.addArmorMaterial(Names.Armor.CHAIN_IRON_ARMOR, 15, new int[]{2, 5, 4, 1}, 12);
    protected static ArmorMaterial ArmorMaterialChainGold = EnumHelper.addArmorMaterial(Names.Armor.CHAIN_GOLD_ARMOR, 7, new int[]{2, 5, 3, 1}, 25);

    public ItemArmorSolstice(String armorName, ArmorMaterial armorMaterial, ArmorType armorType)
    {
        super(armorMaterial, 1, armorType.ordinal());
        this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
        this.setUnlocalizedName(armorName);
        this.setTextureName(String.format("%s%s_%s", Textures.RESOURCE_PREFIX, armorName, getArmorTypeName(this.armorType)));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s_%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
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
        super.registerIcons(iconRegister);
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            return getArmorTypeName(itemArmor.armorType);
        }

        return "";
    }

    protected String getArmorTypeName(int slot)
    {
        if (slot == 0)
        {
            return "helm";
        }
        else if (slot == 1)
        {
            return "chest";
        }
        else if (slot == 2)
        {
            return "legs";
        }
        else// slot == 3
        {
            return "boots";
        }
    }
}
