package com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class foxyarmor_main extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public foxyarmor_main(float modelSize, EquipmentSlotType slottype) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 74;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(1, 45).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 1.0F, 1.2F, false);
		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);
		Head.setTextureOffset(39, 51).addBox(-2.2232F, -4.0811F, -8.7433F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(39, 10).addBox(2.0757F, -15.841F, -2.2986F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		Head.setTextureOffset(3, 69).addBox(-5.981F, -9.9052F, -1.3741F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(35, 62).addBox(-3.0076F, -11.9689F, -0.7672F, 5.0F, 3.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(3, 69).addBox(3.981F, -9.9963F, -0.507F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(25, 69).addBox(-9.545F, -4.4147F, -4.2231F, 6.0F, 4.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(38, 69).addBox(3.4927F, -4.4291F, -4.0866F, 6.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0873F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r1.setTextureOffset(13, 63).addBox(4.8164F, -12.0834F, -0.0557F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0873F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r2.setTextureOffset(1, 63).addBox(-9.9726F, -11.8093F, -1.4608F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0436F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		Head_r1.setTextureOffset(11, 50).addBox(-2.3104F, -28.1419F, -7.7F, 5.0F, 5.0F, 4.0F, -0.1F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.CHEST) {
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(19, 45).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(7.0F, -4.0F, 0.0F);
		Body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.7418F);
		if(slottype == EquipmentSlotType.CHEST) {
		cube_r3.setTextureOffset(54, 65).addBox(-3.0F, 1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.0F, -4.0F, 0.0F);
		Body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, -0.7418F);
		if(slottype == EquipmentSlotType.CHEST) {
		cube_r4.setTextureOffset(45, 62).addBox(-3.0F, 1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);
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
		this.Body.copyModelAngles(this.bipedBody);
		this.RightArm.copyModelAngles(this.bipedRightArm);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}