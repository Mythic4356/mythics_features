
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
