package com.hexopygate.Telgttatium.blockarchtype;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class TelGlass extends Block {
	String oName = this.getClass().getSimpleName();
	boolean isTransperent;
	 private static final IIcon[] field_149998_a = new IIcon[16];
	public TelGlass(Material mat, boolean isTransparent) {
		super(mat);
		// TODO Auto-generated constructor stub
		this.isTransperent = isTransparent;
		
		 this.setBlockName(oName).setBlockTextureName("tel:"+oName);
		 
		    GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}

	public TelGlass()
	{
		this(Material.glass,true);
	
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
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube()
	{
		return false;
	}
}
