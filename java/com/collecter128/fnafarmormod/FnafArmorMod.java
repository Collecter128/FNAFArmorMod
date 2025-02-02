package com.collecter128.fnafarmormod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.collecter128.fnafarmormod.core.BlockInit;
import com.collecter128.fnafarmormod.core.ItemInit;

import net.minecraftforge.api.distmarker.Dist;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fnafarmormod")
public class FnafArmorMod
{
	public static final String Mod_ID = "fnafarmormod";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static ItemGroup FnafArmorGroupTab = new FnafArmorGroup("FnafArmorTab");
    public static ItemGroup FnafArmorBlocksGroupTab = new FnafArmorBlocksGroup("FnafArmorBlocksTab");
    public static ItemGroup FnafArmorBannersGroupTab = new FnafArmorBannerGroup("FnafArmorBannersTab");

    public FnafArmorMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.Items.register(bus);
    	BlockInit.Blocks.register(bus);
    	
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        //LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    	RenderTypeLookup.setRenderLayer(BlockInit.FazCoinPress.get(), RenderType.cutout());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            //LOGGER.info("HELLO from Register Block");
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> blockRegistryEvent) {
            // register a new item here
            //LOGGER.info("HELLO from Register Block");
        	BlockInit.Blocks.getEntries().stream().map(RegistryObject:: get).forEach(block-> {
        		blockRegistryEvent.getRegistry().register(new BlockItem(block, new Item.Properties().tab(FnafArmorMod.FnafArmorBlocksGroupTab)).setRegistryName(block.getRegistryName()));
        	});;
        }
    }
    
    public static class FnafArmorGroup extends ItemGroup{

		public FnafArmorGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.FazCoin.get().getDefaultInstance();
		}
    	
    }
    
    public static class FnafArmorBlocksGroup extends ItemGroup{

		public FnafArmorBlocksGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return BlockInit.FazBox.get().asItem().getDefaultInstance();
		}
    	
    }
    
    public static class FnafArmorBannerGroup extends ItemGroup{

		public FnafArmorBannerGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.BlankBannerPattern.get().getDefaultInstance();
		}
    	
    }
}
