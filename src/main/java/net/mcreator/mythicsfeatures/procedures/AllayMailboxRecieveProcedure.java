package net.mcreator.mythicsfeatures.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;
import net.mcreator.mythicsfeatures.init.MythicsFeaturesModItems;

import java.util.concurrent.atomic.AtomicReference;

public class AllayMailboxRecieveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack id = ItemStack.EMPTY;
		ItemStack item = ItemStack.EMPTY;
		id = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 2));
		if (id.getItem() == MythicsFeaturesModItems.RED_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).red.getItem() == ItemStack.EMPTY.getItem())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = MythicsFeaturesModVariables.WorldVariables.get(world).red;
						_setstack.setCount(MythicsFeaturesModVariables.WorldVariables.get(world).red.getCount());
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				MythicsFeaturesModVariables.WorldVariables.get(world).red = ItemStack.EMPTY;
				MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (id.getItem() == MythicsFeaturesModItems.ORANGE_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).orange.getItem() == ItemStack.EMPTY.getItem())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = MythicsFeaturesModVariables.WorldVariables.get(world).orange;
						_setstack.setCount(MythicsFeaturesModVariables.WorldVariables.get(world).orange.getCount());
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				MythicsFeaturesModVariables.WorldVariables.get(world).orange = ItemStack.EMPTY;
				MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (id.getItem() == MythicsFeaturesModItems.YELLOW_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).yellow.getItem() == ItemStack.EMPTY.getItem())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = MythicsFeaturesModVariables.WorldVariables.get(world).yellow;
						_setstack.setCount(MythicsFeaturesModVariables.WorldVariables.get(world).yellow.getCount());
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				MythicsFeaturesModVariables.WorldVariables.get(world).yellow = ItemStack.EMPTY;
				MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if (id.getItem() == MythicsFeaturesModItems.LIME_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.MapVariables.get(world).lime.getItem() == ItemStack.EMPTY.getItem())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = MythicsFeaturesModVariables.MapVariables.get(world).lime;
						_setstack.setCount(MythicsFeaturesModVariables.MapVariables.get(world).lime.getCount());
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				MythicsFeaturesModVariables.MapVariables.get(world).lime = ItemStack.EMPTY;
				MythicsFeaturesModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (id.getItem() == MythicsFeaturesModItems.GREEN_STAMP.get()) {
			if (!(MythicsFeaturesModVariables.WorldVariables.get(world).green.getItem() == ItemStack.EMPTY.getItem())) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = MythicsFeaturesModVariables.WorldVariables.get(world).green;
						_setstack.setCount(MythicsFeaturesModVariables.WorldVariables.get(world).green.getCount());
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				MythicsFeaturesModVariables.WorldVariables.get(world).green = ItemStack.EMPTY;
				MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
