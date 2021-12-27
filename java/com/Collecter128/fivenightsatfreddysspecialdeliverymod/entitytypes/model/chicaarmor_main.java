package com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class chicaarmor_main extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftEar_r1;
	private final ModelRenderer RightEar_r1;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public chicaarmor_main(float modelSize, EquipmentSlotType slottype) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 59;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(25, 49).addBox(-4.0F, -8.0F, -4.3F, 8.0F, 8.0F, 1.0F, 1.0F, false);
		Head.setTextureOffset(45, 50).addBox(-2.3104F, -4.1852F, -7.7526F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, -1.5708F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r2.setTextureOffset(58, 1).addBox(-1.2692F, -12.1012F, 2.4966F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3927F, 1.5708F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r3.setTextureOffset(58, 1).addBox(-2.2599F, -11.9711F, 2.3483F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 3.1416F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r4.setTextureOffset(58, 1).addBox(-1.2692F, -11.8415F, 2.389F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.HEAD) {
		cube_r5.setTextureOffset(52, 1).addBox(-1.3564F, -11.3662F, 3.2645F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
		

		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.2618F, 0.0F, 0.0F);
		

		RightEar_r1 = new ModelRenderer(this);
		RightEar_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(RightEar_r1);
		setRotationAngle(RightEar_r1, 0.3927F, 0.0F, 0.0F);
		

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(slottype == EquipmentSlotType.CHEST) {
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
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
		RightLeg.setTextureOffset(0, 32).addBox(-3.5126F, 11.0935F, -5.6012F, 6.0F, 2.0F, 9.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 43).addBox(-1.5114F, 11.162F, -5.6145F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(slottype == EquipmentSlotType.FEET) {
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.setTextureOffset(32, 32).addBox(-2.4212F, 11.3371F, -5.7717F, 6.0F, 2.0F, 9.0F, 0.0F, false);
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