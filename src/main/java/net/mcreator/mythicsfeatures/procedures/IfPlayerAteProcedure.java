package net.mcreator.mythicsfeatures.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IfPlayerAteProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem().isEdible()) {
			if ((entity.getCapability(MythicsFeaturesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MythicsFeaturesModVariables.PlayerVariables())).Sanity < 99) {
				{
					double _setval = Math.round((itemstack.getItem().isEdible() ? itemstack.getItem().getFoodProperties().getNutrition() : 0) * 0.2)
							+ (entity.getCapability(MythicsFeaturesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MythicsFeaturesModVariables.PlayerVariables())).Sanity;
					entity.getCapability(MythicsFeaturesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sanity = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
