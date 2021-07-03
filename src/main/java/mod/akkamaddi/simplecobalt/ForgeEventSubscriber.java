package mod.akkamaddi.simplecobalt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.simplecobalt.config.SimpleCobaltConfig;
import mod.akkamaddi.simplecobalt.content.SimpleCobaltArmorMaterial;
import mod.akkamaddi.simplecobalt.loot.SimpleCobaltInjectionLookup;
import mod.alexndr.simplecorelib.helpers.ArmorUtils;
import mod.alexndr.simplecorelib.helpers.LootUtils;
import mod.alexndr.simpleores.generation.OreGeneration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
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
     * Biome loading triggers ore generation.
     */
    @SubscribeEvent(priority=EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent evt)
    {
        if (evt.getCategory() != Biome.Category.NETHER && evt.getCategory() != Biome.Category.THEEND)
        {
            OreGeneration.generateOverworldOres(evt);
        }
   } // end onBiomeLoading()
    
     /**
     * Handle special armor immunities: blue_drift_steel cancels falling damage.
     * 
     * @param event
     */
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingAttackEvent(LivingAttackEvent event)
    {
        // first, is it a player?
        if (event.getEntityLiving() instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
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
