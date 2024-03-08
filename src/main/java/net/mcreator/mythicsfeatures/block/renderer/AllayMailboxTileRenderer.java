package net.mcreator.mythicsfeatures.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mythicsfeatures.block.model.AllayMailboxBlockModel;
import net.mcreator.mythicsfeatures.block.entity.AllayMailboxTileEntity;

public class AllayMailboxTileRenderer extends GeoBlockRenderer<AllayMailboxTileEntity> {
	public AllayMailboxTileRenderer() {
		super(new AllayMailboxBlockModel());
	}

	@Override
	public RenderType getRenderType(AllayMailboxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
