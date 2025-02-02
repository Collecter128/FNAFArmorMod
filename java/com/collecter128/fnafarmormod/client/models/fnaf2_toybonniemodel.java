package com.collecter128.fnafarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class fnaf2_toybonniemodel extends BipedModel {
	private final ModelRenderer Headlightblue;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer Head;
	private final ModelRenderer LeftEar_r2;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodylightblue;
	private final ModelRenderer LowerBody;
	private final ModelRenderer tail_r1;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer LeftArmlightblue;
	private final ModelRenderer UpperRightLeglightblue;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer UpperLeftLeglightblue;
	private final ModelRenderer LeftLeglightblue;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf2_toybonniemodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 120;
		
		equipmentslot = slot;
		
		MainColorDefault = 2925976;//LightBlue
		MainColor = MainColorDefault;

		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headlightblue.texOffs(33, 2).addBox(-4.9848F, -14.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Headlightblue.texOffs(44, 2).addBox(0.9696F, -15.0291F, -1.1428F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setPos(6.0F, -16.0F, 0.0F);
		Headlightblue.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.2618F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r1.texOffs(66, 8).addBox(-4.9848F, -4.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		LeftEar_r1.texOffs(66, 1).addBox(-10.9848F, -4.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(36, 70).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.2F, false);
		Head.texOffs(84, 3).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.2F, false);
		Head.texOffs(25, 61).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		Head.texOffs(70, 65).addBox(-0.3142F, -5.1943F, -7.6659F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(2, 52).addBox(-4.9848F, -14.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Head.texOffs(13, 52).addBox(0.9696F, -15.0291F, -1.1428F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Head.texOffs(41, 11).addBox(-3.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(53, 11).addBox(-3.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(47, 11).addBox(2.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(59, 11).addBox(2.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r2 = new ModelRenderer(this);
		LeftEar_r2.setPos(6.0F, -16.0F, 0.0F);
		Head.addChild(LeftEar_r2);
		setRotationAngle(LeftEar_r2, 0.2618F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r2.texOffs(37, 52).addBox(-4.9848F, -4.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		LeftEar_r2.texOffs(25, 52).addBox(-10.9848F, -4.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Face_r1 = new ModelRenderer(this);
		Face_r1.setPos(0.0F, 0.0F, 0.0F);
		Head.addChild(Face_r1);
		setRotationAngle(Face_r1, 0.0873F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Face_r1.texOffs(1, 61).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(57, 73).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 2.0F, 1.2F, false);
		}
		
		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(60, 69).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		LowerBodylightblue = new ModelRenderer(this);
		LowerBodylightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodylightblue.texOffs(16, 99).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		LowerBodylightblue.texOffs(16, 83).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(40, 87).addBox(-2.0F, 8.5F, 5.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		tail_r1 = new ModelRenderer(this);
		tail_r1.setPos(-4.0F, 8.0F, 4.0F);
		LowerBody.addChild(tail_r1);
		setRotationAngle(tail_r1, -1.5708F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		tail_r1.texOffs(51, 97).addBox(3.5F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.2F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightArmlightblue.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmlightblue = new ModelRenderer(this);
		LeftArmlightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightblue.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftArmlightblue.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLeglightblue = new ModelRenderer(this);
		UpperRightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeglightblue.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLeglightblue.texOffs(0, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeglightblue.texOffs(46, 34).addBox(-2.5126F, 10.2843F, -4.6196F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		RightLeglightblue.texOffs(2, 75).addBox(-0.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeglightblue.texOffs(7, 75).addBox(-2.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeglightblue.texOffs(12, 75).addBox(1.4874F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeglightblue.texOffs(76, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		UpperLeftLeglightblue = new ModelRenderer(this);
		UpperLeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeglightblue.texOffs(56, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLeglightblue.texOffs(56, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightblue.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeglightblue.texOffs(51, 46).addBox(-2.4212F, 10.1635F, -4.7869F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		LeftLeglightblue.texOffs(21, 75).addBox(1.5788F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeglightblue.texOffs(26, 75).addBox(-0.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeglightblue.texOffs(31, 75).addBox(-2.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeglightblue.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		
        this.Headlightblue.copyFrom(this.head);
		Headlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		this.Bodylightblue.copyFrom(this.body);
		Bodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.LowerBodylightblue.copyFrom(this.body);
		LowerBodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightArmlightblue.copyFrom(this.rightArm);
		RightArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightblue.copyFrom(this.leftArm);
		LeftArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.UpperRightLeglightblue.copyFrom(this.rightLeg);
		UpperRightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.UpperLeftLeglightblue.copyFrom(this.leftLeg);
		UpperLeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}