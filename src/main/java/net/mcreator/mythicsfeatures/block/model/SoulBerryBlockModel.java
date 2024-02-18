package net.mcreator.mythicsfeatures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicsfeatures.block.entity.SoulBerryTileEntity;

public class SoulBerryBlockModel extends GeoModel<SoulBerryTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SoulBerryTileEntity animatable) {
		return new ResourceLocation("mythics_features", "animations/soulberry.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SoulBerryTileEntity animatable) {
		return new ResourceLocation("mythics_features", "geo/soulberry.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SoulBerryTileEntity entity) {
		return new ResourceLocation("mythics_features", "textures/block/soul_berry_e.png");
	}
}
