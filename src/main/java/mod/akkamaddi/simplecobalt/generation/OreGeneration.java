package mod.akkamaddi.simplecobalt.generation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    public static ConfiguredFeature<?, ?> ORE_COBALT;
    private static final Logger LOGGER = LogManager.getLogger(SimpleCobalt.MODID + " OreGeneration");

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
        //LOGGER.debug("cobalt_vein feature generated.");
    } // end generateOverworldOres()

} // end class OreGeneration