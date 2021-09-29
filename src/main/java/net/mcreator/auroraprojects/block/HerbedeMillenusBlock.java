
package net.mcreator.auroraprojects.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.auroraprojects.AuroraprojectsModElements;

import java.util.List;
import java.util.Collections;

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
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
		}

		@Override
		public boolean isLadder(BlockState state, IWorldReader world, BlockPos pos, LivingEntity entity) {
			return true;
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
