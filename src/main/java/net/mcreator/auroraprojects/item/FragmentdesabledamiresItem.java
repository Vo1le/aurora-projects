
package net.mcreator.auroraprojects.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.auroraprojects.itemgroup.AmiresItemsItemGroup;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class FragmentdesabledamiresItem extends AuroraprojectsModElements.ModElement {
	@ObjectHolder("auroraprojects:fragmentdesabledamires")
	public static final Item block = null;

	public FragmentdesabledamiresItem(AuroraprojectsModElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AmiresItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("fragmentdesabledamires");
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
