package com.collecter128.fnafarmormod.core;

import java.util.ArrayList;
import java.util.List;

import com.collecter128.fnafarmormod.FnafArmorMod;
import com.collecter128.fnafarmormod.client.CustomPatterns;
import com.collecter128.fnafarmormod.items.*;
import com.collecter128.fnafarmormod.materials.ArmorMaterials;

import net.minecraft.client.Minecraft;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.PotionUtils;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, "fnafarmormod"); //MegamanArmorMod.Mod_ID
	
	public static final List<BannerPattern> PATTERNS = new ArrayList<>();
	public static final List<RegistryObject<Item>> PATTERN_ITEMS = new ArrayList<>();


	    static {
	        for (CustomPatterns cp : CustomPatterns.values()) {
	            String name = cp.getName();
	            BannerPattern pattern = BannerPattern.create(cp.name(), name, name, true);
	            RegistryObject<Item> pattern_item = 
	            		Items.register(name + "_banner_pattern", () -> new BannerPatternItem(pattern, 
	            				new Item.Properties().tab(FnafArmorMod.FnafArmorBannersGroupTab)));
	            PATTERNS.add(pattern);
	            PATTERN_ITEMS.add(pattern_item);
	        }
	    }
	
	//public static final RegistryObject<Item> CircleBannerPattern = Items.register("circle_banner_pattern",
	//		() -> new BannerPatternItem(null, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> FazCoin = Items.register("fazcoin",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinRoll = Items.register("fazcoin_roll",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinStack = Items.register("fazcoin_stack",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinCup = Items.register("fazcoin_cup",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinTub = Items.register("fazcoin_tub",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinSack = Items.register("fazcoin_sack",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> FazCoinTruck = Items.register("fazcoin_truck",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> BlankBannerPattern = Items.register("blank_banner_pattern",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorBannersGroupTab)));
	
	//Fnaf1
	
	public static final RegistryObject<Item> Fnaf1FreddyMicrophone = Items.register("fnaf1freddy_microphone",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1Freddy_Head = Items.register("fnaf1freddy_head",
			() -> new fnaf1FreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Freddy_Body = Items.register("fnaf1freddy_body",
			() -> new fnaf1FreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Freddy_Legs = Items.register("fnaf1freddy_legs",
			() -> new fnaf1FreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Freddy_Boots = Items.register("fnaf1freddy_boots",
			() -> new fnaf1FreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> Fnaf1BonnieGuitar = Items.register("fnaf1bonnie_guitar",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1Bonnie_Head = Items.register("fnaf1bonnie_head",
			() -> new fnaf1BonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Bonnie_Body = Items.register("fnaf1bonnie_body",
			() -> new fnaf1BonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Bonnie_Legs = Items.register("fnaf1bonnie_legs",
			() -> new fnaf1BonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Bonnie_Boots = Items.register("fnaf1bonnie_boots",
			() -> new fnaf1BonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> Fnaf1Cupcake = Items.register("fnaf1cupcake",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1Chica_Head = Items.register("fnaf1chica_head",
			() -> new fnaf1ChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Chica_Body = Items.register("fnaf1chica_body",
			() -> new fnaf1ChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Chica_Legs = Items.register("fnaf1chica_legs",
			() -> new fnaf1ChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Chica_Boots = Items.register("fnaf1chica_boots",
			() -> new fnaf1ChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1Foxy_Head = Items.register("fnaf1foxy_head",
			() -> new fnaf1FoxyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Foxy_Body = Items.register("fnaf1foxy_body",
			() -> new fnaf1FoxyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Foxy_Legs = Items.register("fnaf1foxy_legs",
			() -> new fnaf1FoxyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1Foxy_Boots = Items.register("fnaf1foxy_boots",
			() -> new fnaf1FoxyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1Bonnie_HeadEyeless = Items.register("fnaf1bonnie_headeyeless",
			() -> new fnaf1BonnieArmorEyeless(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> Fnaf1GoldenFreddyMicrophone = Items.register("fnaf1goldenfreddy_microphone",
			() -> new Item(new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf1GoldenFreddy_Head = Items.register("fnaf1goldenfreddy_head",
			() -> new fnaf1GoldenFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1GoldenFreddy_Body = Items.register("fnaf1goldenfreddy_body",
			() -> new fnaf1GoldenFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1GoldenFreddy_Legs = Items.register("fnaf1goldenfreddy_legs",
			() -> new fnaf1GoldenFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf1GoldenFreddy_Boots = Items.register("fnaf1goldenfreddy_boots",
			() -> new fnaf1GoldenFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> movie1GoldenFreddy_Head = Items.register("movie1goldenfreddy_head",
			() -> new movie1GoldenFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> movie1Sparky_Head = Items.register("movie1sparky_head",
			() -> new movie1SparkyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> movie1Sparky_Body = Items.register("movie1sparky_body",
			() -> new movie1SparkyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> movie1Sparky_Legs = Items.register("movie1sparky_legs",
			() -> new movie1SparkyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> movie1Sparky_Boots = Items.register("movie1sparky_boots",
			() -> new movie1SparkyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	//Fnaf2
	
	public static final RegistryObject<Item> fnaf2ToyFreddy_Head = Items.register("fnaf2toyfreddy_head",
			() -> new fnaf2ToyFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyFreddy_Body = Items.register("fnaf2toyfreddy_body",
			() -> new fnaf2ToyFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyFreddy_Legs = Items.register("fnaf2toyfreddy_legs",
			() -> new fnaf2ToyFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyFreddy_Boots = Items.register("fnaf2toyfreddy_boots",
			() -> new fnaf2ToyFreddyArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf2ToyBonnie_Head = Items.register("fnaf2toybonnie_head",
			() -> new fnaf2ToyBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyBonnie_Body = Items.register("fnaf2toybonnie_body",
			() -> new fnaf2ToyBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyBonnie_Legs = Items.register("fnaf2toybonnie_legs",
			() -> new fnaf2ToyBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyBonnie_Boots = Items.register("fnaf2toybonnie_boots",
			() -> new fnaf2ToyBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf2ToyChica_Head = Items.register("fnaf2toychica_head",
			() -> new fnaf2ToyChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyChica_Body = Items.register("fnaf2toychica_body",
			() -> new fnaf2ToyChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyChica_Legs = Items.register("fnaf2toychica_legs",
			() -> new fnaf2ToyChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2ToyChica_Boots = Items.register("fnaf2toychica_boots",
			() -> new fnaf2ToyChicaArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf2Puppet_Head = Items.register("fnaf2puppet_head",
			() -> new fnaf2PuppetArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2Puppet_Body = Items.register("fnaf2puppet_body",
			() -> new fnaf2PuppetArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2Puppet_Legs = Items.register("fnaf2puppet_legs",
			() -> new fnaf2PuppetArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2Puppet_Boots = Items.register("fnaf2puppet_boots",
			() -> new fnaf2PuppetArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf2RWQ_Head = Items.register("fnaf2rwq_head",
			() -> new fnaf2RWQArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2RWQ_Body = Items.register("fnaf2rwq_body",
			() -> new fnaf2RWQArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2RWQ_Legs = Items.register("fnaf2rwq_legs",
			() -> new fnaf2RWQArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf2RWQ_Boots = Items.register("fnaf2rwq_boots",
			() -> new fnaf2RWQArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf2ToyChica_HeadBeakless = Items.register("fnaf2toychica_headbeakless",
			() -> new fnaf2ToyChicaArmorBeakless(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	//Fnaf 3
	
	public static final RegistryObject<Item> fnaf3SpringBonnie_Head = Items.register("fnaf3springbonnie_head",
			() -> new fnaf3SpringBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3SpringBonnie_Body = Items.register("fnaf3springbonnie_body",
			() -> new fnaf3SpringBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3SpringBonnie_Legs = Items.register("fnaf3springbonnie_legs",
			() -> new fnaf3SpringBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3SpringBonnie_Boots = Items.register("fnaf3springbonnie_boots",
			() -> new fnaf3SpringBonnieArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
	public static final RegistryObject<Item> fnaf3Springtrap_Head = Items.register("fnaf3springtrap_head",
			() -> new fnaf3SpringtrapArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3Springtrap_Body = Items.register("fnaf3springtrap_body",
			() -> new fnaf3SpringtrapArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3Springtrap_Legs = Items.register("fnaf3springtrap_legs",
			() -> new fnaf3SpringtrapArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	public static final RegistryObject<Item> fnaf3Springtrap_Boots = Items.register("fnaf3springtrap_boots",
			() -> new fnaf3SpringtrapArmor(ArmorMaterials.BasicFnafArmor, EquipmentSlotType.FEET, new Item.Properties().tab(FnafArmorMod.FnafArmorGroupTab)));
	
}
