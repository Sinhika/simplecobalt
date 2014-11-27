package akkamaddi.simplecobalt.code;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.core.Content;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class CobaltRecipes
{
    @SuppressWarnings("unchecked")
	public static void doCobaltRecipes()
    {
        // Ore Dictionary
        OreDictionary.registerOre("ingotCobalt", new ItemStack(SimpleCobaltCore.cobaltIngot));
        OreDictionary.registerOre("oreCobalt", new ItemStack(SimpleCobaltCore.oreCobalt));
        OreDictionary.registerOre("ingotBlueDriftSteel", new ItemStack(SimpleCobaltCore.blueDriftSteelIngot));
        OreDictionary.registerOre("ingotBlueCeladon", new ItemStack(SimpleCobaltCore.blueCeladonIngot));
        OreDictionary.registerOre("ingotGreenCeladon", new ItemStack(SimpleCobaltCore.greenCeladonIngot));
        
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(SimpleCobaltCore.blockCobalt, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobaltCore.cobaltIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobaltCore.blockBlueDriftSteel, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobaltCore.blueDriftSteelIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobaltCore.blockBlueCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobaltCore.blueCeladonIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleCobaltCore.blockGreenCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleCobaltCore.greenCeladonIngot});
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.cobaltIngot, 9), new Object[]
                                        {
                                            SimpleCobaltCore.blockCobalt
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.blueDriftSteelIngot, 9), new Object[]
                                        {
                                            SimpleCobaltCore.blockBlueDriftSteel
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.blueCeladonIngot, 9), new Object[]
                                        {
                                            SimpleCobaltCore.blockBlueCeladon
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.greenCeladonIngot, 9), new Object[]
                                        {
                                            SimpleCobaltCore.blockGreenCeladon
                                        });
        //Chunk Recipes
        //Blue Drift Steel Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueDriftSteelChunkItem, SimpleCobaltCore.mediumBlueDriftSteelChunkItem, SimpleCobaltCore.mediumBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueDriftSteelChunkItem, SimpleCobaltCore.mediumBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumBlueDriftSteelChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem, SimpleCobaltCore.smallBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumBlueDriftSteelChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.largeBlueDriftSteelChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.smallBlueDriftSteelChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueDriftSteelChunkItem
                                        });
        // Blue Celadon Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueCeladonChunkItem, SimpleCobaltCore.mediumBlueCeladonChunkItem, SimpleCobaltCore.mediumBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueCeladonChunkItem, SimpleCobaltCore.mediumBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumBlueCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem, SimpleCobaltCore.smallBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumBlueCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.largeBlueCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.smallBlueCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.mediumBlueCeladonChunkItem
                                        });
        // Green Celadon Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumGreenCeladonChunkItem, SimpleCobaltCore.mediumGreenCeladonChunkItem, SimpleCobaltCore.mediumGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.mediumGreenCeladonChunkItem, SimpleCobaltCore.mediumGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumGreenCeladonChunkItem, 1), new Object[]
                                        {
                                            SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem, SimpleCobaltCore.smallGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.mediumGreenCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.largeGreenCeladonChunkItem
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleCobaltCore.smallGreenCeladonChunkItem, 2), new Object[]
                                        {
                                            SimpleCobaltCore.mediumGreenCeladonChunkItem
                                        });
        // Cobalt
        //Cobalt Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        //Cobalt Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.cobaltBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotCobalt"
                }));
        // Blue Drift Steel
        //Blue Drift Steel Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        //Blue Drift Steel Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueDriftSteelBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        // Blue Celadon
        //Blue Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        //Blue Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.blueCeladonBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        // Green Celadon
        //Green Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        //green Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleCobaltCore.greenCeladonBoots, true, new Object[]
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
		GameRegistry.addSmelting(SimpleCobaltCore.oreCobalt, new ItemStack(
				SimpleCobaltCore.cobaltIngot), 0.8F);
		GameRegistry.addSmelting(SimpleCobaltCore.largeBlueDriftSteelChunkItem,
				new ItemStack(SimpleCobaltCore.blueDriftSteelIngot), 0.9F);
		GameRegistry.addSmelting(SimpleCobaltCore.largeBlueCeladonChunkItem,
				new ItemStack(SimpleCobaltCore.blueCeladonIngot), 1.0F);
		GameRegistry.addSmelting(SimpleCobaltCore.largeGreenCeladonChunkItem,
				new ItemStack(SimpleCobaltCore.greenCeladonIngot), 1.4F);
        
        //Fusion Furnace Recipes
        // Blue Drift Steel
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.coal, 1,
						OreDictionary.WILDCARD_VALUE), new ItemStack(
						SimpleCobaltCore.smallBlueDriftSteelChunkItem), 6.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.gunpowder),
				new ItemStack(SimpleCobaltCore.mediumBlueDriftSteelChunkItem),
				8.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Items.iron_ingot), new ItemStack(Items.dye, 1,
						4), new ItemStack(
						SimpleCobaltCore.largeBlueDriftSteelChunkItem), 20.F);
		// Blue Celadon
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.redstone), new ItemStack(
						SimpleCobaltCore.smallBlueCeladonChunkItem), 8.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.dye, 1, 4), new ItemStack(
						SimpleCobaltCore.mediumBlueCeladonChunkItem), 10.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.mythril_ingot),
				new ItemStack(Items.glowstone_dust), new ItemStack(
						SimpleCobaltCore.largeBlueCeladonChunkItem), 26.F);
		// Green Celadon
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.dye, 1, 4), new ItemStack(
						SimpleCobaltCore.smallGreenCeladonChunkItem), 10.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.glowstone_dust), new ItemStack(
						SimpleCobaltCore.mediumGreenCeladonChunkItem), 12.0F);
		FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltIngot),
				new ItemStack(Content.adamantium_ingot),
				new ItemStack(Items.emerald), new ItemStack(
						SimpleCobaltCore.largeGreenCeladonChunkItem), 36.F);

        if (SimpleCobaltCore.enableRecycling)
        {
            // Cobalt
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobaltCore.oreCobalt, 2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobaltCore.oreCobalt, 2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.cobaltPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltAxe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobaltCore.oreCobalt), 15.0F);
			FusionRecipes.addSmelting(new ItemStack(SimpleCobaltCore.cobaltHoe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					SimpleCobaltCore.oreCobalt), 15.0F);
            // Blue Drift Steel
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.blueDriftSteelChest,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									SimpleCobaltCore.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.blueDriftSteelLegs,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									SimpleCobaltCore.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueDriftSteelHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							SimpleCobaltCore.largeBlueDriftSteelChunkItem),
					15.0F);
			// Blue Celadon
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobaltCore.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobaltCore.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.blueCeladonHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
			// Green Celadon
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonHelm, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.greenCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobaltCore.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes.addSmelting(new ItemStack(
					SimpleCobaltCore.greenCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					SimpleCobaltCore.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonBoots,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonSword,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonShovel,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonPickaxe,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonAxe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
			FusionRecipes
					.addSmelting(
							new ItemStack(SimpleCobaltCore.greenCeladonHoe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									SimpleCobaltCore.largeGreenCeladonChunkItem),
							20.0F);
        }
    }
}
