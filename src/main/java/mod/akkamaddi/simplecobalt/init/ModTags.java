package mod.akkamaddi.simplecobalt.init;

import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags
{
    public static class Items
    {
        public static final TagKey<Item> INGOTS_COBALT = TagUtils.forgeTag("ingots/cobalt");
        public static final TagKey<Item> INGOTS_MYTHRIL = TagUtils.forgeTag("ingots/mythril");
        public static final TagKey<Item> INGOTS_ADAMANTIUM = TagUtils.forgeTag("ingots/adamantium");
    } // end class Items

} // end class
