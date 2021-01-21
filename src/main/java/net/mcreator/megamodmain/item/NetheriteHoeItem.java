
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class NetheriteHoeItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:netherite_hoe")
	public static final Item block = null;
	public NetheriteHoeItem(MegamodmainModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteIngotItem.block, (int) (1)));
			}
		}, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("netherite_hoe"));
	}
}
