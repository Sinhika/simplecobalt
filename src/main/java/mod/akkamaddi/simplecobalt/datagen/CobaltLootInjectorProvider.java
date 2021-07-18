package mod.akkamaddi.simplecobalt.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.alexndr.simplecorelib.datagen.LootTableInjectorProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

public class CobaltLootInjectorProvider extends LootTableInjectorProvider
{

    public CobaltLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();
        // simple_dungeon
        LootPool.Builder foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.cobalt_nugget.get()).setWeight(10)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_drift_steel_nugget.get()).setWeight(5)
                    .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_celadon_nugget.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                .add(ItemLootEntry.lootTableItem(ModItems.green_celadon_nugget.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))));
        addInjectionTable(SimpleCobalt.MODID, "simple_dungeon", foo);
        
        // abandoned_mineshaft
        foo = createChestPool(1,1,0.25F)
                .add(ItemLootEntry.lootTableItem(ModBlocks.cobalt_ore.get())
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))));
         addInjectionTable(SimpleCobalt.MODID, "abandoned_mineshaft", foo);
         
        // shipwreck
        foo = createChestPool(1,1,0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.cobalt_ingot.get()).setWeight(10)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_drift_steel_ingot.get()).setWeight(5)
                    .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                .add(ItemLootEntry.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))));
        addInjectionTable(SimpleCobalt.MODID, "shipwreck", foo);

        // underwater_ruins
        foo = createChestPool(1,1,0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                .add(ItemLootEntry.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))));
        
        // stronghold
        foo = createChestPool(1,1,0.50F)
                .add(ItemLootEntry.lootTableItem(ModItems.cobalt_ingot.get()).setWeight(10)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_drift_steel_ingot.get()).setWeight(5)
                    .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                .add(ItemLootEntry.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(3)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                .add(ItemLootEntry.lootTableItem(ModItems.cobalt_pickaxe.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_drift_steel_sword.get()).setWeight(2))
                .add(ItemLootEntry.lootTableItem(ModItems.blue_celadon_axe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.green_celadon_boots.get()).setWeight(1));
        addInjectionTable(SimpleCobalt.MODID, "stronghold", foo);
                        
        
        return tables;
    } //end getTables()

} // end class
