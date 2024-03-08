package net.mcreator.mythicsfeatures.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mythicsfeatures.init.MythicsFeaturesModBlockEntities;
import net.mcreator.mythicsfeatures.block.renderer.AllayMailboxTileRenderer;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

@Mod.EventBusSubscriber(modid = MythicsFeaturesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(MythicsFeaturesModBlockEntities.ALLAY_MAILBOX.get(), context -> new AllayMailboxTileRenderer());
	}
}
