package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{

    public Recipes(DataGenerator p_i48262_1_)
    {
        super(p_i48262_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleCobalt.MODID, SimpleCobaltConfig.INSTANCE, name);
    }

} // end class
