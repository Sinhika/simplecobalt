package akkamaddi.simplecobalt.code;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import akkamaddi.akkamaddiCore.api.SimpleArmorWithEffect;
import akkamaddi.akkamaddiCore.api.SimpleArmorWithEffect.ARMOR_TYPE;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class HandlerArmor
{
    //effects

    @SubscribeEvent
    public void onFallDamage(LivingAttackEvent event)
    {
        if (event.entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entity;
			ItemStack [] armorbits = new ItemStack[4];
			SimpleArmorWithEffect.getArmorPieces(player, armorbits);
			for (int i=0; i < 4; i++) {
				if (armorbits[i] == null) return;
			}
			if (armorbits[ARMOR_TYPE.HELM.ordinal()].getItem() == SimpleCobaltCore.blueDriftSteelHelm
					&& armorbits[ARMOR_TYPE.CHEST.ordinal()].getItem() == SimpleCobaltCore.blueDriftSteelChest
					&& armorbits[ARMOR_TYPE.LEGS.ordinal()].getItem() == SimpleCobaltCore.blueDriftSteelLegs
					&& armorbits[ARMOR_TYPE.BOOTS.ordinal()].getItem() == SimpleCobaltCore.blueDriftSteelBoots) 
			{
				if (event.source.equals(DamageSource.fall)) {
					event.setCanceled(true);
				}
 			} // end if armor all blueDriftSteel
        }
    } // end onFallDamage()
} // end class HandlerArmor
