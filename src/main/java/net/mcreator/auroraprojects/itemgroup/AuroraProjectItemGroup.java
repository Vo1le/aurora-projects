
package net.mcreator.auroraprojects.itemgroup;

@AuroraprojectsModElements.ModElement.Tag
public class AuroraProjectItemGroup extends AuroraprojectsModElements.ModElement {

	public AuroraProjectItemGroup(AuroraprojectsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabaurora_project") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.BEDROCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
