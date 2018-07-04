package com.hexopygate.Telgttatium.buildingblocks.columns;

import com.hexopygate.Telgttatium.TileEntities.TEColumn;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Black_Diamond_Column extends BlockContainer {
	 String name ;
	protected Black_Diamond_Column(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		setResistance(100);
		setHardness(100);
		name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	public Black_Diamond_Column()
	{
		this(Material.rock);
		
	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TEColumn(name);
	}
	

}
