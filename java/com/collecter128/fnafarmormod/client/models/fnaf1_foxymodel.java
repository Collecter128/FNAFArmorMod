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
public class fnaf1_foxymodel extends BipedModel {
	private final ModelRenderer Headred;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Head;
	private final ModelRenderer Face_r2;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodyred;
	private final ModelRenderer fur_r1;
	private final ModelRenderer fur_r2;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodyred;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArm;
	private final ModelRenderer UpperRightLegred;
	private final ModelRenderer UpperRightLeg;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLeg;
	private final ModelRenderer UpperLeftLegred;
	private final ModelRenderer UpperLeftLeg;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf1_foxymodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 129;
		
		equipmentslot = slot;
		
		MainColorDefault = 15152669;//Red
		MainColor = MainColorDefault;

		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(59, 104).addBox(-9.9848F, -11.9197F, -1.1829F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Headred.texOffs(71, 104).addBox(5.9696F, -12.0291F, -0.1428F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Headred.texOffs(59, 123).addBox(-10.0F, -5.0F, -4.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		Headred.texOffs(72, 123).addBox(4.0F, -5.0F, -4.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		Headred.texOffs(63, 116).addBox(-2.9166F, -11.8502F, -1.9493F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		Face_r1 = new ModelRenderer(this);
		Face_r1.setPos(-1.0F, 0.0F, -1.0F);
		Headred.addChild(Face_r1);
		setRotationAngle(Face_r1, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Face_r1.texOffs(55, 66).addBox(-1.3142F, -5.1943F, -7.6659F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(17, 75).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);
		//Head.texOffs(63, 116).addBox(-2.9166F, -11.8502F, -1.9493F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(85, 104).addBox(-9.9848F, -11.9197F, -1.1829F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(61, 110).addBox(-5.9848F, -9.9197F, -1.1829F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(97, 104).addBox(5.9696F, -12.0291F, -0.1428F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(73, 110).addBox(4.9696F, -10.0291F, -0.1428F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(82, 79).addBox(-2.3142F, -4.1943F, -8.6659F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		Head.texOffs(98, 79).addBox(-1.3142F, -4.5F, -9.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(52, 54).addBox(-4.0F, -10.0F, -4.5F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Face_r2 = new ModelRenderer(this);
		Face_r2.setPos(-1.0F, 0.0F, -1.0F);
		Head.addChild(Face_r2);
		setRotationAngle(Face_r2, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Face_r2.texOffs(55, 78).addBox(-1.3142F, -5.1943F, -7.6659F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(1, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		fur_r1 = new ModelRenderer(this);
		fur_r1.setPos(4.0F, -2.0F, 1.0F);
		Bodyred.addChild(fur_r1);
		setRotationAngle(fur_r1, 0.0F, -1.5708F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		fur_r1.texOffs(93, 116).addBox(-4.0F, -3.0F, -1.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		fur_r2 = new ModelRenderer(this);	
		fur_r2.setPos(-4.0F, -2.0F, -1.0F);
		Bodyred.addChild(fur_r2);
		setRotationAngle(fur_r2, 0.0F, 1.5708F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		fur_r2.texOffs(81, 116).addBox(-4.0F, -3.0F, -1.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(67, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		LowerBodyred = new ModelRenderer(this);
		LowerBodyred.setPos(0.0F, 0.0F, 0.0F);
		

		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 107).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		LowerBody.texOffs(16, 91).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		RightArm.texOffs(23, 60).addBox(-3.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.9F, false);
		RightArm.texOffs(40, 62).addBox(-3.5F, 11.0F, -0.5F, 4.0F, 6.0F, 1.0F, 0.1F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLegred = new ModelRenderer(this);
		UpperRightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLegred, 0.192F, 0.0F, 0.0349F);
		

		UpperRightLeg = new ModelRenderer(this);
		UpperRightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeg.texOffs(0, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		UpperRightLeg.texOffs(76, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		UpperRightLeg.texOffs(0, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		RightLeg.texOffs(19, 48).addBox(-3.5126F, 11.2843F, -4.6196F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		RightLeg.texOffs(0, 57).addBox(-3.5126F, 11.2843F, -7.6196F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		RightLeg.texOffs(11, 57).addBox(0.4874F, 11.2843F, -7.6196F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		}
		
		UpperLeftLegred = new ModelRenderer(this);
		UpperLeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLegred, -0.1745F, 0.0F, -0.0349F);
		

		UpperLeftLeg = new ModelRenderer(this);
		UpperLeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeg.texOffs(40, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		UpperLeftLeg.texOffs(93, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		UpperLeftLeg.texOffs(40, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		LeftLeg.texOffs(47, 38).addBox(-2.4212F, 11.1635F, -4.7869F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		LeftLeg.texOffs(11, 57).addBox(1.5788F, 11.1635F, -7.7869F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		LeftLeg.texOffs(11, 62).addBox(-2.4212F, 11.1635F, -7.7869F, 2.0F, 2.0F, 3.0F, 0.0F, false);
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
		
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.LowerBodyred.copyFrom(this.body);
		LowerBodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.UpperRightLegred.copyFrom(this.rightLeg);
		UpperRightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperRightLeg.copyFrom(this.rightLeg);
		UpperRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.UpperLeftLegred.copyFrom(this.leftLeg);
		UpperLeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperLeftLeg.copyFrom(this.leftLeg);
		UpperLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}