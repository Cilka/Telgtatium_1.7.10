package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class TelIronFence extends BlockPane {

	protected TelIronFence(String facetexture, String trimtexture, Material mat, boolean something) {
		super(facetexture, trimtexture,mat,something);
		// TODO Auto-generated constructor stub
		String name = this.getClass().getSimpleName();
		this.setBlockName(name);
		GameRegistry.registerBlock(this, name);
	}
	
	public TelIronFence(String facetexture) {
		this("tel:"+facetexture, "tel:Glass_Trim",Material.iron,true);
	}

}
