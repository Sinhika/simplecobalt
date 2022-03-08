package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo
 */
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleCobalt.MODID);

    // Ore Block
    public static final RegistryObject<OreBlock> cobalt_ore = BLOCKS.register("cobalt_ore",
            () -> new OreBlock(Block.Properties.of(Material.STONE)
                    .strength( 4.0F, 10.0F).requiresCorrectToolForDrops()));
                  //  .harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<OreBlock> deepslate_cobalt_ore = BLOCKS.register("deepslate_cobalt_ore",
            () -> new OreBlock(Block.Properties.of(Material.STONE)
                    .strength( 4.0F, 10.0F).requiresCorrectToolForDrops()));
    
    // Storage Blocks
    public static final RegistryObject<Block> cobalt_block = BLOCKS.register("cobalt_block", 
            () -> new Block(Block.Properties.of(Material.METAL,
                    MaterialColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static final RegistryObject<Block> raw_cobalt_block = BLOCKS.register("raw_cobalt_block", 
            () -> new Block(Block.Properties.of(Material.METAL,
                    MaterialColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> blue_drift_steel_block = BLOCKS.register("blue_drift_steel_block", 
            () -> new Block(Block.Properties.of(Material.METAL,
                    MaterialColor.COLOR_CYAN)
                    .strength(10.0F, 22.0F).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> blue_celadon_block = BLOCKS.register("blue_celadon_block", 
            () -> new Block(Block.Properties.of(Material.METAL,
                    MaterialColor.COLOR_LIGHT_BLUE)
                    .strength(10.0F, 22.0F).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    
    public static final RegistryObject<Block> green_celadon_block = BLOCKS.register("green_celadon_block", 
            () -> new Block(Block.Properties.of(Material.METAL,
                    MaterialColor.COLOR_LIGHT_GREEN)
                    .strength(10.0F, 22.0F).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)));

} // end class
