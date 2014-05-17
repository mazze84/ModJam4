package com.teampapayamar.solstice.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntitySolstice extends TileEntity
{
    protected ForgeDirection orientation;
    protected byte state;
    protected String owner;

    public TileEntitySolstice()
    {
        orientation = ForgeDirection.SOUTH;
        state = 0;
    }

    public ForgeDirection getOrientation()
    {
        return orientation;
    }

    public void setOrientation(ForgeDirection orientation)
    {
        this.orientation = orientation;
    }

    public byte getState()
    {
        return state;
    }

    public void setState(byte state)
    {
        this.state = state;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey("orientation"))
        {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte("orientation"));
        }

        if (nbtTagCompound.hasKey("state"))
        {
            this.state = nbtTagCompound.getByte("state");
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte("orientation", (byte) orientation.ordinal());
        nbtTagCompound.setByte("state", state);
    }
}
