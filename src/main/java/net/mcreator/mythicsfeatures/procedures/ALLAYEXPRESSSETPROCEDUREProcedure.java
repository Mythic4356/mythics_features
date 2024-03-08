package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.mythicsfeatures.network.MythicsFeaturesModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ALLAYEXPRESSSETPROCEDUREProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		(ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).setCount((int) DoubleArgumentType.getDouble(arguments, "number"));
		if ((StringArgumentType.getString(arguments, "name")).equals("red")) {
			MythicsFeaturesModVariables.WorldVariables.get(world).red = (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance());
			MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Successfully set red to: " + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getCount() + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getDisplayName().getString())),
						false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("orange")) {
			MythicsFeaturesModVariables.WorldVariables.get(world).orange = (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance());
			MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Successfully set orange to: " + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getCount() + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getDisplayName().getString())),
						false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("yellow")) {
			MythicsFeaturesModVariables.WorldVariables.get(world).yellow = (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance());
			MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Successfully set yellow to: " + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getCount() + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getDisplayName().getString())),
						false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("lime")) {
			MythicsFeaturesModVariables.MapVariables.get(world).lime = (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance());
			MythicsFeaturesModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Successfully set lime to: " + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getCount() + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getDisplayName().getString())),
						false);
		} else if ((StringArgumentType.getString(arguments, "name")).equals("green")) {
			MythicsFeaturesModVariables.WorldVariables.get(world).green = (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance());
			MythicsFeaturesModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Successfully set green to: " + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getCount() + (ItemArgument.getItem(arguments, "item").getItem().getDefaultInstance()).getDisplayName().getString())),
						false);
		}
	}
}
