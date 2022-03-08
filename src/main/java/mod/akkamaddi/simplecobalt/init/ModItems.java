package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.content.SimpleCobaltArmorMaterial;
import mod.akkamaddi.simplecobalt.content.SimpleCobaltItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleCobalt.MODID);

    // Simple Items: ingots, chunks, nuggets
    public static final RegistryObject<Item> cobalt_ingot = ITEMS.register("cobalt_ingot",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> cobalt_nugget = ITEMS.register("cobalt_nugget",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    public static final RegistryObject<Item> blue_drift_steel_ingot = ITEMS.register("blue_drift_steel_ingot",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> blue_drift_steel_nugget = ITEMS.register("blue_drift_steel_nugget",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_blue_drift_steel_chunk = ITEMS.register("medium_blue_drift_steel_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_blue_drift_steel_chunk = ITEMS.register("large_blue_drift_steel_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    public static final RegistryObject<Item> blue_celadon_ingot = ITEMS.register("blue_celadon_ingot",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> blue_celadon_nugget = ITEMS.register("blue_celadon_nugget",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_blue_celadon_chunk = ITEMS.register("medium_blue_celadon_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_blue_celadon_chunk = ITEMS.register("large_blue_celadon_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    public static final RegistryObject<Item> green_celadon_ingot = ITEMS.register("green_celadon_ingot",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> green_celadon_nugget = ITEMS.register("green_celadon_nugget",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_green_celadon_chunk = ITEMS.register("medium_green_celadon_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_green_celadon_chunk = ITEMS.register("large_green_celadon_chunk",
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // TOOLS & WEAPONS
    // sword
    public static final RegistryObject<SwordItem> cobalt_sword = ITEMS.register("cobalt_sword",
            () -> new SwordItem(SimpleCobaltItemTier.COBALT, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> blue_celadon_sword = ITEMS.register("blue_celadon_sword",
            () -> new SwordItem(SimpleCobaltItemTier.BLUE_CELADON, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> green_celadon_sword = ITEMS.register("green_celadon_sword",
            () -> new SwordItem(SimpleCobaltItemTier.GREEN_CELADON, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> blue_drift_steel_sword = ITEMS.register("blue_drift_steel_sword",
            () -> new SwordItem(SimpleCobaltItemTier.BLUE_DRIFT_STEEL, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
  
    // axes
    public static final RegistryObject<AxeItem> cobalt_axe = ITEMS.register("cobalt_axe",
            () -> new AxeItem(SimpleCobaltItemTier.COBALT, 6.0F, 3.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> blue_celadon_axe = ITEMS.register("blue_celadon_axe",
            () -> new AxeItem(SimpleCobaltItemTier.BLUE_CELADON, 6.0F, 3.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> green_celadon_axe = ITEMS.register("green_celadon_axe",
            () -> new AxeItem(SimpleCobaltItemTier.GREEN_CELADON, 6.0F, 3.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> blue_drift_steel_axe = ITEMS.register("blue_drift_steel_axe",
            () -> new AxeItem(SimpleCobaltItemTier.BLUE_DRIFT_STEEL, 6.0F, 3.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // pickaxes
    public static final RegistryObject<PickaxeItem> cobalt_pickaxe = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(SimpleCobaltItemTier.COBALT, 1, -2.8F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> blue_celadon_pickaxe = ITEMS.register("blue_celadon_pickaxe",
            () -> new PickaxeItem(SimpleCobaltItemTier.BLUE_CELADON, 1, -2.8F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> green_celadon_pickaxe = ITEMS.register("green_celadon_pickaxe",
            () -> new PickaxeItem(SimpleCobaltItemTier.GREEN_CELADON, 1, -2.8F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> blue_drift_steel_pickaxe = ITEMS.register("blue_drift_steel_pickaxe",
            () -> new PickaxeItem(SimpleCobaltItemTier.BLUE_DRIFT_STEEL, 1, -2.8F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // hoes
    public static final RegistryObject<HoeItem> cobalt_hoe = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(SimpleCobaltItemTier.COBALT, -1, -1.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> blue_celadon_hoe = ITEMS.register("blue_celadon_hoe",
            () -> new HoeItem(SimpleCobaltItemTier.BLUE_CELADON, -1,  -1.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> green_celadon_hoe = ITEMS.register("green_celadon_hoe",
            () -> new HoeItem(SimpleCobaltItemTier.GREEN_CELADON, -1, -1.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> blue_drift_steel_hoe = ITEMS.register("blue_drift_steel_hoe",
            () -> new HoeItem(SimpleCobaltItemTier.BLUE_DRIFT_STEEL, -1, -1.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
  
    // shovel
    public static final RegistryObject<ShovelItem> cobalt_shovel = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(SimpleCobaltItemTier.COBALT, 1.5F, -2.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> blue_celadon_shovel = ITEMS.register("blue_celadon_shovel",
            () -> new ShovelItem(SimpleCobaltItemTier.BLUE_CELADON, 1.5F, -2.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> green_celadon_shovel = ITEMS.register("green_celadon_shovel",
            () -> new ShovelItem(SimpleCobaltItemTier.GREEN_CELADON, 1.5F, -2.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> blue_drift_steel_shovel = ITEMS.register("blue_drift_steel_shovel",
            () -> new ShovelItem(SimpleCobaltItemTier.BLUE_DRIFT_STEEL, 1.5F, -2.0F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
  
    // ARMOR
    // cobalt
    public static final RegistryObject<ArmorItem> cobalt_helmet = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.COBALT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cobalt_leggings = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.COBALT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cobalt_chestplate = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.COBALT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cobalt_boots = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.COBALT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // cobalt carbide
    public static final RegistryObject<ArmorItem> blue_celadon_helmet = ITEMS.register("blue_celadon_helmet",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_CELADON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_celadon_leggings = ITEMS.register("blue_celadon_leggings",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_CELADON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_celadon_chestplate = ITEMS.register("blue_celadon_chestplate",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_CELADON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_celadon_boots = ITEMS.register("blue_celadon_boots",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_CELADON, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // green_celadon
    public static final RegistryObject<ArmorItem> green_celadon_helmet = ITEMS.register("green_celadon_helmet",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.GREEN_CELADON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> green_celadon_leggings = ITEMS.register("green_celadon_leggings",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.GREEN_CELADON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> green_celadon_chestplate = ITEMS.register("green_celadon_chestplate",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.GREEN_CELADON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> green_celadon_boots = ITEMS.register("green_celadon_boots",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.GREEN_CELADON, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // cobalt steel
    public static final RegistryObject<ArmorItem> blue_drift_steel_helmet = ITEMS.register("blue_drift_steel_helmet",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_DRIFT_STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_drift_steel_leggings = ITEMS.register("blue_drift_steel_leggings",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_DRIFT_STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_drift_steel_chestplate = ITEMS.register("blue_drift_steel_chestplate",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_DRIFT_STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> blue_drift_steel_boots = ITEMS.register("blue_drift_steel_boots",
            () -> new ArmorItem(SimpleCobaltArmorMaterial.BLUE_DRIFT_STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

} // end class
