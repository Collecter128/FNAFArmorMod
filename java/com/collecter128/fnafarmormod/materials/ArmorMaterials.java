package com.collecter128.fnafarmormod.materials;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;

public enum ArmorMaterials implements IArmorMaterial{
	
	BasicFnafArmor("basicfnafarmor", 15, new int[] {2, 5, 6, 3}, 3, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(Items.IRON_INGOT))
	;
	
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

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slotIn) {
		return this.basedurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotIn) {
		return this.armorValue[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantibility;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.RepairIngredient;
	}

}
