package com.collecter128.fnafarmormod.items;

import com.collecter128.fnafarmormod.client.models.fnaf3_springbonniemodel;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class fnaf3SpringBonnieArmor extends DyeableArmorItem{
	
	public int MainColorDefault = 11906092;//gold
	public int MainColor = MainColorDefault;

	public fnaf3SpringBonnieArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		fnaf3_springbonniemodel model = new fnaf3_springbonniemodel(1.0f, armorSlot);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;

//		model.young = _default.young;
//        model.crouching = _default.crouching;
//        model.riding = _default.riding;
//        model.rightArmPose = _default.rightArmPose;
//        model.leftArmPose = _default.leftArmPose;
        
        CompoundNBT compoundnbt = itemStack.getTagElement("display");

	      if(compoundnbt != null && compoundnbt.contains("color", 99)) {
	    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
	    	  //armorcolorer = compoundnbt.getInt("MainColor");
	    	  model.MainColor = compoundnbt.getInt("color");

	      }
	      
      
		this.MainColor = model.MainColor;

        return (A) model;
		
	}

	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "fnafarmormod:textures/armor/fnaf3_springbonniearmor.png";
    }
	
}
