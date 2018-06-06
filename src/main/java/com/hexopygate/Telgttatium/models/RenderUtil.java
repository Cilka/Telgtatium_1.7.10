package com.hexopygate.Telgttatium.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public
class RenderUtil{
   public static final float S = 1F / 16F;
   
   public static void renderInOut(ModelRenderer model){ //This renders both the inside and the outside of a model
       GL11.glPushMatrix(); // Start context
       GL11.glFrontFace(GL11.GL_CW); // Set render mode to inside
       model.render(S); // Render
       GL11.glFrontFace(GL11.GL_CCW); // Set render mode to outside
       model.render(S); //Render
       GL11.glPopMatrix(); // Reset context
   }
   
   public static void renderTranslucent (ModelRenderer translucent, 
		   ModelRenderer opaque, boolean isItem){
       GL11.glPushMatrix(); // Start context
       // If the render pass is for opaque objects, render, items don't have render passes, so always render them
       if (MinecraftForgeClient.getRenderPass() == 0 || isItem) { 
           opaque.render(S);
       }
       
        // If the render pass is for translucent objects, render, items don't have render passes, so always render them
       if(MinecraftForgeClient.getRenderPass() == 1 || isItem) {
           GL11.glDepthMask(false); // Disable depth writing, but leave depth checking enabled
           GL11.glEnable(GL11.GL_BLEND); // Turn on blending
           GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE); //Choose whichever combination you like: i.imgur.com/L3iwUkv.jpg
           translucent.render(S);
       }
       
       GL11.glPopMatrix(); // End Render
   }
}