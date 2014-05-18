package com.teampapayamar.solstice.network;

import com.teampapayamar.solstice.network.mesage.MessageTileEntityUpdate;
import com.teampapayamar.solstice.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.NETWORK_CHANNEL.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityUpdate.class, MessageTileEntityUpdate.class, 0, Side.CLIENT);
    }
}
