
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mythicsfeatures.block.entity.AllayMailboxTileEntity;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

public class MythicsFeaturesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MythicsFeaturesMod.MODID);
	public static final RegistryObject<BlockEntityType<AllayMailboxTileEntity>> ALLAY_MAILBOX = REGISTRY.register("allay_mailbox",
			() -> BlockEntityType.Builder.of(AllayMailboxTileEntity::new, MythicsFeaturesModBlocks.ALLAY_MAILBOX.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
