
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class WoodenDaggerItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:wooden_dagger")
	public static final Item block = null;
	public WoodenDaggerItem(MegamodmainModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 132;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OAK_PLANKS, (int) (1)), new ItemStack(Blocks.SPRUCE_PLANKS, (int) (1)),
						new ItemStack(Blocks.BIRCH_PLANKS, (int) (1)), new ItemStack(Blocks.JUNGLE_PLANKS, (int) (1)),
						new ItemStack(Blocks.ACACIA_PLANKS, (int) (1)), new ItemStack(Blocks.DARK_OAK_PLANKS, (int) (1)));
			}
		}, 3, -2.0999999999999999f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("wooden_dagger"));
	}
}
