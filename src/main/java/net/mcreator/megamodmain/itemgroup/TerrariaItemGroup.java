
package net.mcreator.megamodmain.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.megamodmain.item.PlaceholderNameItem;
import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class TerrariaItemGroup extends MegamodmainModElements.ModElement {
	public TerrariaItemGroup(MegamodmainModElements instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabterraria") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlaceholderNameItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
