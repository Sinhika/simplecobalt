package mod.akkamaddi.simplecobalt.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ModTabGroups
{
    public static final CreativeModeTab MOD_ITEM_GROUP =
            new ModTabGroup(SimpleCobalt.MODID, () -> new ItemStack(ModBlocks.cobalt_ore.get()));

    public static final class ModTabGroup extends CreativeModeTab
    {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return iconSupplier.get();
        }
    } // end ModTabGroup()

} // end class ModTabGroups
