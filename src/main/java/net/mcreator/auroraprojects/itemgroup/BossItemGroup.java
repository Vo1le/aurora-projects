
package net.mcreator.auroraprojects.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class BossItemGroup extends AuroraprojectsModElements.ModElement {
	public BossItemGroup(AuroraprojectsModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabboss") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.NETHERITE_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
