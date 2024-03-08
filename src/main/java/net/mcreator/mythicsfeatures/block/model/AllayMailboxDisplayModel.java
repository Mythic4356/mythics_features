package net.mcreator.mythicsfeatures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicsfeatures.block.display.AllayMailboxDisplayItem;

public class AllayMailboxDisplayModel extends GeoModel<AllayMailboxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AllayMailboxDisplayItem animatable) {
		return new ResourceLocation("mythics_features", "animations/allay_mailbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AllayMailboxDisplayItem animatable) {
		return new ResourceLocation("mythics_features", "geo/allay_mailbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AllayMailboxDisplayItem entity) {
		return new ResourceLocation("mythics_features", "textures/block/allay_mailbox.png");
	}
}
