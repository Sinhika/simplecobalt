package akkamaddi.simplecobalt.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import akkamaddi.akkamaddiCore.api.CommonProxy;
import alexndr.SimpleOres.api.content.SimpleBlock;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "simplecobalt", name = "Simple Cobalt, and Cobalt alloys", 
	version = "1.2.1", 
	dependencies = "required-after:simpleores ; required-after:required-after:fusionplugin ; required-after:akkamaddicore")

public class SimpleCobaltCore
{
    // The instance of your mod that Forge uses.
    @Instance("simplecobalt")
    public static SimpleCobaltCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simplecobalt.code.ClientProxy", 
    			serverSide = "akkamaddi.akkamaddiCore.api.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file


    // set actual item names

    //Cobalt
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

    // set block names
    public static Block blockCobalt;
    public static Block oreCobalt;

    // spawning
    public static int cobaltSpawnRate;
    public static int cobaltVeinSize;
    public static int cobaltSpawnHeight;
    public static int cobaltMinSpawnHeight;

    //Blue DriftSteel
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

    public static Block blockBlueDriftSteel;

    //Blue Celadon
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

    public static Block blockBlueCeladon;

    //Green Celadon
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

    public static Block blockGreenCeladon;

    // config
    public static Configuration config;

    //boolean
    public static boolean enableHigherDimensionGen;
    public static boolean enableRecycling;

    //Higher Dimensions
    public static int[] dimensionIDsArray;

    // tab
    public static SimpleTab tabAkkamaddiCobalt = new SimpleTab("tabAkkamaddiCobalt");

    /**
     * ArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static ArmorMaterial armorCobalt = EnumHelper.addArmorMaterial("COBALT", 24, new int[] {3, 4, 3, 3}, 8);
    public static ArmorMaterial armorBlueDriftSteel = EnumHelper.addArmorMaterial("BLUEDRIFTSTEEL", 26, new int[] {3, 6, 5, 3}, 16);
    public static ArmorMaterial armorBlueCeladon = EnumHelper.addArmorMaterial("BLUECELADON", 30, new int[] {4, 6, 5, 4}, 24);
    public static ArmorMaterial armorGreenCeladon = EnumHelper.addArmorMaterial("GREENCELADON", 44, new int[] {5, 9, 8, 5}, 26);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererCobalt;
    public static int rendererBlueDriftSteel;
    public static int rendererBlueCeladon;
    public static int rendererGreenCeladon;

    // set tool properties
    // ToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static ToolMaterial toolCobalt = EnumHelper.addToolMaterial("COBALT", 2, 960, 7.0F, 2, 8);
    public static ToolMaterial toolBlueDriftSteel = EnumHelper.addToolMaterial("BLUEDRIFTSTEEL", 2, 1240, 13.0F, 2, 16);
    public static ToolMaterial toolBlueCeladon = EnumHelper.addToolMaterial("BLUECELADON", 3, 1740, 20.0F, 5, 24);
    public static ToolMaterial toolGreenCeladon = EnumHelper.addToolMaterial("GREENCELADON", 4, 2120, 24.0F, 6, 26);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiCobalt.setIcon(new ItemStack(SimpleCobaltCore.oreCobalt));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        //Adjustable Ore Spawn Rates
        cobaltSpawnRate = config.get("13. Cobalt Ore Worldgen", "Cobalt Spawn Rate", 6).getInt();
        cobaltVeinSize = config.get("13. Cobalt Ore Worldgen", "Cobalt Vein Size", 6).getInt();
        cobaltSpawnHeight = config.get("13. Cobalt Ore Worldgen", "Cobalt Maximum Spawn Height", 32).getInt();
        cobaltMinSpawnHeight = config.get("13. Cobalt Ore Worldgen", "Cobalt Minimum Spawn Height", 0).getInt();
        //higher dimension
        enableHigherDimensionGen = config.get("14. Higher World Gen", "Spawn Cobalt in higher dimensions? (Advanced)", false).getBoolean(enableHigherDimensionGen);
        // Recycling
        enableRecycling = config.get("15. Enable Cobalt Recycling", "Enable Simple Cobalt item recycling recipes: false or true?", false).getBoolean(false);

        //Higher Dimensions
        if (enableHigherDimensionGen)
        {
            dimensionIDsArray = config.get("Higher Dimensions", "Higher Dimensions ID List", new int[] {}).getIntList();
            System.out.println("Number of dimension ID's in the array = " + dimensionIDsArray.length);

            try
            {
                for (int i = 0; i < dimensionIDsArray.length; i++)
                {
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Cobalt Spawn Rate", 6).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Cobalt Maximum Spawn Height", 32).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Cobalt Minimum Spawn Height", 0).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Cobalt Vein Size", 6).getInt();
                    System.out.println("Dimension ID in position " + i + " is " + dimensionIDsArray[i]);
                }
            }
            catch (Exception e)
            {
            }
        }
        else
            dimensionIDsArray = new int[] {};

        config.save();

        // define items
        // Cobalt
		cobaltIngot = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltIngot");
		cobaltSword = new SimpleSword(toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltSword");
		cobaltShovel = new SimpleShovel(toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltShovel");
		cobaltAxe = new SimpleAxe(toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltAxe");
		cobaltPickaxe = new SimplePickaxe(toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltPickaxe");
		cobaltHoe = new SimpleHoe(toolCobalt).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltHoe");
		cobaltHelm = new SimpleArmor(armorCobalt, rendererCobalt, 0)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltHelm");
		cobaltChest = new SimpleArmor(armorCobalt, rendererCobalt, 1)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltChest");
		cobaltLegs = new SimpleArmor(armorCobalt, rendererCobalt, 2)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltLegs");
		cobaltBoots = new SimpleArmor(armorCobalt, rendererCobalt, 3)
				.modId("simplecobalt").setType("cobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("cobaltBoots");
        // Blue Drift Steel
		blueDriftSteelIngot = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelIngot");
		smallBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallBlueDriftSteelChunkItem");
		mediumBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumBlueDriftSteelChunkItem");
		largeBlueDriftSteelChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeBlueDriftSteelChunkItem");
		blueDriftSteelSword = new SimpleSword(toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelSword");
		blueDriftSteelShovel = new SimpleShovel(toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelShovel");
		blueDriftSteelAxe = new SimpleAxe(toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelAxe");
		blueDriftSteelPickaxe = new SimplePickaxe(toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelPickaxe");
		blueDriftSteelHoe = new SimpleHoe(toolBlueDriftSteel)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelHoe");
		blueDriftSteelHelm = new SimpleArmor(armorBlueDriftSteel,
				rendererBlueDriftSteel, 0).modId("simplecobalt")
				.setType("bluedriftsteel")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelHelm");
		blueDriftSteelChest = new SimpleArmor(armorBlueDriftSteel,
				rendererBlueDriftSteel, 1).modId("simplecobalt")
				.setType("bluedriftsteel")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelChest");
		blueDriftSteelLegs = new SimpleArmor(armorBlueDriftSteel,
				rendererBlueDriftSteel, 2).modId("simplecobalt")
				.setType("bluedriftsteel")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelLegs");
		blueDriftSteelBoots = new SimpleArmor(armorBlueDriftSteel,
				rendererBlueDriftSteel, 3).modId("simplecobalt")
				.setType("bluedriftsteel")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueDriftSteelBoots");
        // Blue Celadon
		blueCeladonIngot = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonIngot");
		smallBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallBlueCeladonChunkItem");
		mediumBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumBlueCeladonChunkItem");
		largeBlueCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeBlueCeladonChunkItem");
		blueCeladonSword = new SimpleSword(toolBlueCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonSword");
		blueCeladonShovel = new SimpleShovel(toolBlueCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonShovel");
		blueCeladonAxe = new SimpleAxe(toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonAxe");
		blueCeladonPickaxe = new SimplePickaxe(toolBlueCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonPickaxe");
		blueCeladonHoe = new SimpleHoe(toolBlueCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonHoe");
		blueCeladonHelm = new SimpleArmor(armorBlueCeladon, rendererCobalt, 0)
				.modId("simplecobalt").setType("blueceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonHelm");
		blueCeladonChest = new SimpleArmor(armorBlueCeladon, rendererCobalt, 1)
				.modId("simplecobalt").setType("blueceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonChest");
		blueCeladonLegs = new SimpleArmor(armorBlueCeladon, rendererCobalt, 2)
				.modId("simplecobalt").setType("blueceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonLegs");
		blueCeladonBoots = new SimpleArmor(armorBlueCeladon, rendererCobalt, 3)
				.modId("simplecobalt").setType("blueceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("blueCeladonBoots");
        // Green Celadon
		greenCeladonIngot = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonIngot");
		smallGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("smallGreenCeladonChunkItem");
		mediumGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("mediumGreenCeladonChunkItem");
		largeGreenCeladonChunkItem = new SimpleIngot().modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("largeGreenCeladonChunkItem");
		greenCeladonSword = new SimpleSword(toolGreenCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonSword");
		greenCeladonShovel = new SimpleShovel(toolGreenCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonShovel");
		greenCeladonAxe = new SimpleAxe(toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonAxe");
		greenCeladonPickaxe = new SimplePickaxe(toolGreenCeladon)
				.modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonPickaxe");
		greenCeladonHoe = new SimpleHoe(toolGreenCeladon).modId("simplecobalt")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonHoe");
		greenCeladonHelm = new SimpleArmor(armorGreenCeladon, rendererCobalt, 0)
				.modId("simplecobalt").setType("greenceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonHelm");
		greenCeladonChest = new SimpleArmor(armorGreenCeladon, rendererCobalt,
				1).modId("simplecobalt").setType("greenceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonChest");
		greenCeladonLegs = new SimpleArmor(armorGreenCeladon, rendererCobalt, 2)
				.modId("simplecobalt").setType("greenceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonLegs");
		greenCeladonBoots = new SimpleArmor(armorGreenCeladon, rendererCobalt,
				3).modId("simplecobalt").setType("greenceladon")
				.setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
				.setUnlocalizedName("greenCeladonBoots");

        // define blocks
        blockCobalt = new SimpleBlock( Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("blockCobalt");

        oreCobalt = new SimpleBlock( Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("oreCobalt");

        blockBlueDriftSteel = new SimpleBlock( Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("blockBlueDriftSteel").setLightLevel(1.0F);

        blockBlueCeladon = new SimpleBlock(Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("blockBlueCeladon");

        blockGreenCeladon = new SimpleBlock( Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundTypeMetal)
        .setBlockName("blockGreenCeladon");
        
        //blocks
        blockCobalt.setHarvestLevel( "pickaxe", 0);
        oreCobalt.setHarvestLevel( "pickaxe", 2);
        blockBlueDriftSteel.setHarvestLevel( "pickaxe", 0);
        blockBlueCeladon.setHarvestLevel( "pickaxe", 0);
        blockGreenCeladon.setHarvestLevel( "pickaxe", 0);

        armorCobalt.customCraftingMaterial = SimpleCobaltCore.cobaltIngot;
        armorBlueDriftSteel.customCraftingMaterial = SimpleCobaltCore.blueDriftSteelIngot;
        armorBlueCeladon.customCraftingMaterial = SimpleCobaltCore.blueCeladonIngot;
        armorGreenCeladon.customCraftingMaterial = SimpleCobaltCore.greenCeladonIngot;
        toolCobalt.customCraftingMaterial = SimpleCobaltCore.cobaltIngot;
        toolBlueDriftSteel.customCraftingMaterial = SimpleCobaltCore.blueDriftSteelIngot;
        toolBlueCeladon.customCraftingMaterial = SimpleCobaltCore.blueCeladonIngot;
        toolGreenCeladon.customCraftingMaterial = SimpleCobaltCore.greenCeladonIngot;

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
        //recipes
        CobaltRecipes.doCobaltRecipes();

        // run tab icon call
        setTabIcons();
        
        MinecraftForge.EVENT_BUS.register(new HandlerArmor());
        GameRegistry.registerWorldGenerator(new SimpleCobaltGenerator(), 1);
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());

    } // end preInit()

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
     }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
