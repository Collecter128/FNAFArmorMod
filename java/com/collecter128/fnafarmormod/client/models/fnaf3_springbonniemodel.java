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
public class fnaf3_springbonniemodel extends BipedModel {
	private final ModelRenderer Headgold;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer Head;
	private final ModelRenderer LeftEar_r2;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodygold;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArm;
	private final ModelRenderer UpperRightLeggold;
	private final ModelRenderer UpperRightLeg;
	private final ModelRenderer UpperLeftLeggold;
	private final ModelRenderer UpperLeftLeg;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf3_springbonniemodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 112;
		texHeight = 137;
		
		equipmentslot = slot;
		
		MainColorDefault = 11906092;//gold
		MainColor = MainColorDefault;

		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgold.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgold.texOffs(26, 1).addBox(-3.9848F, -14.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Headgold.texOffs(35, 1).addBox(0.9696F, -15.0291F, -1.1428F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Headgold.texOffs(84, 81).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setPos(8.0F, -16.0F, 0.0F);
		Headgold.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r1.texOffs(55, 1).addBox(-6.9848F, -4.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		LeftEar_r1.texOffs(46, 1).addBox(-11.9848F, -4.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(13, 79).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(60, 81).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		Head.texOffs(65, 0).addBox(-3.9848F, -14.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Head.texOffs(33, 10).addBox(-2.9848F, -15.9197F, -1.1829F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(47, 11).addBox(-2.9848F, -9.9197F, -1.1829F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(39, 10).addBox(2.0152F, -15.9197F, -1.1829F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(53, 11).addBox(2.0152F, -9.9197F, -1.1829F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(74, 0).addBox(0.9696F, -15.0291F, -1.1428F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r2 = new ModelRenderer(this);
		LeftEar_r2.setPos(8.0F, -16.0F, 0.0F);
		Head.addChild(LeftEar_r2);
		setRotationAngle(LeftEar_r2, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r2.texOffs(74, 7).addBox(-6.9848F, -4.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		LeftEar_r2.texOffs(65, 7).addBox(-11.9848F, -4.9197F, -1.1829F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(2, 85).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(23, 66).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		Body.texOffs(99, 52).addBox(-1.5F, 3.0F, -3.4F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		LowerBodygold = new ModelRenderer(this);
		LowerBodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodygold.texOffs(16, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 112).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(77, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(94, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLeggold = new ModelRenderer(this);
		UpperRightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeggold.texOffs(0, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLeggold.texOffs(63, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, false);
		}
		
		UpperRightLeg = new ModelRenderer(this);
		UpperRightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeg.texOffs(0, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		UpperLeftLeggold = new ModelRenderer(this);
		UpperLeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeggold.texOffs(40, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLeggold.texOffs(86, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, true);
		}
		
		UpperLeftLeg = new ModelRenderer(this);
		UpperLeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeg.texOffs(40, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeggold.texOffs(20, 49).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.texOffs(78, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		RightLeg.texOffs(41, 34).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeggold.texOffs(49, 49).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.texOffs(78, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		LeftLeg.texOffs(49, 63).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
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
		
        this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LowerBodygold.copyFrom(this.body);
		LowerBodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.UpperRightLeggold.copyFrom(this.rightLeg);
		UpperRightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperRightLeg.copyFrom(this.rightLeg);
		UpperRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.UpperLeftLeggold.copyFrom(this.leftLeg);
		UpperLeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperLeftLeg.copyFrom(this.leftLeg);
		UpperLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}