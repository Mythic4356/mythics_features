package net.mcreator.mythicsfeatures.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mythicsfeatures.block.model.AllayMailboxDisplayModel;
import net.mcreator.mythicsfeatures.block.display.AllayMailboxDisplayItem;

public class AllayMailboxDisplayItemRenderer extends GeoItemRenderer<AllayMailboxDisplayItem> {
	public AllayMailboxDisplayItemRenderer() {
		super(new AllayMailboxDisplayModel());
	}

	@Override
	public RenderType getRenderType(AllayMailboxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
