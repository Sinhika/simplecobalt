package mod.akkamaddi.simplecobalt.generation;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    // TODO: add deepslate ore
    public static final List<OreConfiguration.TargetBlockState> ORE_COBALT_TARGET_LIST =
            OreGenUtils.BuildStandardOreTargetList(ModBlocks.cobalt_ore.get(), ModBlocks.deepslate_cobalt_ore.get());
    
    public static ConfiguredFeature<?, ?> ORE_COBALT;

    /**
     * initialize overworld Features.
     * 
     * @param evt
     */
    public static void initOverworldFeatures()
    {
        ORE_COBALT = OreGenUtils.buildOverworldOreFeature(Feature.ORE, ModBlocks.cobalt_ore.get().defaultBlockState(),
                SimpleCobaltConfig.cobalt_cfg);
        OreGenUtils.registerFeature(SimpleCobalt.MODID, "cobalt_vein", ORE_COBALT);
        LOGGER.debug("cobalt_vein feature registered.");
    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_COBALT);
    } // end generateOverworldOres()

} // end class OreGeneration