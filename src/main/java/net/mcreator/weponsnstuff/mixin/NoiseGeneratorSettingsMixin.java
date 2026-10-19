package net.mcreator.weponsnstuff.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.weponsnstuff.init.WeponsnstuffModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements WeponsnstuffModBiomes.WeponsnstuffModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> weponsnstuff_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.weponsnstuff_dimensionTypeReference != null) {
			retval = WeponsnstuffModBiomes.adaptSurfaceRule(retval, this.weponsnstuff_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setweponsnstuffDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.weponsnstuff_dimensionTypeReference = dimensionType;
	}
}