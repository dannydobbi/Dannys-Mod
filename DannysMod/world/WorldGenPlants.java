package DannysMod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import DannysMod.Blocks.Blocks;
import DannysMod.Items.Items;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenPlants implements IWorldGenerator 
{
	public WorldGenPlants() 
	{

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId)
		{
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random rand, int blockX, int blockZ) 
	{

		for(int var5 = 0; var5 < 1; ++var5)
		{
			int var6 = blockX + rand.nextInt(16);
			int var7 = rand.nextInt(128);
			int var8 = blockZ + rand.nextInt(16);

			//new WorldGenFlowers(Blocks.tomatoPlant.blockID).generate(world, rand, var6, var7, var8);

		}
	}
}