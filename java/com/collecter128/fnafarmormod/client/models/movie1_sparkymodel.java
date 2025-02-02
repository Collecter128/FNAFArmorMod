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
public class movie1_sparkymodel extends BipedModel {
	private final ModelRenderer Headbrown;
	private final ModelRenderer Head;
	private final ModelRenderer Headglowy;
	private final ModelRenderer Bodybrown;
	private final ModelRenderer Body;
	private final ModelRenderer LowerBodyBrown;
	private final ModelRenderer LowerBody;
	private final ModelRenderer RightArmbrown;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArmbrown;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLegbrown;
	private final ModelRenderer UpperRightLegbrown;
	private final ModelRenderer UpperRightLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLegbrown;
	private final ModelRenderer UpperLeftLegbrown;
	private final ModelRenderer UpperLeftLeg;
	private final ModelRenderer LeftLeg;
	
	public int MainColor;
	public int MainColorDefault;
	
	EquipmentSlotType equipmentslot;

	public movie1_sparkymodel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 129;
		
		equipmentslot = slot;
		
		MainColorDefault = 11773541;//Brown
		MainColor = MainColorDefault;

		Headbrown = new ModelRenderer(this);
		Headbrown.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headbrown, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headbrown.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headbrown.texOffs(55, 67).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		}
		
		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(17, 75).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(83, 77).addBox(-5.9848F, -7.9197F, -1.1829F, 1.0F, 8.0F, 3.0F, 0.5F, false);
		Head.texOffs(94, 77).addBox(5.0152F, -7.9197F, -1.1829F, 1.0F, 8.0F, 3.0F, 0.5F, false);
		Head.texOffs(55, 79).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		Head.texOffs(52, 57).addBox(-3.0F, -8.0F, -5.4F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		}
		
		Headglowy = new ModelRenderer(this);
		Headglowy.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowy, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowy.texOffs(1, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 1.0F, false);
		}
		
		Bodybrown = new ModelRenderer(this);
		Bodybrown.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodybrown.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(35, 5).addBox(-3.0F, 1.7F, -3.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		LowerBodyBrown = new ModelRenderer(this);
		LowerBodyBrown.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBodyBrown.texOffs(16, 91).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LowerBody.texOffs(16, 107).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		RightArmbrown = new ModelRenderer(this);
		RightArmbrown.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmbrown, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmbrown.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(75, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		}
		
		LeftArmbrown = new ModelRenderer(this);
		LeftArmbrown.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbrown, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbrown.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(92, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		}
		
		RightLegbrown = new ModelRenderer(this);
		RightLegbrown.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegbrown, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegbrown.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegbrown.texOffs(16, 48).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		UpperRightLegbrown = new ModelRenderer(this);
		UpperRightLegbrown.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLegbrown, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLegbrown.texOffs(0, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		UpperRightLegbrown.texOffs(63, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, false);
		}
		
		UpperRightLeg = new ModelRenderer(this);
		UpperRightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperRightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperRightLeg.texOffs(0, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.texOffs(76, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);
		RightLeg.texOffs(16, 60).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		LeftLegbrown = new ModelRenderer(this);
		LeftLegbrown.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegbrown, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegbrown.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegbrown.texOffs(45, 32).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		UpperLeftLegbrown = new ModelRenderer(this);
		UpperLeftLegbrown.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLegbrown, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLegbrown.texOffs(40, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		UpperLeftLegbrown.texOffs(86, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.2F, true);
		}
		
		UpperLeftLeg = new ModelRenderer(this);
		UpperLeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(UpperLeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		UpperLeftLeg.texOffs(40, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.texOffs(76, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
		LeftLeg.texOffs(45, 44).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
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
        
        this.Headbrown.copyFrom(this.head);
		Headbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.Headglowy.copyFrom(this.head);
		Headglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		this.Bodybrown.copyFrom(this.body);
		Bodybrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LowerBodyBrown.copyFrom(this.body);
		LowerBodyBrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LowerBody.copyFrom(this.body);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightArmbrown.copyFrom(this.rightArm);
		RightArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftArmbrown.copyFrom(this.leftArm);
		LeftArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.RightLegbrown.copyFrom(this.rightLeg);
		RightLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperRightLegbrown.copyFrom(this.rightLeg);
		UpperRightLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperRightLeg.copyFrom(this.rightLeg);
		UpperRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftLegbrown.copyFrom(this.leftLeg);
		LeftLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperLeftLegbrown.copyFrom(this.leftLeg);
		UpperLeftLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.UpperLeftLeg.copyFrom(this.leftLeg);
		UpperLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}