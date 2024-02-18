package net.mcreator.mythicsfeatures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicsfeatures.block.display.SoulBerryDisplayItem;

public class SoulBerryDisplayModel extends GeoModel<SoulBerryDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SoulBerryDisplayItem animatable) {
		return new ResourceLocation("mythics_features", "animations/soulberry.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SoulBerryDisplayItem animatable) {
		return new ResourceLocation("mythics_features", "geo/soulberry.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SoulBerryDisplayItem entity) {
		return new ResourceLocation("mythics_features", "textures/block/soul_berry_e.png");
	}
}
