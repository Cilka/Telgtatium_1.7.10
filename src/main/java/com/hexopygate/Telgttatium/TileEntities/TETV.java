package com.hexopygate.Telgttatium.TileEntities;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TETV extends TileEntity {
 private int channel;
 public int getChannel()
 {
   return channel;
 }
 public void setChannel(int ch)
 {
	 
	 channel = ch;
	 updateEntity();
 }
 public void changeChannel() {
	 channel++;
	 if(channel > 7)
	 {
		 channel = 0;
	 }
 }
 
 public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
	    super.readFromNBT(par1NBTTagCompound);
	    
	    if (par1NBTTagCompound.hasKey("Channel"))
	    {
	      channel = par1NBTTagCompound.getInteger("Channel");
	    }
	  }
	  

 
	  public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	  {
	    super.writeToNBT(par1NBTTagCompound);
	    
	    par1NBTTagCompound.setInteger("Channel", getChannel());
	  }
	  

	  public boolean canUpdate()
	  {
	    return false;
	  }
	  
	 
	
	  

	  public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
	  {
	    NBTTagCompound tagCom = pkt.func_148857_g();
	    readFromNBT(tagCom);
	  }
	  

	  public Packet getDescriptionPacket()
	  {
	    NBTTagCompound tagCom = new NBTTagCompound();
	    writeToNBT(tagCom);
	    return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, blockMetadata, tagCom);
	  }
}
