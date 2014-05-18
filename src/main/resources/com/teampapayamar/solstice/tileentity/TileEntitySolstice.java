package com.teampapayamar.solstice.tileentity;

import com.teampapayamar.solstice.reference.Names;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
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
        owner = "";
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

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(Names.NBT.ORIENTATION))
        {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(Names.NBT.ORIENTATION));
        }

        if (nbtTagCompound.hasKey(Names.NBT.STATE))
        {
            this.state = nbtTagCompound.getByte(Names.NBT.STATE);
        }

        if (nbtTagCompound.hasKey(Names.NBT.OWNER))
        {
            this.owner = nbtTagCompound.getString(Names.NBT.OWNER);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte(Names.NBT.ORIENTATION, (byte) orientation.ordinal());
        nbtTagCompound.setByte(Names.NBT.STATE, state);
        nbtTagCompound.setString(Names.NBT.OWNER, owner);
    }
}
