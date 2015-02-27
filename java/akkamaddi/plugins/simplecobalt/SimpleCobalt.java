package akkamaddi.plugins.simplecobalt;

import java.io.File;

import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;
import alexndr.api.helpers.game.OreGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, 
	version = ModInfo.VERSION, 
	dependencies = "required-after:simplecore; required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore")
public class SimpleCobalt 
{
	// tab
	public static SimpleTab tabAkkamaddiCobalt;

	public static ArmorMaterial armorCobalt, armorBlueDriftSteel, armorBlueCeladon, armorGreenCeladon;
	public static ToolMaterial toolCobalt, toolBlueDriftSteel, toolBlueCeladon, toolGreenCeladon;

	@EventHandler 
    public void preInit(FMLPreInitializationEvent event)
    {
		tabAkkamaddiCobalt = new SimpleTab("tabAkkamaddiCobalt", ContentTypes.CreativeTab.GENERAL);
		
		//Configuration
		Settings.createOrLoadSettings(event);
		
		//Content
		setToolAndArmorStats();
		Content.preInitialize();
		Recipes.preInitialize();
		Content.setLoot();

		MinecraftForge.EVENT_BUS.register(new HandlerArmor());

        // define items
        // Cobalt
//		cobaltIngot = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltIngot");
//		cobaltSword = new SimpleSword(toolCobalt).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltSword");
//		cobaltShovel = new SimpleShovel(toolCobalt).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltShovel");
//		cobaltAxe = new SimpleAxe(toolCobalt).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltAxe");
//		cobaltPickaxe = new SimplePickaxe(toolCobalt).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltPickaxe");
//		cobaltHoe = new SimpleHoe(toolCobalt).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltHoe");
//		cobaltHelm = new SimpleArmor(armorCobalt, rendererCobalt, 0)
//				.modId("simplecobalt").setType("cobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltHelm");
//		cobaltChest = new SimpleArmor(armorCobalt, rendererCobalt, 1)
//				.modId("simplecobalt").setType("cobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltChest");
//		cobaltLegs = new SimpleArmor(armorCobalt, rendererCobalt, 2)
//				.modId("simplecobalt").setType("cobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltLegs");
//		cobaltBoots = new SimpleArmor(armorCobalt, rendererCobalt, 3)
//				.modId("simplecobalt").setType("cobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("cobaltBoots");
//        // Blue Drift Steel
//		blueDriftSteelIngot = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelIngot");
//		smallBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("smallBlueDriftSteelChunkItem");
//		mediumBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("mediumBlueDriftSteelChunkItem");
//		largeBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("largeBlueDriftSteelChunkItem");
//		blueDriftSteelSword = new SimpleSword(toolBlueDriftSteel)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelSword");
//		blueDriftSteelShovel = new SimpleShovel(toolBlueDriftSteel)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelShovel");
//		blueDriftSteelAxe = new SimpleAxe(toolBlueDriftSteel)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelAxe");
//		blueDriftSteelPickaxe = new SimplePickaxe(toolBlueDriftSteel)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelPickaxe");
//		blueDriftSteelHoe = new SimpleHoe(toolBlueDriftSteel)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelHoe");
//		blueDriftSteelHelm = new SimpleArmor(armorBlueDriftSteel,
//				rendererBlueDriftSteel, 0).modId("simplecobalt")
//				.setType("bluedriftsteel")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelHelm");
//		blueDriftSteelChest = new SimpleArmor(armorBlueDriftSteel,
//				rendererBlueDriftSteel, 1).modId("simplecobalt")
//				.setType("bluedriftsteel")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelChest");
//		blueDriftSteelLegs = new SimpleArmor(armorBlueDriftSteel,
//				rendererBlueDriftSteel, 2).modId("simplecobalt")
//				.setType("bluedriftsteel")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelLegs");
//		blueDriftSteelBoots = new SimpleArmor(armorBlueDriftSteel,
//				rendererBlueDriftSteel, 3).modId("simplecobalt")
//				.setType("bluedriftsteel")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueDriftSteelBoots");
//        // Blue Celadon
//		blueCeladonIngot = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonIngot");
//		smallBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("smallBlueCeladonChunkItem");
//		mediumBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("mediumBlueCeladonChunkItem");
//		largeBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("largeBlueCeladonChunkItem");
//		blueCeladonSword = new SimpleSword(toolBlueCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonSword");
//		blueCeladonShovel = new SimpleShovel(toolBlueCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonShovel");
//		blueCeladonAxe = new SimpleAxe(toolBlueCeladon).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonAxe");
//		blueCeladonPickaxe = new SimplePickaxe(toolBlueCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonPickaxe");
//		blueCeladonHoe = new SimpleHoe(toolBlueCeladon).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonHoe");
//		blueCeladonHelm = new SimpleArmor(armorBlueCeladon, rendererCobalt, 0)
//				.modId("simplecobalt").setType("blueceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonHelm");
//		blueCeladonChest = new SimpleArmor(armorBlueCeladon, rendererCobalt, 1)
//				.modId("simplecobalt").setType("blueceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonChest");
//		blueCeladonLegs = new SimpleArmor(armorBlueCeladon, rendererCobalt, 2)
//				.modId("simplecobalt").setType("blueceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonLegs");
//		blueCeladonBoots = new SimpleArmor(armorBlueCeladon, rendererCobalt, 3)
//				.modId("simplecobalt").setType("blueceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("blueCeladonBoots");
//        // Green Celadon
//		greenCeladonIngot = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonIngot");
//		smallGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("smallGreenCeladonChunkItem");
//		mediumGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("mediumGreenCeladonChunkItem");
//		largeGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("largeGreenCeladonChunkItem");
//		greenCeladonSword = new SimpleSword(toolGreenCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonSword");
//		greenCeladonShovel = new SimpleShovel(toolGreenCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonShovel");
//		greenCeladonAxe = new SimpleAxe(toolGreenCeladon).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonAxe");
//		greenCeladonPickaxe = new SimplePickaxe(toolGreenCeladon)
//				.modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonPickaxe");
//		greenCeladonHoe = new SimpleHoe(toolGreenCeladon).modId("simplecobalt")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonHoe");
//		greenCeladonHelm = new SimpleArmor(armorGreenCeladon, rendererCobalt, 0)
//				.modId("simplecobalt").setType("greenceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonHelm");
//		greenCeladonChest = new SimpleArmor(armorGreenCeladon, rendererCobalt,
//				1).modId("simplecobalt").setType("greenceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonChest");
//		greenCeladonLegs = new SimpleArmor(armorGreenCeladon, rendererCobalt, 2)
//				.modId("simplecobalt").setType("greenceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonLegs");
//		greenCeladonBoots = new SimpleArmor(armorGreenCeladon, rendererCobalt,
//				3).modId("simplecobalt").setType("greenceladon")
//				.setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//				.setUnlocalizedName("greenCeladonBoots");
//
//        // define blocks
//        blockCobalt = new SimpleBlock( Material.iron)
//        .modId("simplecobalt").setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
//        .setBlockName("blockCobalt");
//
//        oreCobalt = new SimpleBlock( Material.iron)
//        .modId("simplecobalt").setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal)
//        .setBlockName("oreCobalt");
//
//        blockBlueDriftSteel = new SimpleBlock( Material.iron)
//        .modId("simplecobalt").setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
//        .setBlockName("blockBlueDriftSteel").setLightLevel(1.0F);
//
//        blockBlueCeladon = new SimpleBlock(Material.iron)
//        .modId("simplecobalt").setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
//        .setBlockName("blockBlueCeladon");
//
//        blockGreenCeladon = new SimpleBlock( Material.iron)
//        .modId("simplecobalt").setCreativeTab(SimpleCobalt.tabAkkamaddiCobalt)
//        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
//        .setBlockName("blockGreenCeladon");
//        
//        //blocks
//        blockCobalt.setHarvestLevel( "pickaxe", 0);
//        ((SimpleBlock) blockCobalt).setAsBeaconBase(true);
//        oreCobalt.setHarvestLevel( "pickaxe", 2);
//        blockBlueDriftSteel.setHarvestLevel( "pickaxe", 0);
//        ((SimpleBlock) blockBlueDriftSteel).setAsBeaconBase(true);
//        blockBlueCeladon.setHarvestLevel( "pickaxe", 0);
//        ((SimpleBlock) blockBlueCeladon).setAsBeaconBase(true);
//        blockGreenCeladon.setHarvestLevel( "pickaxe", 0);
//        ((SimpleBlock) blockGreenCeladon).setAsBeaconBase(true);
//        

    } // end preInit()

	@EventHandler
	public void load(FMLInitializationEvent event) {
		// run tab icon call
		setTabIcons();
		setRepairMaterials();
		Recipes.initialize();
		setOreGenSettings();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("SimpleCobalt loaded");
	}
	
	// Tab
	private void setTabIcons() {
		tabAkkamaddiCobalt.setIcon(new ItemStack(Content.oreCobalt));
	}

	/**
	 * Sets the tool and armor stats from the Settings file.
	 */
	private static void setToolAndArmorStats() 
	{
		/**
		 * ToolMaterial
		 */
		toolCobalt = EnumHelper.addToolMaterial("TUNGSTEN",
				Settings.cobaltMiningLevel, Settings.cobaltUsesNum,
				Settings.cobaltMiningSpeed, Settings.cobaltDamageVsEntity,
				Settings.cobaltEnchantability);
		toolBlueDriftSteel = EnumHelper.addToolMaterial("TUNGSTENCARBIDE",
				Settings.blueDriftSteelMiningLevel, Settings.blueDriftSteelUsesNum,
				Settings.blueDriftSteelMiningSpeed, Settings.blueDriftSteelDamageVsEntity,
				Settings.blueDriftSteelEnchantability);
		toolBlueCeladon = EnumHelper.addToolMaterial("VALFRAM",
				Settings.blueCeladonMiningLevel, Settings.blueCeladonUsesNum,
				Settings.blueCeladonMiningSpeed, Settings.blueCeladonDamageVsEntity,
				Settings.blueCeladonEnchantability);
		toolGreenCeladon = EnumHelper.addToolMaterial("TUNGSTENSTEEL",
				Settings.greenCeladonMiningLevel, Settings.greenCeladonUsesNum,
				Settings.greenCeladonMiningSpeed, Settings.greenCeladonDamageVsEntity,
				Settings.greenCeladonEnchantability);

		/**
		 * ArmorMaterial. In form ("NAME", max damage (like uses, multiply by
		 * pieces for their max damage), new int[] {helmet defense, chestplate
		 * defense, leggings defense, boots defense}, enchantability)
		 */
		armorCobalt = EnumHelper.addArmorMaterial("TUNGSTEN",
				Settings.cobaltArmorDurability,
				Settings.cobaltArmorDamageReduction,
				Settings.cobaltArmorEnchantability);
		armorBlueDriftSteel = EnumHelper.addArmorMaterial("TUNGSTENCARBIDE",
				Settings.blueDriftSteelArmorDurability,
				Settings.blueDriftSteelArmorDamageReduction,
				Settings.blueDriftSteelArmorEnchantability);
		armorBlueCeladon = EnumHelper.addArmorMaterial("VALFRAM",
				Settings.blueCeladonArmorDurability,
				Settings.blueCeladonArmorDamageReduction,
				Settings.blueCeladonArmorEnchantability);
		armorGreenCeladon = EnumHelper.addArmorMaterial("TUNGSTENSTEEL",
				Settings.greenCeladonArmorDurability,
				Settings.greenCeladonArmorDamageReduction,
				Settings.greenCeladonArmorEnchantability);
	} // end setToolAndArmorStats()
	
	/**
	 * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
	 */
	private static void setRepairMaterials()
	{
		//Tools
		toolCobalt.setRepairItem(new ItemStack(Content.cobaltIngot));
		toolBlueDriftSteel.setRepairItem(new ItemStack(Content.blueDriftSteelIngot));
		toolBlueCeladon.setRepairItem(new ItemStack(Content.blueCeladonIngot));
		toolGreenCeladon.setRepairItem(new ItemStack(Content.greenCeladonIngot));
	
		//Armor
		armorCobalt.customCraftingMaterial = Content.cobaltIngot;
		armorBlueDriftSteel.customCraftingMaterial = Content.blueDriftSteelIngot;
		armorBlueCeladon.customCraftingMaterial = Content.blueCeladonIngot;
		armorGreenCeladon.customCraftingMaterial = Content.greenCeladonIngot;
	} // end setRepairMaterials()

	/**
	 * Registers each ore to be generated.
	 */
	private static void setOreGenSettings()
	{
		OreGenerator.INSTANCE.registerOreForGeneration(0, Content.oreCobalt,
				Blocks.stone, Settings.cobaltVeinSize,
				Settings.cobaltSpawnRate, Settings.cobaltMaxSpawnHeight,
				Settings.cobaltMinSpawnHeight);
	} // end setOreGenSettings()


} // end class SimpleCobalt
