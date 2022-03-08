package mod.akkamaddi.simplecobalt.content;

import java.util.List;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public final class SimpleCobaltItemTier 
{
    public static final Tag.Named<Block> COBALT_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleCobalt.MODID, "needs_cobalt_tool"));
    public static final Tag.Named<Block> BLUE_DRIFT_STEEL_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleCobalt.MODID, "needs_blue_drift_steel_tool"));
    public static final Tag.Named<Block> BLUE_CELADON_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleCobalt.MODID, "needs_blue_celadon_tool"));
    public static final Tag.Named<Block> GREEN_CELADON_TAG = 
            BlockTags.createOptional(new ResourceLocation(SimpleCobalt.MODID, "needs_green_celadon_tool"));
    
    public static final Tier COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 960, 7.0F, 2.0F, 8, COBALT_TAG, ()->Ingredient.of( ModItems.cobalt_ingot.get())),
            new ResourceLocation(SimpleCobalt.MODID, "cobalt"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
            
    public static final Tier BLUE_DRIFT_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 1240, 13.0F, 2.0F, 16, BLUE_DRIFT_STEEL_TAG, ()->Ingredient.of( ModItems.blue_drift_steel_ingot.get())),
            new ResourceLocation(SimpleCobalt.MODID, "blue_drift_steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
                    
    public static final Tier BLUE_CELADON = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 1740, 20.0F, 5.0F, 24, BLUE_CELADON_TAG, ()->Ingredient.of( ModItems.blue_celadon_ingot.get())),
            new ResourceLocation(SimpleCobalt.MODID, "blue_celadon"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
            
    public static final Tier GREEN_CELADON = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), 2120, 24.0F, 6.0F, 26, GREEN_CELADON_TAG, ()->Ingredient.of( ModItems.green_celadon_ingot.get())),
            new ResourceLocation(SimpleCobalt.MODID, "green_celadon"), List.of(Tiers.NETHERITE), List.of());
} // end enum class
