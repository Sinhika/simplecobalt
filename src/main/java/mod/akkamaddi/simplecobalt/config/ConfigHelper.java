package mod.akkamaddi.simplecobalt.config;

import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.config.ModConfig;
import mod.alexndr.simplecorelib.config.ModOreConfig;

/**
 * This bakes the config values to normal fields
 *
 * @author Cadiboo
 * It can be merged into the main ExampleModConfig class, but is separate because of personal preference and to keep the code organised
 */
public final class ConfigHelper
{
//      public static void bakeClient(final ModConfig config) { }

    public static void bakeServer(final ModConfig config)
    {
        SimpleCobaltConfig.enableCobaltOre = ConfigHolder.SERVER.serverEnableCobaltOre.get();
        SimpleCobaltConfig.addModLootToChests = ConfigHolder.SERVER.serverAddModLootToChests.get();
        
        //SimpleCobaltConfig.cobalt_veinsize = ConfigHolder.SERVER.serverCobaltVeinSize.get();
        SimpleCobaltConfig.cobalt_cfg = new ModOreConfig(
                new TopSolidRangeConfig( ConfigHolder.SERVER.serverCobaltBottomHeight.get(), 
                        0, ConfigHolder.SERVER.serverCobaltMaxHeight.get()),
                ConfigHolder.SERVER.serverCobaltVeinSize.get(),
                ConfigHolder.SERVER.serverCobaltVeinCount.get());

        // recipe flags
        SimpleCobaltConfig.INSTANCE.putFlag("cobalt_recipes", ConfigHolder.SERVER.serverEnableCobaltRecipes.get());
        SimpleCobaltConfig.INSTANCE.putFlag("blue_celadon_recipes", ConfigHolder.SERVER.serverEnableBlueCeladonRecipes.get());
        SimpleCobaltConfig.INSTANCE.putFlag("blue_drift_steel_recipes", ConfigHolder.SERVER.serverEnableBlueDriftSteelRecipes.get());
        SimpleCobaltConfig.INSTANCE.putFlag("green_celadon_recipes", ConfigHolder.SERVER.serverEnableGreenCeladonRecipes.get());
        SimpleCobaltConfig.INSTANCE.putFlag("recycling_recipes", ConfigHolder.SERVER.serverEnableRecyclingRecipes.get());
        
    } // end bakeServer()

    public static void bakeClient(final ModConfig config) 
    {
    } // end bakeClient
    
    @SuppressWarnings("unused")
    private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue)
    {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    } // end setValueAndSave()

} // end class ConfigHelper
