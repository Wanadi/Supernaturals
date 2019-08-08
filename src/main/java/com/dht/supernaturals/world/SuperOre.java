package com.dht.supernaturals.world;

import com.dht.supernaturals.common.blocks.SuperBlockNames;
import com.dht.supernaturals.util.config.SuperOreConfig;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class SuperOre {

    public static void setupOreGeneration()
    {
        if(SuperOreConfig.Overworld_Generation.get())
        {
            for(Biome biome : ForgeRegistries.BIOMES)
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, SuperBlockNames.ghastlyore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, SuperBlockNames.darkore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SuperBlockNames.silverore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SuperBlockNames.whitegoldore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SuperBlockNames.amethystore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SuperBlockNames.manaore.getDefaultState(), SuperOreConfig.Super_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));

            }
        }
    }

}
