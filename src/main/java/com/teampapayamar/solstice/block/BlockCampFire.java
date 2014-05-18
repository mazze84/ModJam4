package com.teampapayamar.solstice.block;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.RenderIds;
import com.teampapayamar.solstice.tileentity.TileEntityCampFire;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCampFire extends BlockSolstice implements ITileEntityProvider
{
    public BlockCampFire()
    {
        super(Material.wood);
        this.setBlockName(Names.Block.CAMP_FIRE);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityCampFire();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.campFire;
    }
}
