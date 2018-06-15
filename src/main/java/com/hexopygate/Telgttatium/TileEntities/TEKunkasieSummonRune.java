package com.hexopygate.Telgttatium.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TEKunkasieSummonRune extends TileEntity {
 private boolean isActivated;
 private int step;
 private int counter =0;

 public void setActive(boolean active)
 {
	 isActivated= active;
 }
 public boolean getActivate()
 {
	 return isActivated;
 }
 @Override
 public void readFromNBT(NBTTagCompound tag)
 {
 	super.readFromNBT(tag);
 	isActivated = tag.getBoolean("isActivated");
 	step = tag.getInteger("step");
 }

 @Override
 public void writeToNBT(NBTTagCompound tag) {
 	super.writeToNBT(tag);
 	tag.setInteger("step", step);
 	tag.setBoolean("isActivated", isActivated);
 
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

 public void editCoutner()
 {
	 isActivated = !isActivated;
	 markDirty();
	 worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
 }
 void canActivateBlock()
 {
	isActivated =  worldObj.getClosestPlayer(xCoord, yCoord +1, zCoord, 1) != null;
	System.out.println("Rune is activated: " +isActivated);
 }
 @Override
 public void updateEntity()
 {
	 canActivateBlock();
	if(isActivated)
	{
		counter++;
	}
	 if(counter  == 20)
	 {
		 counter = 0;
		 step++;
	 } 
	
	 step = (step > 15 && isActivated) ? 15 : (!isActivated ?  0 : step);
	 
	 if(!worldObj.isRemote)
	 {
		 worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, step, 2);
	 }
	
	 super.updateEntity();
 }
}
