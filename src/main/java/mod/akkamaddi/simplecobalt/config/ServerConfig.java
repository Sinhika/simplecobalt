package mod.akkamaddi.simplecobalt.config;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraftforge.common.ForgeConfigSpec;

/**
 * For configuration settings that change the behaviour of code on the LOGICAL SERVER.
 * This can be moved to an inner class of ExampleModConfig, but is separate because of personal preference and to keep the code organised
 *
 * @author Cadiboo
 * @author Sinhika
 */
final class ServerConfig
{
    final ForgeConfigSpec.BooleanValue serverEnableCobaltRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableBlueDriftSteelRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableBlueCeladonRecipes;
    final ForgeConfigSpec.BooleanValue serverEnableGreenCeladonRecipes;
    
    final ForgeConfigSpec.BooleanValue serverEnableRecyclingRecipes;
    final ForgeConfigSpec.BooleanValue serverAddModLootToChests;

	ServerConfig(final ForgeConfigSpec.Builder builder)
	{
	    builder.push("General");
        serverAddModLootToChests = builder.comment("Add SimpleCobalt items to chest loot?")
                .translation(SimpleCobalt.MODID + ".config.addModLootToChests")
                .define("AddModLootToChests", true);
        
	    serverEnableRecyclingRecipes = builder
            .comment("Enable fusion recycling of cobalt items?")
            .translation(SimpleCobalt.MODID + ".config.enableRecycling")
            .define("EnableRecycling", true);
	    builder.pop();
	    
        builder.push("Recipes");
        serverEnableCobaltRecipes = builder.comment("false disables recipes")
                .translation(SimpleCobalt.MODID + ".config.enableCobaltRecipes")
                .define("EnableCobaltRecipes", true);
        serverEnableBlueCeladonRecipes = builder.comment("false disables recipes")
                .translation(SimpleCobalt.MODID + ".config.enableBlueCeladonRecipes")
                .define("EnableBlueCeladonRecipes", true);
        serverEnableBlueDriftSteelRecipes = builder.comment("false disables recipes")
                .translation(SimpleCobalt.MODID + ".config.enableBlueDriftSteelRecipes")
                .define("EnableBlueDriftSteelRecipes", true);
        serverEnableGreenCeladonRecipes = builder.comment("false disables recipes")
                .translation(SimpleCobalt.MODID + ".config.enableGreenCeladonRecipes")
                .define("EnableGreenCeladonRecipes", true);
        builder.pop();
        
	} // end ctor

} // end class ServerConfig
