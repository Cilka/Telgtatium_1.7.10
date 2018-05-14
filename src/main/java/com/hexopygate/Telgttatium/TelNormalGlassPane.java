package com.hexopygate.Telgttatium;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TelNormalGlassPane extends BlockPane
{
	 String name = this.getClass().getSimpleName();
	public TelNormalGlassPane(String faceTexture , String rimTexture) {
		
		super(faceTexture, rimTexture, Material.glass,true);
		// TODO Auto-generated constructor stub
		 

		this.setBlockName(name).setBlockTextureName("tel:"+name);
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
		
	}

	public TelNormalGlassPane(String texture)
	{
		this(texture,texture);
	}
	@Override
	  @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }

}
