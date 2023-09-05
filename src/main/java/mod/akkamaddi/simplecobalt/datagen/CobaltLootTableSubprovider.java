package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.SimpleBlockLootSubProvider;

public class CobaltLootTableSubprovider extends SimpleBlockLootSubProvider
{

 
    @Override
	protected void generate() 
	{
    	dropMultiItemsWithFortune(ModBlocks.cobalt_ore.get(), ModItems.raw_cobalt.get(), 1, 1);
        dropMultiItemsWithFortune(ModBlocks.deepslate_cobalt_ore.get(), ModItems.raw_cobalt.get(), 1, 1);
        dropSelf(ModBlocks.cobalt_block.get());
        dropSelf(ModBlocks.blue_drift_steel_block.get());
        dropSelf(ModBlocks.blue_celadon_block.get());
        dropSelf(ModBlocks.green_celadon_block.get());
    }

} // end class
