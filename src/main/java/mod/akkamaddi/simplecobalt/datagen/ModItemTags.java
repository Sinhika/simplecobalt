package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, new ModBlockTags(dataGenerator, existingFileHelper), SimpleCobalt.MODID, 
                existingFileHelper);
    }

} // end class
