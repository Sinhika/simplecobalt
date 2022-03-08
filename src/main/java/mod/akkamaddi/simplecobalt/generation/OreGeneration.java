package mod.akkamaddi.simplecobalt.generation;

import java.util.List;

import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    // TODO: add deepslate ore
    public static final List<OreConfiguration.TargetBlockState> ORE_COBALT_TARGET_LIST =
            OreGenUtils.BuildStandardOreTargetList(ModBlocks.cobalt_ore.get(), ModBlocks.deepslate_cobalt_ore.get());
    
    public static ConfiguredFeature<OreConfiguration, ?> ORE_COBALT;
    public static PlacedFeature ORE_COBALT_DEPOSIT;
    
    /**
     * initialize overworld Features.
     * 
     * @param evt
     */
    public static void initOverworldFeatures()
    {
        ORE_COBALT = FeatureUtils.register("ore_cobalt",  
                OreGenUtils.ConfigureOreFeature(ORE_COBALT_TARGET_LIST, SimpleCobaltConfig.cobalt_cfg.getVein_size(), 0.0F));
        ORE_COBALT_DEPOSIT = PlacementUtils.register("ore_cobalt_deposit", 
                OreGenUtils.ConfigurePlacedFeature(SimpleCobaltConfig.cobalt_cfg, ORE_COBALT));
    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_COBALT_DEPOSIT);
    } // end generateOverworldOres()

} // end class OreGeneration