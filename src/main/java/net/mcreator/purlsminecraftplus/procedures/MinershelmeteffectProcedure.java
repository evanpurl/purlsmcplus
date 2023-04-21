package net.mcreator.purlsminecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class MinershelmeteffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double helmet = 0;
		double chestplate = 0;
		double leggings = 0;
		double boots = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 0, (false), (false)));
	}
}
