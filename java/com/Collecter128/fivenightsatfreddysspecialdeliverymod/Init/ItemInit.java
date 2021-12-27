package com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.FNAFARSpecialDeliveryMod;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.materials.ArmorMaterials;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS,
			"fnafarmod");
	
	public static final RegistryObject<Item> Fazcoin = Items.register("fazcoin",
			() -> new Item(new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> FreddyMic = Items.register("freddymicrophone",
			() -> new Item(new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> FreddyHead = Items.register("freddyhead",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FreddyArmor(ArmorMaterials.FreddyFnaf1Armor, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> FreddyArmor = Items.register("freddyarmor",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FreddyArmor(ArmorMaterials.FreddyFnaf1Armor, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> FreddyLegs = Items.register("freddylegs",
			() -> new ArmorItem(ArmorMaterials.FreddyFnaf1Armor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> FreddyFeet = Items.register("freddyfeet",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FreddyArmor(ArmorMaterials.FreddyFnaf1Armor, EquipmentSlotType.FEET, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	
	public static final RegistryObject<Item> GoldenFreddyHead = Items.register("goldenfreddyhead",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.GoldenFreddyArmor(ArmorMaterials.GoldenFreddyFnaf1Armor, EquipmentSlotType.HEAD, 
					new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> GoldenFreddyArmor = Items.register("goldenfreddyarmor",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.GoldenFreddyArmor(ArmorMaterials.GoldenFreddyFnaf1Armor, EquipmentSlotType.CHEST, 
					new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> GoldenFreddyLegs = Items.register("goldenfreddylegs",
			() -> new ArmorItem(ArmorMaterials.GoldenFreddyFnaf1Armor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> GoldenFreddyFeet = Items.register("goldenfreddyfeet",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.GoldenFreddyArmor(ArmorMaterials.GoldenFreddyFnaf1Armor, EquipmentSlotType.FEET, 
					new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	
	public static final RegistryObject<Item> BonnieGuitar = Items.register("bonnieguitar",
			() -> new Item(new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> BonnieHead = Items.register("bonniehead",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.BonnieArmor(
					ArmorMaterials.BonnieFnaf1Armor, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> BonnieArmor = Items.register("bonniearmor",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.BonnieArmor(
					ArmorMaterials.BonnieFnaf1Armor, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> BonnieLegs = Items.register("bonnielegs",
			() -> new ArmorItem(ArmorMaterials.BonnieFnaf1Armor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> BonnieFeet = Items.register("bonniefeet",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.BonnieArmor(
					ArmorMaterials.BonnieFnaf1Armor, EquipmentSlotType.FEET, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> ChicaHead = Items.register("chicahead",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.ChicaArmor(
					ArmorMaterials.ChicaFnaf1Armor, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> ChicaArmor = Items.register("chicaarmor",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.ChicaArmor(
					ArmorMaterials.ChicaFnaf1Armor, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> ChicaLegs = Items.register("chicalegs",
			() -> new ArmorItem(ArmorMaterials.ChicaFnaf1Armor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> ChicaFeet = Items.register("chicafeet",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.ChicaArmor(
					ArmorMaterials.ChicaFnaf1Armor, EquipmentSlotType.FEET, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> FoxyHead = Items.register("foxyhead",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FoxyArmor(
					ArmorMaterials.FoxyFnaf1Armor, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> FoxyArmor = Items.register("foxyarmor",
			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FoxyArmor(
					ArmorMaterials.FoxyFnaf1Armor, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> FoxyLegs = Items.register("foxylegs",
			() -> new ArmorItem(ArmorMaterials.FoxyFnaf1Armor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
//	public static final RegistryObject<Item> FoxyFeet = Items.register("foxyfeet",
//			() -> new com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items.FoxyArmor(
//					ArmorMaterials.FoxyFnaf1Armor, EquipmentSlotType.FEET, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> RWQFSFASXCHead = Items.register("rwqhead",
			() -> new ArmorItem(ArmorMaterials.RWQArmor, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> RWQFSFASXCArmor = Items.register("rwqarmor",
			() -> new ArmorItem(ArmorMaterials.RWQArmor, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> RWQFSFASXCLegs = Items.register("rwqlegs",
			() -> new ArmorItem(ArmorMaterials.RWQArmor, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	public static final RegistryObject<Item> RWQFSFASXCFeet = Items.register("rwqfeet",
			() -> new ArmorItem(ArmorMaterials.RWQArmor, EquipmentSlotType.FEET, new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
	
	public static final RegistryObject<Item> ChicasCupcake = Items.register("chicas_cupcake",
			() -> new Item(new Item.Properties().group(FNAFARSpecialDeliveryMod.FnafARGroup)));
}
