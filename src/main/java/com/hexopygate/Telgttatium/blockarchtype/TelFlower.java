package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockBush;

public class TelFlower extends BlockBush {

	public TelFlower()
	{
		super();
		String name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);		 
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
}
