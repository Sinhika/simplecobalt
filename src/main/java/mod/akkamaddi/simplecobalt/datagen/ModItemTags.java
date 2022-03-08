package mod.akkamaddi.simplecobalt.datagen;

import java.util.List;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.init.ModBlocks;
import mod.akkamaddi.simplecobalt.init.ModItems;
import mod.alexndr.simplecorelib.datagen.MiningItemTags;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends MiningItemTags
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, new ModBlockTags(dataGenerator, existingFileHelper), SimpleCobalt.MODID, 
                existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        super.addTags();
        registerNuggetTags();
        registerIngotTags();
    }

    @Override
    protected void registerOreTags() 
    {
        // register "forge:ores" tags
        this.tag(TagUtils.forgeTag( "ores"))
                .addTag(TagUtils.forgeTag( "ores/cobalt"));
        this.tag(TagUtils.forgeTag( "ores/cobalt"))
            .add(ModBlocks.cobalt_ore.get().asItem())
            .add(ModBlocks.deepslate_cobalt_ore.get().asItem());
        
        // register forge ore_rates tags.
        this.registerOreRateTags( List.of(), // sparse 
                List.of(ModBlocks.cobalt_ore.get(), ModBlocks.deepslate_cobalt_ore.get()), // singular 
                List.of()); // dense
        
        // register forge:ores_in_ground tags
        this.registerOresInGroundTags( List.of(ModBlocks.cobalt_ore.get()), // stone ores
                List.of( ModBlocks.deepslate_cobalt_ore.get()), // deepslate ores
                List.of());  // netherrack ores
    }
    
    
    private void registerNuggetTags()
    {
        this.tag(TagUtils.forgeTag("nuggets"))
            .addTag(TagUtils.forgeTag("nuggets/cobalt"))
            .addTag(TagUtils.forgeTag("nuggets/blue_drift_steel"))
            .addTag(TagUtils.forgeTag("nuggets/blue_celadon"))
            .addTag(TagUtils.forgeTag("nuggets/green_celadon"));
    
        this.tag(TagUtils.forgeTag("nuggets/cobalt")).add(ModItems.cobalt_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/blue_drift_steel")).add(ModItems.blue_drift_steel_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/blue_celadon")).add(ModItems.blue_celadon_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/green_celadon")).add(ModItems.green_celadon_nugget.get());
    } // end registerNuggetTags()
    
    private void registerIngotTags()
    {
        this.tag(TagUtils.forgeTag("ingots"))
            .addTag(TagUtils.forgeTag("ingots/cobalt"))
            .addTag(TagUtils.forgeTag("ingots/blue_drift_steel"))
            .addTag(TagUtils.forgeTag("ingots/blue_celadon"))
            .addTag(TagUtils.forgeTag("ingots/green_celadon"));
        
        this.tag(TagUtils.forgeTag("ingots/cobalt")).add(ModItems.cobalt_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/blue_drift_steel")).add(ModItems.blue_drift_steel_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/blue_celadon")).add(ModItems.blue_celadon_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/green_celadon")).add(ModItems.green_celadon_ingot.get());
    } // end registerIngotTags()

} // end class
