package com.teampapayamar.solstice.block;

import com.teampapayamar.solstice.creativetab.CreativeTabSolstice;
import com.teampapayamar.solstice.reference.Textures;
import com.teampapayamar.solstice.tileentity.TileEntitySolstice;
import com.teampapayamar.solstice.util.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockSolstice extends Block
{
    protected BlockSolstice()
    {
        super(Material.rock);
    }

    public BlockSolstice(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSolstice.SOLSTICE_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        if (world.getTileEntity(x, y, z) instanceof TileEntitySolstice)
        {
            ForgeDirection orientation = ForgeDirection.SOUTH;
            int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4f / 360f + 0.5d) & 3;

            if (facing == 0)
            {
                orientation = ForgeDirection.NORTH;
            }
            else if (facing == 1)
            {
                orientation = ForgeDirection.EAST;
            }
            else if (facing == 2)
            {
                orientation = ForgeDirection.SOUTH;
            }
            else if (facing == 3)
            {
                orientation = ForgeDirection.WEST;
            }

            String owner = "";
            if (entityLiving instanceof EntityPlayer)
            {
                owner = ((EntityPlayer) entityLiving).getDisplayName();
            }

            ((TileEntitySolstice) world.getTileEntity(x, y, z)).setOrientation(orientation);
            ((TileEntitySolstice) world.getTileEntity(x, y, z)).setOwner(owner);
        }
    }
}
