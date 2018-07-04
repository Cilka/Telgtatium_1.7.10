package com.hexopygate.Telgttatium.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TEPillar extends TileEntity {
private String Name;
public TEPillar(String name){
	Name = name;
}
public String GetTextureName()
{
	return Name;
}
@Override
public void readFromNBT(NBTTagCompound tag)
{
	super.readFromNBT(tag);
	Name = tag.getString("textureName");
}

@Override
public void writeToNBT(NBTTagCompound tag) {
	super.writeToNBT(tag);
	tag.setString("textureName", Name);
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
