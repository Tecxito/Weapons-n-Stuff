package net.mcreator.weponsnstuff.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.weponsnstuff.network.WeponsnstuffModVariables;
import net.mcreator.weponsnstuff.init.WeponsnstuffModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerHeartDropProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WeponsnstuffModItems.HEART.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
				_vars.Total_Health = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).Total_Health - 2;
				_vars.markSyncDirty();
			}
		}
	}
}