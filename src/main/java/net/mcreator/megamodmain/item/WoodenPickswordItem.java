
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
public class WoodenPickswordItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:wooden_picksword")
	public static final Item block = null;
	public WoodenPickswordItem(MegamodmainModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 180;
			}

			public float getEfficiency() {
				return 1.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.WOODEN_PICKAXE, (int) (1)), new ItemStack(Items.WOODEN_SWORD, (int) (1)));
			}
		}, 1, -2.6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("wooden_picksword"));
	}
}
