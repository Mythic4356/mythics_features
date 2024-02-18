package net.mcreator.mythicsfeatures.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mythicsfeatures.block.model.SoulBerryBlockModel;
import net.mcreator.mythicsfeatures.block.entity.SoulBerryTileEntity;

public class SoulBerryTileRenderer extends GeoBlockRenderer<SoulBerryTileEntity> {
	public SoulBerryTileRenderer() {
		super(new SoulBerryBlockModel());
	}

	@Override
	public RenderType getRenderType(SoulBerryTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
