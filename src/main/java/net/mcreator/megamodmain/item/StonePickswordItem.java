
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class StonePickswordItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:stone_picksword")
	public static final Item block = null;
	public StonePickswordItem(MegamodmainModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 3.5f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.STONE_SWORD, (int) (1)), new ItemStack(Items.STONE_PICKAXE, (int) (1)));
			}
		}, 1, -2.6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("stone_picksword"));
	}
}
