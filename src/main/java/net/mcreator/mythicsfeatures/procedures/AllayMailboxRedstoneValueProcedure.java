package net.mcreator.mythicsfeatures.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;
import net.mcreator.mythicsfeatures.init.MythicsFeaturesModItems;

import java.util.concurrent.atomic.AtomicReference;

public class AllayMailboxRedstoneValueProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == MythicsFeaturesModItems.RED_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).red.getItem() == ItemStack.EMPTY.getItem())) {
				return 15;
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == MythicsFeaturesModItems.ORANGE_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).orange.getItem() == ItemStack.EMPTY.getItem())) {
				return 15;
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == MythicsFeaturesModItems.YELLOW_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).yellow.getItem() == ItemStack.EMPTY.getItem())) {
				return 15;
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == MythicsFeaturesModItems.LIME_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.MapVariables.get(world).lime.getItem() == ItemStack.EMPTY.getItem())) {
				return 15;
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == MythicsFeaturesModItems.GREEN_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).green.getItem() == ItemStack.EMPTY.getItem())) {
				return 15;
			}
		}
		return 0;
	}
}
