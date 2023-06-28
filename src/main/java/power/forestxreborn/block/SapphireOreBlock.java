

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SapphireOreBlock extends
Block
{
public SapphireOreBlock() {
super( BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.STONE)
.strength(3.9f, 6.1677205204f)
.requiresCorrectToolForDrops()
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
if(player.getInventory().getSelected().getItem() instanceof
PickaxeItem
tieredItem)
return tieredItem.getTier().getLevel() >= 3;
return false;
}
}