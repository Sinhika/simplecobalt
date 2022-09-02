package mod.akkamaddi.simplecobalt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.content.SimpleCobaltArmorMaterial;
import mod.akkamaddi.simplecobalt.loot.SimpleCobaltInjectionLookup;
import mod.alexndr.simplecorelib.api.helpers.ArmorUtils;
import mod.alexndr.simplecorelib.api.helpers.LootUtils;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleCobalt.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(SimpleCobalt.MODID + " Forge Event Subscriber");
    private static final SimpleCobaltInjectionLookup lootLookupMap = new SimpleCobaltInjectionLookup();

    /**
     * add mod loot to loot tables. Code heavily based on Botania's LootHandler, which
     * neatly solves the problem when I couldn't figure it out.
     */
    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
        if (SimpleCobaltConfig.addModLootToChests)
        {
            LootUtils.LootLoadHandler(SimpleCobalt.MODID, event, lootLookupMap);
        } // end-if
    } // end LootLoad()
    
      /**
     * Handle special armor immunities: blue_drift_steel cancels falling damage.
     * 
     * @param event
     */
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingAttackEvent(LivingAttackEvent event)
    {
        // first, is it a player?
        if (event.getEntity() instanceof Player)
        {
            Player player = (Player) event.getEntity();
            LOGGER.debug("caught LivingAttackEvent");

            // falling anvils and other impact damage, wearing full suit of tungsten carbide?
            if (event.getSource() == DamageSource.FALL 
                &&
                ArmorUtils.isPlayerWearingFullSet(player, SimpleCobaltArmorMaterial.BLUE_DRIFT_STEEL))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled fall damage because of blue drift steel armor set");
            } // end-if full set of blue drift steel and fall damage
        } // end-if player
    } // end onLivingHurtEvent

} // end class
