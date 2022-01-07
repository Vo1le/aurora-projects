
package net.mcreator.auroraprojects.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.auroraprojects.block.GrassMillenusBlock;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class MillenusItemsItemGroup extends AuroraprojectsModElements.ModElement {
	public MillenusItemsItemGroup(AuroraprojectsModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmillenus_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrassMillenusBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
