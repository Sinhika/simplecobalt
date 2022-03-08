package mod.akkamaddi.simplecobalt.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.alexndr.simplecorelib.datagen.BlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.resources.ResourceLocation;

public class CobaltLootTableProvider extends BlockLootTableProvider
{

    public CobaltLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables()
    {
        tables.clear();
        specialDropTable(ModBlocks.cobalt_ore.get(), ModItems.raw_cobalt.get());
        specialDropTable(ModBlocks.deepslate_cobalt_ore.get(), ModItems.raw_cobalt.get());
        standardDropTable(ModBlocks.cobalt_block.get());
        standardDropTable(ModBlocks.blue_drift_steel_block.get());
        standardDropTable(ModBlocks.blue_celadon_block.get());
        standardDropTable(ModBlocks.green_celadon_block.get());
        return tables;
    }

} // end class
