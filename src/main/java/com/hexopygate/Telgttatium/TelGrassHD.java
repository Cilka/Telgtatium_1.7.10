package com.hexopygate.Telgttatium;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

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
		
		 
	      icons[0] = reg.registerIcon("tel:Dirt");
	      icons[1]= reg.registerIcon("tel:"+name);
	      icons[2]=reg.registerIcon("tel:Dirt");
	      icons[3]=reg.registerIcon("tel:Dirt");
	      icons[4]=reg.registerIcon("tel:Dirt");
	      icons[5]=reg.registerIcon("tel:Dirt");
	    }
	   @Override
	    public IIcon getIcon(int side, int meta)
	    {
	        return icons[side];
	    }
}
