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
    final ForgeConfigSpec.BooleanValue serverEnableCobaltOre;
    final ForgeConfigSpec.IntValue serverCobaltVeinSize;
    final ForgeConfigSpec.IntValue serverCobaltVeinCount;
    final ForgeConfigSpec.IntValue serverCobaltBottomHeight;
    final ForgeConfigSpec.IntValue serverCobaltMaxHeight;
    
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
	    
	    builder.push("OreGeneration");
	    serverEnableCobaltOre = builder
                .comment("Enable cobalt ore generation?")
                .translation(SimpleCobalt.MODID + ".config.enableCobaltOre")
                .define("EnableCobaltOre", true);
        builder.push("Cobalt");
        serverCobaltVeinSize = builder
                .comment("Cobalt ore vein size")
                .translation(SimpleCobalt.MODID + ".config.serverCobaltVeinSize")
                .defineInRange("CobaltVeinSize", 6, 1, Integer.MAX_VALUE);
        serverCobaltVeinCount = builder
                .comment("Cobalt ore vein count per chunk")
                .translation(SimpleCobalt.MODID + ".config.serverCobaltVeinCount")
                .defineInRange("CobaltVeinCount", 6, 1, Integer.MAX_VALUE);
        serverCobaltBottomHeight = builder
                .comment("Cobalt ore minimum height")
                .translation(SimpleCobalt.MODID + ".config.serverCobaltBottomHeight")
                .defineInRange("CobaltBottomHeight", 1, 1, 254);
        serverCobaltMaxHeight = builder
                .comment("Cobalt ore maximum height")
                .translation(SimpleCobalt.MODID + ".config.serverCobaltMaxHeight")
                .defineInRange("CobaltMaxHeight", 32, 1, 255);
        builder.pop();
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
