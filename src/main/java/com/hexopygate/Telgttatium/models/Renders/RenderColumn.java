package com.hexopygate.Telgttatium.models.Renders;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.TileEntities.TEColumn;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderColumn extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z,
			float scale) {
		// TODO Auto-generated method stub
		TEColumn col = (TEColumn)entity;
    	IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(Telgttatium.ModId, "obj/Column.obj"));
       // ResourceLocation texture = new ResourceLocation(Telgttatium.ModId, "textures/blocks/"+ col.GetTextureName() +".png");
       // bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
        GL11.glScalef(1, 1, 1);

        model.renderAll();
        GL11.glPopMatrix();
	}

}
