package net.mcreator.mythicsfeatures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicsfeatures.block.entity.AllayMailboxTileEntity;

public class AllayMailboxBlockModel extends GeoModel<AllayMailboxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AllayMailboxTileEntity animatable) {
		return new ResourceLocation("mythics_features", "animations/allay_mailbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AllayMailboxTileEntity animatable) {
		return new ResourceLocation("mythics_features", "geo/allay_mailbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AllayMailboxTileEntity entity) {
		return new ResourceLocation("mythics_features", "textures/block/allay_mailbox.png");
	}
}
