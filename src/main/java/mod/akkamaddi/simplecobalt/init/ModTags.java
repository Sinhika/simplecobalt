package mod.akkamaddi.simplecobalt.init;

import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.world.item.Item;
import net.minecraft.tags.Tag;

public class ModTags
{
    public static class Items
    {
        public static final Tag.Named<Item> INGOTS_COBALT = TagUtils.forgeTag("ingots/cobalt");
        public static final Tag.Named<Item> INGOTS_MYTHRIL = TagUtils.forgeTag("ingots/mythril");
        public static final Tag.Named<Item> INGOTS_ADAMANTIUM = TagUtils.forgeTag("ingots/adamantium");
    } // end class Items

} // end class
