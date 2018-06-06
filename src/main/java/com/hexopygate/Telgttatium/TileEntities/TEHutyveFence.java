package com.hexopygate.Telgttatium.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TEHutyveFence extends TileEntity{
public int direction;
public String textureName;

public TEHutyveFence()
{}
public TEHutyveFence(String texture, int direction)
{
	this.textureName =  texture;
	this.direction = direction;
}

@Override
public void readFromNBT(NBTTagCompound tag)
{
	super.readFromNBT(tag);
	direction = tag.getInteger("direction");
	textureName = tag.getString("textureName");
}

@Override
public void writeToNBT(NBTTagCompound tag) {
	super.writeToNBT(tag);
	tag.setInteger("direction", direction);
	tag.setString("textureName", textureName);
	}
@Override
public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet){
this.readFromNBT(packet.func_148857_g());	
}
@Override
public Packet getDescriptionPacket()
{
	NBTTagCompound var1 = new NBTTagCompound();
	this.writeToNBT(var1);
	return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord,1,var1);
}
}
