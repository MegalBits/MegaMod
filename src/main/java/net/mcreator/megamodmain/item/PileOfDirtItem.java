
package net.mcreator.megamodmain.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class PileOfDirtItem extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:pile_of_dirt")
	public static final Item block = null;
	public PileOfDirtItem(MegamodmainModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64));
			setRegistryName("pile_of_dirt");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
