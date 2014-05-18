package com.teampapayamar.solstice.block;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.RenderIds;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCalendar extends BlockSolstice implements ITileEntityProvider
{
    public BlockCalendar()
    {
        super(Material.wood);
        this.setBlockName(Names.Block.CALENDAR);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityCalendar();
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
        return RenderIds.calendar;
    }
}
