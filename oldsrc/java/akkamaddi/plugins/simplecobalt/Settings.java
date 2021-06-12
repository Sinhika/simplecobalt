package akkamaddi.plugins.simplecobalt;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import akkamaddi.api.core.ASettings;
import alexndr.api.core.LogHelper;

public class Settings extends ASettings 
{
	public static void createOrLoadSettings(FMLPreInitializationEvent event) 
	{
		config = GetConfig(event, "akkamaddi", "simplecobalt.cfg");

		try {
			LogHelper.verboseInfo(ModInfo.ID, "Loading Settings...");
			config.load();
			genericSettings(ModInfo.ID, "Simple Cobalt, and Cobalt alloys");

			// Adjustable Ore Spawn Rates
			adjustOreSpawnRates();

			// Armor Stat Modification
			armorStatDefaults();
			if (enableArmorStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Armor Stat Modification enabled!");
				customizeArmorStats();
			} // end-if enableArmorStatModification

			// Block Stat Modification
			blockStatDefaults();
			if (enableBlockStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Block Stat Modification enabled!");
				customizeBlockStats();
			}

			toolStatDefaults();
			if (enableToolStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Tool Stat Modification enabled!");
				customizeToolStats();
			}
		} // end-try
		catch (Exception e) {
			LogHelper
					.severe(ModInfo.ID,
							"Settings failed to load correctly. The plugin may not function correctly");
		}

		finally {
			config.save();
			LogHelper.verboseInfo(ModInfo.ID, "Settings loaded successfully");
		}
	} // end createOrLoadSettings()
	
	
	/**
	 * loads/sets the ore generation variables.
	 */
	public static void adjustOreSpawnRates() {
		cobaltSpawnRate = config.getInt("Cobalt Spawn Rate","Cobalt Ore Worldgen",
				 6, 0, 5000,
				"Controls the spawn rate of Cobalt Ore.");
		cobaltVeinSize = config.getInt("Cobalt Vein Size","Cobalt Ore Worldgen",
				 6, 0, 5000,
				"Controls the max vein size of Cobalt Ore.");
		cobaltMaxSpawnHeight = config.getInt("Cobalt Maximum Spawn Height", "Cobalt Ore Worldgen",
				32, 0, 255,
				"Controls the max spawn height of Cobalt Ore.");
		cobaltMinSpawnHeight = config.getInt("Cobalt Minimum Spawn Height", "Cobalt Ore Worldgen",
				0, 0, 255,
				"Controls the min spawn height of Cobalt Ore.");
	} // end adjustOreSpawnRates()

	/**
	 * Sets the default armor stats.
	 */
	public static void armorStatDefaults() {
		cobaltArmorDurability = 24;
		cobaltArmorDamageReduction = new int[] { 3, 4, 3, 3 };
		cobaltArmorEnchantability = 8;
		blueDriftSteelArmorDurability = 26;
		blueDriftSteelArmorDamageReduction = new int[] { 3, 6, 5, 3 };
		blueDriftSteelArmorEnchantability = 16;
		blueCeladonArmorDurability = 30;
		blueCeladonArmorDamageReduction = new int[] { 4, 6, 5, 4 };
		blueCeladonArmorEnchantability = 24;
		greenCeladonArmorDurability = 44;
		greenCeladonArmorDamageReduction = new int[] {  5, 9, 8, 5 };
		greenCeladonArmorEnchantability = 26;
	} // end armorStatDefaults()

	/**
	 * sets customized armor stats.
	 */
	public static void customizeArmorStats() {
		cobaltArmorDurability = config.getInt("Cobalt Armor Durability",
				"Armor Stat Modification", cobaltArmorDurability, 0, 255,
				"Controls the durability of Cobalt Armor.");
		cobaltArmorDamageReduction = config.get("Armor Stat Modification",
				"Cobalt Armor Damage Reduction Array",
				cobaltArmorDamageReduction).getIntList();
		cobaltArmorEnchantability = config.getInt(
				"Cobalt Armor Enchantability", "Armor Stat Modification", 
				cobaltArmorEnchantability,
				0, 255, "Controls the enchantability of Cobalt Armor.");

		blueDriftSteelArmorDurability = config.getInt(
				"Blue Drift Steel Armor Durability", "Armor Stat Modification",
				blueDriftSteelArmorDurability, 0, 255,
				"Controls the durability of Blue Drift Steel Armor.");
		blueDriftSteelArmorDamageReduction = config.get(
				"Armor Stat Modification",
				"Blue Drift Steel Armor Damage Reduction Array",
				blueDriftSteelArmorDamageReduction).getIntList();
		blueDriftSteelArmorEnchantability = config.getInt(
				"Blue Drift Steel Armor Enchantability",
				"Armor Stat Modification", blueDriftSteelArmorEnchantability, 0, 255,
				"Controls the enchantability of Blue Drift Steel Armor.");

		blueCeladonArmorDurability = config.getInt("Blue Celadon Armor Durability",
				"Armor Stat Modification", blueCeladonArmorDurability, 0, 255,
				"Controls the durability of Blue Celadon Armor.");
		blueCeladonArmorDamageReduction = config.get("Armor Stat Modification",
				"Blue Celadon Armor Damage Reduction Array",
				blueCeladonArmorDamageReduction).getIntList();
		blueCeladonArmorEnchantability = config.getInt(
				"Blue Celadon Armor Enchantability", "Armor Stat Modification", 
				blueCeladonArmorEnchantability,
				0, 255, "Controls the enchantability of Blue Celadon Armor.");

		greenCeladonArmorDurability = config.getInt(
				"Green Celadon Armor Durability", "Armor Stat Modification",
				greenCeladonArmorDurability, 
				0, 255, "Controls the durability of Green Celadon Armor.");
		greenCeladonArmorDamageReduction = config.get(
				"Armor Stat Modification",
				"Green Celadon Armor Damage Reduction Array",
				greenCeladonArmorDamageReduction).getIntList();
		greenCeladonArmorEnchantability = config.getInt(
				"Green Celadon Armor Enchantability",
				"Armor Stat Modification", greenCeladonArmorEnchantability, 0, 255,
				"Controls the enchantability of Green Celadon Armor.");
	} // end customizeArmorStatus

	/**
	 * Sets the default block stats.
	 */
	public static void blockStatDefaults() 
	{
		cobaltHardness = 10.0F;
		cobaltResistance = 22.0F;
		cobaltHarvestLevel = 0;
		cobaltOreHardness = 4.0F;
		cobaltOreResistance = 10.0F;
		cobaltOreHarvestLevel = 2;
		blueDriftSteelHardness = 10.0F;
		blueDriftSteelResistance = 22.0F;
		blueDriftSteelHarvestLevel = 0;
		blueCeladonHardness = 10.0F;
		blueCeladonResistance = 22.0F;
		blueCeladonHarvestLevel = 0;
		greenCeladonHardness = 10.0F;
		greenCeladonResistance = 22.0F;
		greenCeladonHarvestLevel = 0;
	} // end blockStatDefaults()

	/**
	 * sets customized block stats.
	 */
	public static void customizeBlockStats() 
	{
		cobaltHardness = config.getFloat("Cobalt Hardness",
				"Block Stat Modification", cobaltHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		cobaltResistance = config.getFloat("Cobalt Resistance",
				"Block Stat Modification", cobaltResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		cobaltHarvestLevel = config.getInt("Cobalt Harvest Level",
				"Block Stat Modification", cobaltHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		cobaltOreHardness = config.getFloat("Cobalt Ore Hardness",
				"Block Stat Modification", cobaltOreHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		cobaltOreResistance = config.getFloat("Cobalt Ore Resistance",
				"Block Stat Modification", cobaltOreResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		cobaltOreHarvestLevel = config.getInt("Cobalt Ore Harvest Level",
				"Block Stat Modification", cobaltOreHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		blueDriftSteelHardness = config.getFloat("Blue Drift Steel Hardness",
				"Block Stat Modification", blueDriftSteelHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		blueDriftSteelResistance = config.getFloat("Blue Drift Steel Resistance",
				"Block Stat Modification", blueDriftSteelResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		blueDriftSteelHarvestLevel = config.getInt("Blue Drift Steel Harvest Level",
				"Block Stat Modification", blueDriftSteelHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		blueCeladonHardness = config.getFloat("Blue Celadon Hardness",
				"Block Stat Modification", blueCeladonHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		blueCeladonResistance = config.getFloat("Blue Celadon Resistance",
				"Block Stat Modification", blueCeladonResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		blueCeladonHarvestLevel = config.getInt("Blue Celadon Harvest Level",
				"Block Stat Modification", blueCeladonHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		greenCeladonHardness = config.getFloat("Green Celadon Hardness",
				"Block Stat Modification", greenCeladonHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		greenCeladonResistance = config.getFloat("Green Celadon Resistance",
				"Block Stat Modification", greenCeladonResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		greenCeladonHarvestLevel = config.getInt("Green Celadon Harvest Level",
				"Block Stat Modification", greenCeladonHarvestLevel, 0, 255,
				"Tool level required to harvest this block");
	} // end customizeBlockStats()

	/**
	 * Sets the default tool stats.
	 */
	public static void toolStatDefaults() 
	{
		cobaltMiningLevel = 2;
		cobaltUsesNum = 960;
		cobaltMiningSpeed = 7.0F;
		cobaltDamageVsEntity = 2.0F;
		cobaltEnchantability = 8;
		
		blueDriftSteelMiningLevel = 2;
		blueDriftSteelUsesNum = 1240;
		blueDriftSteelMiningSpeed = 13.0F;
		blueDriftSteelDamageVsEntity = 2.0F;
		blueDriftSteelEnchantability = 16;
		
		blueCeladonMiningLevel = 3;
		blueCeladonUsesNum = 1740;
		blueCeladonMiningSpeed = 20.0F;
		blueCeladonDamageVsEntity = 5.0F;
		blueCeladonEnchantability = 24;
		
		greenCeladonMiningLevel = 4;
		greenCeladonUsesNum = 2120;
		greenCeladonMiningSpeed = 24.0F;
		greenCeladonDamageVsEntity = 6.0F;
		greenCeladonEnchantability = 26;
	} // end toolStatDefaults()

	/**
	 * set customized tool stats.
	 */
	public static void customizeToolStats() 
	{
		cobaltMiningLevel = config
				.getInt("Cobalt Mining Level",
						"Tool Stat Modification",
						cobaltMiningLevel,
						0,
						255,
						"Controls the mining level of Cobalt Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		cobaltUsesNum = config.getInt("Cobalt Tools Durability",
				"Tool Stat Modification", cobaltUsesNum, 0, 32000,
				"Controls the number of uses Cobalt Tools have.");
		cobaltMiningSpeed = config
				.getFloat("Cobalt Mining Speed", "Tool Stat Modification",
						cobaltMiningSpeed, 0, 32000,
						"Controls the speed at which Cobalt Tools harvest their appropriate blocks.");
		cobaltDamageVsEntity = config
				.getFloat("Cobalt Damage Vs. Entities",
						"Tool Stat Modification", cobaltDamageVsEntity, 0, 32000,
						"Controls the amount of damage that Cobalt Tools will do to entities.");
		cobaltEnchantability = config.getInt("Cobalt Tools Enchantability",
				"Tool Stat Modification", cobaltEnchantability, 0, 32000,
				"Controls the enchantability of Cobalt Tools.");

		blueDriftSteelMiningLevel = config
				.getInt("Blue Drift Steel Mining Level",
						"Tool Stat Modification",
						blueDriftSteelMiningLevel,
						0,
						255,
						"Controls the mining level of Blue Drift Steel Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		blueDriftSteelUsesNum = config.getInt(
				"Blue Drift Steel Tools Durability", "Tool Stat Modification",
				blueDriftSteelUsesNum, 0, 32000,
				"Controls the number of uses Blue Drift Steel Tools have.");
		blueDriftSteelMiningSpeed = config
				.getFloat(
						"Blue Drift Steel Mining Speed",
						"Tool Stat Modification",
						blueDriftSteelMiningSpeed,
						0,
						32000,
						"Controls the speed at which Blue Drift Steel Tools harvest their appropriate blocks.");
		blueDriftSteelDamageVsEntity = config
				.getFloat(
						"Blue Drift Steel Damage Vs. Entities",
						"Tool Stat Modification",
						blueDriftSteelDamageVsEntity,
						0,
						32000,
						"Controls the amount of damage that Blue Drift Steel Tools will do to entities.");
		blueDriftSteelEnchantability = config.getInt(
				"Blue Drift Steel Tools Enchantability",
				"Tool Stat Modification", blueDriftSteelEnchantability, 0, 32000,
				"Controls the enchantability of Blue Drift Steel Tools.");

		blueCeladonMiningLevel = config
				.getInt("Blue Celadon Mining Level",
						"Tool Stat Modification",
						blueCeladonMiningLevel,
						0,
						255,
						"Controls the mining level of Blue Celadon Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		blueCeladonUsesNum = config.getInt("Blue Celadon Tools Durability",
				"Tool Stat Modification", blueCeladonUsesNum, 0, 32000,
				"Controls the number of uses Blue Celadon Tools have.");
		blueCeladonMiningSpeed = config
				.getFloat("Blue Celadon Mining Speed", "Tool Stat Modification",
						blueCeladonMiningSpeed, 0, 32000,
						"Controls the speed at which Blue Celadon Tools harvest their appropriate blocks.");
		blueCeladonDamageVsEntity = config
				.getFloat("Blue Celadon Damage Vs. Entities",
						"Tool Stat Modification", blueCeladonDamageVsEntity, 0, 32000,
						"Controls the amount of damage Blue Celadon Tools will do to entities.");
		blueCeladonEnchantability = config.getInt("Blue Celadon Tools Enchantability",
				"Tool Stat Modification", blueCeladonEnchantability, 0, 32000,
				"Controls the enchantability of Blue Celadon Tools.");

		greenCeladonMiningLevel = config
				.getInt("Green Celadon Mining Level",
						"Tool Stat Modification",
						greenCeladonMiningLevel,
						0,
						255,
						"Controls the mining level of Green Celadon Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		greenCeladonUsesNum = config.getInt("Green Celadon Tools Durability",
				"Tool Stat Modification", greenCeladonUsesNum, 0, 32000,
				"Controls the number of uses Green Celadon Tools have.");
		greenCeladonMiningSpeed = config
				.getFloat(
						"Green Celadon Mining Speed",
						"Tool Stat Modification",
						greenCeladonMiningSpeed,
						0,
						32000,
						"Controls the speed at which Green Celadon Tools harvest their appropriate blocks.");
		greenCeladonDamageVsEntity = config
				.getFloat("Green Celadon Damage Vs. Entities",
						"Tool Stat Modification", greenCeladonDamageVsEntity, 0, 32000,
						"Controls the amount of damage Green Celadon Tools will do to entities.");
		greenCeladonEnchantability = config.getInt(
				"Green Celadon Tools Enchantability",
				"Tool Stat Modification",greenCeladonEnchantability, 0, 32000,
				"Controls the enchantability of Green Celadon Tools.");
	} // end customizeToolStats()

	// spawning
	public static int cobaltSpawnRate, cobaltVeinSize, cobaltMaxSpawnHeight, cobaltMinSpawnHeight;

	// Tool Stats
	public static int cobaltMiningLevel, blueDriftSteelMiningLevel,
			greenCeladonMiningLevel, blueCeladonMiningLevel;
	public static int cobaltUsesNum, blueDriftSteelUsesNum, greenCeladonUsesNum,
			blueCeladonUsesNum;
	public static float cobaltMiningSpeed, blueDriftSteelMiningSpeed,
			greenCeladonMiningSpeed, blueCeladonMiningSpeed;
	public static float cobaltDamageVsEntity, blueDriftSteelDamageVsEntity,
			greenCeladonDamageVsEntity, blueCeladonDamageVsEntity;
	public static int cobaltEnchantability, blueDriftSteelEnchantability,
			greenCeladonEnchantability, blueCeladonEnchantability;

	// Armor Stats
	public static int cobaltArmorDurability, blueDriftSteelArmorDurability,
			greenCeladonArmorDurability, blueCeladonArmorDurability;
	public static int[] cobaltArmorDamageReduction,
			blueDriftSteelArmorDamageReduction, greenCeladonArmorDamageReduction,
			blueCeladonArmorDamageReduction;
	public static int cobaltArmorEnchantability,
			blueDriftSteelArmorEnchantability, greenCeladonArmorEnchantability,
			blueCeladonArmorEnchantability;

	// Block stats
	public static float cobaltHardness, cobaltOreHardness,
			blueDriftSteelHardness, greenCeladonHardness, blueCeladonHardness;
	public static float cobaltResistance, cobaltOreResistance,
			blueDriftSteelResistance, greenCeladonResistance,
			blueCeladonResistance;
	public static int cobaltHarvestLevel, cobaltOreHarvestLevel,
			blueDriftSteelHarvestLevel, greenCeladonHarvestLevel,
			blueCeladonHarvestLevel;


} // end class Settings
