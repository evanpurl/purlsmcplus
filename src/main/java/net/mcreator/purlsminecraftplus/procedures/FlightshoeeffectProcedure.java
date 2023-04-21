package net.mcreator.purlsminecraftplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.purlsminecraftplus.init.PurlsMinecraftPlusModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FlightshoeeffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double helmet = 0;
		double chestplate = 0;
		double leggings = 0;
		double boots = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PurlsMinecraftPlusModItems.FLIGHTSHOES_BOOTS.get()) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
		} else {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
		}
	}
}
