package net.mcreator.weponsnstuff.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerFallingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (0 > entity.getDeltaMovement().y()) {
		} else {
		}
	}
}