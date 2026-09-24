package net.mcreator.weponsnstuff.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.weponsnstuff.network.WeponsnstuffModVariables;

public class Add_HeartProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).Total_Health < WeponsnstuffModVariables.MapVariables.get(world).Max_Health) {
			{
				WeponsnstuffModVariables.PlayerVariables _vars = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES);
				_vars.Total_Health = entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).Total_Health + 2;
				_vars.markSyncDirty();
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			itemstack.shrink(1);
		}
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity4.getAttribute(Attributes.MAX_HEALTH).setBaseValue(entity.getData(WeponsnstuffModVariables.PLAYER_VARIABLES).Total_Health);
	}
}