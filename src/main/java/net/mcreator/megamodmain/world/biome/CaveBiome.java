
package net.mcreator.megamodmain.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.block.Blocks;

import net.mcreator.megamodmain.MegamodmainModElements;

import com.google.common.collect.Lists;

@MegamodmainModElements.ModElement.Tag
public class CaveBiome extends MegamodmainModElements.ModElement {
	@ObjectHolder("megamodmain:cave")
	public static final CustomBiome biome = null;
	public CaveBiome(MegamodmainModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0f).scale(0f).temperature(0.5f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState(),
							Blocks.STONE.getDefaultState())));
			setRegistryName("cave");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			DefaultBiomeFeatures.addLakes(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG)
							.withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(3))));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG)
					.withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(3))));
			addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
					Feature.DISK
							.withConfiguration(new SphereReplaceConfig(Blocks.GRAVEL.getDefaultState(), 6, 2,
									Lists.newArrayList(Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState())))
							.withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(4))));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.BAT, 20, 4, 4));
			this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.BAT, 20, 4, 4));
			this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.IRON_GOLEM, 20, 4, 4));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.IRON_GOLEM, 20, 4, 4));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.CREEPER, 20, 4, 4));
			this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.CREEPER, 20, 4, 4));
			this.addSpawn(EntityClassification.AMBIENT, new Biome.SpawnListEntry(EntityType.CREEPER, 20, 4, 4));
		}
	}
}
