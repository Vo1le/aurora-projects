
package net.mcreator.auroraprojects.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@AuroraprojectsModElements.ModElement.Tag
public class Cablejunction2facesBlock extends AuroraprojectsModElements.ModElement {

	@ObjectHolder("auroraprojects:cablejunction_2faces")
	public static final Block block = null;

	public Cablejunction2facesBlock(AuroraprojectsModElements instance) {
		super(instance, 4);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AuroraProjectItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid()
					.setOpaque((bs, br, bp) -> false));

			setRegistryName("cablejunction_2faces");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 0;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CablesStandarItem.block));
		}

	}

}
