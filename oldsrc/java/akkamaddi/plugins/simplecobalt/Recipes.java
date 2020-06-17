package akkamaddi.plugins.simplecobalt;

import alexndr.api.core.LogHelper;
import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.FusionMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void preInitialize()
	{
		try {
			addOreDictEntries();
			LogHelper.verboseInfo(ModInfo.ID,
					"All OreDictionary entries were added successfully.");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
			 "OreDictionary entries were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end preInitialize()
	
	public static void initialize()
	{
		try {
			addRecipes();
			LogHelper.verboseInfo(ModInfo.ID,
					"All recipes were added successfully.");
		} catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Recipes were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end initialize()
	
	public static void addOreDictEntries()
	{
        // Ore Dictionary
        OreDictionary.registerOre("ingotCobalt", new ItemStack(Content.cobaltIngot));
        OreDictionary.registerOre("oreCobalt", new ItemStack(Content.oreCobalt));
        OreDictionary.registerOre("ingotBlueDriftSteel", new ItemStack(Content.blueDriftSteelIngot));
        OreDictionary.registerOre("ingotBlueCeladon", new ItemStack(Content.blueCeladonIngot));
        OreDictionary.registerOre("ingotGreenCeladon", new ItemStack(Content.greenCeladonIngot));
       		
	} // end addOreDictEntries
	
    @SuppressWarnings("unchecked")
	public static void addRecipes()
    {
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(Content.blockCobalt, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Content.cobaltIngot});
        GameRegistry.addRecipe(new ItemStack(Content.blockBlueDriftSteel, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Content.blueDriftSteelIngot});
        GameRegistry.addRecipe(new ItemStack(Content.blockBlueCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Content.blueCeladonIngot});
        GameRegistry.addRecipe(new ItemStack(Content.blockGreenCeladon, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Content.greenCeladonIngot});
        
        //Ingot Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Content.cobaltIngot, 9),
				new Object[] { Content.blockCobalt });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.blueDriftSteelIngot, 9),
				new Object[] { Content.blockBlueDriftSteel });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.blueCeladonIngot,
				9), new Object[] { Content.blockBlueCeladon });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.greenCeladonIngot, 9),
				new Object[] { Content.blockGreenCeladon });
		
        //Chunk Recipes
        //Blue Drift Steel Chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueDriftSteelChunkItem, 1), new Object[] {
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueDriftSteelChunkItem, 1), new Object[] {
				Content.mediumBlueDriftSteelChunkItem,
				Content.mediumBlueDriftSteelChunkItem,
				Content.mediumBlueDriftSteelChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueDriftSteelChunkItem, 1), new Object[] {
				Content.mediumBlueDriftSteelChunkItem,
				Content.mediumBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumBlueDriftSteelChunkItem, 1), new Object[] {
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem,
				Content.smallBlueDriftSteelChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumBlueDriftSteelChunkItem, 2),
				new Object[] { Content.largeBlueDriftSteelChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.smallBlueDriftSteelChunkItem, 2),
				new Object[] { Content.mediumBlueDriftSteelChunkItem });
		// Blue Celadon Chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueCeladonChunkItem, 1), new Object[] {
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueCeladonChunkItem, 1), new Object[] {
				Content.mediumBlueCeladonChunkItem,
				Content.mediumBlueCeladonChunkItem,
				Content.mediumBlueCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeBlueCeladonChunkItem, 1), new Object[] {
				Content.mediumBlueCeladonChunkItem,
				Content.mediumBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumBlueCeladonChunkItem, 1), new Object[] {
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem,
				Content.smallBlueCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumBlueCeladonChunkItem, 2),
				new Object[] { Content.largeBlueCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.smallBlueCeladonChunkItem, 2),
				new Object[] { Content.mediumBlueCeladonChunkItem });
		// Green Celadon Chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeGreenCeladonChunkItem, 1), new Object[] {
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeGreenCeladonChunkItem, 1), new Object[] {
				Content.mediumGreenCeladonChunkItem,
				Content.mediumGreenCeladonChunkItem,
				Content.mediumGreenCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeGreenCeladonChunkItem, 1), new Object[] {
				Content.mediumGreenCeladonChunkItem,
				Content.mediumGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumGreenCeladonChunkItem, 1), new Object[] {
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem,
				Content.smallGreenCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumGreenCeladonChunkItem, 2),
				new Object[] { Content.largeGreenCeladonChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.smallGreenCeladonChunkItem, 2),
				new Object[] { Content.mediumGreenCeladonChunkItem });
		
        // Cobalt
        //Cobalt Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotCobalt", 'Y', "stickWood"
                }));
        //Cobalt Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotCobalt"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cobaltBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotCobalt"
                }));
        // Blue Drift Steel
        //Blue Drift Steel Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueDriftSteel", 'Y', "stickWood"
                }));
        //Blue Drift Steel Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueDriftSteelBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueDriftSteel"
                }));
        // Blue Celadon
        //Blue Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotBlueCeladon", 'Y', "stickWood"
                }));
        //Blue Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.blueCeladonBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotBlueCeladon"
                }));
        // Green Celadon
        //Green Celadon Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotGreenCeladon", 'Y', "stickWood"
                }));
        //green Celadon Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotGreenCeladon"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.greenCeladonBoots, true, new Object[]
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
		GameRegistry.addSmelting(Content.oreCobalt, new ItemStack(
				Content.cobaltIngot), 0.8F);
		GameRegistry.addSmelting(Content.largeBlueDriftSteelChunkItem,
				new ItemStack(Content.blueDriftSteelIngot), 0.9F);
		GameRegistry.addSmelting(Content.largeBlueCeladonChunkItem,
				new ItemStack(Content.blueCeladonIngot), 1.0F);
		GameRegistry.addSmelting(Content.largeGreenCeladonChunkItem,
				new ItemStack(Content.greenCeladonIngot), 1.4F);
        
        //Fusion Furnace Recipes
        // Blue Drift Steel
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotIron"), 
				FusionMaterial.of(Items.coal, 1, OreDictionary.WILDCARD_VALUE), 
				new ItemStack(Content.smallBlueDriftSteelChunkItem), 6.0F);
		
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotIron"), 
				FusionMaterial.of(Items.gunpowder),
				new ItemStack(Content.mediumBlueDriftSteelChunkItem), 8.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotIron"), 
				FusionMaterial.of(Items.dye, 1,	4), 
				new ItemStack(Content.largeBlueDriftSteelChunkItem), 20.F);
		
		// Blue Celadon
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotMythril"),
				FusionMaterial.of(Items.redstone), 
				new ItemStack(Content.smallBlueCeladonChunkItem), 8.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotMythril"),
				FusionMaterial.of(Items.dye, 1, 4), 
				new ItemStack(Content.mediumBlueCeladonChunkItem), 10.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotMythril"),
				FusionMaterial.of(Items.glowstone_dust), 
				new ItemStack(Content.largeBlueCeladonChunkItem), 26.F);
		
		// Green Celadon
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotAdamantium"),
				FusionMaterial.of(Items.dye, 1, 4), 
				new ItemStack(Content.smallGreenCeladonChunkItem), 10.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotAdamantium"),
				FusionMaterial.of(Items.glowstone_dust), 
				new ItemStack(Content.mediumGreenCeladonChunkItem), 12.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCobalt"),
				FusionMaterial.of("ingotAdamantium"),
				FusionMaterial.of(Items.emerald), 
				new ItemStack(Content.largeGreenCeladonChunkItem), 36.F);

        if (Settings.enableRecycling)
        {
            // Cobalt
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreCobalt, 2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreCobalt, 2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cobaltPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.cobaltAxe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreCobalt), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.cobaltHoe,
					1, OreDictionary.WILDCARD_VALUE), new ItemStack(
					Blocks.gravel), new ItemStack(Items.coal, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.oreCobalt), 15.0F);
            // Blue Drift Steel
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.blueDriftSteelChest,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									Content.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.blueDriftSteelLegs,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.coal, 2,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(
									Content.largeBlueDriftSteelChunkItem,
									2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueDriftSteelHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1,
							OreDictionary.WILDCARD_VALUE), new ItemStack(
							Content.largeBlueDriftSteelChunkItem),
					15.0F);
			// Blue Celadon
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonHelm, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largeBlueCeladonChunkItem, 2, 0), 40.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonBoots, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonSword, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonShovel, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonPickaxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonAxe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.blueCeladonHoe, 1,
					OreDictionary.WILDCARD_VALUE),
					new ItemStack(Blocks.gravel), new ItemStack(
							Items.lava_bucket), new ItemStack(
							Content.largeBlueCeladonChunkItem), 20.0F);
			// Green Celadon
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonHelm, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.greenCeladonChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.greenCeladonLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.lava_bucket), new ItemStack(
					Content.largeGreenCeladonChunkItem, 2, 0), 40.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonBoots,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonSword,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonShovel,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonPickaxe,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonAxe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.greenCeladonHoe, 1,
									OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel),
							new ItemStack(Items.lava_bucket),
							new ItemStack(
									Content.largeGreenCeladonChunkItem),
							20.0F);
        }
    } // end addRecipes()
} // end class Recipes
