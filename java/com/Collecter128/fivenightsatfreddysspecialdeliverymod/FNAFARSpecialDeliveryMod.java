package com.Collecter128.fivenightsatfreddysspecialdeliverymod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init.EntityTypesInit;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init.ItemInit;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.Animatronic;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.AnimatronicRendering;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fnafarmod")
public class FNAFARSpecialDeliveryMod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    
    public static ItemGroup FnafARGroup = new FnafARGroup("fnafartab");

    public FNAFARSpecialDeliveryMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.Items.register(bus);
    	EntityTypesInit.EntityTypes.register(bus);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        //EntityTypesInit.EntityTypes.register(FMLJavaModLoadingContext.get().getModEventBus());
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SuppressWarnings("deprecation")
    private void setup(final FMLCommonSetupEvent event)
    {
    	DeferredWorkQueue.runLater(() -> {
    	//	GlobalEntityTypeAttributes.put(EntityTypesInit.ANIMATRONIC.get(), Animatronic.setCustomAttributes().create());
    	});
    }

    public static class FnafARGroup extends ItemGroup{

		public FnafARGroup(String label) {
			super("FnafARModtab");
		}

		@Override
		public ItemStack createIcon() {

			return ItemInit.Fazcoin.get().getDefaultInstance();
		}
    	
    }
}
