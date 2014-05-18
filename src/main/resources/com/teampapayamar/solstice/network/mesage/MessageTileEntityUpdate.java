package com.teampapayamar.solstice.network.mesage;

import com.teampapayamar.solstice.tileentity.TileEntitySolstice;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class MessageTileEntityUpdate implements IMessage, IMessageHandler<MessageTileEntityUpdate, IMessage>
{
    public int x, y, z;
    public byte orientation, state;
    public String owner;

    public MessageTileEntityUpdate()
    {
    }

    public MessageTileEntityUpdate(TileEntitySolstice tileEntitySolstice)
    {
        this.x = tileEntitySolstice.xCoord;
        this.y = tileEntitySolstice.yCoord;
        this.z = tileEntitySolstice.zCoord;
        this.orientation = (byte) tileEntitySolstice.getOrientation().ordinal();
        this.state = tileEntitySolstice.getState();
        this.owner = tileEntitySolstice.getOwner();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int ownerLength = buf.readInt();
        this.owner = new String(buf.readBytes(ownerLength).array());
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(owner.length());
        buf.writeBytes(owner.getBytes());
    }

    @Override
    public IMessage onMessage(MessageTileEntityUpdate message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

        if (tileEntity instanceof TileEntitySolstice)
        {
            ((TileEntitySolstice) tileEntity).setOrientation(ForgeDirection.getOrientation(message.orientation));
            ((TileEntitySolstice) tileEntity).setState(message.state);
        }

        return null;
    }
}
