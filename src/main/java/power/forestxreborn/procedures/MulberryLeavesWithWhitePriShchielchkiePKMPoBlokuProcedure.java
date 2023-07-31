package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModItems;
import power.forestxreborn.init.ForestModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MulberryLeavesWithWhitePriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.MULBERRY_LEAVES_WITHOUT_WHITE.get().defaultBlockState(), 3);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForestModItems.WHITE_MULBERRY.get()));
			entityToSpawn.setPickUpDelay(1);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForestModItems.WHITE_MULBERRY.get()));
			entityToSpawn.setPickUpDelay(1);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForestModItems.WHITE_MULBERRY.get()));
			entityToSpawn.setPickUpDelay(1);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForestModItems.WHITE_MULBERRY.get()));
			entityToSpawn.setPickUpDelay(1);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForestModItems.WHITE_MULBERRY.get()));
			entityToSpawn.setPickUpDelay(1);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
