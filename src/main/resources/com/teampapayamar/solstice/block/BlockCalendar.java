package com.teampapayamar.solstice.block;

import com.teampapayamar.solstice.reference.Names;
import com.teampapayamar.solstice.reference.RenderIds;
import com.teampapayamar.solstice.tileentity.TileEntityCalendar;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockCalendar extends BlockSolstice implements ITileEntityProvider
{
    public BlockCalendar()
    {
        super(Material.wood);
        this.setBlockName(Names.Block.CALENDAR);
        this.setHardness(0.5f);
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

    @Override
    public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 startVector, Vec3 endVector)
    {
        if (world.getTileEntity(x, y, z) instanceof TileEntityCalendar)
        {
            TileEntityCalendar tileEntityCalendar = (TileEntityCalendar) world.getTileEntity(x, y, z);

            switch(tileEntityCalendar.getOrientation())
            {
                case SOUTH:
                {
                    this.setBlockBounds(0.1f, 0.1f, 0.0f, 0.9f, 0.9f, 0.15f);
                    break;
                }
                case NORTH:
                {
                    this.setBlockBounds(0.1f, 0.1f, 0.85f, 0.9f, 0.9f, 1.0f);
                    break;
                }
                case EAST:
                {
                    this.setBlockBounds(0.0f, 0.1f, 0.1f, 0.15f, 0.9f, 0.9f);
                    break;
                }
                case WEST:
                {
                    this.setBlockBounds(0.85f, 0.1f, 0.1f, 1.0f, 0.9f, 0.9f);
                    break;
                }
                default:
                {
                    break;
                }
            }
        }

        return super.collisionRayTrace(world, x, y, z, startVector, endVector);
    }
}
