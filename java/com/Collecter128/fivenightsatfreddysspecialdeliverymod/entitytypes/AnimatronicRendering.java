package com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.AnimatronicModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class AnimatronicRendering extends MobRenderer<Animatronic, AnimatronicModel<Animatronic>>{

	public static final ResourceLocation Texturelocation = new ResourceLocation("fnafarmod", "textures/entity/ender01.png");
	
	
	public AnimatronicRendering(EntityRendererManager renderManagerIn) {//, AnimatronicModel<Animatronic> entityModelIn,
		//float shadowSizeIn
		super(renderManagerIn, new AnimatronicModel<>(), 0.7f);
		//entityModelIn, shadowsizein
		
	}

	@Override
	public ResourceLocation getEntityTexture(Animatronic entity) {
		
		return Texturelocation;
	}

}
