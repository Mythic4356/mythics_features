
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mythicsfeatures.item.VexInABottleItem;
import net.mcreator.mythicsfeatures.item.SoulBerryItem;
import net.mcreator.mythicsfeatures.item.AllayInABottleItem;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

public class MythicsFeaturesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MythicsFeaturesMod.MODID);
	public static final RegistryObject<Item> SPIRITWOOD_LOG = block(MythicsFeaturesModBlocks.SPIRITWOOD_LOG);
	public static final RegistryObject<Item> SPIRITWOOD_WOOD = block(MythicsFeaturesModBlocks.SPIRITWOOD_WOOD);
	public static final RegistryObject<Item> SPIRITWOOD_PLANKS = block(MythicsFeaturesModBlocks.SPIRITWOOD_PLANKS);
	public static final RegistryObject<Item> SPIRITWOOD_LEAVES = block(MythicsFeaturesModBlocks.SPIRITWOOD_LEAVES);
	public static final RegistryObject<Item> SPIRITWOOD_STAIRS = block(MythicsFeaturesModBlocks.SPIRITWOOD_STAIRS);
	public static final RegistryObject<Item> SPIRITWOOD_SLAB = block(MythicsFeaturesModBlocks.SPIRITWOOD_SLAB);
	public static final RegistryObject<Item> SPIRITWOOD_FENCE = block(MythicsFeaturesModBlocks.SPIRITWOOD_FENCE);
	public static final RegistryObject<Item> SPIRITWOOD_FENCE_GATE = block(MythicsFeaturesModBlocks.SPIRITWOOD_FENCE_GATE);
	public static final RegistryObject<Item> SPIRITWOOD_PRESSURE_PLATE = block(MythicsFeaturesModBlocks.SPIRITWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> SPIRITWOOD_BUTTON = block(MythicsFeaturesModBlocks.SPIRITWOOD_BUTTON);
	public static final RegistryObject<Item> SPIRITWOOD_DOOR = doubleBlock(MythicsFeaturesModBlocks.SPIRITWOOD_DOOR);
	public static final RegistryObject<Item> SPIRITWOOD_TRAPDOOR = block(MythicsFeaturesModBlocks.SPIRITWOOD_TRAPDOOR);
	public static final RegistryObject<Item> SPIRITWOOD_SAPLING = block(MythicsFeaturesModBlocks.SPIRITWOOD_SAPLING);
	public static final RegistryObject<Item> ALLAY_IN_A_BOTTLE = REGISTRY.register("allay_in_a_bottle", () -> new AllayInABottleItem());
	public static final RegistryObject<Item> VEGETATED_SOUL_SOIL = block(MythicsFeaturesModBlocks.VEGETATED_SOUL_SOIL);
	public static final RegistryObject<Item> VEX_IN_A_BOTTLE = REGISTRY.register("vex_in_a_bottle", () -> new VexInABottleItem());
	public static final RegistryObject<Item> STRIPPED_SPIRITWOOD_LOG = block(MythicsFeaturesModBlocks.STRIPPED_SPIRITWOOD_LOG);
	public static final RegistryObject<Item> STRIPPED_SPIRITWOOD_WOOD = block(MythicsFeaturesModBlocks.STRIPPED_SPIRITWOOD_WOOD);
	public static final RegistryObject<Item> SOUL_BERRY = REGISTRY.register("soul_berry", () -> new SoulBerryItem());
	public static final RegistryObject<Item> SOUL_BERRY_BUSH = block(MythicsFeaturesModBlocks.SOUL_BERRY_BUSH);
	public static final RegistryObject<Item> TEST = block(MythicsFeaturesModBlocks.TEST);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
