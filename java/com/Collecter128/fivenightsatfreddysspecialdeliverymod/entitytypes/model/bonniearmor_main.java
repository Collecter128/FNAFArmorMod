package com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class bonniearmor_main extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer RightEar_r1;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public bonniearmor_main(float modelSize, EquipmentSlotType slottype) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 55;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(38, 45).addBox(-3.3142F, -4.1943F, -7.6659F, 7.0F, 5.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(39, 10).addBox(2.0757F, -15.841F, -2.2986F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		Head.setTextureOffset(53, 11).addBox(2.0757F, -10.8739F, -2.1F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r1.setTextureOffset(47, 11).addBox(-2.9924F, -10.9108F, -1.0337F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		cube_r1.setTextureOffset(33, 10).addBox(-2.9924F, -15.8996F, -1.4F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		cube_r1.setTextureOffset(35, 1).addBox(1.0719F, -14.8775F, -1.6893F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(26, 1).addBox(-3.9962F, -14.9361F, -1.132F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.2618F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		LeftEar_r1.setTextureOffset(55, 1).addBox(1.0F, -20.6F, 1.6192F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		RightEar_r1 = new ModelRenderer(this);
		RightEar_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(RightEar_r1);
		setRotationAngle(RightEar_r1, 0.3927F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		RightEar_r1.setTextureOffset(46, 1).addBox(-4.0F, -20.0F, 4.0405F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.CHEST) {
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(19, 45).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.CHEST) {
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.CHEST) {
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(slottype == EquipmentSlotType.FEET) {
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.setTextureOffset(0, 32).addBox(-3.5126F, 10.2843F, -4.6196F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(slottype == EquipmentSlotType.FEET) {
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.setTextureOffset(29, 32).addBox(-2.4212F, 10.1635F, -4.7869F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		}
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		this.Head.copyModelAngles(this.bipedHead);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Body.copyModelAngles(this.bipedBody);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightArm.copyModelAngles(this.bipedRightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}