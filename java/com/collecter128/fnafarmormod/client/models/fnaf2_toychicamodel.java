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
public class fnaf2_toychicamodel extends BipedModel {
	private final ModelRenderer Headyellow;
	private final ModelRenderer feather_r1;
	private final ModelRenderer feather_r2;
	private final ModelRenderer feather_r3;
	private final ModelRenderer Head;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodyyellow;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer UpperRightLegyellow;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeg;
	private final ModelRenderer UpperLeftLegyellow;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf2_toychicamodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 129;
		
		equipmentslot = slot;
		
		MainColorDefault = 16105522;//Yellow
		MainColor = MainColorDefault;

		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		feather_r1 = new ModelRenderer(this);
		feather_r1.setPos(6.0F, -1.0F, 1.0F);
		Headyellow.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.0F, 0.0F, -0.5672F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		feather_r1.texOffs(59, 4).addBox(-1.9166F, -13.8502F, -1.9493F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		}
		
		feather_r2 = new ModelRenderer(this);
		feather_r2.setPos(-1.0F, 1.0F, 0.0F);
		Headyellow.addChild(feather_r2);
		setRotationAngle(feather_r2, 0.0F, 0.0F, 0.3491F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		feather_r2.texOffs(59, 4).addBox(-1.9166F, -13.8502F, -1.9493F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		}
		
		feather_r3 = new ModelRenderer(this);
		feather_r3.setPos(7.0F, -2.0F, 0.0F);
		Headyellow.addChild(feather_r3);
		setRotationAngle(feather_r3, 0.0F, 0.7418F, -0.6545F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		feather_r3.texOffs(44, 6).addBox(-1.9166F, -13.6F, -1.9493F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(17, 75).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(9, 61).addBox(-4.0F, -9.1943F, -5.6659F, 8.0F, 5.0F, 4.0F, 0.0F, false);
		Head.texOffs(75, 80).addBox(-1.5F, -3.0F, -6.6659F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Face_r1 = new ModelRenderer(this);
		Face_r1.setPos(-5.0F, 0.0F, -2.0F);
		Head.addChild(Face_r1);
		setRotationAngle(Face_r1, 0.0F, -0.7854F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Face_r1.texOffs(57, 80).addBox(-0.3142F, -4.1943F, -7.6659F, 4.0F, 5.0F, 4.0F, 0.2F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(1, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Bodyyellow.texOffs(70, 100).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		LowerBodyyellow = new ModelRenderer(this);
		LowerBodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodyyellow.texOffs(16, 107).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 91).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightArmyellow.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftArmyellow.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLegyellow = new ModelRenderer(this);
		UpperRightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLegyellow.texOffs(0, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLegyellow.texOffs(0, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegyellow.texOffs(76, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(58, 45).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.texOffs(16, 48).addBox(-2.5126F, 10.2843F, -4.6196F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		RightLeg.texOffs(84, 120).addBox(-0.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeg.texOffs(89, 120).addBox(-2.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeg.texOffs(94, 120).addBox(1.4874F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		}
		
		UpperLeftLegyellow = new ModelRenderer(this);
		UpperLeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLegyellow.texOffs(40, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLegyellow.texOffs(40, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegyellow.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(58, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.texOffs(46, 33).addBox(-2.4212F, 10.1635F, -4.7869F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		LeftLeg.texOffs(65, 120).addBox(1.5788F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeg.texOffs(70, 120).addBox(-0.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeg.texOffs(75, 120).addBox(-2.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
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
        
        this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LowerBodyyellow.copyFrom(this.body);
		LowerBodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.UpperRightLegyellow.copyFrom(this.rightLeg);
		UpperRightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.UpperLeftLegyellow.copyFrom(this.leftLeg);
		UpperLeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}