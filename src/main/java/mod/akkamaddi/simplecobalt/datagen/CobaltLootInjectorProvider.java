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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class CobaltLootInjectorProvider extends LootTableInjectorProvider
{

    public CobaltLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables()
    {
        tables.clear();
        // simple_dungeon
        LootPool.Builder foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.cobalt_nugget.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_drift_steel_nugget.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_celadon_nugget.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.green_celadon_nugget.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(SimpleCobalt.MODID, "simple_dungeon", foo);
        
        // abandoned_mineshaft
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModBlocks.cobalt_ore.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
         addInjectionTable(SimpleCobalt.MODID, "abandoned_mineshaft", foo);
         
        // shipwreck
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.cobalt_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_drift_steel_ingot.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(SimpleCobalt.MODID, "shipwreck", foo);

        // underwater_ruins
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(SimpleCobalt.MODID, "underwater_ruins", foo);
        
        // stronghold
        foo = createChestPool(1,1,0.50F)
                .add(LootItem.lootTableItem(ModItems.cobalt_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_drift_steel_ingot.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.blue_celadon_ingot.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.green_celadon_ingot.get()).setWeight(3)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.cobalt_pickaxe.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.blue_drift_steel_sword.get()).setWeight(2))
                .add(LootItem.lootTableItem(ModItems.blue_celadon_axe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.green_celadon_boots.get()).setWeight(1));
        addInjectionTable(SimpleCobalt.MODID, "stronghold", foo);
        
        return tables;
    } //end getTables()

} // end class
