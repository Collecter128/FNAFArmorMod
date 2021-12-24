package com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.Animatronic;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AnimatronicModel <T extends Animatronic> extends EntityModel<T> {
	
	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	private final ModelRenderer bb_mainHead;
	//private final ModelRenderer SupportR_r1;
	//private final ModelRenderer SupportL_r1;

	public AnimatronicModel() {
		textureWidth = 64;
		textureHeight = 64;
		
		bb_mainHead = new ModelRenderer(this);
		bb_mainHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		//head
		bb_mainHead.setTextureOffset(0, 4).addBox(-7.0F, -30.0F, 0.0F, 6.0F, 7.0F, 3.0F, 0.0F, false);
	//	bb_main.setTextureOffset(24, 21).addBox(-7.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
	//	bb_main.setTextureOffset(8, 14).addBox(-3.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
	//	bb_main.setTextureOffset(13, 13).addBox(-6.0F, -26.0F, -4.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		//body
	//	bb_main.setTextureOffset(16, 21).addBox(-5.0F, -23.0F, 0.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
	//	bb_main.setTextureOffset(0, 0).addBox(-10.0F, -21.0F, 0.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		//pelvis
	//	bb_main.setTextureOffset(26, 12).addBox(-7.0F, -9.0F, 0.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		
		//arm
	//	bb_main.setTextureOffset(0, 31).addBox(2.0F, -21.0F, 0.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		//arm
	//	bb_main.setTextureOffset(24, 24).addBox(-12.0F, -21.0F, 0.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		//leg
	//	bb_main.setTextureOffset(8, 21).addBox(-2.0F, -8.0F, 0.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
		//leg
	//	bb_main.setTextureOffset(0, 14).addBox(-8.0F, -8.0F, 0.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

//		SupportR_r1 = new ModelRenderer(this);
//		SupportR_r1.setRotationPoint(-3.0F, -15.0F, 1.0F);
//		bb_main.addChild(SupportR_r1);
//		setRotationAngle(SupportR_r1, 3.1416F, 0.0F, 0.7854F);
//		SupportR_r1.setTextureOffset(18, 4).addBox(-8.0F, -2.0F, 0.0F, 8.0F, 1.0F, 0.0F, 0.0F, false);
//
//		SupportL_r1 = new ModelRenderer(this);
//		SupportL_r1.setRotationPoint(2.0F, -19.0F, 1.0F);
//		bb_main.addChild(SupportL_r1);
//		setRotationAngle(SupportL_r1, 0.0F, 0.0F, -0.7854F);
//		SupportL_r1.setTextureOffset(20, 8).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F, 0.0F, false);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		//bb_mainHead.copyModelAngles(this.);
		bb_mainHead.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	//@Override
	//public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
	//		float red, float green, float blue, float alpha) {
	//	// TODO Auto-generated method stub
		
	//}

	@Override
	public void setRotationAngles(Animatronic entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub

		
	}
	
}
