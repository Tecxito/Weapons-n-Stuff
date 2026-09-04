package net.mcreator.weponsnstuff.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.weponsnstuff.network.WeponsnstuffModVariables;

import javax.annotation.Nullable;

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
			{
				WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
				_vars.falling_ticks = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks + 1;
				_vars.markSyncDirty();
			}
		} else {
			{
				WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
				_vars.falling_ticks = 0;
				_vars.markSyncDirty();
			}
		}
	}
}