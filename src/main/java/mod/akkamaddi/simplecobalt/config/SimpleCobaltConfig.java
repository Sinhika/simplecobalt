package mod.akkamaddi.simplecobalt.config;

import mod.alexndr.simplecorelib.api.config.SimpleConfig;

public class SimpleCobaltConfig extends SimpleConfig
{
    public static SimpleCobaltConfig INSTANCE = new SimpleCobaltConfig();

    public static boolean enableCobaltOre;
    public static boolean addModLootToChests;
    
    // Vein/Chunk Count, MinHeight, MaxHeightBase, MaxHeight
//    public static Lazy<ModOreConfig> cobalt_cfg = Lazy.of( () -> new ModOreConfig(ModOreConfig.TRIANGLE,
//                ConfigHolder.SERVER.serverCobaltVeinSize.get(), ConfigHolder.SERVER.serverCobaltVeinCount.get(), true,
//                VerticalAnchor.absolute(ConfigHolder.SERVER.serverCobaltBottomHeight.get()),
//                VerticalAnchor.absolute(ConfigHolder.SERVER.serverCobaltMaxHeight.get()))); 
    //public static  int cobalt_veinsize = 5;
    

} // end-class
