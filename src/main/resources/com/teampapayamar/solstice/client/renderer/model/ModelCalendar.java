package com.teampapayamar.solstice.client.renderer.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelCalendar extends ModelBase
{
    public ModelRenderer shape1 = (new ModelRenderer(this, 22, 0)).setTextureSize(64, 64);
    public ModelRenderer shape2 = (new ModelRenderer(this, 0, 10)).setTextureSize(64, 64);
    public ModelRenderer shape3 = (new ModelRenderer(this, 0, 0)).setTextureSize(64, 64);
    public ModelRenderer shape4 = (new ModelRenderer(this, 22, 4)).setTextureSize(64, 64);

    public ModelCalendar()
    {
        this.shape1.addBox(2F, 0F, 0F, 12, 2, 2);
        shape1.setRotationPoint(-8F, 8F, 6F);

        this.shape2.addBox(0F, 0F, 0F, 12, 10, 0);
        this.shape2.setRotationPoint(-6F, 10F, 8F);

        this.shape3.addBox(0F, 0F, 0F, 10, 9, 1);
        this.shape3.setRotationPoint(-5F, 10F, 6F);

        this.shape4.addBox(0F, 0F, 0F, 8, 1, 1);
        this.shape4.setRotationPoint(-4F, 7F, 7F);
        shape4.rotateAngleZ = 0.0174533F;
    }

    public void renderAll()
    {
        this.shape1.render(0.0625F);
        this.shape2.render(0.0625F);
        this.shape3.render(0.0625F);
        this.shape4.render(0.0625F);
    }
}