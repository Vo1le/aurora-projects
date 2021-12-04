
package net.mcreator.auroraprojects.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.auroraprojects.block.TeleporteurMillenusBlock;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class AuroraTeleporteursItemGroup extends AuroraprojectsModElements.ModElement {
	public AuroraTeleporteursItemGroup(AuroraprojectsModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabaurora_teleporteurs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TeleporteurMillenusBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
