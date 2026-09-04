package net.mcreator.weponsnstuff.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class MaceoknightfallEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.BREEZE_WIND_CHARGE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 1.5, entity.getZ()), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((1.5 * (-1) * Math.sin(Math.toRadians(entity.getYRot())) * Math.cos(Math.toRadians(entity.getXRot()))), (1.5 * (-1) * Math.sin(Math.toRadians(entity.getXRot()))),
						(1.5 * Math.cos(Math.toRadians(entity.getYRot())) * Math.cos(Math.toRadians(entity.getXRot()))));
			}
		}
	}
}