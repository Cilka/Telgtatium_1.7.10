package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TelSnow extends Block {
	protected IIcon[] icons = new IIcon[6];
	String name = null;
	protected TelSnow(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		name = this.getClass().getSimpleName();
		this.setBlockName(name);
		// TODO Auto-generated constructor stub
		GameRegistry.registerBlock(this, name);
	}
	public TelSnow() {
		this(Material.snow);
	}
	 @Override
	    public void registerBlockIcons(IIconRegister reg)
	    {
		  String [] nameSplit =  name.split("_");
		  String dirtType =  nameSplit[1];
		 
	      icons[0] = reg.registerIcon("tel:"+dirtType+"_"+"Dirt");
	      icons[1]= reg.registerIcon("tel:Snow");
	      icons[2]=reg.registerIcon("tel:"+dirtType+"_"+"Snow");
	      icons[3]=reg.registerIcon("tel:"+dirtType+"_Snow");
	      icons[4]=reg.registerIcon("tel:"+dirtType+"_Snow");
	      icons[5]=reg.registerIcon("tel:"+dirtType+"_Snow");
	    }
	   @Override
	    public IIcon getIcon(int side, int meta)
	    {
	        return icons[side];
	    }
}
