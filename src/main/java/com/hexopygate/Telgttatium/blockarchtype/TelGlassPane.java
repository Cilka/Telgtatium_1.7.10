package com.hexopygate.Telgttatium.blockarchtype;

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

public class TelGlassPane extends BlockPane {
	 String name = this.getClass().getSimpleName();
	public TelGlassPane(String faceTexture , String rimTexture) {
		
		super("tel:"+faceTexture, "tel:"+rimTexture, Material.glass,true);
		// TODO Auto-generated constructor stub
		 

		this.setBlockName(name).setBlockTextureName("tel:"+name);
       GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
		
	}

	public TelGlassPane(String texture)
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
