package com.teampapayamar.solstice.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCampFire extends ModelBase
{
    ModelRenderer shape1 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
    ModelRenderer shape2 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
    ModelRenderer shape3 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
    ModelRenderer shape4 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
    ModelRenderer shape5 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
    ModelRenderer shape6 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);

    public ModelCampFire()
    {
        textureWidth = 64;
        textureHeight = 64;

        shape1.addBox(0F, 0F, 0F, 1, 1, 12);
        shape1.setRotationPoint(0F, 23F, -7F);
        setRotation(shape1, 0.5948578F, 0F, 0F);

        shape2.addBox(0F, 0F, 0F, 1, 1, 12);
        shape2.setRotationPoint(-7F, 23F, 0F);
        setRotation(shape2, 0.5934119F, 1.658063F, 0F);

        shape3.addBox(0F, 0F, 0F, 1, 1, 12);
        shape3.setRotationPoint(0F, 23F, 7F);
        setRotation(shape3, 0.5934119F, 3.141593F, 0F);

        shape4.addBox(0F, 0F, 0F, 1, 1, 12);
        shape4.setRotationPoint(7F, 23F, 4F);
        setRotation(shape4, 0.5934119F, -2.193538F, 0F);

        shape5.addBox(0F, 0F, 0F, 1, 1, 12);
        shape5.setRotationPoint(5F, 23F, -6F);
        setRotation(shape5, 0.5934119F, -0.6878043F, 0F);

        shape6.addBox(0F, 0F, 0F, 1, 1, 12);
        shape6.setRotationPoint(-5F, 23F, 6F);
        setRotation(shape6, 0.5934119F, 2.435199F, 0F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void renderAll()
    {
        this.shape1.render(0.0625f);
        this.shape2.render(0.0625f);
        this.shape3.render(0.0625f);
        this.shape4.render(0.0625f);
        this.shape5.render(0.0625f);
        this.shape6.render(0.0625f);
    }
}
