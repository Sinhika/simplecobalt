package mod.akkamaddi.simplecobalt.content;

import java.util.function.Supplier;

import mod.akkamaddi.simplecobalt.init.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;

public enum SimpleCobaltItemTier implements Tier 
{
    COBALT(2, 960, 7.0F, 2.0F, 8, ()->{ return Ingredient.of( ModItems.cobalt_ingot.get()); }),
    BLUE_DRIFT_STEEL(2, 1240, 13.0F, 2.0F, 16, ()->{ return Ingredient.of( ModItems.blue_drift_steel_ingot.get()); }),
    BLUE_CELADON(3, 1740, 20.0F, 5.0F, 24, ()->{ return Ingredient.of( ModItems.blue_celadon_ingot.get()); }),
    GREEN_CELADON(4, 2120, 24.0F, 6.0F, 26, ()->{ return Ingredient.of( ModItems.green_celadon_ingot.get()); });
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;
    
    
    private SimpleCobaltItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage,
            int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
       return this.maxUses;
    }

    @Override
    public float getSpeed() {
       return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
       return this.attackDamage;
    }

    @Override
    public int getLevel() {
       return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
       return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
       return this.repairMaterial.get();
    }

} // end enum class
