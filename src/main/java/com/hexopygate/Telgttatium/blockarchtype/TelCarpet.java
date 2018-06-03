package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TelCarpet extends Block {
	 String name = this.getClass().getSimpleName();
	public TelCarpet(Material carpet) {
		super(carpet);
	     String texName= name.split("_")[0];
		 this.setBlockName(name).setBlockTextureName("tel:"+ texName);
		 this.setBlockBounds(0, 0, 0, 1, .07F, 1);	
		    GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
		
	}

	public TelCarpet() {
		this(Material.carpet);
	}

	/*
	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		// TODO Auto-generated method stub
		return new TECarpet(name);
	}*/
	@Override
	public boolean renderAsNormalBlock()
	{
		return 	false;
	}
	
/*
	@Override
    public int getRenderType(){
        return -1;
    }*/

    @Override 
    public boolean isOpaqueCube() {
    return false;
    
    }
}
