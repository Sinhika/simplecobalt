package akkamaddi.plugins.simplecobalt;

import akkamaddi.api.core.LootHelper;
import akkamaddi.plugins.simplecobalt.Settings;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.items.SimpleArmor;
import alexndr.api.content.items.SimpleAxe;
import alexndr.api.content.items.SimpleHoe;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.content.items.SimplePickaxe;
import alexndr.api.content.items.SimpleShovel;
import alexndr.api.content.items.SimpleSword;
import alexndr.api.core.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
		blockCobalt = new SimpleBlock(Material.iron).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setHardness(Settings.cobaltHardness)
				.setResistance(Settings.cobaltResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockCobalt");

		oreCobalt = new SimpleBlock(Material.iron).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setHardness(Settings.cobaltOreHardness)
				.setResistance(Settings.cobaltOreResistance)
				.setStepSound(Block.soundTypeMetal).setBlockName("oreCobalt");

		blockBlueDriftSteel = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setHardness(Settings.blueDriftSteelHardness)
				.setResistance(Settings.blueDriftSteelResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockBlueDriftSteel").setLightLevel(1.0F);

		blockGreenCeladon = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setHardness(Settings.greenCeladonHardness)
				.setResistance(Settings.greenCeladonResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockGreenCeladon");

		blockBlueCeladon = ((SimpleBlock) new SimpleBlock(Material.iron)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setHardness(Settings.blueCeladonHardness)
				.setResistance(Settings.blueCeladonResistance)
				.setStepSound(Block.soundTypeMetal)).setBeaconBase(true)
				.setBlockName("blockBlueCeladon");

		blockCobalt.setHarvestLevel("pickaxe", Settings.cobaltHarvestLevel);
		oreCobalt.setHarvestLevel("pickaxe", Settings.cobaltOreHarvestLevel);
		blockBlueCeladon.setHarvestLevel("pickaxe", Settings.blueCeladonHarvestLevel);
		blockBlueDriftSteel.setHarvestLevel("pickaxe", Settings.blueDriftSteelHarvestLevel);
		blockGreenCeladon.setHarvestLevel("pickaxe", Settings.greenCeladonHarvestLevel);
		
	} // end doBlocks()

	public static void doItems() 
	{
		cobaltIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltIngot");
		
		blueDriftSteelIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelIngot");
		smallBlueDriftSteelChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallBlueDriftSteelChunkItem");
		mediumBlueDriftSteelChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumBlueDriftSteelChunkItem");
		largeBlueDriftSteelChunkItem = new SimpleItem().modId(ModInfo.ID)
				.isIngot().setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeBlueDriftSteelChunkItem");
		
		blueCeladonIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonIngot");
		smallBlueCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallBlueCeladonChunkItem");
		mediumBlueCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumBlueCeladonChunkItem");
		largeBlueCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeBlueCeladonChunkItem");
		
		greenCeladonIngot = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonIngot");
		smallGreenCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallGreenCeladonChunkItem");
		mediumGreenCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumGreenCeladonChunkItem");
		largeGreenCeladonChunkItem = new SimpleItem().modId(ModInfo.ID).isIngot()
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeGreenCeladonChunkItem");
	} // end doItems()

	public static void doArmor()
	{
		cobaltHelm = new SimpleArmor(SimpleCobalt.armorCobalt, 0)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltHelm");
		cobaltChest = new SimpleArmor(SimpleCobalt.armorCobalt, 1)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltChest");
		cobaltLegs = new SimpleArmor(SimpleCobalt.armorCobalt, 2)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltLegs");
		cobaltBoots = new SimpleArmor(SimpleCobalt.armorCobalt, 3)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltBoots");
		
		blueDriftSteelHelm = new SimpleArmor(
				SimpleCobalt.armorBlueDriftSteel, 0).modId("simplecobalt")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelHelm");
		blueDriftSteelChest = new SimpleArmor(
				SimpleCobalt.armorBlueDriftSteel, 1).modId("simplecobalt")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelChest");
		blueDriftSteelLegs = new SimpleArmor(
				SimpleCobalt.armorBlueDriftSteel, 2).modId("simplecobalt")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelLegs");
		blueDriftSteelBoots = new SimpleArmor(
				SimpleCobalt.armorBlueDriftSteel, 3).modId("simplecobalt")
				.setType("tungstencarbide")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelBoots");

		blueCeladonHelm = new SimpleArmor(SimpleCobalt.armorBlueCeladon, 0)
				.modId("simplecobalt").setType("blueCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonHelm");
		blueCeladonChest = new SimpleArmor(SimpleCobalt.armorBlueCeladon, 1)
				.modId("simplecobalt").setType("blueCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonChest");
		blueCeladonLegs = new SimpleArmor(SimpleCobalt.armorBlueCeladon, 2)
				.modId("simplecobalt").setType("blueCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonLegs");
		blueCeladonBoots = new SimpleArmor(SimpleCobalt.armorBlueCeladon, 3)
				.modId("simplecobalt").setType("blueCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonBoots");

		greenCeladonHelm = new SimpleArmor(SimpleCobalt.armorGreenCeladon, 0)
				.modId("simplecobalt").setType("greenCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonHelm");
		greenCeladonChest = new SimpleArmor(SimpleCobalt.armorGreenCeladon, 1)
				.modId("simplecobalt").setType("greenCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonChest");
		greenCeladonLegs = new SimpleArmor(SimpleCobalt.armorGreenCeladon, 2)
				.modId("simplecobalt").setType("greenCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonLegs");
		greenCeladonBoots = new SimpleArmor(SimpleCobalt.armorGreenCeladon, 3)
				.modId("simplecobalt").setType("greenCeladon")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonBoots");
	
	} // end doArmor()
	
	public static void doTools()
	{
		// Cobalt
		cobaltSword = new SimpleSword(SimpleCobalt.toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltSword");
		cobaltShovel = new SimpleShovel(SimpleCobalt.toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltShovel");
		cobaltAxe = new SimpleAxe(SimpleCobalt.toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltAxe");
		cobaltPickaxe = new SimplePickaxe(SimpleCobalt.toolCobalt)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltPickaxe");
		cobaltHoe = new SimpleHoe(SimpleCobalt.toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltHoe");
		
		blueDriftSteelSword = new SimpleSword(SimpleCobalt.toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelSword");
		blueDriftSteelShovel = new SimpleShovel(SimpleCobalt.toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelShovel");
		blueDriftSteelAxe = new SimpleAxe(SimpleCobalt.toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelAxe");
		blueDriftSteelPickaxe = new SimplePickaxe(SimpleCobalt.toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelPickaxe");
		blueDriftSteelHoe = new SimpleHoe(SimpleCobalt.toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelHoe");
		
		// BlueCeladon
		blueCeladonSword = new SimpleSword(SimpleCobalt.toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonSword");
		blueCeladonShovel = new SimpleShovel(SimpleCobalt.toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonShovel");
		blueCeladonAxe = new SimpleAxe(SimpleCobalt.toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonAxe");
		blueCeladonPickaxe = new SimplePickaxe(SimpleCobalt.toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonPickaxe");
		blueCeladonHoe = new SimpleHoe(SimpleCobalt.toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonHoe");

		greenCeladonSword = new SimpleSword(SimpleCobalt.toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonSword");
		greenCeladonShovel = new SimpleShovel(SimpleCobalt.toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonShovel");
		greenCeladonAxe = new SimpleAxe(SimpleCobalt.toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonAxe");
		greenCeladonPickaxe = new SimplePickaxe(SimpleCobalt.toolGreenCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonPickaxe");
		greenCeladonHoe = new SimpleHoe(SimpleCobalt.toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonHoe");
		
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
