package com.hexopygate.Telgttatium.blockarchtype;

import java.util.List;

import com.hexopygate.Telgttatium.TileEntities.TESindrintariaFence;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TelSindrintariaFence extends BlockContainer{
 String name = null;
	protected TelSindrintariaFence(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		  name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);
		 this.setStepSound(soundTypeWood);
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	
	}
	public TelSindrintariaFence() {
		this(Material.gourd);
		}
	@Override 	
	public int getRenderType()
	{
		return -1;
	}
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	@Override
	public boolean isNormalCube()
	{
		return false;
	}
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
	if (entity == null)
	{
	return;
	}

	TESindrintariaFence tile = (TESindrintariaFence) world.getTileEntity(x, y, z);
	tile.textureName = this.getClass().getSimpleName();
	tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	}
	
	@Override 
	 public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
	{
		this.setBlockBounds(0, 0.0F, 0, 1, 1.5F, 1);
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
   
	}
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		// TODO Auto-generated method stub
	
		return new TESindrintariaFence();
	}
	   public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
	    {
	        Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
	        return block != this && block != Blocks.fence_gate ? (block.isOpaqueCube() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false) : true;
	    }

}
