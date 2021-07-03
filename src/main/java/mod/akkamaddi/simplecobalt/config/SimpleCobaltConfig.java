package mod.akkamaddi.simplecobalt.config;

import mod.alexndr.simplecorelib.config.ModOreConfig;
import mod.alexndr.simplecorelib.config.SimpleConfig;

public class SimpleCobaltConfig extends SimpleConfig
{
    public static SimpleCobaltConfig INSTANCE = new SimpleCobaltConfig();

    public static boolean enableCobaltOre;
    public static boolean addModLootToChests;
    
    // Vein/Chunk Count, MinHeight, MaxHeightBase, MaxHeight
    public static  ModOreConfig cobalt_cfg;
    //public static  int cobalt_veinsize = 5;
    

} // end-class
