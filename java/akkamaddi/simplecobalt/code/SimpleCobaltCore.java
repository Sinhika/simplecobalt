package akkamaddi.simplecobalt.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.ForgeSubscribe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;;

@Mod(modid = "simplecobalt", name = "Simple Cobalt, and Cobalt alloys", version = "1.2.1", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class SimpleCobaltCore
{
    // The instance of your mod that Forge uses.
    @Instance("simplecobalt")
    public static SimpleCobaltCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simplecobalt.code.ClientProxy", serverSide = "akkamaddi.simplecobalt.code.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Cobalt
    public static int cobaltIngotID;

    public static int cobaltSwordID;
    public static int cobaltShovelID;
    public static int cobaltAxeID;
    public static int cobaltPickaxeID;
    public static int cobaltHoeID;

    public static int cobaltHelmID;
    public static int cobaltChestID;
    public static int cobaltLegsID;
    public static int cobaltBootsID;

    public static int blockCobaltID;
    public static int oreCobaltID;

    //Blue DriftSteel
    public static int blueDriftSteelIngotID;
    public static int smallBlueDriftSteelChunkItemID;
    public static int mediumBlueDriftSteelChunkItemID;
    public static int largeBlueDriftSteelChunkItemID;

    public static int blueDriftSteelSwordID;
    public static int blueDriftSteelShovelID;
    public static int blueDriftSteelAxeID;
    public static int blueDriftSteelPickaxeID;
    public static int blueDriftSteelHoeID;

    public static int blueDriftSteelHelmID;
    public static int blueDriftSteelChestID;
    public static int blueDriftSteelLegsID;
    public static int blueDriftSteelBootsID;

    public static int blockBlueDriftSteelID;

    //Blue Celadon
    public static int blueCeladonIngotID;
    public static int smallBlueCeladonChunkItemID;
    public static int mediumBlueCeladonChunkItemID;
    public static int largeBlueCeladonChunkItemID;

    public static int blueCeladonSwordID;
    public static int blueCeladonShovelID;
    public static int blueCeladonAxeID;
    public static int blueCeladonPickaxeID;
    public static int blueCeladonHoeID;

    public static int blueCeladonHelmID;
    public static int blueCeladonChestID;
    public static int blueCeladonLegsID;
    public static int blueCeladonBootsID;

    public static int blockBlueCeladonID;

    //Green Celadon
    public static int greenCeladonIngotID;
    public static int smallGreenCeladonChunkItemID;
    public static int mediumGreenCeladonChunkItemID;
    public static int largeGreenCeladonChunkItemID;

    public static int greenCeladonSwordID;
    public static int greenCeladonShovelID;
    public static int greenCeladonAxeID;
    public static int greenCeladonPickaxeID;
    public static int greenCeladonHoeID;

    public static int greenCeladonHelmID;
    public static int greenCeladonChestID;
    public static int greenCeladonLegsID;
    public static int greenCeladonBootsID;

    public static int blockGreenCeladonID;

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
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorCobalt = EnumHelper.addArmorMaterial("COBALT", 24, new int[] {3, 4, 3, 3}, 8);
    public static EnumArmorMaterial armorBlueDriftSteel = EnumHelper.addArmorMaterial("BLUEDRIFTSTEEL", 26, new int[] {3, 6, 5, 3}, 16);
    public static EnumArmorMaterial armorBlueCeladon = EnumHelper.addArmorMaterial("BLUECELADON", 30, new int[] {4, 6, 5, 4}, 24);
    public static EnumArmorMaterial armorGreenCeladon = EnumHelper.addArmorMaterial("GREENCELADON", 44, new int[] {5, 9, 8, 5}, 26);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererCobalt;
    public static int rendererBlueDriftSteel;
    public static int rendererBlueCeladon;
    public static int rendererGreenCeladon;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolCobalt = EnumHelper.addToolMaterial("COBALT", 2, 960, 7.0F, 2, 8);
    public static EnumToolMaterial toolBlueDriftSteel = EnumHelper.addToolMaterial("BLUEDRIFTSTEEL", 2, 1240, 13.0F, 2, 16);
    public static EnumToolMaterial toolBlueCeladon = EnumHelper.addToolMaterial("BLUECELADON", 3, 1740, 20.0F, 5, 24);
    public static EnumToolMaterial toolGreenCeladon = EnumHelper.addToolMaterial("GREENCELADON", 4, 2120, 24.0F, 6, 26);

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
        // Stub Method
        MinecraftForge.EVENT_BUS.register(new HandlerArmor());
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        // Cobalt
        cobaltIngotID = config.getItem("01. Cobalt Item", "Cobalt Ingot", 12270).getInt();
        cobaltSwordID = config.getItem("02. Cobalt Tool", "Cobalt Sword", 12271).getInt();
        cobaltShovelID = config.getItem("02. Cobalt Tool", "Cobalt Shovel", 12272).getInt();
        cobaltAxeID = config.getItem("02. Cobalt Tool", "Cobalt Axe", 12273).getInt();
        cobaltPickaxeID = config.getItem("02. Cobalt Tool", "Cobalt Pickaxe", 12274).getInt();
        cobaltHoeID = config.getItem("02. Cobalt Tool", "Cobalt Hoe", 12275).getInt();
        cobaltHelmID = config.getItem("02. Cobalt Armor", "Cobalt Helm", 12276).getInt();
        cobaltChestID = config.getItem("02. Cobalt Armor", "Cobalt Chestplate", 12277).getInt();
        cobaltLegsID = config.getItem("02. Cobalt Armor", "Cobalt Leggings", 12278).getInt();
        cobaltBootsID = config.getItem("02. Cobalt Armor", "Cobalt Boots", 12279).getInt();
        blockCobaltID = config.getBlock("03. Cobalt Block", "Cobalt Block", 1322).getInt();
        oreCobaltID = config.getBlock("03. Cobalt Ore", "Cobalt Ore", 1323).getInt();
        // Blue Drift Steel
        blueDriftSteelIngotID = config.getItem("04. Blue Drift Steel Item", "Blue Drift Steel Ingot", 12280).getInt();
        smallBlueDriftSteelChunkItemID = config.getItem("04. Blue Drift Steel Item", "Blue Drift Steel Small Chunk", 12281).getInt();
        mediumBlueDriftSteelChunkItemID = config.getItem("04. Blue Drift Steel Item", "Blue Drift Steel Medium Chunk", 12282).getInt();
        largeBlueDriftSteelChunkItemID = config.getItem("04. Blue Drift Steel Item", "Blue Drift Steel Large Chunk", 12283).getInt();
        blueDriftSteelSwordID = config.getItem("05. Blue Drift Steel Tool", "Blue Drift Steel Sword", 12284).getInt();
        blueDriftSteelShovelID = config.getItem("05. Blue Drift Steel Tool", "Blue Drift Steel Shovel", 12285).getInt();
        blueDriftSteelAxeID = config.getItem("05. Blue Drift Steel Tool", "Blue Drift Steel Axe", 12286).getInt();
        blueDriftSteelPickaxeID = config.getItem("05. Blue Drift Steel Tool", "Blue Drift Steel Pickaxe", 12287).getInt();
        blueDriftSteelHoeID = config.getItem("05. Blue Drift Steel Tool", "Blue Drift Steel Hoe", 12288).getInt();
        blueDriftSteelHelmID = config.getItem("05. Blue Drift Steel Armor", "Blue Drift Steel Helm", 12289).getInt();
        blueDriftSteelChestID = config.getItem("05. Blue Drift Steel Armor", "Blue Drift Steel Chestplate", 12290).getInt();
        blueDriftSteelLegsID = config.getItem("05. Blue Drift Steel Armor", "Blue Drift Steel Leggings", 12291).getInt();
        blueDriftSteelBootsID = config.getItem("05. Blue Drift Steel Armor", "Blue Drift Steel Boots", 12292).getInt();
        blockBlueDriftSteelID = config.getBlock("06. Blue Drift Steel Block", "Blue Drift Steel Block", 1324).getInt();
        // Blue Celadon
        blueCeladonIngotID = config.getItem("07. Blue Celadon Item", "Blue Celadon Ingot", 12293).getInt();
        smallBlueCeladonChunkItemID = config.getItem("07. Blue Celadon Item", "Blue Celadon Small Chunk", 12294).getInt();
        mediumBlueCeladonChunkItemID = config.getItem("07. Blue Celadon Item", "Blue Celadon Medium Chunk", 12295).getInt();
        largeBlueCeladonChunkItemID = config.getItem("07. Blue Celadon Item", "Blue Celadon Large Chunk", 12296).getInt();
        blueCeladonSwordID = config.getItem("08. Blue Celadon Tool", "Blue Celadon Sword", 12297).getInt();
        blueCeladonShovelID = config.getItem("08. Blue Celadon Tool", "Blue Celadon Shovel", 12298).getInt();
        blueCeladonAxeID = config.getItem("08. Blue Celadon Tool", "Blue Celadon Axe", 12299).getInt();
        blueCeladonPickaxeID = config.getItem("08. Blue Celadon Tool", "Blue Celadon Pickaxe", 12300).getInt();
        blueCeladonHoeID = config.getItem("08. Blue Celadon Tool", "Blue Celadon Hoe", 12301).getInt();
        blueCeladonHelmID = config.getItem("08. Blue Celadon Armor", "Blue Celadon Helm", 12302).getInt();
        blueCeladonChestID = config.getItem("08. Blue Celadon Armor", "Blue Celadon Chestplate", 12303).getInt();
        blueCeladonLegsID = config.getItem("08. Blue Celadon Armor", "Blue Celadon Leggings", 12304).getInt();
        blueCeladonBootsID = config.getItem("08. Blue Celadon Armor", "Blue Celadon Boots", 12305).getInt();
        blockBlueCeladonID = config.getBlock("09. Blue Celadon Block", "Blue Celadon Block", 1325).getInt();
        // Green Celadon
        greenCeladonIngotID = config.getItem("10. Green Celadon Item", "Green Celadon Ingot", 12306).getInt();
        smallGreenCeladonChunkItemID = config.getItem("10. Green Celadon Item", "Green Celadon Small Chunk", 12307).getInt();
        mediumGreenCeladonChunkItemID = config.getItem("10. Green Celadon Item", "Green Celadon Medium Chunk", 12308).getInt();
        largeGreenCeladonChunkItemID = config.getItem("10. Green Celadon Item", "Green Celadon Large Chunk", 12309).getInt();
        greenCeladonSwordID = config.getItem("11. Green Celadon Tool", "Green Celadon Sword", 12310).getInt();
        greenCeladonShovelID = config.getItem("11. Green Celadon Tool", "Green Celadon Shovel", 12311).getInt();
        greenCeladonAxeID = config.getItem("11. Green Celadon Tool", "Green Celadon Axe", 12312).getInt();
        greenCeladonPickaxeID = config.getItem("11. Green Celadon Tool", "Green Celadon Pickaxe", 12313).getInt();
        greenCeladonHoeID = config.getItem("11. Green Celadon Tool", "Green Celadon Hoe", 12314).getInt();
        greenCeladonHelmID = config.getItem("11. Green Celadon Armor", "Green Celadon Helm", 12315).getInt();
        greenCeladonChestID = config.getItem("11. Green Celadon Armor", "Green Celadon Chestplate", 12316).getInt();
        greenCeladonLegsID = config.getItem("11. Green Celadon Armor", "Green Celadon Leggings", 12317).getInt();
        greenCeladonBootsID = config.getItem("11. Green Celadon Armor", "Green Celadon Boots", 12318).getInt();
        blockGreenCeladonID = config.getBlock("12. Green Celadon Block", "Green Celadon Block", 1326).getInt();
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
        cobaltIngot = new SimpleIngot(cobaltIngotID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltIngot");

        cobaltSword = new SimpleSword(cobaltSwordID, toolCobalt).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltSword");

        cobaltShovel = new SimpleShovel(cobaltShovelID, toolCobalt).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltShovel");

        cobaltAxe = new SimpleAxe(cobaltAxeID, toolCobalt).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltAxe");

        cobaltPickaxe = new SimplePickaxe(cobaltPickaxeID, toolCobalt).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltPickaxe");

        cobaltHoe = new SimpleHoe(cobaltHoeID, toolCobalt).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltHoe");

        cobaltHelm = new SimpleArmor(cobaltHelmID, armorCobalt, rendererCobalt, 0).modId("simplecobalt").setType("cobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltHelm");

        cobaltChest = new SimpleArmor(cobaltChestID, armorCobalt, rendererCobalt, 1).modId("simplecobalt").setType("cobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltChest");

        cobaltLegs = new SimpleArmor(cobaltLegsID, armorCobalt, rendererCobalt, 2).modId("simplecobalt").setType("cobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltLegs");

        cobaltBoots = new SimpleArmor(cobaltBootsID, armorCobalt, rendererCobalt, 3).modId("simplecobalt").setType("cobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("cobaltBoots");

        // Blue Drift Steel
        blueDriftSteelIngot = new SimpleIngot(blueDriftSteelIngotID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelIngot");

        smallBlueDriftSteelChunkItem = new SimpleIngot(smallBlueDriftSteelChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("smallBlueDriftSteelChunkItem");

        mediumBlueDriftSteelChunkItem = new SimpleIngot(mediumBlueDriftSteelChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("mediumBlueDriftSteelChunkItem");

        largeBlueDriftSteelChunkItem = new SimpleIngot(largeBlueDriftSteelChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("largeBlueDriftSteelChunkItem");

        blueDriftSteelSword = new SimpleSword(blueDriftSteelSwordID, toolBlueDriftSteel).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelSword");

        blueDriftSteelShovel = new SimpleShovel(blueDriftSteelShovelID, toolBlueDriftSteel).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelShovel");

        blueDriftSteelAxe = new SimpleAxe(blueDriftSteelAxeID, toolBlueDriftSteel).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelAxe");

        blueDriftSteelPickaxe = new SimplePickaxe(blueDriftSteelPickaxeID, toolBlueDriftSteel).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelPickaxe");

        blueDriftSteelHoe = new SimpleHoe(blueDriftSteelHoeID, toolBlueDriftSteel).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelHoe");

        blueDriftSteelHelm = new SimpleArmor(blueDriftSteelHelmID, armorBlueDriftSteel, rendererBlueDriftSteel, 0).modId("simplecobalt").setType("bluedriftsteel").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelHelm");

        blueDriftSteelChest = new SimpleArmor(blueDriftSteelChestID, armorBlueDriftSteel, rendererBlueDriftSteel, 1).modId("simplecobalt").setType("bluedriftsteel").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelChest");

        blueDriftSteelLegs = new SimpleArmor(blueDriftSteelLegsID, armorBlueDriftSteel, rendererBlueDriftSteel, 2).modId("simplecobalt").setType("bluedriftsteel").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelLegs");

        blueDriftSteelBoots = new SimpleArmor(blueDriftSteelBootsID, armorBlueDriftSteel, rendererBlueDriftSteel, 3).modId("simplecobalt").setType("bluedriftsteel").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueDriftSteelBoots");

        // Blue Celadon
        blueCeladonIngot = new SimpleIngot(blueCeladonIngotID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonIngot");

        smallBlueCeladonChunkItem = new SimpleIngot(smallBlueCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("smallBlueCeladonChunkItem");

        mediumBlueCeladonChunkItem = new SimpleIngot(mediumBlueCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("mediumBlueCeladonChunkItem");

        largeBlueCeladonChunkItem = new SimpleIngot(largeBlueCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("largeBlueCeladonChunkItem");

        blueCeladonSword = new SimpleSword(blueCeladonSwordID, toolBlueCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonSword");

        blueCeladonShovel = new SimpleShovel(blueCeladonShovelID, toolBlueCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonShovel");

        blueCeladonAxe = new SimpleAxe(blueCeladonAxeID, toolBlueCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonAxe");

        blueCeladonPickaxe = new SimplePickaxe(blueCeladonPickaxeID, toolBlueCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonPickaxe");

        blueCeladonHoe = new SimpleHoe(blueCeladonHoeID, toolBlueCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonHoe");

        blueCeladonHelm = new SimpleArmor(blueCeladonHelmID, armorBlueCeladon, rendererCobalt, 0).modId("simplecobalt").setType("blueceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonHelm");

        blueCeladonChest = new SimpleArmor(blueCeladonChestID, armorBlueCeladon, rendererCobalt, 1).modId("simplecobalt").setType("blueceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonChest");

        blueCeladonLegs = new SimpleArmor(blueCeladonLegsID, armorBlueCeladon, rendererCobalt, 2).modId("simplecobalt").setType("blueceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonLegs");

        blueCeladonBoots = new SimpleArmor(blueCeladonBootsID, armorBlueCeladon, rendererCobalt, 3).modId("simplecobalt").setType("blueceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("blueCeladonBoots");

        // Green Celadon
        greenCeladonIngot = new SimpleIngot(greenCeladonIngotID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonIngot");

        smallGreenCeladonChunkItem = new SimpleIngot(smallGreenCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("smallGreenCeladonChunkItem");

        mediumGreenCeladonChunkItem = new SimpleIngot(mediumGreenCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("mediumGreenCeladonChunkItem");

        largeGreenCeladonChunkItem = new SimpleIngot(largeGreenCeladonChunkItemID).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("largeGreenCeladonChunkItem");

        greenCeladonSword = new SimpleSword(greenCeladonSwordID, toolGreenCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonSword");

        greenCeladonShovel = new SimpleShovel(greenCeladonShovelID, toolGreenCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonShovel");

        greenCeladonAxe = new SimpleAxe(greenCeladonAxeID, toolGreenCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonAxe");

        greenCeladonPickaxe = new SimplePickaxe(greenCeladonPickaxeID, toolGreenCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonPickaxe");

        greenCeladonHoe = new SimpleHoe(greenCeladonHoeID, toolGreenCeladon).modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonHoe");

        greenCeladonHelm = new SimpleArmor(greenCeladonHelmID, armorGreenCeladon, rendererCobalt, 0).modId("simplecobalt").setType("greenceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonHelm");

        greenCeladonChest = new SimpleArmor(greenCeladonChestID, armorGreenCeladon, rendererCobalt, 1).modId("simplecobalt").setType("greenceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonChest");

        greenCeladonLegs = new SimpleArmor(greenCeladonLegsID, armorGreenCeladon, rendererCobalt, 2).modId("simplecobalt").setType("greenceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonLegs");

        greenCeladonBoots = new SimpleArmor(greenCeladonBootsID, armorGreenCeladon, rendererCobalt, 3).modId("simplecobalt").setType("greenceladon").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt).setUnlocalizedName("greenCeladonBoots");

        // define blocks
        blockCobalt = new SimpleOre(blockCobaltID, Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockCobalt");

        oreCobalt = new SimpleOre(oreCobaltID, Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("oreCobalt");

        blockBlueDriftSteel = new SimpleOre(blockBlueDriftSteelID, Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockBlueDriftSteel").setLightValue(1.0F);

        blockBlueCeladon = new SimpleOre(blockBlueCeladonID, Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockBlueCeladon");

        blockGreenCeladon = new SimpleOre(blockGreenCeladonID, Material.iron)
        .modId("simplecobalt").setCreativeTab(SimpleCobaltCore.tabAkkamaddiCobalt)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockGreenCeladon");

        /*
        // Game Registration
        GameRegistry.registerItem(cobaltIngot,"cobaltIngot");
        GameRegistry.registerItem(cobaltSword,"cobaltSword");
        GameRegistry.registerItem(cobaltShovel,"cobaltShovel");
        GameRegistry.registerItem(cobaltAxe,"cobaltAxe");
        GameRegistry.registerItem(cobaltPickaxe,"cobaltPickaxe");
        GameRegistry.registerItem(cobaltHoe,"cobaltHoe");
        GameRegistry.registerItem(cobaltHelm,"cobaltHelm");
        GameRegistry.registerItem(cobaltChest,"cobaltChest");
        GameRegistry.registerItem(cobaltLegs,"cobaltLegs");
        GameRegistry.registerItem(cobaltBoots,"cobaltBoots");

        GameRegistry.registerItem(blueDriftSteelIngot,"blueDriftSteelIngot");
        GameRegistry.registerItem(smallBlueDriftSteelChunkItem,"smallBlueDriftSteelChunkItem");
        GameRegistry.registerItem(mediumBlueDriftSteelChunkItem,"mediumBlueDriftSteelChunkItem");
        GameRegistry.registerItem(largeBlueDriftSteelChunkItem,"largeBlueDriftSteelChunkItem");
        GameRegistry.registerItem(blueDriftSteelSword,"blueDriftSteelSword");
        GameRegistry.registerItem(blueDriftSteelShovel,"blueDriftSteelShovel");
        GameRegistry.registerItem(blueDriftSteelAxe,"blueDriftSteelAxe");
        GameRegistry.registerItem(blueDriftSteelPickaxe,"blueDriftSteelPickaxe");
        GameRegistry.registerItem(blueDriftSteelHoe,"blueDriftSteelHoe");
        GameRegistry.registerItem(blueDriftSteelHelm,"blueDriftSteelHelm");
        GameRegistry.registerItem(blueDriftSteelChest,"blueDriftSteelChest");
        GameRegistry.registerItem(blueDriftSteelLegs,"blueDriftSteelLegs");
        GameRegistry.registerItem(blueDriftSteelBoots,"blueDriftSteelBoots");

        GameRegistry.registerItem(blueCeladonIngot,"blueCeladonIngot");
        GameRegistry.registerItem(smallBlueCeladonChunkItem,"smallBlueCeladonChunkItem");
        GameRegistry.registerItem(mediumBlueCeladonChunkItem,"mediumBlueCeladonChunkItem");
        GameRegistry.registerItem(largeBlueCeladonChunkItem,"largeBlueCeladonChunkItem");
        GameRegistry.registerItem(blueCeladonSword,"blueCeladonSword");
        GameRegistry.registerItem(blueCeladonShovel,"blueCeladonShovel");
        GameRegistry.registerItem(blueCeladonAxe,"blueCeladonAxe");
        GameRegistry.registerItem(blueCeladonPickaxe,"blueCeladonPickaxe");
        GameRegistry.registerItem(blueCeladonHoe,"blueCeladonHoe");
        GameRegistry.registerItem(blueCeladonHelm,"blueCeladonHelm");
        GameRegistry.registerItem(blueCeladonChest,"blueCeladonChest");
        GameRegistry.registerItem(blueCeladonLegs,"blueCeladonLegs");
        GameRegistry.registerItem(blueCeladonBoots,"blueCeladonBoots");

        GameRegistry.registerItem(greenCeladonIngot,"greenCeladonIngot");
        GameRegistry.registerItem(smallGreenCeladonChunkItem,"smallGreenCeladonChunkItem");
        GameRegistry.registerItem(mediumGreenCeladonChunkItem,"mediumGreenCeladonChunkItem");
        GameRegistry.registerItem(largeGreenCeladonChunkItem,"largeGreenCeladonChunkItem");
        GameRegistry.registerItem(greenCeladonSword,"greenCeladonSword");
        GameRegistry.registerItem(greenCeladonShovel,"greenCeladonShovel");
        GameRegistry.registerItem(greenCeladonAxe,"greenCeladonAxe");
        GameRegistry.registerItem(greenCeladonPickaxe,"greenCeladonPickaxe");
        GameRegistry.registerItem(greenCeladonHoe,"greenCeladonHoe");
        GameRegistry.registerItem(greenCeladonHelm,"greenCeladonHelm");
        GameRegistry.registerItem(greenCeladonChest,"greenCeladonChest");
        GameRegistry.registerItem(greenCeladonLegs,"greenCeladonLegs");
        GameRegistry.registerItem(greenCeladonBoots,"greenCeladonBoots");

        GameRegistry.registerBlock(blockCobalt, "blockCobalt");
        GameRegistry.registerBlock(oreCobalt, "oreCobalt");
        GameRegistry.registerBlock(blockBlueDriftSteel, "blockBlueDriftSteel");
        GameRegistry.registerBlock(blockBlueCeladon, "blockBlueCeladon");
        GameRegistry.registerBlock(blockGreenCeladon, "blockGreenCeladon");
        */
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
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        GameRegistry.registerWorldGenerator(new SimpleCobaltGenerator());
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        //Armor Renderers
        rendererCobalt = proxy.addArmor("cobalt");
        rendererBlueDriftSteel = proxy.addArmor("bluedriftsteel");
        rendererBlueCeladon = proxy.addArmor("blueceladon");
        rendererGreenCeladon = proxy.addArmor("greenceladon");
        // name stuff
        // name Cobalt
        LanguageRegistry.addName(cobaltIngot, "Cobalt Ingot");
        LanguageRegistry.addName(cobaltSword, "Cobalt Sword");
        LanguageRegistry.addName(cobaltShovel, "Cobalt Shovel");
        LanguageRegistry.addName(cobaltAxe, "Cobalt Axe");
        LanguageRegistry.addName(cobaltPickaxe, "Cobalt Pickaxe");
        LanguageRegistry.addName(cobaltHoe, "Cobalt Hoe");
        LanguageRegistry.addName(cobaltHelm, "Cobalt Helm");
        LanguageRegistry.addName(cobaltChest, "Cobalt Chestplate");
        LanguageRegistry.addName(cobaltLegs, "Cobalt Leggings");
        LanguageRegistry.addName(cobaltBoots, "Cobalt Boots");
        // name Blue Drift Steel
        LanguageRegistry.addName(blueDriftSteelIngot, "Blue Drift Steel Ingot");
        LanguageRegistry.addName(smallBlueDriftSteelChunkItem, "Small Blue Drift Steel Chunk");
        LanguageRegistry.addName(mediumBlueDriftSteelChunkItem, "Medium Blue Drift Steel Chunk");
        LanguageRegistry.addName(largeBlueDriftSteelChunkItem, "Large Blue Drift Steel Chunk");
        LanguageRegistry.addName(blueDriftSteelSword, "Blue Drift Steel Sword");
        LanguageRegistry.addName(blueDriftSteelShovel, "Blue Drift Steel Shovel");
        LanguageRegistry.addName(blueDriftSteelAxe, "Blue Drift Steel Axe");
        LanguageRegistry.addName(blueDriftSteelPickaxe, "Blue Drift Steel Pickaxe");
        LanguageRegistry.addName(blueDriftSteelHoe, "Blue Drift Steel Hoe");
        LanguageRegistry.addName(blueDriftSteelHelm, "Blue Drift Steel Helm");
        LanguageRegistry.addName(blueDriftSteelChest, "Blue Drift Steel Chestplate");
        LanguageRegistry.addName(blueDriftSteelLegs, "Blue Drift Steel Leggings");
        LanguageRegistry.addName(blueDriftSteelBoots, "Blue Drift Steel Boots");
        // name Blue Celadon
        LanguageRegistry.addName(blueCeladonIngot, "Blue Celadon Ingot");
        LanguageRegistry.addName(smallBlueCeladonChunkItem, "Small Blue Celadon Chunk");
        LanguageRegistry.addName(mediumBlueCeladonChunkItem, "Medium Blue Celadon Chunk");
        LanguageRegistry.addName(largeBlueCeladonChunkItem, "Large Blue Celadon Chunk");
        LanguageRegistry.addName(blueCeladonSword, "Blue Celadon Sword");
        LanguageRegistry.addName(blueCeladonShovel, "Blue Celadon Shovel");
        LanguageRegistry.addName(blueCeladonAxe, "Blue Celadon Axe");
        LanguageRegistry.addName(blueCeladonPickaxe, "Blue Celadon Pickaxe");
        LanguageRegistry.addName(blueCeladonHoe, "Blue Celadon Hoe");
        LanguageRegistry.addName(blueCeladonHelm, "Blue Celadon Helm");
        LanguageRegistry.addName(blueCeladonChest, "Blue Celadon Chestplate");
        LanguageRegistry.addName(blueCeladonLegs, "Blue Celadon Leggings");
        LanguageRegistry.addName(blueCeladonBoots, "Blue Celadon Boots");
        // name Green Celadon
        LanguageRegistry.addName(greenCeladonIngot, "Green Celadon Ingot");
        LanguageRegistry.addName(smallGreenCeladonChunkItem, "Small Green Celadon Chunk");
        LanguageRegistry.addName(mediumGreenCeladonChunkItem, "Medium Green Celadon Chunk");
        LanguageRegistry.addName(largeGreenCeladonChunkItem, "Large Green Celadon Chunk");
        LanguageRegistry.addName(greenCeladonSword, "Green Celadon Sword");
        LanguageRegistry.addName(greenCeladonShovel, "Green Celadon Shovel");
        LanguageRegistry.addName(greenCeladonAxe, "Green Celadon Axe");
        LanguageRegistry.addName(greenCeladonPickaxe, "Green Celadon Pickaxe");
        LanguageRegistry.addName(greenCeladonHoe, "Green Celadon Hoe");
        LanguageRegistry.addName(greenCeladonHelm, "Green Celadon Helm");
        LanguageRegistry.addName(greenCeladonChest, "Green Celadon Chestplate");
        LanguageRegistry.addName(greenCeladonLegs, "Green Celadon Leggings");
        LanguageRegistry.addName(greenCeladonBoots, "Green Celadon Boots");
        //blocks
        LanguageRegistry.addName(blockCobalt, "Cobalt Block");
        MinecraftForge.setBlockHarvestLevel(blockCobalt, "pickaxe", 0);
        LanguageRegistry.addName(oreCobalt, "Cobalt Ore");
        MinecraftForge.setBlockHarvestLevel(oreCobalt, "pickaxe", 2);
        LanguageRegistry.addName(blockBlueDriftSteel, "Blue Drift Steel Block");
        MinecraftForge.setBlockHarvestLevel(blockBlueDriftSteel, "pickaxe", 0);
        LanguageRegistry.addName(blockBlueCeladon, "Blue Celadon Block");
        MinecraftForge.setBlockHarvestLevel(blockBlueDriftSteel, "pickaxe", 0);
        LanguageRegistry.addName(blockGreenCeladon, "Green Celadon Block");
        MinecraftForge.setBlockHarvestLevel(blockGreenCeladon, "pickaxe", 0);
        //tools registry
        MinecraftForge.setToolClass(cobaltPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(cobaltShovel, "shovel", 2);
        MinecraftForge.setToolClass(cobaltAxe, "axe", 2);
        MinecraftForge.setToolClass(blueDriftSteelPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(blueDriftSteelShovel, "shovel", 2);
        MinecraftForge.setToolClass(blueDriftSteelAxe, "axe", 2);
        MinecraftForge.setToolClass(blueCeladonPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(blueCeladonShovel, "shovel", 3);
        MinecraftForge.setToolClass(blueCeladonAxe, "axe", 3);
        MinecraftForge.setToolClass(greenCeladonPickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(greenCeladonShovel, "shovel", 4);
        MinecraftForge.setToolClass(greenCeladonAxe, "axe", 4);
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiCobalt", "en_US", "akkamaddi's Simple Cobalt");
        armorCobalt.customCraftingMaterial = SimpleCobaltCore.cobaltIngot;
        armorBlueDriftSteel.customCraftingMaterial = SimpleCobaltCore.blueDriftSteelIngot;
        armorBlueCeladon.customCraftingMaterial = SimpleCobaltCore.blueCeladonIngot;
        armorGreenCeladon.customCraftingMaterial = SimpleCobaltCore.greenCeladonIngot;
        toolCobalt.customCraftingMaterial = SimpleCobaltCore.cobaltIngot;
        toolBlueDriftSteel.customCraftingMaterial = SimpleCobaltCore.blueDriftSteelIngot;
        toolBlueCeladon.customCraftingMaterial = SimpleCobaltCore.blueCeladonIngot;
        toolGreenCeladon.customCraftingMaterial = SimpleCobaltCore.greenCeladonIngot;
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
