package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

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
	@Override
	public boolean isLeaves(IBlockAccess world, int x, int y, int z)
	{
		return true;
	}
}
