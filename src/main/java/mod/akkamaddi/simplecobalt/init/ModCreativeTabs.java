package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs
{

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleCobalt.MODID);
	
	public static final RegistryObject<CreativeModeTab> COBALT_TAB = CREATIVE_MODE_TABS.register("cobalt_tab",
			() -> CreativeModeTab.builder()
				.title(Component.translatable("item_group." + SimpleCobalt.MODID + ".tab"))
				.icon(() -> new ItemStack(ModBlocks.cobalt_ore.get().asItem()))
				.displayItems((parameters, output) -> {
					output.acceptAll(ModBlocks.BLOCKS.getEntries().stream()
										.map(RegistryObject::get)
										.map(b -> (new ItemStack(b.asItem())))
										.toList()
										);
					output.acceptAll(ModItems.ITEMS.getEntries().stream()
							.map(RegistryObject::get)
							.map(b -> (new ItemStack(b)))
							.toList()
							);
				}).build());

} // end class ModTabGroups
