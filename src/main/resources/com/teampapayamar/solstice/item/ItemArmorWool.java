package com.teampapayamar.solstice.item;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.ArmorType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemArmorWool extends ItemArmorSolstice
{
    public ItemArmorWool(ArmorType armorType)
    {
        super(ArmorMaterial.CLOTH, armorType);
        this.setUnlocalizedName(Names.Armor.WOOL_ARMOR);
        this.setTextureName(Textures.RESOURCE_PREFIX + getArmorTypeName(this));
    }

    /**
     * Retrieves the modifiers to be used when calculating armor damage.
     * <p/>
     * Armor will higher priority will have damage applied to them before lower priority ones. If there are multiple
     * pieces of armor with the same priority, damage will be distributed between them based on there absorption ratio.
     *
     * @param player
     *         The entity wearing the armor.
     * @param armor
     *         The ItemStack of the armor item itself.
     * @param source
     *         The source of the damage, which can be used to alter armor properties based on the type or source of
     *         damage.
     * @param damage
     *         The total damage being applied to the entity
     * @param slot
     *         The armor slot the item is in.
     *
     * @return A ArmorProperties instance holding information about how the armor effects damage.
     */
    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return null;
    }

    /**
     * Get the displayed effective armor.
     *
     * @param player
     *         The player wearing the armor.
     * @param armor
     *         The ItemStack of the armor item itself.
     * @param slot
     *         The armor slot the item is in.
     *
     * @return The number of armor points for display, 2 per shield.
     */
    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return 0;
    }

    /**
     * Applies damage to the ItemStack. The mod is responsible for reducing the item durability and stack size. If the
     * stack is depleted it will be cleaned up automatically.
     *
     * @param entity
     *         The entity wearing the armor
     * @param stack
     *         The ItemStack of the armor item itself.
     * @param source
     *         The source of the damage, which can be used to alter armor properties based on the type or source of
     *         damage.
     * @param damage
     *         The amount of damage being applied to the armor
     * @param slot
     *         The armor slot the item is in.
     */
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
                return Textures.WOOL_ARMOR_LAYER1;
            }
            else if (armorSlot == ArmorType.LEGS.ordinal())
            {
                return Textures.WOOL_ARMOR_LAYER2;
            }
        }

        return null;
    }
}
