package mod.akkamaddi.simplecobalt.generation;

import mod.akkamaddi.simplecobalt.init.ModFeatures;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Ore generation master-class for SimpleOres.
 */
public class OreGeneration
{
    /**
     * generate overworld ores.
     */
    public static void generateOverworldOres(BiomeLoadingEvent evt)
    {
        evt.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ModFeatures.ORE_COBALT_DEPOSIT.getHolder().get());
    } // end generateOverworldOres()

} // end class OreGeneration