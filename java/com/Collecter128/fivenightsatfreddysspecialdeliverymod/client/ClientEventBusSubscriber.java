package com.Collecter128.fivenightsatfreddysspecialdeliverymod.client;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init.EntityTypesInit;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.AnimatronicRendering;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "fnafarmod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	//
	 @SubscribeEvent
	    public static void onClientSetup(FMLClientSetupEvent event) {
		 RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ANIMATRONIC.get(), AnimatronicRendering::new);
	    }
}
