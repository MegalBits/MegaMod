
package net.mcreator.megamodmain.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.megamodmain.itemgroup.SpecialItemGroup;
import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.List;
import java.util.Collections;

@MegamodmainModElements.ModElement.Tag
public class LuckyBlockBlock extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:lucky_block")
	public static final Block block = null;
	public LuckyBlockBlock(MegamodmainModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(SpecialItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(0.8f, 8f).lightValue(2));
			setRegistryName("lucky_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
