package com.hexopygate.Telgttatium;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemLead;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TelFence extends Block{
 String name = null;
	protected TelFence(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		  name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name).setBlockBounds(0, 0, 0, 1, 1, .005f);;
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	
	}
	public TelFence()
	{
		this(Material.gourd);
		
	}
	@Override
	  public int getRenderType()
    {
        return 0;
    }
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	@Override
	  @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }
	   public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
	    {
	        Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
	        return block != this && block != Blocks.fence_gate ? (block.isOpaqueCube() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false) : true;
	    }
	   @Override
	   public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
	    {
	        boolean back = this.canConnectFenceTo(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ - 1);
	        boolean front = this.canConnectFenceTo(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ + 1);
	        boolean left = this.canConnectFenceTo(p_149743_1_, p_149743_2_ - 1, p_149743_3_, p_149743_4_);
	        boolean right = this.canConnectFenceTo(p_149743_1_, p_149743_2_ + 1, p_149743_3_, p_149743_4_);
	        float f = 0.375F;
	        float f1 = 0.385F;
	        float f2 = 0.375F;
	        float f3 = 0.385F;

	        if (back)
	        {
	            f2 = 0.0F;
	       
	        }

	        if (front)
	        {
	            f3 = 1.0F;
	        }

	        if (back || front)
	        {
	            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
	            super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
	        }

	        f2 = 0.375F;
	        f3 = 0.385F;

	        if (left)
	        {
	            f = 0.0F;
	        }

	        if (right)
	        {
	            f1 = 1.0F;
	        }

	        if (left || right || !back && !front)
	        {
	            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
	            super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
	        }

	        
	        if (back)
	        {
	            f2 = 0.0F;
	        }

	        if (front)
	        {
	            f3 = 1.0F;
	        }

	        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
	    }
	   @Override
	   public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	    {
	        boolean flag = this.canConnectFenceTo(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ - 1);
	        boolean flag1 = this.canConnectFenceTo(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ + 1);
	        boolean flag2 = this.canConnectFenceTo(p_149719_1_, p_149719_2_ - 1, p_149719_3_, p_149719_4_);
	        boolean flag3 = this.canConnectFenceTo(p_149719_1_, p_149719_2_ + 1, p_149719_3_, p_149719_4_);
	        float f = 0.375F;
	        float f1 = 0.385F;
	        float f2 = 0.375F;
	        float f3 = 0.385F;

	        if (flag)
	        {
	            f2 = 0.0F;
	        }

	        if (flag1)
	        {
	            f3 = 1.0F;
	        }

	        if (flag2)
	        {
	            f = 0.0F;
	        }

	        if (flag3)
	        {
	            f1 = 1.0F;
	        }

	        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
	    }
	@Override
	 @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("tel:"+name);
    }

}
