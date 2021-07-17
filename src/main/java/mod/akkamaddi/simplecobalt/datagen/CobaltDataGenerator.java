package mod.akkamaddi.simplecobalt.datagen;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * bundles up the GatherDataEvent handler and all the necessary data providers for
 * data generation.
 * @author Sinhika
 */
@EventBusSubscriber(modid = SimpleCobalt.MODID, bus = MOD)public class CobaltDataGenerator
{
    /**
     * GatherDataEvent handler.
     * @param event the GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer())
        {
            gen.addProvider(new Recipes(gen));
            gen.addProvider(new FusionRecipes(gen));
            gen.addProvider(new ModItemTags(gen, event.getExistingFileHelper()));
            gen.addProvider(new ModBlockTags(gen, event.getExistingFileHelper()));
            gen.addProvider(new CobaltLootTableProvider(gen));
            gen.addProvider(new CobaltLootInjectorProvider(gen));
        }
    } // end gatherData()

    
} // end class
