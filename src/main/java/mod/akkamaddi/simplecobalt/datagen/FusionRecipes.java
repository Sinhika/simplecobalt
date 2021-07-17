package mod.akkamaddi.simplecobalt.datagen;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class FusionRecipes extends AbstractFusionRecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{

    public FusionRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public ICondition flag(String name)
    {
        return impl_flag(SimpleCobalt.MODID, SimpleCobaltConfig.INSTANCE, name);
    }

} // end class
