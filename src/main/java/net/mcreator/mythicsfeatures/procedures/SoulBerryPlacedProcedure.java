package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicsfeatures.init.MythicsFeaturesModBlocks;

public class SoulBerryPlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == MythicsFeaturesModBlocks.SPIRITWOOD_LOG.get()) {
			{
				String _value = "south";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == MythicsFeaturesModBlocks.SPIRITWOOD_LOG.get()) {
			{
				String _value = "north";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == MythicsFeaturesModBlocks.SPIRITWOOD_LOG.get()) {
			{
				String _value = "east";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == MythicsFeaturesModBlocks.SPIRITWOOD_LOG.get()) {
			{
				String _value = "west";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		}
	}
}
