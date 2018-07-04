package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class TelGrass extends Block  {
protected IIcon[] icons = new IIcon[6];
String name = null;

	protected TelGrass(Material p_i45394_1_) {
		super(p_i45394_1_);
	name = this.getClass().getSimpleName();
		this.setBlockName(name);
	
		// TODO Auto-generated constructor stub
		GameRegistry.registerBlock(this, name);
		
	
	}

	public TelGrass()
	{
		this(Material.grass);
	}
	   @Override
	    public void registerBlockIcons(IIconRegister reg)
	    {
		  if(name.contains("v2"))
		  {
			  String [] nameSplit =  name.split("_");
			  String grassColor = nameSplit[0];
			  String dirtType =  nameSplit[1];
			 
		      icons[0] = reg.registerIcon("tel:"+dirtType+"_"+"Dirt");
		      icons[1]= reg.registerIcon("tel:"+grassColor+"_"+"Grass_v2");
		      icons[2]=reg.registerIcon("tel:"+grassColor+"_Grass_Side_"+dirtType+"_Dirt_Block_v2");
		      icons[3]=reg.registerIcon("tel:"+grassColor+"_Grass_Side_"+dirtType+"_Dirt_Block_v2");
		      icons[4]=reg.registerIcon("tel:"+grassColor+"_Grass_Side_"+dirtType+"_Dirt_Block_v2");
		      icons[5]=reg.registerIcon("tel:"+grassColor+"_Grass_Side_"+dirtType+"_Dirt_Block_v2"); 
		 
		  }
		  else
		  {
			  String [] nameSplit =  name.split("_");
			  String grassColor = nameSplit[1];
			  String dirtType =  nameSplit[0];
			 
		      icons[0] = reg.registerIcon("tel:"+grassColor+"_"+"Dirt");
		      icons[1]= reg.registerIcon("tel:"+grassColor+"_"+"Grass");
		      icons[2]=reg.registerIcon("tel:"+dirtType+"_"+grassColor+"_"+"side");
		      icons[3]=reg.registerIcon("tel:"+dirtType+"_"+grassColor+"_"+"side");
		      icons[4]=reg.registerIcon("tel:"+dirtType+"_"+grassColor+"_"+"side");
		      icons[5]=reg.registerIcon("tel:"+dirtType+"_"+grassColor+"_"+"side"); 
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
