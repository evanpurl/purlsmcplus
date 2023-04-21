package net.mcreator.purlsminecraftplus.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.purlsminecraftplus.init.PurlsMinecraftPlusModItems;

public class StomearmoreffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double helmet = 0;
		double chestplate = 0;
		double leggings = 0;
		double boots = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == PurlsMinecraftPlusModItems.STONE_ARMOR_HELMET.get()) {
			helmet = 1;
		} else {
			helmet = 0;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == PurlsMinecraftPlusModItems.STONE_ARMOR_CHESTPLATE.get()) {
			chestplate = 1;
		} else {
			chestplate = 0;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == PurlsMinecraftPlusModItems.STONE_ARMOR_LEGGINGS.get()) {
			leggings = 1;
		} else {
			leggings = 0;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PurlsMinecraftPlusModItems.STONE_ARMOR_BOOTS.get()) {
			boots = 1;
		} else {
			boots = 0;
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, (int) (helmet + chestplate + leggings + boots - 1), (false), (false)));
	}
}
