package mod.akkamaddi.simplecobalt.init;

import mod.akkamaddi.simplecobalt.SimpleCobalt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
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
    public static final RegistryObject<DropExperienceBlock> cobalt_ore = BLOCKS.register("cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength( 4.0F, 10.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<DropExperienceBlock> deepslate_cobalt_ore = BLOCKS.register("deepslate_cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength( 4.0F, 10.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    // Storage Blocks
    public static final RegistryObject<Block> cobalt_block = BLOCKS.register("cobalt_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> raw_cobalt_block = BLOCKS.register("raw_cobalt_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> blue_drift_steel_block = BLOCKS.register("blue_drift_steel_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> blue_celadon_block = BLOCKS.register("blue_celadon_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> green_celadon_block = BLOCKS.register("green_celadon_block", 
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(10.0F, 22.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

} // end class
