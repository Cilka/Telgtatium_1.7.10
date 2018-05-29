package com.hexopygate.Telgttatium.buildingblocks.city;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockTV extends Block {

	protected BlockTV(Material mat) {
		super(Material.rock);
		// TODO Auto-generated constructor stub
		GameRegistry.registerBlock(this, "tel:Television");
	}
	}
	
