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
public class fnaf2_intactmanglemodel extends BipedModel {
	private final ModelRenderer Headwhite;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer RightEar_r1;
	private final ModelRenderer Head;
	private final ModelRenderer LeftEar_r2;
	private final ModelRenderer RightEar_r2;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodywhite;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer UpperRightLegwhite;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeg;
	private final ModelRenderer UpperLeftLegwhite;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public fnaf2_intactmanglemodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 129;
		
		equipmentslot = slot;
		
		MainColorDefault = 16777215;//white
		MainColor = MainColorDefault;

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(69, 116).addBox(-2.5F, -12.0F, -1.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		Headwhite.texOffs(59, 123).addBox(-9.5F, -5.0F, -4.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		Headwhite.texOffs(72, 123).addBox(3.5F, -5.0F, -4.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setPos(5.0F, -9.0F, 0.0F);
		Headwhite.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r1.texOffs(97, 104).addBox(-0.0304F, -2.0291F, -0.1428F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		RightEar_r1 = new ModelRenderer(this);
		RightEar_r1.setPos(-5.0F, -9.0F, 0.0F);
		Headwhite.addChild(RightEar_r1);
		setRotationAngle(RightEar_r1, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RightEar_r1.texOffs(85, 104).addBox(-3.9848F, -1.9197F, -1.1829F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(20, 78).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 5.0F, 1.0F, false);
		Head.texOffs(82, 79).addBox(-2.3142F, -4.0F, -10.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		}
		
		LeftEar_r2 = new ModelRenderer(this);
		LeftEar_r2.setPos(5.0F, -9.0F, 0.0F);
		Head.addChild(LeftEar_r2);
		setRotationAngle(LeftEar_r2, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LeftEar_r2.texOffs(71, 104).addBox(-0.0304F, -2.0291F, -0.1428F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		RightEar_r2 = new ModelRenderer(this);
		RightEar_r2.setPos(-5.0F, -9.0F, 0.0F);
		Head.addChild(RightEar_r2);
		setRotationAngle(RightEar_r2, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RightEar_r2.texOffs(59, 104).addBox(-3.9848F, -1.9197F, -1.1829F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		Face_r1 = new ModelRenderer(this);
		Face_r1.setPos(-1.0F, -6.0F, -8.0F);
		Head.addChild(Face_r1);
		setRotationAngle(Face_r1, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Face_r1.texOffs(55, 78).addBox(-1.3142F, 1.8057F, -3.6659F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(1, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(42, 6).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		LowerBodywhite = new ModelRenderer(this);
		LowerBodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodywhite.texOffs(16, 107).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		LowerBodywhite.texOffs(83, 106).addBox(1.0F, 10.0F, 2.0F, 1.0F, 11.0F, 12.0F, 1.01F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 91).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		LowerBody.texOffs(1, 55).addBox(1.0F, 10.0F, 2.0F, 1.0F, 11.0F, 12.0F, 1.01F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(41, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightArmwhite.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(47, 53).addBox(-2.5F, 10.0F, -1.5F, 3.0F, 1.0F, 3.0F, 1.8F, false);
		RightArm.texOffs(62, 54).addBox(-3.5F, 13.0F, 0.5F, 4.0F, 6.0F, 1.0F, 1.0F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(58, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftArmwhite.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		UpperRightLegwhite = new ModelRenderer(this);
		UpperRightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLegwhite.texOffs(0, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLegwhite.texOffs(0, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegwhite.texOffs(17, 48).addBox(-2.5126F, 10.2843F, -4.6196F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		RightLegwhite.texOffs(76, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(67, 95).addBox(-0.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeg.texOffs(72, 95).addBox(-2.5126F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		RightLeg.texOffs(77, 95).addBox(1.4874F, 11.2843F, -5.6196F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		}
		
		UpperLeftLegwhite = new ModelRenderer(this);
		UpperLeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLegwhite.texOffs(40, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLegwhite.texOffs(40, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegwhite.texOffs(45, 38).addBox(-2.4212F, 10.1635F, -4.7869F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		LeftLegwhite.texOffs(65, 120).addBox(1.5788F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegwhite.texOffs(70, 120).addBox(-0.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegwhite.texOffs(75, 120).addBox(-2.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLegwhite.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(86, 95).addBox(1.5788F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeg.texOffs(91, 95).addBox(-0.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LeftLeg.texOffs(96, 95).addBox(-2.4212F, 11.1635F, -5.7869F, 1.0F, 1.0F, 1.0F, 0.3F, false);
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
		
        this.Headwhite.copyFrom(this.head);
        Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.Head.copyFrom(this.head);
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Headglowy.copyFrom(this.head);
        Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
        this.Bodywhite.copyFrom(this.body);
        Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.Body.copyFrom(this.body);
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.LowerBodywhite.copyFrom(this.body);
        LowerBodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LowerBody.copyFrom(this.body);
        LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.RightArmwhite.copyFrom(this.rightArm);
        RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArm.copyFrom(this.rightArm);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        
        this.LeftArmwhite.copyFrom(this.leftArm);
        LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
        this.UpperRightLegwhite.copyFrom(this.rightLeg);
        UpperRightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLegwhite.copyFrom(this.rightLeg);
        RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLeg.copyFrom(this.rightLeg);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
        this.UpperLeftLegwhite.copyFrom(this.leftLeg);
        UpperLeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLegwhite.copyFrom(this.leftLeg);
        LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLeg.copyFrom(this.leftLeg);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}