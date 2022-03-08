package mod.akkamaddi.simplecobalt.datagen;

import java.util.List;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.MiningBlockTags;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockTags extends MiningBlockTags
{

    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, SimpleCobalt.MODID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        super.addTags();
        registerStorageBlockTags();
        registerBeaconBlockTags();
    } // end registerTags()
 
    @Override
    protected void registerMiningTags()
    {
       // all the registered blocks are mineable.
       List<Block> mineables = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
       
       // do nothing; super() generates all the vanilla blocktags, and we don't want that.
       // note: all the mineable blocks are iron-level.
       registerMineableTags(mineables, 
                List.of(), // 1 stone
                mineables, // 2 - iron
                List.of(), // 3 - diamond
                List.of()); // 4 - netherite
                
    } // end registerMiningTags()
    
    @Override
    protected void registerOreTags()
    {
        // register "forge:ores" tags
        this.tag(TagUtils.forgeBlockTag( "ores"))
                .addTag(TagUtils.forgeBlockTag( "ores/cobalt"));
        this.tag(TagUtils.forgeBlockTag( "ores/cobalt"))
            .add(ModBlocks.cobalt_ore.get())
            .add(ModBlocks.deepslate_cobalt_ore.get());
        
        // register forge ore_rates tags.
        this.registerOreRateTags( List.of(), // sparse 
                List.of(ModBlocks.cobalt_ore.get(), ModBlocks.deepslate_cobalt_ore.get()), // singular 
                List.of()); // dense
        
        // register forge:ores_in_ground tags
        this.registerOresInGroundTags( List.of(ModBlocks.cobalt_ore.get()), // stone ores
                List.of( ModBlocks.deepslate_cobalt_ore.get()), // deepslate ores
                List.of());  // netherrack ores
    } // end registerOreTags()
    
    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeBlockTag("storage_blocks"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/cobalt_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/blue_drift_steel_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/blue_celadon_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/green_celadon_block"));
        
        this.tag(TagUtils.forgeBlockTag("storage_blocks/cobalt_block"))
            .add(ModBlocks.cobalt_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/blue_drift_steel_block"))
            .add(ModBlocks.blue_drift_steel_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/blue_celadon_block"))
            .add(ModBlocks.blue_celadon_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/green_celadon_block"))
            .add(ModBlocks.green_celadon_block.get());
    } // end registerStorageBlockTags
    
    /**
     * Identify metal blocks as beacon block bases.
     */
    private void registerBeaconBlockTags()
    {
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
            .add(ModBlocks.cobalt_block.get())
            .add(ModBlocks.blue_drift_steel_block.get())
            .add(ModBlocks.blue_celadon_block.get())
            .add(ModBlocks.green_celadon_block.get());
    }
} // end class
