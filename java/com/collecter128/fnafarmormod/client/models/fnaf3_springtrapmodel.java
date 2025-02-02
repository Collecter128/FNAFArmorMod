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
public class fnaf3_springtrapmodel extends BipedModel {
	private final ModelRenderer Headgreen;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer Head;
	private final ModelRenderer rightEarwire_r1;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodygreen;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArm;
	private final ModelRenderer UpperRightLeggreen;
	private final ModelRenderer UpperRightLeg;
	private final ModelRenderer RightLeggreen;
	private final ModelRenderer RightLeg;
	private final ModelRenderer UpperLeftLeggreen;
	private final ModelRenderer UpperLeftLeg;
	private final ModelRenderer LeftLeggreen;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf3_springtrapmodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 112;
		texHeight = 136;

		equipmentslot = slot;
		
		MainColorDefault = 8227919;//green
		MainColor = MainColorDefault;
		
		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgreen.texOffs(26, 2).addBox(-4.9848F, -13.9197F, -1.1829F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		Headgreen.texOffs(35, 1).addBox(1.9696F, -15.0291F, -0.1428F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Headgreen.texOffs(60, 81).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setPos(-3.0F, -16.0F, 0.0F);
		Headgreen.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r1.texOffs(55, 1).addBox(4.9696F, -5.0291F, -0.1428F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(21, 86).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 8.0F, 1.0F, 1.0F, false);
		Head.texOffs(60, 69).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		Head.texOffs(42, 33).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.7F, false);
		Head.texOffs(39, 10).addBox(2.9696F, -10.0291F, -0.1428F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(53, 11).addBox(2.9696F, -16.0291F, -0.1428F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(33, 10).addBox(-4.0304F, -10.0291F, -0.1428F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		rightEarwire_r1 = new ModelRenderer(this);
		rightEarwire_r1.setPos(-11.0F, -14.0F, -1.0F);
		Head.addChild(rightEarwire_r1);
		setRotationAngle(rightEarwire_r1, 0.5672F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		rightEarwire_r1.texOffs(46, 3).addBox(4.9696F, -2.0291F, -0.1428F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(4, 86).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 8.0F, 1.0F, 1.0F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		LowerBodygreen = new ModelRenderer(this);
		LowerBodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodygreen.texOffs(16, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 112).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(77, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(94, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLeggreen = new ModelRenderer(this);
		UpperRightLeggreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeggreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeggreen.texOffs(0, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLeggreen.texOffs(63, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, false);
		}
		
		UpperRightLeg = new ModelRenderer(this);
		UpperRightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeg.texOffs(0, 113).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLeggreen = new ModelRenderer(this);
		RightLeggreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreen.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(78, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		RightLeg.texOffs(20, 49).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		UpperLeftLeggreen = new ModelRenderer(this);
		UpperLeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeggreen.texOffs(40, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLeggreen.texOffs(86, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, true);
		}
		
		UpperLeftLeg = new ModelRenderer(this);	
		UpperLeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeg.texOffs(40, 114).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLeggreen = new ModelRenderer(this);
		LeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreen.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(78, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		LeftLeg.texOffs(49, 49).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
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
		
        this.Headgreen.copyFrom(this.head);
        Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.Head.copyFrom(this.head);
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Headglowy.copyFrom(this.head);
        Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
        this.Bodygreen.copyFrom(this.body);
        Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.Body.copyFrom(this.body);
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.LowerBodygreen.copyFrom(this.body);
        LowerBodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LowerBody.copyFrom(this.body);
        LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.RightArmgreen.copyFrom(this.rightArm);
        RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArm.copyFrom(this.rightArm);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.LeftArmgreen.copyFrom(this.leftArm);
        LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftArm.copyFrom(this.leftArm);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.UpperRightLeggreen.copyFrom(this.rightLeg);
        UpperRightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.UpperRightLeg.copyFrom(this.rightLeg);
        UpperRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.RightLeggreen.copyFrom(this.rightLeg);
        RightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLeg.copyFrom(this.rightLeg);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.UpperLeftLeggreen.copyFrom(this.leftLeg);
        UpperLeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.UpperLeftLeg.copyFrom(this.leftLeg);
        UpperLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.LeftLeggreen.copyFrom(this.leftLeg);
        LeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLeg.copyFrom(this.leftLeg);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}