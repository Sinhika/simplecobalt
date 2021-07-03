package mod.akkamaddi.simplecobalt.generation;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.alexndr.simplecorelib.world.OreGenUtils;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
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

    }
    
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, OreGeneration.ORE_COBALT);
    } // end generateOverworldOres()

} // end class OreGeneration