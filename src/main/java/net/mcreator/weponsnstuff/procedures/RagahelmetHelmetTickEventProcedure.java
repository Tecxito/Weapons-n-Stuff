package net.mcreator.weponsnstuff.procedures;

import net.neoforged.bus.api.Event;

public class RagahelmetHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30, 1));
	}
}