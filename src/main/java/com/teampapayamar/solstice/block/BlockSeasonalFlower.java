package com.teampapayamar.solstice.block;

import java.util.Random;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.NameHelper;
import com.teampapayamar.solstice.util.TimeHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockSeasonalFlower extends BlockBush{
	@SideOnly(Side.CLIENT)
	private IIcon wiltedIcon;
	@SideOnly(Side.CLIENT)
	private IIcon budIcon;
	
	
	public BlockSeasonalFlower(String name) {
		super(Material.plants);
		this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
		this.setBlockName(name);
		this.setHardness(0.0F);
        this.setStepSound(soundTypeGrass);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		
        String name = NameHelper.getUnwrappedUnlocalizedName(getUnlocalizedName());
		blockIcon = iconRegister.registerIcon(name);
        
        wiltedIcon = iconRegister.registerIcon(String.format("%s%s_wilted", Textures.RESOURCE_PREFIX, name));
        
        budIcon = iconRegister.registerIcon(String.format("%s%s_bud", Textures.RESOURCE_PREFIX, name));
                
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if (meta == 0){
            return blockIcon;
        }
        if (meta == 1) {
        	return budIcon;
        }
        if (meta == 2) {
        	return wiltedIcon;
        }
        return blockIcon;
    }
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		int season = TimeHelper.getSeason(world.getTotalWorldTime());
		int meta = 0;
		// winter or autumn
		if (season == 0 || season == 3 ){
			meta = 2;
		}
		// season spring
		if (season == 1) {
			meta = 1;
		}
		
		// season summer
		if (season == 2) {
			meta = 0;
		}
		
		
		world.setBlockMetadataWithNotify(x, y, z, meta, 2);
	}
	
	// always return the normal flower
	@Override
	public int damageDropped(int meta) {
        return 0;
    }
	
	
		
		
		
		
	
}
