package com.teampapayamar.solstice.block;

import java.util.Random;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.util.NameHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSeasonalDoublePlantSeasonal extends BlockDoublePlant {
	@SideOnly(Side.CLIENT)
	IIcon doublePlantIcon[];
	@SideOnly(Side.CLIENT)
	IIcon wiltedIcon[];
	@SideOnly(Side.CLIENT)
	IIcon budIcon[];
	
	@SideOnly(Side.CLIENT)
	IIcon sunflowerIcons[];
	@SideOnly(Side.CLIENT)
	IIcon sunflowerBudIcon[];
	@SideOnly(Side.CLIENT)
	IIcon sunflowerWiltedIcon[];
	
	public BlockSeasonalDoublePlantSeasonal(String name) {
		super();
		this.setBlockName(name);
		this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		String name = NameHelper.getUnwrappedUnlocalizedName(getUnlocalizedName());
		// 0 will be bottom Icon and 1 will be top 
		this.doublePlantIcon = new IIcon[2];
		this.wiltedIcon = new IIcon[2];
		this.budIcon = new IIcon[2];
		
		this.doublePlantIcon[0] = blockIcon = iconRegister.registerIcon(String.format("double_plant_%s_bottom", name));
		this.doublePlantIcon[0] = blockIcon = iconRegister.registerIcon(String.format("double_plant_%s_top", name));
		
		this.wiltedIcon[0] = iconRegister.registerIcon(String.format("double_plant_%s%s_bottom_wilted", Textures.RESOURCE_PREFIX, name));
		this.wiltedIcon[1] = iconRegister.registerIcon(String.format("double_plant_%s%s_top_wilted", Textures.RESOURCE_PREFIX, name));
        
		this.budIcon[0] = iconRegister.registerIcon(String.format("double_plant_%s%s_bottom_bud", Textures.RESOURCE_PREFIX, name));
		this.budIcon[1] = iconRegister.registerIcon(String.format("double_plant_%s%s_top_bud", Textures.RESOURCE_PREFIX, name));
        
        this.sunflowerIcons = new IIcon[2];
        this.sunflowerIcons[0] = iconRegister.registerIcon("double_plant_sunflower_front");
        this.sunflowerIcons[1] = iconRegister.registerIcon("double_plant_sunflower_back");
        
        this.sunflowerBudIcon = new IIcon[2];
        this.sunflowerBudIcon[0] = iconRegister.registerIcon("double_plant_sunflower_front_bud");
        this.sunflowerBudIcon[1] = iconRegister.registerIcon("double_plant_sunflower_back_bud");
        
        this.sunflowerWiltedIcon = new IIcon[2];
        this.sunflowerWiltedIcon[0] = iconRegister.registerIcon("double_plant_sunflower_front");
        this.sunflowerWiltedIcon[1] = iconRegister.registerIcon("double_plant_sunflower_back");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
		
        if (meta == 0 || meta == 1){
            return doublePlantIcon[meta];
        }
        if (meta == 2 || meta == 3) {
        	return meta == 2 ? budIcon[0] : budIcon[1];
        }
        if (meta == 4 || meta == 5) {
        	return meta == 4 ? wiltedIcon[0] : wiltedIcon[1];
        }
        return blockIcon;
    
	
	
        
    }
	
	
	@Override
	public int getDamageValue(World world, int x, int y, int z)
    {
		
        // int l = world.getBlockMetadata(x, y, z);
        
        // return func_149887_c(l) ? func_149890_d(world.getBlockMetadata(x, y - 1, z)) : func_149890_d(l);
        
        return 0;
    }

	@Override
    public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_)
    {
        int l = this.func_149885_e(world, x, y, z);
        return l != 2 && l != 3;
    }

    

}

