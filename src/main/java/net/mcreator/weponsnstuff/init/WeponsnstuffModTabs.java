/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weponsnstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.weponsnstuff.WeponsnstuffMod;

@EventBusSubscriber
public class WeponsnstuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeponsnstuffMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WEPONS_N_STUFF = REGISTRY.register("wepons_n_stuff",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.weponsnstuff.wepons_n_stuff")).icon(() -> new ItemStack(WeponsnstuffModItems.SOUL_ESSENCE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WeponsnstuffModItems.MACEOKNIGHTFALL.get());
				tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_HELMET.get());
				tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_CHESTPLATE.get());
				tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_LEGGINGS.get());
				tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_BOOTS.get());
				tabData.accept(WeponsnstuffModItems.SOUL_ESSENCE.get());
				tabData.accept(WeponsnstuffModItems.MACE_HEAD.get());
				tabData.accept(WeponsnstuffModItems.WEAPON_HANDLE.get());
				tabData.accept(WeponsnstuffModItems.MACE_BLADE.get());
				tabData.accept(WeponsnstuffModBlocks.SOUL_CORE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(WeponsnstuffModItems.MACEOKNIGHTFALL.get());
			tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_HELMET.get());
			tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_CHESTPLATE.get());
			tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_LEGGINGS.get());
			tabData.accept(WeponsnstuffModItems.RAGA_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(WeponsnstuffModItems.SOUL_ESSENCE.get());
		}
	}
}