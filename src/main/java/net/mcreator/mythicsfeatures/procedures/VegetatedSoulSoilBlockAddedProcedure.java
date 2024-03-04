package net.mcreator.mythicsfeatures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicsfeatures.init.MythicsFeaturesModBlocks;

public class VegetatedSoulSoilBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 30) >= 25) {
			world.setBlock(BlockPos.containing(x, y + 1, z), MythicsFeaturesModBlocks.SOUL_BERRY_BUSH.get().defaultBlockState(), 3);
		}
	}
}
