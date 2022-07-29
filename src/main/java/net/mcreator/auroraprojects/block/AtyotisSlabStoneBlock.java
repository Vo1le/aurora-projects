
package net.mcreator.auroraprojects.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.properties.SlabType;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.auroraprojects.itemgroup.AtyotisTabItemGroup;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

import java.util.List;
import java.util.Collections;

@AuroraprojectsModElements.ModElement.Tag
public class AtyotisSlabStoneBlock extends AuroraprojectsModElements.ModElement {
	@ObjectHolder("auroraprojects:atyotis_slab_stone")
	public static final Block block = null;

	public AtyotisSlabStoneBlock(AuroraprojectsModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(AtyotisTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f, 6f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("atyotis_slab_stone");
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
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
