package mod.akkamaddi.simplecobalt.init;

import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

public class ModTags
{
    public static class Items
    {
        public static final ITag.INamedTag<Item> INGOTS_COBALT = TagUtils.forgeTag("ingots/cobalt");
        public static final ITag.INamedTag<Item> INGOTS_MYTHRIL = TagUtils.forgeTag("ingots/mythril");
        public static final ITag.INamedTag<Item> INGOTS_ADAMANTIUM = TagUtils.forgeTag("ingots/adamantium");
    } // end class Items

} // end class