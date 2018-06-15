package com.hexopygate.Telgttatium.buildingblocks.city;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTV extends Block {

	protected BlockTV(Material mat) {
		super(Material.rock);
		// TODO Auto-generated constructor stub
		GameRegistry.registerBlock(this, "tel:Television");
	}
	}
	
