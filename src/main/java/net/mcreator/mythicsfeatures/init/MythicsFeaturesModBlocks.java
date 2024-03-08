
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mythicsfeatures.block.VegetatedSoulSoilBlock;
import net.mcreator.mythicsfeatures.block.StrippedSpiritwoodWoodBlock;
import net.mcreator.mythicsfeatures.block.StrippedSpiritwoodLogBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodWoodBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodTrapdoorBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodStairsBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodSlabBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodSaplingBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodPressurePlateBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodPlanksBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodLogBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodLeavesBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodFenceGateBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodFenceBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodDoorBlock;
import net.mcreator.mythicsfeatures.block.SpiritwoodButtonBlock;
import net.mcreator.mythicsfeatures.block.SoulBerryBushBlock;
import net.mcreator.mythicsfeatures.block.EndSandBlock;
import net.mcreator.mythicsfeatures.block.AllayMailboxBlock;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

public class MythicsFeaturesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MythicsFeaturesMod.MODID);
	public static final RegistryObject<Block> SPIRITWOOD_LOG = REGISTRY.register("spiritwood_log", () -> new SpiritwoodLogBlock());
	public static final RegistryObject<Block> SPIRITWOOD_WOOD = REGISTRY.register("spiritwood_wood", () -> new SpiritwoodWoodBlock());
	public static final RegistryObject<Block> SPIRITWOOD_PLANKS = REGISTRY.register("spiritwood_planks", () -> new SpiritwoodPlanksBlock());
	public static final RegistryObject<Block> SPIRITWOOD_LEAVES = REGISTRY.register("spiritwood_leaves", () -> new SpiritwoodLeavesBlock());
	public static final RegistryObject<Block> SPIRITWOOD_STAIRS = REGISTRY.register("spiritwood_stairs", () -> new SpiritwoodStairsBlock());
	public static final RegistryObject<Block> SPIRITWOOD_SLAB = REGISTRY.register("spiritwood_slab", () -> new SpiritwoodSlabBlock());
	public static final RegistryObject<Block> SPIRITWOOD_FENCE = REGISTRY.register("spiritwood_fence", () -> new SpiritwoodFenceBlock());
	public static final RegistryObject<Block> SPIRITWOOD_FENCE_GATE = REGISTRY.register("spiritwood_fence_gate", () -> new SpiritwoodFenceGateBlock());
	public static final RegistryObject<Block> SPIRITWOOD_PRESSURE_PLATE = REGISTRY.register("spiritwood_pressure_plate", () -> new SpiritwoodPressurePlateBlock());
	public static final RegistryObject<Block> SPIRITWOOD_BUTTON = REGISTRY.register("spiritwood_button", () -> new SpiritwoodButtonBlock());
	public static final RegistryObject<Block> SPIRITWOOD_DOOR = REGISTRY.register("spiritwood_door", () -> new SpiritwoodDoorBlock());
	public static final RegistryObject<Block> SPIRITWOOD_TRAPDOOR = REGISTRY.register("spiritwood_trapdoor", () -> new SpiritwoodTrapdoorBlock());
	public static final RegistryObject<Block> SPIRITWOOD_SAPLING = REGISTRY.register("spiritwood_sapling", () -> new SpiritwoodSaplingBlock());
	public static final RegistryObject<Block> VEGETATED_SOUL_SOIL = REGISTRY.register("vegetated_soul_soil", () -> new VegetatedSoulSoilBlock());
	public static final RegistryObject<Block> STRIPPED_SPIRITWOOD_LOG = REGISTRY.register("stripped_spiritwood_log", () -> new StrippedSpiritwoodLogBlock());
	public static final RegistryObject<Block> STRIPPED_SPIRITWOOD_WOOD = REGISTRY.register("stripped_spiritwood_wood", () -> new StrippedSpiritwoodWoodBlock());
	public static final RegistryObject<Block> SOUL_BERRY_BUSH = REGISTRY.register("soul_berry_bush", () -> new SoulBerryBushBlock());
	public static final RegistryObject<Block> END_SAND = REGISTRY.register("end_sand", () -> new EndSandBlock());
	public static final RegistryObject<Block> ALLAY_MAILBOX = REGISTRY.register("allay_mailbox", () -> new AllayMailboxBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			VegetatedSoulSoilBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			VegetatedSoulSoilBlock.itemColorLoad(event);
		}
	}
}
