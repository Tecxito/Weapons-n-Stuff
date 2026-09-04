/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weponsnstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.weponsnstuff.item.MaceoknightfallItem;
import net.mcreator.weponsnstuff.WeponsnstuffMod;

public class WeponsnstuffModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WeponsnstuffMod.MODID);
	public static final DeferredItem<Item> MACEOKNIGHTFALL = REGISTRY.register("maceoknightfall", MaceoknightfallItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}