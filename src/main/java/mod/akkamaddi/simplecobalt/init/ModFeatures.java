package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.alexndr.simplecorelib.api.helpers.OreGenUtils;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures
{
    /** ConfiguredFeature<?, ?> registry */
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SimpleCobalt.MODID);

    public static RegistryObject<ConfiguredFeature<OreConfiguration, ?>> ORE_COBALT =
            CONFIGURED_FEATURES.register("ore_cobalt", 
                    () -> OreGenUtils.createConfiguredOreFeature(
                            OreGenUtils.BuildStandardOreTargetList(ModBlocks.cobalt_ore.get(), ModBlocks.deepslate_cobalt_ore.get()),
                            SimpleCobaltConfig.cobalt_cfg));

    /** PlacedFeature registry */
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SimpleCobalt.MODID);
    
    public static RegistryObject<PlacedFeature> ORE_COBALT_DEPOSIT = PLACED_FEATURES.register("ore_cobalt_deposit", 
            ()-> OreGenUtils.createPlacedOreFeature(ORE_COBALT.getHolder().get(), SimpleCobaltConfig.cobalt_cfg));

} // end class
