package com.Collecter128.fivenightsatfreddysspecialdeliverymod.Items;

import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.bonniearmor_main;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.foxyarmor_main;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.freddyarmor_chestplate;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.freddyarmor_feet;
import com.Collecter128.fivenightsatfreddysspecialdeliverymod.entitytypes.model.freddyarmor_main;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class FoxyArmor extends ArmorItem{

	public FoxyArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		foxyarmor_main model = new foxyarmor_main(1.0f, slot);
		model.bipedHeadwear.showModel = armorSlot == slot; //EquipmentSlotType.HEAD
        
		model.isChild = _default.isChild;
		model.isSneak = _default.isSneak;
		model.isSitting = _default.isSitting;
		model.rightArmPose = _default.rightArmPose;
		model.leftArmPose = _default.leftArmPose;

		return (A) model;
		
	}
	

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "fnafarmod:textures/armor/foxyarmor_layer_1.png";
    }
}
