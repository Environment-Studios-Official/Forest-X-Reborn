
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.features.RaspberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.OldOakTreeFeature;
import ru.power_umc.forestxreborn.world.features.MixedForestTreesFeature;
import ru.power_umc.forestxreborn.world.features.CharredTreeFeatureFeature;
import ru.power_umc.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestMod.MODID);
	public static final RegistryObject<Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RASPBERRIES_BUSH_FEATURE = REGISTRY.register("raspberries_bush_feature", RaspberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> MIXED_FOREST_TREES = REGISTRY.register("mixed_forest_trees", MixedForestTreesFeature::new);
	public static final RegistryObject<Feature<?>> OLD_OAK_TREE = REGISTRY.register("old_oak_tree", OldOakTreeFeature::new);
	public static final RegistryObject<Feature<?>> CHARRED_TREE_FEATURE = REGISTRY.register("charred_tree_feature", CharredTreeFeatureFeature::new);
}
