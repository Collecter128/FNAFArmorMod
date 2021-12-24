package com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.Animatronic;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> EntityTypes = DeferredRegister.create(ForgeRegistries.ENTITIES, "fnafarmod");

	public static final RegistryObject<EntityType<Animatronic>> ANIMATRONIC = EntityTypes.register("animatronic", 
			() -> EntityType.Builder.create(Animatronic::new, EntityClassification.MONSTER).size(1.0f, 1.0f).build(new ResourceLocation("fnafarmod", "animatronic").toString()));
	
}
