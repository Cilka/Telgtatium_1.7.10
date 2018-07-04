package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class TelDirt extends Block {

	protected TelDirt(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}

	public TelDirt()
	{
		this(Material.ground);
	}
	@Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable)
    {
	   return true;
    }
}
