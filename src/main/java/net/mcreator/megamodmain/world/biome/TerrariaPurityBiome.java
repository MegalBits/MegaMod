
package net.mcreator.megamodmain.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.feature.SeaGrassConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import net.mcreator.megamodmain.block.TerraGrassBlock;
import net.mcreator.megamodmain.block.TerraDirtBlock;
import net.mcreator.megamodmain.MegamodmainModElements;

import com.google.common.collect.ImmutableList;

@MegamodmainModElements.ModElement.Tag
public class TerrariaPurityBiome extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:terraria_purity")
	public static final CustomBiome biome = null;
	public TerrariaPurityBiome(MegamodmainModElements instance) {
		super(instance, 159);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 1000));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0.1f).scale(0.1f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.NONE).waterColor(-16776961).waterFogColor(-16777012)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(TerraGrassBlock.block.getDefaultState(),
							TerraDirtBlock.block.getDefaultState(), TerraDirtBlock.block.getDefaultState())));
			setRegistryName("terraria_purity");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addOres(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.DEFAULT_FLOWER_CONFIG)
					.withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(4))));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.GRASS_CONFIG)
					.withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(4))));
			this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(20, 0.3D))
					.withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_SELECTOR
							.withConfiguration(new MultipleRandomFeatureConfig(
									ImmutableList.of(Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).withChance(0.2F),
											Feature.FANCY_TREE.withConfiguration(DefaultBiomeFeatures.field_230131_m_).withChance(0.1F)),
									Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230132_o_)))
							.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
		}
	}
}
