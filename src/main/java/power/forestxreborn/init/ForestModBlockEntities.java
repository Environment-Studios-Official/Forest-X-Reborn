
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.block.entity.FermentationBarrelBlockEntity;
import power.forestxreborn.block.entity.ClayOvenBlockEntity;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class ForestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ForestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CLAY_OVEN = register("clay_oven", ForestModBlocks.CLAY_OVEN, ClayOvenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FERMENTATION_BARREL = register("fermentation_barrel", ForestModBlocks.FERMENTATION_BARREL, FermentationBarrelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
