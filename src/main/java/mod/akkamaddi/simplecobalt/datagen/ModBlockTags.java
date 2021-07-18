package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider
{

    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, SimpleCobalt.MODID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        registerStorageBlockTags();
        registerBeaconBlockTags();
    } // end registerTags()
 
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
