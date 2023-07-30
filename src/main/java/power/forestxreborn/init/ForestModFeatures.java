
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.world.features.plants.WildflowerFeature;
import power.forestxreborn.world.features.plants.WhiteRoseFeature;
import power.forestxreborn.world.features.plants.PinkRoseFeature;
import power.forestxreborn.world.features.plants.LavanderFeature;
import power.forestxreborn.world.features.plants.DesertRoseFeature;
import power.forestxreborn.world.features.plants.BurningblossomFeature;
import power.forestxreborn.world.features.plants.BlueRoseFeature;
import power.forestxreborn.world.features.ores.SilverOreFeature;
import power.forestxreborn.world.features.ores.SandslateFeature;
import power.forestxreborn.world.features.ores.RhyoliteFeature;
import power.forestxreborn.world.features.ores.DeepslateSilverOreFeature;
import power.forestxreborn.world.features.SunshroomsFeatureFeature;
import power.forestxreborn.world.features.StoneVolcanoDeltaFeature;
import power.forestxreborn.world.features.StonePatchFeature;
import power.forestxreborn.world.features.SemidesertPatchFeature;
import power.forestxreborn.world.features.RedMushroomsFeatureFeature;
import power.forestxreborn.world.features.PumicePatchFeature;
import power.forestxreborn.world.features.PeatbogLakesFeature;
import power.forestxreborn.world.features.ObsidianPatchFeature;
import power.forestxreborn.world.features.MoonshroomsFeatureFeature;
import power.forestxreborn.world.features.LavaPatchFeature;
import power.forestxreborn.world.features.GrapevineLogFeature;
import power.forestxreborn.world.features.CobblestonePatchFeature;
import power.forestxreborn.world.features.BrownMushroomsFeatureFeature;
import power.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import power.forestxreborn.world.features.BigRedMushroomsFeatureFeature;
import power.forestxreborn.world.features.BigBrownMushroomsFeatureFeature;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestMod.MODID);
	public static final RegistryObject<Feature<?>> RHYOLITE = REGISTRY.register("rhyolite", RhyoliteFeature::new);
	public static final RegistryObject<Feature<?>> SANDSLATE = REGISTRY.register("sandslate", SandslateFeature::new);
	public static final RegistryObject<Feature<?>> WILDFLOWER = REGISTRY.register("wildflower", WildflowerFeature::new);
	public static final RegistryObject<Feature<?>> BURNING_BLOSSOM = REGISTRY.register("burning_blossom", BurningblossomFeature::new);
	public static final RegistryObject<Feature<?>> LAVANDER = REGISTRY.register("lavander", LavanderFeature::new);
	public static final RegistryObject<Feature<?>> DESERT_ROSE = REGISTRY.register("desert_rose", DesertRoseFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_ROSE = REGISTRY.register("blue_rose", BlueRoseFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", DeepslateSilverOreFeature::new);
	public static final RegistryObject<Feature<?>> PEATBOG_LAKES = REGISTRY.register("peatbog_lakes", PeatbogLakesFeature::new);
	public static final RegistryObject<Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SEMIDESERT_PATCH = REGISTRY.register("semidesert_patch", SemidesertPatchFeature::new);
	public static final RegistryObject<Feature<?>> BROWN_MUSHROOMS_FEATURE = REGISTRY.register("brown_mushrooms_feature", BrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RED_MUSHROOMS_FEATURE = REGISTRY.register("red_mushrooms_feature", RedMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> MOONSHROOMS_FEATURE = REGISTRY.register("moonshrooms_feature", MoonshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SUNSHROOMS_FEATURE = REGISTRY.register("sunshrooms_feature", SunshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_BROWN_MUSHROOMS_FEATURE = REGISTRY.register("big_brown_mushrooms_feature", BigBrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_RED_MUSHROOMS_FEATURE = REGISTRY.register("big_red_mushrooms_feature", BigRedMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> OBSIDIAN_PATCH = REGISTRY.register("obsidian_patch", ObsidianPatchFeature::new);
	public static final RegistryObject<Feature<?>> PUMICE_PATCH = REGISTRY.register("pumice_patch", PumicePatchFeature::new);
	public static final RegistryObject<Feature<?>> STONE_PATCH = REGISTRY.register("stone_patch", StonePatchFeature::new);
	public static final RegistryObject<Feature<?>> COBBLESTONE_PATCH = REGISTRY.register("cobblestone_patch", CobblestonePatchFeature::new);
	public static final RegistryObject<Feature<?>> LAVA_PATCH = REGISTRY.register("lava_patch", LavaPatchFeature::new);
	public static final RegistryObject<Feature<?>> STONE_VOLCANO_DELTA = REGISTRY.register("stone_volcano_delta", StoneVolcanoDeltaFeature::new);
	public static final RegistryObject<Feature<?>> GRAPEVINE_LOG = REGISTRY.register("grapevine_log", GrapevineLogFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_ROSE = REGISTRY.register("white_rose", WhiteRoseFeature::new);
	public static final RegistryObject<Feature<?>> PINK_ROSE = REGISTRY.register("pink_rose", PinkRoseFeature::new);
}
