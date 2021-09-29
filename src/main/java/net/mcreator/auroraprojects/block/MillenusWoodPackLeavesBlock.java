
package net.mcreator.auroraprojects.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@AuroraprojectsModElements.ModElement.Tag
public class MillenusWoodPackLeavesBlock extends AuroraprojectsModElements.ModElement {

	@ObjectHolder("auroraprojects:millenus_wood_pack_leaves")
	public static final Block block = null;

	public MillenusWoodPackLeavesBlock(AuroraprojectsModElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.2f, 0.2f).setLightLevel(s -> 0).notSolid());

			setRegistryName("millenus_wood_pack_leaves");
		}

		@OnlyIn(Dist.CLIENT)
		public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
			return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 1;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 30;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
