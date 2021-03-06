package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemArmorWoolDiamond extends ItemArmorSolstice
{
    public ItemArmorWoolDiamond(ArmorType armorType)
    {
        super(Names.Armor.WOOL_LINED_DIAMOND_ARMOR, ArmorMaterialWoolLinedDiamond, armorType);
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return null;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {

    }

    /**
     * Called by RenderBiped and RenderPlayer to determine the armor texture that should be use for the currently
     * equipped item. This will only be called on instances of ItemArmor.
     * <p/>
     * Returning null from this function will use the default value.
     *
     * @param armorStack
     *         ItemStack for the equipped armor
     * @param entity
     *         The entity wearing the armor
     * @param armorSlot
     *         The slot the armor is in
     * @param type
     *         The subtype, can be null or "overlay"
     *
     * @return Path of texture to bind, or null to use default
     */
    @Override
    public String getArmorTexture(ItemStack armorStack, Entity entity, int armorSlot, String type)
    {
        if (armorStack.getItem() instanceof ItemArmorSolstice)
        {
            if (armorSlot == ArmorType.HELMET.ordinal() || armorSlot == ArmorType.CHEST.ordinal() || armorSlot == ArmorType.BOOTS.ordinal())
            {
                return Textures.WOOL_LINED_DIAMOND_ARMOR_LAYER1;
            }
            else if (armorSlot == ArmorType.LEGS.ordinal())
            {
                return Textures.WOOL_LINED_DIAMOND_ARMOR_LAYER2;
            }
        }

        return null;
    }
}
