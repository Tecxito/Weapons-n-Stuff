package net.mcreator.weponsnstuff.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

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
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.level().getScoreboard();
			Objective _so = _sc.getObjective("fall_count");
			if (_so == null)
				_so = _sc.addObjective("fall_count", ObjectiveCriteria.DUMMY, Component.literal("fall_count"), ObjectiveCriteria.RenderType.INTEGER, true, null);
			_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set((int) entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks);
		}
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