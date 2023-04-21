package net.mcreator.purlsminecraftplus.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FlightshoeeffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double helmet = 0;
		double chestplate = 0;
		double leggings = 0;
		double boots = 0;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = (true);
			_player.onUpdateAbilities();
		}
	}
}
