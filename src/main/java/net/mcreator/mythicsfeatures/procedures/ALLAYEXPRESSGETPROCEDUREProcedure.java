package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class ALLAYEXPRESSGETPROCEDUREProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "name")).equals("red")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Item in red: " + MythicsFeaturesModVariables.WorldVariables.get(world).red.getCount() + MythicsFeaturesModVariables.WorldVariables.get(world).red.getDisplayName().getString())), false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("orange")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("Item in orange: " + MythicsFeaturesModVariables.WorldVariables.get(world).orange.getCount() + MythicsFeaturesModVariables.WorldVariables.get(world).orange.getDisplayName().getString())), false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("yellow")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("Item in yellow: " + MythicsFeaturesModVariables.WorldVariables.get(world).yellow.getCount() + MythicsFeaturesModVariables.WorldVariables.get(world).yellow.getDisplayName().getString())), false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("lime")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Item in lime: " + MythicsFeaturesModVariables.MapVariables.get(world).lime.getCount() + MythicsFeaturesModVariables.MapVariables.get(world).lime.getDisplayName().getString())), false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("green")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Item in green: " + MythicsFeaturesModVariables.WorldVariables.get(world).green.getCount() + MythicsFeaturesModVariables.WorldVariables.get(world).green.getDisplayName().getString())),
						false);
		}
	}
}
