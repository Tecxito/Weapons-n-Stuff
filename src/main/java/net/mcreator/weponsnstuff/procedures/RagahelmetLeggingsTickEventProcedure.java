package net.mcreator.weponsnstuff.procedures;

import net.neoforged.bus.api.Event;

public class RagahelmetLeggingsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30, 1));
	}
}