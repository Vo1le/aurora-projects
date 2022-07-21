
package net.mcreator.auroraprojects.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.auroraprojects.itemgroup.AtyotisTabItemGroup;
import net.mcreator.auroraprojects.AuroraprojectsModElements;

@AuroraprojectsModElements.ModElement.Tag
public class AtyotisWoodPicaxeItem extends AuroraprojectsModElements.ModElement {
	@ObjectHolder("auroraprojects:atyotis_wood_picaxe")
	public static final Item block = null;

	public AtyotisWoodPicaxeItem(AuroraprojectsModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 68;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(AtyotisTabItemGroup.tab)) {
		}.setRegistryName("atyotis_wood_picaxe"));
	}
}
