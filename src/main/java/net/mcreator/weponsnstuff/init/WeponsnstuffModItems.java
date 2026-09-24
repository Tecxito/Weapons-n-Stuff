/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weponsnstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.weponsnstuff.item.*;
import net.mcreator.weponsnstuff.WeponsnstuffMod;

public class WeponsnstuffModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WeponsnstuffMod.MODID);
	public static final DeferredItem<Item> MACEOKNIGHTFALL;
	public static final DeferredItem<Item> RAGA_ARMOR_HELMET;
	public static final DeferredItem<Item> RAGA_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> RAGA_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> RAGA_ARMOR_BOOTS;
	public static final DeferredItem<Item> SOUL_ESSENCE;
	public static final DeferredItem<Item> SOUL_CRYSTLE;
	public static final DeferredItem<Item> MACE_HEAD;
	public static final DeferredItem<Item> WEAPON_HANDLE;
	public static final DeferredItem<Item> MACE_BLADE;
	public static final DeferredItem<Item> SWORD_OF_LIFE_STEAL;
	public static final DeferredItem<Item> HEART;
	public static final DeferredItem<Item> BOTTLE_O_BLOOD;
	static {
		MACEOKNIGHTFALL = REGISTRY.register("maceoknightfall", MaceoknightfallItem::new);
		RAGA_ARMOR_HELMET = REGISTRY.register("raga_armor_helmet", RagahelmetItem.Helmet::new);
		RAGA_ARMOR_CHESTPLATE = REGISTRY.register("raga_armor_chestplate", RagahelmetItem.Chestplate::new);
		RAGA_ARMOR_LEGGINGS = REGISTRY.register("raga_armor_leggings", RagahelmetItem.Leggings::new);
		RAGA_ARMOR_BOOTS = REGISTRY.register("raga_armor_boots", RagahelmetItem.Boots::new);
		SOUL_ESSENCE = REGISTRY.register("soul_essence", SoulEssenceItem::new);
		SOUL_CRYSTLE = REGISTRY.register("soul_crystle", SoulCrystleItem::new);
		MACE_HEAD = REGISTRY.register("mace_head", MaceHeadItem::new);
		WEAPON_HANDLE = REGISTRY.register("weapon_handle", WeaponHandleItem::new);
		MACE_BLADE = REGISTRY.register("mace_blade", MaceBladeItem::new);
		SWORD_OF_LIFE_STEAL = REGISTRY.register("sword_of_life_steal", SwordOfLifeStealItem::new);
		HEART = REGISTRY.register("heart", HeartItem::new);
		BOTTLE_O_BLOOD = REGISTRY.register("bottle_o_blood", BottleOBloodItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}