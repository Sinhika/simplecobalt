package akkamaddi.plugins.simplecobalt;

import akkamaddi.api.core.LootHelper;
import alexndr.api.core.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Content 
{
	/**
	 * Loads all the Simple Cobalt content, by calling the methods below.
	 */
	public static void preInitialize()
	{
		try {
			doItems();
			LogHelper.verboseInfo(ModInfo.ID,
					"All items were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Items were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doBlocks();
			LogHelper.verboseInfo(ModInfo.ID,
					"All blocks were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Blocks were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doTools();
			LogHelper.verboseInfo(ModInfo.ID,
					"All tools were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Tools were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doArmor();
			LogHelper.verboseInfo(ModInfo.ID,
					"All armor was added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Armor was not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		//		try{doAchievements(); LogHelper.verboseInfo(ModInfo.ID, "All achievements were added successfully");}
//			catch(Exception e){LogHelper.severe(ModInfo.ID, "Achievements were not added successfully. This is a serious problem!"); e.printStackTrace();}
	} // end preInitialize()
	
	
	public static void doBlocks() 
	{
		// TODO Auto-generated method stub
		
	} // end doBlocks()

	public static void doItems() 
	{
		// TODO Auto-generated method stub
		
	} // end doItems()

	public static void doArmor()
	{
		
	} // end doArmor()
	
	public static void doTools()
	{
		
	} // end doTools()
	
	public static void setLoot()
	{
        // loot
       LootHelper.addLoot("villageBlacksmith", new ItemStack(cobaltIngot), 2, 4, 6);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(cobaltSword), 2, 3, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(cobaltPickaxe), 2, 3, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(cobaltAxe), 2, 3, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(cobaltShovel), 2, 3, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(blueDriftSteelIngot), 2, 3, 4);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(blueCeladonIngot), 2, 3, 3);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(greenCeladonIngot), 1, 2, 2);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(blueDriftSteelSword), 1, 2, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(blueCeladonSword), 1, 2, 1);
       LootHelper.addLoot("villageBlacksmith", new ItemStack(greenCeladonSword), 1, 1, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(blueDriftSteelSword), 1, 2, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(blueDriftSteelPickaxe), 1, 2, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(blueCeladonPickaxe), 1, 2, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(greenCeladonPickaxe), 1, 1, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(blueCeladonSword), 1, 2, 1);
       LootHelper.addLoot("dungeonChest", new ItemStack(greenCeladonSword), 1, 1, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(cobaltIngot), 2, 3, 3);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(cobaltSword), 1, 2, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(cobaltPickaxe), 2, 3, 2);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(cobaltShovel), 2, 3, 2);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(blueDriftSteelPickaxe), 2, 3, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(blueDriftSteelShovel), 1, 1, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(blueCeladonPickaxe), 1, 1, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(blueCeladonShovel), 1, 1, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(greenCeladonPickaxe), 1, 1, 1);
       LootHelper.addLoot("mineshaftCorridor", new ItemStack(greenCeladonShovel), 1, 1, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(blueDriftSteelIngot), 1, 2, 3);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(blueCeladonIngot), 1, 1, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(greenCeladonIngot), 1, 1, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(blueDriftSteelSword), 2, 4, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(blueCeladonSword), 1, 1, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(greenCeladonSword), 1, 1, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cobaltSword), 1, 5, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cobaltHelm), 1, 5, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cobaltChest), 1, 5, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cobaltLegs), 1, 5, 1);
       LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cobaltBoots), 1, 5, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(blueDriftSteelIngot), 1, 1, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(blueCeladonIngot), 1, 1, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonIngot), 1, 2, 4);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(blueDriftSteelSword), 1, 1, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(blueCeladonSword), 1, 1, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonSword), 1, 5, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonHelm), 1, 5, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonChest), 1, 5, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonLegs), 1, 5, 1);
       LootHelper.addLoot("pyramidJungleChest", new ItemStack(greenCeladonBoots), 1, 5, 1);
		
	} // end setLoot()
	
	// Cobalt
	public static Item cobaltIngot;

	public static Item cobaltSword;
	public static Item cobaltShovel;
	public static Item cobaltAxe;
	public static Item cobaltPickaxe;
	public static Item cobaltHoe;

	public static Item cobaltHelm;
	public static Item cobaltChest;
	public static Item cobaltLegs;
	public static Item cobaltBoots;
	
	// Blue DriftSteel
	public static Item blueDriftSteelIngot;
	public static Item smallBlueDriftSteelChunkItem;
	public static Item mediumBlueDriftSteelChunkItem;
	public static Item largeBlueDriftSteelChunkItem;

	public static Item blueDriftSteelSword;
	public static Item blueDriftSteelShovel;
	public static Item blueDriftSteelAxe;
	public static Item blueDriftSteelPickaxe;
	public static Item blueDriftSteelHoe;

	public static Item blueDriftSteelHelm;
	public static Item blueDriftSteelChest;
	public static Item blueDriftSteelLegs;
	public static Item blueDriftSteelBoots;


	// Blue Celadon
	public static Item blueCeladonIngot;
	public static Item smallBlueCeladonChunkItem;
	public static Item mediumBlueCeladonChunkItem;
	public static Item largeBlueCeladonChunkItem;

	public static Item blueCeladonSword;
	public static Item blueCeladonShovel;
	public static Item blueCeladonAxe;
	public static Item blueCeladonPickaxe;
	public static Item blueCeladonHoe;

	public static Item blueCeladonHelm;
	public static Item blueCeladonChest;
	public static Item blueCeladonLegs;
	public static Item blueCeladonBoots;

	// Green Celadon
	public static Item greenCeladonIngot;
	public static Item smallGreenCeladonChunkItem;
	public static Item mediumGreenCeladonChunkItem;
	public static Item largeGreenCeladonChunkItem;

	public static Item greenCeladonSword;
	public static Item greenCeladonShovel;
	public static Item greenCeladonAxe;
	public static Item greenCeladonPickaxe;
	public static Item greenCeladonHoe;

	public static Item greenCeladonHelm;
	public static Item greenCeladonChest;
	public static Item greenCeladonLegs;
	public static Item greenCeladonBoots;

	// set block names
	public static Block blockCobalt;
	public static Block oreCobalt;
	public static Block blockBlueDriftSteel;
	public static Block blockBlueCeladon;
	public static Block blockGreenCeladon;

} // end class Content
