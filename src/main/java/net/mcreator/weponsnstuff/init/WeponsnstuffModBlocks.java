/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weponsnstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.weponsnstuff.block.TheundergroundPortalBlock;
import net.mcreator.weponsnstuff.WeponsnstuffMod;

public class WeponsnstuffModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WeponsnstuffMod.MODID);
	public static final DeferredBlock<Block> THEUNDERGROUND_PORTAL;
	static {
		THEUNDERGROUND_PORTAL = REGISTRY.register("theunderground_portal", TheundergroundPortalBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}