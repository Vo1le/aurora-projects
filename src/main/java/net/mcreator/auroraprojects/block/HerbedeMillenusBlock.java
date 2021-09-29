
package net.mcreator.auroraprojects.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@AuroraprojectsModElements.ModElement.Tag
public class HerbedeMillenusBlock extends AuroraprojectsModElements.ModElement {

	@ObjectHolder("auroraprojects:herbede_millenus")
	public static final Block block = null;

	public HerbedeMillenusBlock(AuroraprojectsModElements instance) {
		super(instance, 23);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.grass.break")),
							() -> new SoundEvent(new ResourceLocation("block.grass.step")),
							() -> new SoundEvent(new ResourceLocation("block.grass.place")),
							() -> new SoundEvent(new ResourceLocation("block.grass.hit")),
							() -> new SoundEvent(new ResourceLocation("block.gravel.fall"))))
					.hardnessAndResistance(1f, 1f).setLightLevel(s -> 0).harvestLevel(1).harvestTool(ToolType.SHOVEL).setRequiresTool());

			setRegistryName("herbede_millenus");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
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
