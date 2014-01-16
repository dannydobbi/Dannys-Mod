package DannysMod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import DannysMod.world.*;
import DannysMod.Blocks.Blocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator
{

	public WorldGenOres() 
	{

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId)
	    {
	    case 1:
	      generateEnd(world, random, chunkX * 16, chunkZ * 16);
	    case 0:
	      generateSurface(world, random, chunkX * 16, chunkZ * 16);
	    case -1:
	      generateNether(world, random, chunkX * 16, chunkZ * 16);
	    }
	}

	public int i;
	public int Xcoord;
	public int Ycoord;
	public int Zcoord;

	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{
	}

	private void generateSurface(World world, Random rand, int blockX, int blockZ) 
	{

		for (int i = 0; i < 8; i++) {

			int Xcoord = blockX + rand.nextInt(16);
			int YcoordSurface1 = rand.nextInt(56);
			int YcoordSurface2 = rand.nextInt(36);
			int YcoordSurface3 = rand.nextInt(20);
			int YcoordSurface4 = rand.nextInt(15);
			int Zcoord = blockZ + rand.nextInt(16);
			(new WorldGenMinable(Blocks.shadowOre.blockID, 12)).generate(world, rand, Xcoord, YcoordSurface2, Zcoord);
			(new WorldGenMinable(Blocks.fireOre.blockID, 12)).generate(world, rand, Xcoord, YcoordSurface3, Zcoord);
			(new WorldGenMinable(Blocks.illuminiteOre.blockID, 11)).generate(world, rand, Xcoord, YcoordSurface4, Zcoord);
			(new WorldGenMinable(Blocks.pureOre.blockID, 10)).generate(world, rand, Xcoord, YcoordSurface4, Zcoord);
			(new WorldGenMinable(Blocks.demoniteOre.blockID, 9)).generate(world, rand, Xcoord, YcoordSurface4, Zcoord);
			(new WorldGenMinableLava(Blocks.Limestone.blockID, 15)).generate(world, rand, Xcoord, 128, Zcoord);
		}
	}

	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
		for (int i = 0; i < 8; i++) {

			int Xcoord = blockX + rand.nextInt(16);
			int YcoordSurface1 = rand.nextInt(56);
			int YcoordSurface2 = rand.nextInt(36);
			int YcoordSurface3 = rand.nextInt(20);
			int YcoordSurface4 = rand.nextInt(15);
			int Zcoord = blockZ + rand.nextInt(16);
			(new WorldGenMinableNether(Blocks.corruptedshadowOre.blockID, 9)).generate(world, rand, Xcoord, 60, Zcoord);//CHAGE RARITY
			(new WorldGenMinableNether(Blocks.corruptedfireOre.blockID, 9)).generate(world, rand, Xcoord, 60, Zcoord);
			(new WorldGenMinableNether(Blocks.corruptedilluminiteOre.blockID, 6)).generate(world, rand, Xcoord, 50, Zcoord);
			(new WorldGenMinableNether(Blocks.corruptedpureOre.blockID, 5)).generate(world, rand, Xcoord, 40, Zcoord);
			(new WorldGenMinableNether(Blocks.corrupteddemoniteOre.blockID, 3)).generate(world, rand, Xcoord, 15, Zcoord);
	}
}
}