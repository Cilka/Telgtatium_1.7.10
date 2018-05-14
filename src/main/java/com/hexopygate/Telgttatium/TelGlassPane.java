package com.hexopygate.Telgttatium;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class TelGlassPane extends Block {
	 String name = this.getClass().getSimpleName();
	 private IIcon icon;
	protected TelGlassPane(Material mat) {
		
		super(mat);
		// TODO Auto-generated constructor stub
		 
         
		this.setBlockName(name).setBlockTextureName("tel:"+name);
		this.setBlockBounds(0, 0, 0, 1, 1, .05f);
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
		
	}

	public TelGlassPane()
	{
		
	
		 this(Material.glass);
	
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


}
