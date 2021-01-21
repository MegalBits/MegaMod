
package net.mcreator.megamodmain.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.megamodmain.itemgroup.TerrariaItemGroup;
import net.mcreator.megamodmain.MegamodmainModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@MegamodmainModElements.ModElement.Tag
public class TerraWoodBlock extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:terra_wood")
	public static final Block block = null;
	public TerraWoodBlock(MegamodmainModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TerrariaItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.0999999999999999f, 2.8f).lightValue(0)
					.harvestLevel(0).harvestTool(ToolType.AXE));
			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
			setRegistryName("terra_wood");
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			;
			if (context.getFace() == Direction.UP || context.getFace() == Direction.DOWN)
				return this.getDefaultState().with(FACING, Direction.NORTH);
			return this.getDefaultState().with(FACING, context.getFace());
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("megamodmain:terraria_purity")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;
					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.place(world, generator, rand, pos, config);
				}
			}.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("terra_wood", "terra_wood", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == Blocks.OAK_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.SPRUCE_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.BIRCH_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.JUNGLE_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DARK_OAK_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_PLANKS.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.SPRUCE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.BIRCH_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.JUNGLE_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				if (blockAt.getBlock() == Blocks.DARK_OAK_LOG.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 64)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(64, 0, 0, 80))));
		}
	}
}
