package net.mcreator.weponsnstuff.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.weponsnstuff.network.WeponsnstuffModVariables;

public class PlayerFallingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().y() < -0.08 && !(entity.onGround() || entity.isInWaterOrBubble())) {
			if (entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks < 20) {
				{
					WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
					_vars.falling_ticks = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks + 0.5;
					_vars.markSyncDirty();
				}
			}
		} else {
			{
				WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
				_vars.falling_ticks = 0;
				_vars.markSyncDirty();
			}
		}
		itemstack.setDamageValue((int) (entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks * (-50) + 1000));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("say Damage:" + entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).falling_ticks * 2));
	}
}