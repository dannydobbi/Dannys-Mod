
package DannysMod.Mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelchocolateBunny extends ModelBase
{
  //fields
    ModelRenderer Back_Right;
    ModelRenderer Back_Left;
    ModelRenderer Front_Right;
    ModelRenderer Front_Left;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Ear_Left;
    ModelRenderer Ear_Right;
  
  public ModelchocolateBunny()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Back_Right = new ModelRenderer(this, 55, 0);
      Back_Right.addBox(0F, 0F, 0F, 1, 1, 1);
      Back_Right.setRotationPoint(0F, 23F, 0F);
      Back_Right.setTextureSize(64, 32);
      Back_Right.mirror = true;
      setRotation(Back_Right, 0F, 0F, 0F);
      Back_Left = new ModelRenderer(this, 55, 0);
      Back_Left.addBox(0F, 0F, 0F, 1, 1, 1);
      Back_Left.setRotationPoint(0F, 23F, -3F);
      Back_Left.setTextureSize(64, 32);
      Back_Left.mirror = true;
      setRotation(Back_Left, 0F, 0F, 0F);
      Front_Right = new ModelRenderer(this, 55, 0);
      Front_Right.addBox(0F, 0F, 0F, 1, 1, 1);
      Front_Right.setRotationPoint(-4F, 23F, 0F);
      Front_Right.setTextureSize(64, 32);
      Front_Right.mirror = true;
      setRotation(Front_Right, 0F, 0F, 0F);
      Front_Left = new ModelRenderer(this, 55, 0);
      Front_Left.addBox(0F, 0F, 0F, 1, 1, 1);
      Front_Left.setRotationPoint(-4F, 23F, -3F);
      Front_Left.setTextureSize(64, 32);
      Front_Left.mirror = true;
      setRotation(Front_Left, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 5, 2, 4);
      Body.setRotationPoint(-4F, 21F, -3F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 21, 0);
      Head.addBox(0F, 0F, 0F, 2, 2, 2);
      Head.setRotationPoint(1F, 20F, -2F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Ear_Left = new ModelRenderer(this, 0, 25);
      Ear_Left.addBox(0F, 0F, 0F, 0, 3, 1);
      Ear_Left.setRotationPoint(2F, 18F, -2.5F);
      Ear_Left.setTextureSize(64, 32);
      Ear_Left.mirror = true;
      setRotation(Ear_Left, 0.2602503F, 0F, 0F);
      Ear_Right = new ModelRenderer(this, 0, 25);
      Ear_Right.addBox(0F, 0F, 0F, 0, 3, 1);
      Ear_Right.setRotationPoint(2F, 18F, -0.5F);
      Ear_Right.setTextureSize(64, 32);
      Ear_Right.mirror = true;
      setRotation(Ear_Right, -0.260246F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Back_Right.render(f5);
    Back_Left.render(f5);
    Front_Right.render(f5);
    Front_Left.render(f5);
    Body.render(f5);
    Head.render(f5);
    Ear_Left.render(f5);
    Ear_Right.render(f5);
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
