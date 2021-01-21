
package net.mcreator.megamodmain.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.megamodmain.item.GoldenFeatherItem;
import net.mcreator.megamodmain.MegamodmainModElements;

@MegamodmainModElements.ModElement.Tag
public class SpecialItemGroup extends MegamodmainModElements.ModElement {
	public SpecialItemGroup(MegamodmainModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspecial") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GoldenFeatherItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
