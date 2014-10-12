package akkamaddi.simplecobalt.code;

import java.util.EnumSet;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerArmor
{
    //effects

    @SubscribeEvent
    public void onFallDamage(LivingAttackEvent event)
    {
        if (event.entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entity;
            ItemStack helmet = player.getCurrentItemOrArmor(4);
            ItemStack chest = player.getCurrentItemOrArmor(3);
            ItemStack legs = player.getCurrentItemOrArmor(2);
            ItemStack boots = player.getCurrentItemOrArmor(1);

            if (event.entity instanceof EntityPlayer)
            {
                EntityPlayer eventPlayer = (EntityPlayer)event.entity;

                if (helmet != null && chest != null && legs != null && boots != null)
                {
                    if (helmet.getItem() == SimpleCobaltCore.blueDriftSteelHelm & chest.getItem() == SimpleCobaltCore.blueDriftSteelChest & legs.getItem() == SimpleCobaltCore.blueDriftSteelLegs & boots.getItem() == SimpleCobaltCore.blueDriftSteelBoots)
                    {
                        if (event.source.equals(DamageSource.fall))
                        {
                            event.setCanceled(true);
                        }
                    }
                }
            }
        }
    }
}
