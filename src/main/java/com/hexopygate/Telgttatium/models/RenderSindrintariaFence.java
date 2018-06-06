package com.hexopygate.Telgttatium.models;

import org.lwjgl.opengl.GL11;

import com.hexopygate.Telgttatium.TileEntities.TEFence;
import com.hexopygate.Telgttatium.TileEntities.TESindrintariaFence;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RenderSindrintariaFence extends TileEntitySpecialRenderer{
protected ModelSindrintariaFence fence;
protected ResourceLocation texture;
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z,
			float scale) {
		// TODO Auto-generated method stub
		TESindrintariaFence fence= (TESindrintariaFence)tile;
		if(fence.textureName != null)
			texture = new ResourceLocation("tel:textures/blocks/"+fence.textureName+".png");
		GL11.glPushMatrix();
		 GL11.glEnable(GL11.GL_BLEND); 
			//To get in middle of rendering
			GL11.glTranslated(x+.5, y+1.5, z+.5);
			GL11.glRotated(180, 0, 0, 1);
			
		
			GL11.glPushMatrix();
			GL11.glRotated(fence.direction*90, 0, 1, 0);
			this.bindTexture(texture);
			//Techne spefific transforms
			this.fence.render((Entity)null, 0, -0.1f, 0, 0, 0, .0625f);
			GL11.glPopMatrix();
			GL11.glDisable(GL11.GL_BLEND);
	    GL11.glPopMatrix();
	
	}



	public RenderSindrintariaFence()
	{
		
		fence= new ModelSindrintariaFence();
		
	}



}
