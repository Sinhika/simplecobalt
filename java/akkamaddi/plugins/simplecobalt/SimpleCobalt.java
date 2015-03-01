package akkamaddi.plugins.simplecobalt;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;
import alexndr.api.helpers.game.OreGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, 
	version = ModInfo.VERSION, 
	dependencies = "required-after:simplecore; required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore")
public class SimpleCobalt 
{
	// tab
	public static SimpleTab tabAkkamaddiCobalt;

	public static ArmorMaterial armorCobalt, armorBlueDriftSteel,
			armorBlueCeladon, armorGreenCeladon;
	public static ToolMaterial toolCobalt, toolBlueDriftSteel, toolBlueCeladon,
			toolGreenCeladon;

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
