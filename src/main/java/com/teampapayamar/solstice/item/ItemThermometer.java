package com.teampapayamar.solstice.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.NameHelper;
import com.teampapayamar.solstice.util.TempHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemThermometer extends ItemSolstice {
	public ItemThermometer(String name) {
		super();
		
		setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
		setTextureName(String.format("%s%s", Textures.RESOURCE_PREFIX, name));
		setUnlocalizedName(Names.Item.THERMOMETER);
		
	}
	
	@Override
	public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        super.registerIcons(iconRegister);
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	
		
	/*
	 * Reads temperature of the surrounding environment
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		int  temperature = TempHelper.getTemp(world);
		
		if(player.isSneaking()) {
			// read own temperature
			// TODO: Localize String and temperature unit
			
			player.addChatComponentMessage(new ChatComponentText(String.format("My temperature is %s °C", TempHelper.getPlayerTemp(player, world))));
		} else {	
			// read temp of the environment
			// TODO: Localize String and temperature unit
			player.addChatComponentMessage(new ChatComponentText(String.format("Current temperature is %s °C", temperature)));
		}
		
		return stack;
	}
	
	/*
	 * Use on player to get the temperature
	 * returns true if item can be used on target player
	 * 
	 */
	@Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer playerClicked = (EntityPlayer)entity;
		
			int temp = TempHelper.getTemp(player.getEntityWorld());
			player.addChatComponentMessage(new ChatComponentText(String.format("%s's temperature is %s °C",playerClicked.getDisplayName(), temp )));
		
			return true;
		}
		
		return false;
	}
	
}
