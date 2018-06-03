// Date: 6/3/2018 10:09:51 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.hexopygate.Telgttatium.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBambooFence extends ModelBase
{
  //fields
    ModelRenderer ThreeWide;
    ModelRenderer Connector1;
    ModelRenderer Connector2;
    ModelRenderer Connector3;
    ModelRenderer Connector4;
    ModelRenderer Connector5;
    ModelRenderer FourWide;
    ModelRenderer TwoWide;
    ModelRenderer FourWide2;
  
  public ModelBambooFence()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      ThreeWide = new ModelRenderer(this, 4, 0);
      ThreeWide.addBox(-0.5F, -7F, -0.5F, 3, 16, 1);
      ThreeWide.setRotationPoint(7.5F, 15F, 0.5F);
      ThreeWide.setTextureSize(64, 32);
      ThreeWide.mirror = true;
      setRotation(ThreeWide, 0F, 3.141593F, 0F);
      Connector1 = new ModelRenderer(this, 0, 18);
      Connector1.addBox(0F, 0F, 0F, 16, 1, 1);
      Connector1.setRotationPoint(-8F, 11F, 1F);
      Connector1.setTextureSize(64, 32);
      Connector1.mirror = true;
      setRotation(Connector1, 0F, 0F, 0F);
      Connector2 = new ModelRenderer(this, 0, 18);
      Connector2.addBox(0F, 0F, 0F, 16, 1, 1);
      Connector2.setRotationPoint(-8F, 13F, 1F);
      Connector2.setTextureSize(64, 32);
      Connector2.mirror = true;
      setRotation(Connector2, 0F, 0F, 0F);
      Connector3 = new ModelRenderer(this, 0, 18);
      Connector3.addBox(0F, 0F, 0F, 16, 1, 1);
      Connector3.setRotationPoint(-8F, 21F, 1F);
      Connector3.setTextureSize(64, 32);
      Connector3.mirror = true;
      setRotation(Connector3, 0F, 0F, 0F);
      Connector4 = new ModelRenderer(this, 0, 18);
      Connector4.addBox(0F, 0F, 0F, 16, 1, 1);
      Connector4.setRotationPoint(-8F, 22F, 1F);
      Connector4.setTextureSize(64, 32);
      Connector4.mirror = true;
      setRotation(Connector4, 0F, 0F, 0F);
      Connector5 = new ModelRenderer(this, 0, 18);
      Connector5.addBox(0F, 0F, 0F, 16, 1, 1);
      Connector5.setRotationPoint(-8F, 23F, 1F);
      Connector5.setTextureSize(64, 32);
      Connector5.mirror = true;
      setRotation(Connector5, 0F, 0F, 0F);
      FourWide = new ModelRenderer(this, 13, 0);
      FourWide.addBox(-0.5F, -7F, -0.5F, 4, 16, 1);
      FourWide.setRotationPoint(-1.5F, 15F, 0.5F);
      FourWide.setTextureSize(64, 32);
      FourWide.mirror = true;
      setRotation(FourWide, 0F, 3.141593F, 0F);
      TwoWide = new ModelRenderer(this, 25, 0);
      TwoWide.addBox(-0.5F, -7F, -0.5F, 2, 16, 1);
      TwoWide.setRotationPoint(-6.5F, 15F, 0.5F);
      TwoWide.setTextureSize(64, 32);
      TwoWide.mirror = true;
      setRotation(TwoWide, 0F, 3.141593F, 0F);
      FourWide2 = new ModelRenderer(this, 13, 0);
      FourWide2.addBox(-0.5F, -7F, -0.5F, 4, 16, 1);
      FourWide2.setRotationPoint(3.5F, 15F, 0.5F);
      FourWide2.setTextureSize(64, 32);
      FourWide2.mirror = true;
      setRotation(FourWide2, 0F, 3.141593F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ThreeWide.render(f5);
    Connector1.render(f5);
    Connector2.render(f5);
    Connector3.render(f5);
    Connector4.render(f5);
    Connector5.render(f5);
    FourWide.render(f5);
    TwoWide.render(f5);
    FourWide2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}