
package net.mcreator.megamodmain.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.List;
import java.util.Collections;

@MegamodmainModElements.ModElement.Tag
public class PlaceHolderBlock extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:place_holder")
	public static final Block block = null;
	public PlaceHolderBlock(MegamodmainModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.BARRIER).sound(SoundType.GLASS).hardnessAndResistance(9999f, 9999f).lightValue(0));
			setRegistryName("place_holder");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.AIR, (int) (1)));
		}
	}
}
