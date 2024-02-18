package net.mcreator.mythicsfeatures.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mythicsfeatures.block.model.SoulBerryDisplayModel;
import net.mcreator.mythicsfeatures.block.display.SoulBerryDisplayItem;

public class SoulBerryDisplayItemRenderer extends GeoItemRenderer<SoulBerryDisplayItem> {
	public SoulBerryDisplayItemRenderer() {
		super(new SoulBerryDisplayModel());
	}

	@Override
	public RenderType getRenderType(SoulBerryDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
