/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weponsnstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.weponsnstuff.item.RagahelmetItem;
import net.mcreator.weponsnstuff.item.MaceoknightfallItem;
import net.mcreator.weponsnstuff.WeponsnstuffMod;

public class WeponsnstuffModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WeponsnstuffMod.MODID);
	public static final DeferredItem<Item> MACEOKNIGHTFALL;
	public static final DeferredItem<Item> RAGAHELMET_HELMET;
	public static final DeferredItem<Item> RAGAHELMET_CHESTPLATE;
	public static final DeferredItem<Item> RAGAHELMET_LEGGINGS;
	public static final DeferredItem<Item> RAGAHELMET_BOOTS;
	static {
		MACEOKNIGHTFALL = REGISTRY.register("maceoknightfall", MaceoknightfallItem::new);
		RAGAHELMET_HELMET = REGISTRY.register("ragahelmet_helmet", RagahelmetItem.Helmet::new);
		RAGAHELMET_CHESTPLATE = REGISTRY.register("ragahelmet_chestplate", RagahelmetItem.Chestplate::new);
		RAGAHELMET_LEGGINGS = REGISTRY.register("ragahelmet_leggings", RagahelmetItem.Leggings::new);
		RAGAHELMET_BOOTS = REGISTRY.register("ragahelmet_boots", RagahelmetItem.Boots::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}