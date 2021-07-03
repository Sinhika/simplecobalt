package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
    // swords
    // axes
    // pickaxes
    // hoes
    // shovel
    
    // ARMOR
    // tungsten
    // tungsten carbide
    // valfram
    // tungsten steel
    // prasinos

} // end class
