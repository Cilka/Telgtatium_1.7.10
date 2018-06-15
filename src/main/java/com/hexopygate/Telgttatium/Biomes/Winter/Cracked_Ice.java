package com.hexopygate.Telgttatium.Biomes.Winter;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

public class Cracked_Ice extends BlockBreakable {

	protected Cracked_Ice(String texture,Material mat,boolean something) {
		super(texture,mat,something);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();
			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);
		 
		    GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
		     this.slipperiness = 0.98F;
		     this.setTickRandomly(true);
		    
	}

	public Cracked_Ice() {
		this("tel:Cracked_Ice",Material.ice,false);
	}
}
