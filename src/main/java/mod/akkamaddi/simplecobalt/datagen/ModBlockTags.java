package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider
{

    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, SimpleCobalt.MODID, existingFileHelper);
    }

} // end class
