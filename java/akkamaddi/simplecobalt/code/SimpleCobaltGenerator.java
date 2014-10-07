package akkamaddi.simplecobalt.code;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import alexndr.SimpleOres.api.helpers.WorldGenHelper;

public class SimpleCobaltGenerator implements IWorldGenerator
{
    /**
    * Generates the ores in the world. Depending on which 'world' the player is in (ie. Nether or Surface), different methods are called.
    * These two methods are generateSurface and generateNether, which are below.
    */

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (world.provider.dimensionId == 0)
        {
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
        else if (SimpleCobaltCore.enableHigherDimensionGen && SimpleCobaltCore.dimensionIDsArray.length >= 1)
        {
            for (int i = 0; i < SimpleCobaltCore.dimensionIDsArray.length; i++)
            {
                if (world.provider.dimensionId == SimpleCobaltCore.dimensionIDsArray[i])
                {
                    generateHigher(world, random, chunkX * 16, chunkZ * 16, SimpleCobaltCore.dimensionIDsArray[i]);
                }
            }
        }
    }

    /**
     * Sets the details for how the blocks should spawn on the surface world.
     *
     * Configurable options are spawn rate, spawn height, vein size, and the block which spawns.
     * Lowest and highest spawn heights can be set.
     *
     *
     * WorldGenMinable determines which block the ores generate in.
     *
     * WorldGenMinable will generate in stone, ie. for surface ores.
     */
    private void generateSurface(World world, Random random, int blockX, int blockZ)
    {
        for (int x = 0; x < SimpleCobaltCore.cobaltSpawnRate; x++)
        {
            int Xcoord = blockX + random.nextInt(16);
            int Ycoord = random.nextInt(SimpleCobaltCore.cobaltSpawnHeight - SimpleCobaltCore.cobaltMinSpawnHeight);
            int Zcoord = blockZ + random.nextInt(16);
            new WorldGenHelper(SimpleCobaltCore.oreCobalt.blockID, SimpleCobaltCore.cobaltVeinSize, Block.stone).generate(world, random, Xcoord, Ycoord + SimpleCobaltCore.cobaltMinSpawnHeight , Zcoord);
        }
    }

    /**
     * Generates the main surface ores in dimensions other than the vanilla ones. Based on code by AleXndrTheGr8st
     * This is all configurable through the settings file, and is classified as "Advanced".
     *
     * Each different dimension can have different spawn rates, with support for up to ~30000 dimensions (I think).
     */

    private void generateHigher(World world, Random random, int blockX, int blockZ, int dimensionID)
    {
        if (SimpleCobaltCore.enableHigherDimensionGen)
        {
            for (int i = 0; i < SimpleCobaltCore.dimensionIDsArray.length; i++)
            {
                int cobaltRate = SimpleCobaltCore.config.get("Higher Dimension ID: " + dimensionID, "Cobalt Spawn Rate", 6).getInt();

                for (int x = 0; x < cobaltRate; x++)
                {
                    int maxHeight = SimpleCobaltCore.config.get("Higher Dimension ID: " + dimensionID, "Cobalt Maximum Spawn Height", 32).getInt();
                    int minHeight = SimpleCobaltCore.config.get("Higher Dimension ID: " + dimensionID, "Cobalt Minimum Spawn Height", 0).getInt();
                    int veinSize = SimpleCobaltCore.config.get("Higher Dimension ID: " + dimensionID, "Cobalt Vein Size", 6).getInt();
                    int Xcoord = blockX + random.nextInt(16);
                    int Ycoord = random.nextInt(maxHeight - minHeight);
                    int Zcoord = blockZ + random.nextInt(16);
                    new WorldGenHelper(SimpleCobaltCore.oreCobalt.blockID, veinSize, Block.stone).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);
                }
            }
        }
    }
}
