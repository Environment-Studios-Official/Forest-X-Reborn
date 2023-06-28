

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class PolishedPumiceStairsBlock extends
StairBlock
{
public PolishedPumiceStairsBlock() {
super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.BASALT)
.strength(2f, 6f)
.requiresCorrectToolForDrops()
.dynamicShape()
);
}
@Override public float getExplosionResistance() {
return 6f;
}
@Override public boolean isRandomlyTicking(BlockState state) {
return false;
}
@Override public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
if(player.getInventory().getSelected().getItem() instanceof
PickaxeItem
tieredItem)
return tieredItem.getTier().getLevel() >= 1;
return false;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this, 1));
}
}