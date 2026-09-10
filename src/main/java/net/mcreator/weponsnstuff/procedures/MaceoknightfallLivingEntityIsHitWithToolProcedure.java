package net.mcreator.weponsnstuff.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class MaceoknightfallLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double MaceDamage = 0;
		MaceDamage = 1.5;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 50, 3, 3, 3, 1.3);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.mace.smash_ground")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.mace.smash_ground")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK), sourceentity), (float) (sourceentity.fallDistance * MaceDamage));
		sourceentity.fallDistance = 0;
		entity.push(0, 0.5, 0);
		sourceentity.push(0, 0.5, 0);
	}
}