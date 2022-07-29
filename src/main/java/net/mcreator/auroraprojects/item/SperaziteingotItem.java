
package net.mcreator.auroraprojects.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.auroraprojects.itemgroup.AtyotisTabItemGroup;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class SperaziteingotItem extends AuroraprojectsModElements.ModElement {
	@ObjectHolder("auroraprojects:speraziteingot")
	public static final Item block = null;

	public SperaziteingotItem(AuroraprojectsModElements instance) {
		super(instance, 160);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AtyotisTabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("speraziteingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
