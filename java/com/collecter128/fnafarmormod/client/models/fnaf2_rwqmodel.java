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
public class fnaf2_rwqmodel extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer Head;
	private final ModelRenderer LeftEar_r2;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Headglowy;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodyblack;
	private final ModelRenderer LowerBody;
	private final ModelRenderer tail_r1;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer UpperRightLegblack;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer UpperLeftLegblack;
	private final ModelRenderer LeftLegblack;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf2_rwqmodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 120;
		
		equipmentslot = slot;
		
		MainColorDefault = 0;//Black
		MainColor = MainColorDefault;

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblack.texOffs(33, 2).addBox(-4.9848F, -14.9197F, -1.1829F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Headblack.texOffs(44, 2).addBox(0.9696F, -15.0291F, -1.1428F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setPos(6.0F, -16.0F, 0.0F);
		Headblack.addChild(LeftEar_r1);
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
		Headglowy.texOffs(57, 73).addBox(-3.5F, -7.5F, -4.0F, 7.0F, 7.0F, 2.0F, 1.2F, false);
		Headglowy.texOffs(81, 94).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		}
		
		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setPos(0.0F, 0.0F, 0.0F);
		Headglowy.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.0873F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		teeth_r1.texOffs(81, 79).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(60, 69).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		LowerBodyblack = new ModelRenderer(this);
		LowerBodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodyblack.texOffs(16, 99).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		LowerBodyblack.texOffs(16, 83).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
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
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightArmblack.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftArmblack.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLegblack = new ModelRenderer(this);
		UpperRightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLegblack.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLegblack.texOffs(0, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegblack.texOffs(46, 34).addBox(-2.5126F, 10.2843F, -4.6196F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		RightLegblack.texOffs(2, 75).addBox(-0.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLegblack.texOffs(7, 75).addBox(-2.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLegblack.texOffs(12, 75).addBox(1.4874F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLegblack.texOffs(76, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		UpperLeftLegblack = new ModelRenderer(this);
		UpperLeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLegblack.texOffs(56, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLegblack.texOffs(56, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegblack.texOffs(51, 46).addBox(-2.4212F, 10.1635F, -4.7869F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		LeftLegblack.texOffs(21, 75).addBox(1.5788F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegblack.texOffs(26, 75).addBox(-0.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegblack.texOffs(31, 75).addBox(-2.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegblack.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
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
		
        this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.LowerBodyblack.copyFrom(this.body);
		LowerBodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.UpperRightLegblack.copyFrom(this.rightLeg);
		UpperRightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.UpperLeftLegblack.copyFrom(this.leftLeg);
		UpperLeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}