package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import mod.akkamaddi.simplecobalt.init.ModItems;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, new ModBlockTags(dataGenerator, existingFileHelper), SimpleCobalt.MODID, 
                existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        registerNuggetTags();
        registerIngotTags();
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
