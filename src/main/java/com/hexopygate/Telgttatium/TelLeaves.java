package com.hexopygate.Telgttatium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TelLeaves extends Block {

	protected TelLeaves(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();
			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);
		 
		    GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}

	public TelLeaves()
	{
		this(Material.leaves);
	}
}
