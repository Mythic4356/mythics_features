
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MythicsFeaturesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MythicsFeaturesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_LOG.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_WOOD.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_PLANKS.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_STAIRS.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_SLAB.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_FENCE.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_FENCE_GATE.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_LEAVES.get().asItem());
		}
	}
}
