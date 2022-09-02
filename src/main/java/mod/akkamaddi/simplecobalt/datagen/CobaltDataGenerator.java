package mod.akkamaddi.simplecobalt.datagen;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

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
        gen.addProvider(event.includeServer(), new Recipes(gen));
        gen.addProvider(event.includeServer(), new FusionRecipes(gen));
        gen.addProvider(event.includeServer(), new ModItemTags(gen, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(), new ModBlockTags(gen, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(), new CobaltLootTableProvider(gen));
        gen.addProvider(event.includeServer(), new CobaltLootInjectorProvider(gen));
    } // end gatherData()

    
} // end class
