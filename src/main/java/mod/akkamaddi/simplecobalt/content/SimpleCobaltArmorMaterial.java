package mod.akkamaddi.simplecobalt.content;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import mod.akkamaddi.simplecobalt.init.ModItems;

public enum SimpleCobaltArmorMaterial implements IArmorMaterial 
{
    COBALT("simplecobalt:cobalt", 24, new int[] {3, 3, 4, 3 }, 8, 
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F,
            ()-> { return Ingredient.of(ModItems.cobalt_ingot.get());}),
    BLUE_DRIFT_STEEL("simplecobalt:blue_drift_steel", 26, new int[] {3, 5, 6, 3}, 16,
            SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 
            ()-> { return Ingredient.of(ModItems.blue_drift_steel_ingot.get());}),
    BLUE_CELADON("simplecobalt:blue_celadon", 30, new int[] {4, 5, 6, 4}, 24, 
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F,
            ()-> { return Ingredient.of(ModItems.blue_celadon_ingot.get());}),
    GREEN_CELADON("simplecobalt:green_celadon", 44, new int[] {5, 8, 9, 5}, 26, 
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 
            ()-> { return Ingredient.of(ModItems.green_celadon_ingot.get());}),
    
    // {feet, legs, chest, head}
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;
    
    
    private SimpleCobaltArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray,
            int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial)
    {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        // TODO Auto-generated method stub
        return 0;
    }

} // end enum
