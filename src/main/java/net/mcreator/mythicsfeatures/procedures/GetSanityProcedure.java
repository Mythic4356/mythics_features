package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;

public class GetSanityProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Your sanity level is " + (entity.getCapability(MythicsFeaturesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MythicsFeaturesModVariables.PlayerVariables())).Sanity + ".")),
					false);
		return (entity.getCapability(MythicsFeaturesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MythicsFeaturesModVariables.PlayerVariables())).Sanity;
	}
}
