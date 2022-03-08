package mod.akkamaddi.simplecobalt.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.akkamaddi.simplecobalt.init.ModTags;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private RecipeSetBuilder setbuilder;

    public Recipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        setbuilder = new RecipeSetBuilder(SimpleCobalt.MODID);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerStorageRecipes(consumer);
        registerMiscRecipes(consumer);
        registerToolRecipes(consumer);
        registerArmorRecipes(consumer);
        registerFurnaceRecipes(consumer);
    } // end registerRecipes

    private void registerFurnaceRecipes(Consumer<FinishedRecipe> consumer)
    {
        // large chunks
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModBlocks.cobalt_ore.get()),
                ModItems.cobalt_ingot.get(), has(ModBlocks.cobalt_ore.get()), 
                0.8F, 200, "_from_ore");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModBlocks.deepslate_cobalt_ore.get()),
                ModItems.cobalt_ingot.get(), has(ModBlocks.deepslate_cobalt_ore.get()), 
                0.8F, 200, "_from_deepslate_ore");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.raw_cobalt.get()),
                ModItems.cobalt_ingot.get(), has(ModItems.raw_cobalt.get()), 
                0.8F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_blue_drift_steel_chunk.get()),
                ModItems.blue_drift_steel_ingot.get(), has(ModItems.large_blue_drift_steel_chunk.get()), 
                0.9F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_blue_celadon_chunk.get()),
                ModItems.blue_celadon_ingot.get(), has(ModItems.large_blue_celadon_chunk.get()), 
                1.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_green_celadon_chunk.get()),
                ModItems.green_celadon_ingot.get(), has(ModItems.large_green_celadon_chunk.get()), 
                1.4F, 200);
        
        // vanilla recycling.
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.blue_drift_steel_axe.get(), 
                ModItems.blue_drift_steel_pickaxe.get(), ModItems.blue_drift_steel_boots.get(), 
                ModItems.blue_drift_steel_chestplate.get(), ModItems.blue_drift_steel_helmet.get(), 
                ModItems.blue_drift_steel_leggings.get(), 
                ModItems.blue_drift_steel_shovel.get(), ModItems.blue_drift_steel_sword.get()), 
                ModItems.blue_drift_steel_nugget.get(), has(ModItems.blue_drift_steel_axe.get()), 0.9F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.cobalt_axe.get(), 
                ModItems.cobalt_boots.get(), ModItems.cobalt_chestplate.get(), ModItems.cobalt_helmet.get(),
                ModItems.cobalt_hoe.get(), ModItems.cobalt_leggings.get(), ModItems.cobalt_pickaxe.get(),
                ModItems.cobalt_shovel.get(), ModItems.cobalt_sword.get()), 
                ModItems.cobalt_nugget.get(), has(ModItems.cobalt_axe.get()), 0.8F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.blue_celadon_axe.get(), 
                ModItems.blue_celadon_pickaxe.get(), ModItems.blue_celadon_boots.get(), 
                ModItems.blue_celadon_chestplate.get(), ModItems.blue_celadon_helmet.get(), 
                ModItems.blue_celadon_leggings.get(),
                ModItems.blue_celadon_shovel.get(), ModItems.blue_celadon_sword.get()), 
                ModItems.blue_celadon_nugget.get(), has(ModItems.blue_celadon_axe.get()), 1.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer,
                Ingredient.of(ModItems.green_celadon_axe.get(), ModItems.green_celadon_pickaxe.get(),
                        ModItems.green_celadon_boots.get(), 
                        ModItems.green_celadon_chestplate.get(), ModItems.green_celadon_helmet.get(), 
                        ModItems.green_celadon_leggings.get(),
                        ModItems.green_celadon_shovel.get(), ModItems.green_celadon_sword.get()),
                ModItems.green_celadon_nugget.get(), has(ModItems.green_celadon_axe.get()), 1.4F, 200);
        
    } // end registerFurnaceRecipes()

    private void registerArmorRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.cobalt_ingot.get()), 
                "cobalt", has(ModItems.cobalt_ingot.get()), flag("cobalt_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.blue_drift_steel_ingot.get()), 
                "blue_drift_steel", has(ModItems.blue_drift_steel_ingot.get()), flag("blue_drift_steel_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.blue_celadon_ingot.get()), 
                "blue_celadon", has(ModItems.blue_celadon_ingot.get()), flag("blue_celadon_recipes"));
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.green_celadon_ingot.get()), 
                "green_celadon", has(ModItems.green_celadon_ingot.get()), flag("green_celadon_recipes"));
    } // end registerArmorRecipes()

    private void registerToolRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.cobalt_ingot.get()), "cobalt",
                has(ModItems.cobalt_ingot.get()), flag("cobalt_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.blue_drift_steel_ingot.get()), "blue_drift_steel",
                has(ModItems.blue_drift_steel_ingot.get()), flag("blue_drift_steel_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.green_celadon_ingot.get()), "green_celadon",
                has(ModItems.green_celadon_ingot.get()), flag("green_celadon_recipes"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.blue_celadon_ingot.get()), "blue_celadon",
                has(ModItems.blue_celadon_ingot.get()), flag("blue_celadon_recipes"), false);
    } // end registerToolRecipes()

    /** 
     * pressure plates go here if we ever get any.
     * @param consumer
     */
    private void registerMiscRecipes(Consumer<FinishedRecipe> consumer)
    {
        Ingredient stick = Ingredient.of(Tags.Items.RODS_WOODEN);
        ResourceLocation many_rails = new ResourceLocation(SimpleCobalt.MODID, "many_rails");
        ResourceLocation many_more_rails = new ResourceLocation(SimpleCobalt.MODID, "many_more_rails");
        
        ConditionalRecipe.builder().addCondition(flag("cobalt_recipes"))
            .addRecipe( ShapedRecipeBuilder.shaped(Items.RAIL, 24)
                        .define('X', Ingredient.of(ModTags.Items.INGOTS_COBALT))
                        .define('Y', stick)
                        .pattern("X X")
                        .pattern("XYX")
                        .pattern("X X")
                        .unlockedBy("has_item", has(ModTags.Items.INGOTS_COBALT))
                        ::save)
            .setAdvancement(many_rails, setbuilder.build_advancement_with_condition(many_rails, flag("cobalt_recipes"), has(ModTags.Items.INGOTS_COBALT)))
            .build(consumer, many_rails);
        
        ConditionalRecipe.builder().addCondition(flag("blue_drift_steel_recipes"))
            .addRecipe( ShapedRecipeBuilder.shaped(Items.RAIL, 44)
                        .define('X', Ingredient.of(ModItems.blue_drift_steel_ingot.get()))
                        .define('Y', stick)
                        .pattern("X X")
                        .pattern("XYX")
                        .pattern("X X")
                        .unlockedBy("has_item", has(ModItems.blue_drift_steel_ingot.get()))
                        ::save)
            .setAdvancement(many_more_rails, 
                    setbuilder.build_advancement_with_condition(many_more_rails, 
                            flag("blue_drift_steel_recipes"), has(ModItems.blue_drift_steel_ingot.get())))
            .build(consumer, many_more_rails);
        
        
    } // end registerMiscRecipes()

    /**
     * build and register storage recipes; i.e., nugget => ingot => block conversions.
     * @param consumer
     */
    private void registerStorageRecipes(Consumer<FinishedRecipe> consumer)
    {
        // vanilla storage recipes
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.cobalt_ingot.get(), ModBlocks.cobalt_block.get(),
                ModItems.cobalt_nugget.get(), has(ModItems.cobalt_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.blue_drift_steel_ingot.get(), ModBlocks.blue_drift_steel_block.get(),
                ModItems.blue_drift_steel_nugget.get(), has(ModItems.blue_drift_steel_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.blue_celadon_ingot.get(), ModBlocks.blue_celadon_block.get(),
                ModItems.blue_celadon_nugget.get(), has(ModItems.blue_celadon_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.green_celadon_ingot.get(), ModBlocks.green_celadon_block.get(),
                ModItems.green_celadon_nugget.get(), has(ModItems.green_celadon_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.raw_cobalt.get(), 
                ModBlocks.raw_cobalt_block.get(), null, has(ModItems.raw_cobalt.get()));
        
        // chunk conversion recipes
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.blue_drift_steel_nugget.get(),
                ModItems.medium_blue_drift_steel_chunk.get(), ModItems.large_blue_drift_steel_chunk.get(), 
                has(ModItems.blue_drift_steel_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.blue_celadon_nugget.get(),
                ModItems.medium_blue_celadon_chunk.get(), ModItems.large_blue_celadon_chunk.get(), 
                has(ModItems.blue_celadon_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.green_celadon_nugget.get(),
                ModItems.medium_green_celadon_chunk.get(), ModItems.large_green_celadon_chunk.get(), 
                has(ModItems.green_celadon_nugget.get()));
    } // end registerStorageRecipes()

   
    
    @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleCobalt.MODID, SimpleCobaltConfig.INSTANCE, name);
    }

} // end class
