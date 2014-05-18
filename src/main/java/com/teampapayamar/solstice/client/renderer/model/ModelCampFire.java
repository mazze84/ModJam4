package com.teampapayamar.solstice.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCampFire extends ModelBase
{
    ModelRenderer shape1;
    ModelRenderer shape2;
    ModelRenderer shape3;
    ModelRenderer shape4;
    ModelRenderer shape5;
    ModelRenderer shape6;

    public ModelCampFire()
    {
        textureWidth = 64;
        textureHeight = 64;

        shape1 = new ModelRenderer(this, 0, 0);
        shape1.addBox(0F, 0F, 0F, 1, 1, 12);
        shape1.setRotationPoint(0F, 23F, -7F);
        shape1.setTextureSize(64, 32);
        setRotation(shape1, 0.5948578F, 0F, 0F);

        shape2 = new ModelRenderer(this, 0, 0);
        shape2.addBox(0F, 0F, 0F, 1, 1, 12);
        shape2.setRotationPoint(-7F, 23F, 0F);
        shape2.setTextureSize(64, 32);
        setRotation(shape2, 0.5934119F, 1.658063F, 0F);

        shape3 = new ModelRenderer(this, 0, 0);
        shape3.addBox(0F, 0F, 0F, 1, 1, 12);
        shape3.setRotationPoint(0F, 23F, 7F);
        shape3.setTextureSize(64, 32);
        setRotation(shape3, 0.5934119F, 3.141593F, 0F);

        shape4 = new ModelRenderer(this, 0, 0);
        shape4.addBox(0F, 0F, 0F, 1, 1, 12);
        shape4.setRotationPoint(7F, 23F, 4F);
        shape4.setTextureSize(64, 32);
        setRotation(shape4, 0.5934119F, -2.193538F, 0F);

        shape5 = new ModelRenderer(this, 0, 0);
        shape5.addBox(0F, 0F, 0F, 1, 1, 12);
        shape5.setRotationPoint(5F, 23F, -6F);
        shape5.setTextureSize(64, 32);
        setRotation(shape5, 0.5934119F, -0.6878043F, 0F);

        shape6 = new ModelRenderer(this, 0, 0);
        shape6.addBox(0F, 0F, 0F, 1, 1, 12);
        shape6.setRotationPoint(-5F, 23F, 6F);
        shape6.setTextureSize(64, 32);
        setRotation(shape6, 0.5934119F, 2.435199F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        shape1.render(f5);
        shape2.render(f5);
        shape3.render(f5);
        shape4.render(f5);
        shape5.render(f5);
        shape6.render(f5);
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
