
package power.forestxreborn.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import java.util.Set;

public class CobblestonePatchFeature extends RandomPatchFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

	public CobblestonePatchFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}