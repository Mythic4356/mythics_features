
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MythicsFeaturesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MythicsFeaturesMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYTHICS_FEATURES = REGISTRY.register("mythics_features",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mythics_features.mythics_features")).icon(() -> new ItemStack(MythicsFeaturesModBlocks.SPIRITWOOD_SAPLING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MythicsFeaturesModItems.ALLAY_IN_A_BOTTLE.get());
				tabData.accept(MythicsFeaturesModBlocks.VEGETATED_SOUL_SOIL.get().asItem());
				tabData.accept(MythicsFeaturesModItems.VEX_IN_A_BOTTLE.get());
				tabData.accept(MythicsFeaturesModItems.SOUL_BERRY.get());
				tabData.accept(MythicsFeaturesModBlocks.END_SAND.get().asItem());
				tabData.accept(MythicsFeaturesModBlocks.ALLAY_MAILBOX.get().asItem());
				tabData.accept(MythicsFeaturesModItems.RED_STAMP.get());
				tabData.accept(MythicsFeaturesModItems.ORANGE_STAMP.get());
				tabData.accept(MythicsFeaturesModItems.YELLOW_STAMP.get());
				tabData.accept(MythicsFeaturesModItems.LIME_STAMP.get());
				tabData.accept(MythicsFeaturesModItems.GREEN_STAMP.get());
			})

					.build());

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
			tabData.accept(MythicsFeaturesModBlocks.STRIPPED_SPIRITWOOD_LOG.get().asItem());
			tabData.accept(MythicsFeaturesModBlocks.STRIPPED_SPIRITWOOD_WOOD.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MythicsFeaturesModBlocks.SPIRITWOOD_LEAVES.get().asItem());
		}
	}
}
