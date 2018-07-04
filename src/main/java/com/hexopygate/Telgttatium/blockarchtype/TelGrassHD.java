package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class TelGrassHD extends Block  {
protected IIcon[] icons = new IIcon[6];

String name = null;
	protected TelGrassHD(Material p_i45394_1_) {
		super(p_i45394_1_);
	name = this.getClass().getSimpleName();
		this.setBlockName(name).setBlockTextureName("tel:"+name);
		// TODO Auto-generated constructor stub
		GameRegistry.registerBlock(this, name);
		
	}

	public TelGrassHD()
	{
		this(Material.grass);
	}
	   @Override
	    public void registerBlockIcons(IIconRegister reg)
	    {
		   
		   if(name.contains("mound"))
		   {
			   
			   for(int i=0; i <  icons.length; i++)
			   {
				   icons[i]=reg.registerIcon("tel:"+name.substring(0,name.lastIndexOf('_')));
			   }
		   }
		   else
		   {
			   
		   
		   String [] nameArray = name.split("_");
		   String dirtName = null;
		   String grassName = nameArray[0] + "_" +nameArray[1];
		   
		   if(nameArray[0].equalsIgnoreCase("Weird"))
		   {
			   dirtName = nameArray[3];
			   grassName = nameArray[0] + "_" +nameArray[1] +"_" + nameArray[2];
		   }
		   else if(nameArray[0].equalsIgnoreCase("White")||nameArray[0].equalsIgnoreCase("Normal"))
		   {
			   dirtName = nameArray[1];
			   grassName = nameArray[0] ;
		   }
		   else 
		   {
			   dirtName =  nameArray[2];
		   }
			   icons[0]=reg.registerIcon("tel:HD_"+dirtName+"_Dirt");
			   icons[1]=reg.registerIcon("tel:"+grassName +"_Grass");
			   icons[2]=reg.registerIcon("tel:"+name+"_Side");
			   icons[3]=reg.registerIcon("tel:"+name+"_Side");
			   icons[4]=reg.registerIcon("tel:"+name+"_Side");
			   icons[5]=reg.registerIcon("tel:"+name+"_Side");
		   
		   }
	    
	    }
	   @Override
	    public IIcon getIcon(int side, int meta)
	    {
	        return icons[side];
	    }
	   @Override
	    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable)
	    {
		   return true;
	    }
}
