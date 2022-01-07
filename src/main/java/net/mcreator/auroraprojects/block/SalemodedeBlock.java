
package net.mcreator.auroraprojects.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.auroraprojects.itemgroup.AmiresItemsItemGroup;
import net.mcreator.auroraprojects.item.FragmentdesabledamiresItem;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

import java.util.List;
import java.util.Collections;

@AuroraprojectsModElements.ModElement.Tag
public class SalemodedeBlock extends AuroraprojectsModElements.ModElement {
	@ObjectHolder("auroraprojects:salemodede")
	public static final Block block = null;

	public SalemodedeBlock(AuroraprojectsModElements instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AmiresItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.SHOVEL).setRequiresTool());
			setRegistryName("salemodede");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(FragmentdesabledamiresItem.block, (int) (2)));
		}
	}
}
