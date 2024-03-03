package net.mcreator.mythicsfeatures.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicsfeatures.init.MythicsFeaturesModItems;
import net.mcreator.mythicsfeatures.init.MythicsFeaturesModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SoulBerryItemReplaceProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		if (itemstack.getItem() == MythicsFeaturesModBlocks.SOUL_BERRY_BUSH.get().asItem()) {
			item = itemstack;
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MythicsFeaturesModBlocks.SOUL_BERRY_BUSH.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MythicsFeaturesModItems.SOUL_BERRY.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
