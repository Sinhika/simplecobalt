package mod.akkamaddi.simplecobalt.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.akkamaddi.simplecobalt.init.ModTags;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.api.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class FusionRecipes extends AbstractFusionRecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private FusionRecipeSetBuilder fusionbuilder;

    public FusionRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        fusionbuilder = new FusionRecipeSetBuilder(SimpleCobalt.MODID);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerCobaltRecyclingRecipes(consumer);
        registerBlueDriftSteelRecipes(consumer);
        registerBlueCeladonRecipes(consumer);
        registerGreenCeladonRecipes(consumer);
    }

    protected void registerCobaltRecyclingRecipes(Consumer<FinishedRecipe> consumer)
    {
        fusionbuilder.buildFusionRecyclingRecipes(consumer, 
                Ingredient.of(ModItems.cobalt_axe.get(), 
                ModItems.cobalt_pickaxe.get(), ModItems.cobalt_boots.get(),
                ModItems.cobalt_helmet.get(),
                ModItems.cobalt_shovel.get(), ModItems.cobalt_sword.get()),
                Ingredient.of(ModItems.cobalt_chestplate.get(), ModItems.cobalt_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.raw_cobalt.get(), 15.0F, 600, flag("recycling_recipes"), 
                "recycle_cobalt_items");
        
    } // end registerCobaltRecyclingRecipes
    
    /**
     * BlueDriftSteel alloying and fusion recycling recipes.
     */
    protected void registerBlueDriftSteelRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COBALT));
        primary_inputs.add(Ingredient.of(Items.IRON_INGOT));
        catalysts[0] = Ingredient.of(ItemTags.COALS);
        catalysts[1] = Ingredient.of(Items.GUNPOWDER);
        catalysts[2] = Ingredient.of(Items.LAPIS_LAZULI);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.blue_drift_steel_nugget.get(), ModItems.medium_blue_drift_steel_chunk.get(), 
                ModItems.large_blue_drift_steel_chunk.get(),
                6.0F, 600, flag("blue_drift_steel_recipes"));
        
        // blue_drift_steel fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.blue_drift_steel_axe.get(), 
                ModItems.blue_drift_steel_pickaxe.get(), ModItems.blue_drift_steel_boots.get(),
                ModItems.blue_drift_steel_helmet.get(),
                ModItems.blue_drift_steel_shovel.get(), ModItems.blue_drift_steel_sword.get()),
                Ingredient.of(ModItems.blue_drift_steel_chestplate.get(), ModItems.blue_drift_steel_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.large_blue_drift_steel_chunk.get(), 15.0F, 600, flag("recycling_recipes"), 
                "recycle_blue_drift_steel_items");
    } // end registerBlueDriftSteelRecipes
    
    
    /**
     * BlueCeladon alloying and fusion recycling recipes.
     */
    protected void registerBlueCeladonRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COBALT));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_MYTHRIL));
        catalysts[0] = Ingredient.of(Items.REDSTONE);
        catalysts[1] = Ingredient.of(Items.LAPIS_LAZULI);
        catalysts[2] = Ingredient.of(Items.GLOWSTONE_DUST);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.blue_celadon_nugget.get(), ModItems.medium_blue_celadon_chunk.get(), 
                ModItems.large_blue_celadon_chunk.get(),
                8.0F, 600, flag("blue_celadon_recipes"));
        
        // blue_celadon fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.blue_celadon_axe.get(), 
                ModItems.blue_celadon_pickaxe.get(), ModItems.blue_celadon_boots.get(),
                ModItems.blue_celadon_helmet.get(),
                ModItems.blue_celadon_shovel.get(), ModItems.blue_celadon_sword.get()),
                Ingredient.of(ModItems.blue_celadon_chestplate.get(), ModItems.blue_celadon_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(Items.LAVA_BUCKET), 
                ModItems.large_blue_celadon_chunk.get(), 20.0F, 600, flag("recycling_recipes"), 
                "recycle_blue_celadon_items");
    } // end registerBlueCeladonRecipes
    

    /**
     * GreenCeladon alloying and fusion recycling recipes.
     */
    protected void registerGreenCeladonRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COBALT));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_ADAMANTIUM));
        catalysts[0] = Ingredient.of(Items.LAPIS_LAZULI);
        catalysts[1] = Ingredient.of(Items.GLOWSTONE_DUST);
        catalysts[2] = Ingredient.of(Items.EMERALD);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.green_celadon_nugget.get(), ModItems.medium_green_celadon_chunk.get(), 
                ModItems.large_green_celadon_chunk.get(),
                10.0F, 600, flag("green_celadon_recipes"));
        
        // green_celadon fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.green_celadon_axe.get(), 
                ModItems.green_celadon_pickaxe.get(), ModItems.green_celadon_boots.get(),
                ModItems.green_celadon_helmet.get(),
                ModItems.green_celadon_shovel.get(), ModItems.green_celadon_sword.get()),
                Ingredient.of(ModItems.green_celadon_chestplate.get(), ModItems.green_celadon_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(Items.LAVA_BUCKET), 
                ModItems.large_green_celadon_chunk.get(), 20.0F, 600, flag("recycling_recipes"), 
                "recycle_green_celadon_items");
    } // end registerGreenCeladonRecipes
    

   @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleCobalt.MODID, SimpleCobaltConfig.INSTANCE, name);
    }

} // end class
