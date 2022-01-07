
package net.mcreator.auroraprojects.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.auroraprojects.block.SableModdeBlock;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class AmiresItemsItemGroup extends AuroraprojectsModElements.ModElement {
	public AmiresItemsItemGroup(AuroraprojectsModElements instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabamires_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SableModdeBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
