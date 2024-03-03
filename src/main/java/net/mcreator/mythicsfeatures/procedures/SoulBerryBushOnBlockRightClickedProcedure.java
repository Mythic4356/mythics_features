package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicsfeatures.init.MythicsFeaturesModItems;

public class SoulBerryBushOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 3) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 2, 3); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MythicsFeaturesModItems.SOUL_BERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) == 2) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 2); index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MythicsFeaturesModItems.SOUL_BERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		{
			int _value = 1;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
