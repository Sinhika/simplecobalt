package akkamaddi.plugins.simplecobalt;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.core.Content;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
    @SuppressWarnings("unchecked")
	public static void doCobaltRecipes()
    {
        // Ore Dictionary
        OreDictionary.registerOre("ingotCobalt", new ItemStack(SimpleCobalt.cobaltIngot));
        OreDictionary.registerOre("oreCobalt", new ItemStack(SimpleCobalt.oreCobalt));
        OreDictionary.registerOre("ingotBlueDriftSteel", new ItemStack(SimpleCobalt.blueDriftSteelIngot));
        OreDictionary.registerOre("ingotBlueCeladon", new ItemStack(SimpleCobalt.blueCeladonIngot));
        OreDictionary.registerOre("ingotGreenCeladon", new ItemStack(SimpleCobalt.greenCeladonIngot));
        
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(SimpleCobalt.blockCobalt, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobalt.cobaltIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobalt.blockBlueDriftSteel, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobalt.blueDriftSteelIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobalt.blockBlueCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobalt.blueCeladonIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobalt.blockGreenCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobalt.greenCeladonIngot});
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.cobaltIngot, 9), new Object[]
                                        {
                                            SimpleCobalt.blockCobalt
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.blueDriftSteelIngot, 9), new Object[]
                                        {
                                            SimpleCobalt.blockBlueDriftSteel
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.blueCeladonIngot, 9), new Object[]
                                        {
                                            SimpleCobalt.blockBlueCeladon
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.greenCeladonIngot, 9), new Object[]
                                        {
                                            SimpleCobalt.blockGreenCeladon
                                        });
        //Chunk Recipes
        //Blue Drift Steel Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueDriftSteelChunkItem, SimpleCobalt.mediumBlueDriftSteelChunkItem, SimpleCobalt.mediumBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueDriftSteelChunkItem, SimpleCobalt.mediumBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem, SimpleCobalt.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumBlueDriftSteelChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.largeBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.smallBlueDriftSteelChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueDriftSteelChunkItem
                                        });
        // Blue Celadon Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueCeladonChunkItem, SimpleCobalt.mediumBlueCeladonChunkItem, SimpleCobalt.mediumBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueCeladonChunkItem, SimpleCobalt.mediumBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem, SimpleCobalt.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumBlueCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.largeBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.smallBlueCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.mediumBlueCeladonChunkItem
                                        });
        // Green Celadon Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumGreenCeladonChunkItem, SimpleCobalt.mediumGreenCeladonChunkItem, SimpleCobalt.mediumGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.mediumGreenCeladonChunkItem, SimpleCobalt.mediumGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem, SimpleCobalt.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.mediumGreenCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.largeGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobalt.smallGreenCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobalt.mediumGreenCeladonChunkItem
                                        });
        // Cobalt
        //Cobalt Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        //Cobalt Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.cobaltBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotCobalt"
                }));
        // Blue Drift Steel
        //Blue Drift Steel Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        //Blue Drift Steel Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueDriftSteelBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        // Blue Celadon
        //Blue Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        //Blue Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.blueCeladonBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        // Green Celadon
        //Green Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        //green Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobalt.greenCeladonBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotGreenCeladon"
                }));
        //Rails
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(new ItemStack(Blocks.rail, 24, 0),
						true, new Object[] { "X X", "XYX", "X X", 'X',
								"ingotCobalt", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(new ItemStack(Blocks.rail, 44, 0),
						true, new Object[] { "X X", "XYX", "X X", 'X',
								"ingotBlueDriftSteel", 'Y', "stickWood" }));
        // recipes: Smelting
		GameRegistry.addSmelting(SimpleCobalt.oreCobalt, new ItemStack(
				SimpleCobalt.cobaltIngot), 0.8F);
		GameRegistry.addSmelting(SimpleCobalt.largeBlueDriftSteelChunkItem,
				new ItemStack(SimpleCobalt.blueDriftSteelIngot), 0.9F);
		GameRegistry.addSmelting(SimpleCobalt.largeBlueCeladonChunkItem,
				new ItemStack(SimpleCobalt.blueCeladonIngot), 1.0F);
		GameRegistry.addSmelting(SimpleCobalt.largeGreenCeladonChunkItem,
				new ItemStack(SimpleCobalt.greenCeladonIngot), 1.4F);
        
        //Fusion Furnace Recipes
        // Blue Drift Steel
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.coal, 1,
						OreDictionary.WILDCARD_VALUE), new ItemStack(
						SimpleCobalt.smallBlueDriftSteelChunkItem), 6.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.gunpowder),
				new ItemStack(SimpleCobalt.mediumBlueDriftSteelChunkItem),
				8.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.dye, 1,
						4), new ItemStack(
						SimpleCobalt.largeBlueDriftSteelChunkItem), 20.F);
		// Blue Celadon
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.redstone), new ItemStack(
						SimpleCobalt.smallBlueCeladonChunkItem), 8.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.dye, 1, 4), new ItemStack(
						SimpleCobalt.mediumBlueCeladonChunkItem), 10.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.glowstone_dust), new ItemStack(
						SimpleCobalt.largeBlueCeladonChunkItem), 26.F);
		// Green Celadon
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.dye, 1, 4), new ItemStack(
						SimpleCobalt.smallGreenCeladonChunkItem), 10.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.glowstone_dust), new ItemStack(
						SimpleCobalt.mediumGreenCeladonChunkItem), 12.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.emerald), new ItemStack(
						SimpleCobalt.largeGreenCeladonChunkItem), 36.F);

        if (SimpleCobalt.enableRecycling)
        {
            // Cobalt
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobalt.oreCobalt, 2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobalt.oreCobalt, 2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.cobaltPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltAxe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobalt.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(SimpleCobalt.cobaltHoe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobalt.oreCobalt), 15.0F);
            // Blue Drift Steel
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.blueDriftSteelChest,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									SimpleCobalt.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.blueDriftSteelLegs,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									SimpleCobalt.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueDriftSteelHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobalt.largeBlueDriftSteelChunkItem),
					15.0F);
			// Blue Celadon
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobalt.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobalt.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.blueCeladonHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobalt.largeBlueCeladonChunkItem), 20.0F);
			// Green Celadon
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonHelm, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.greenCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobalt.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobalt.greenCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobalt.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonBoots,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonSword,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonShovel,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonPickaxe,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonAxe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobalt.greenCeladonHoe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobalt.largeGreenCeladonChunkItem),
							20.0F);
        }
    }
}
