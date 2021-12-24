package com.Collecter128.fivenightsatfreddysspecialdeliverymod.materials;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.Init.ItemInit;;

public enum ArmorMaterials implements IArmorMaterial{
	
	FreddyFnaf1Armor("freddyarmor", 6, new int[] {1, 4, 5, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(Items.IRON_INGOT)),
	BonnieFnaf1Armor("bonniearmor", 6, new int[] {1, 4, 5, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(Items.IRON_INGOT)),
	GoldenFreddyFnaf1Armor("goldenfreddyarmor", 50, new int[] {2, 7, 6, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2f, 0.1f, () -> Ingredient.fromItems(Items.GOLD_INGOT)),
	
	RWQArmor("rwqarmor", 6, new int[] {1, 4, 5, 2}, 17, SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 1f, 0.1f, () -> Ingredient.fromItems(Items.IRON_INGOT)),
	FrostbearArmor("frostbeararmor", 6, new int[] {1, 4, 5, 2}, 17, SoundEvents.BLOCK_GLASS_BREAK, 1f, 0.1f, () -> Ingredient.fromItems(Items.IRON_INGOT));	//ItemInit.itemname.get()
	
	public static final int[] basedurability = {128, 144, 160, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorValue;
	private final int enchantibility;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackresistance;
	private final Ingredient RepairIngredient;

	ArmorMaterials(String name, int durabilityMultiplier, int[] armorValue, int enchantibility, SoundEvent equipSound, float toughness, float knockbackresistance, Supplier<Ingredient> RepairIngredient){
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorValue = armorValue;
		this.enchantibility = enchantibility;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackresistance = knockbackresistance;
		this.RepairIngredient = RepairIngredient.get();
	}
	
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return this.basedurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.armorValue[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.RepairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackresistance;
	}

}
