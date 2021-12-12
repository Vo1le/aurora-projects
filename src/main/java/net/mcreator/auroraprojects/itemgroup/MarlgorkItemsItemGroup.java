
package net.mcreator.auroraprojects.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.auroraprojects.block.TerreVolcaniqueBlock;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class MarlgorkItemsItemGroup extends AuroraprojectsModElements.ModElement {
	public MarlgorkItemsItemGroup(AuroraprojectsModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmarlgork_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TerreVolcaniqueBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
