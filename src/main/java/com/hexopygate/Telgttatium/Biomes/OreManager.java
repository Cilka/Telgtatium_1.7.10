package com.hexopygate.Telgttatium.Biomes;


import java.util.Random;

import com.hexopygate.Telgttatium.Telgttatium;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
 
public class OreManager implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 137:
			generateTelgttatium(world, random, chunkX*16, chunkZ * 16);
		case 13:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}
 
	private void generateEnd(World world, Random random, int x, int z)
	{
 
	}
 
	private void generateSurface(World world, Random random, int x, int z)
	{
		this.addOreSpawn(Telgttatium.blockRef.get("Athemyst_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 2 + random.nextInt(1), 5, 30, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Copper_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 4 + random.nextInt(3), 30, 30, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Darto_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 2 + random.nextInt(1), 5, 30, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Diamon_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 2 + random.nextInt(2), 14, 15, 35);
		this.addOreSpawn(Telgttatium.blockRef.get("Diamon_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(1), 8, 80, 110);
		this.addOreSpawn(Telgttatium.blockRef.get("Emerald_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(1), 10, 15, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Gold_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(3), 20, 15, 35);
		this.addOreSpawn(Telgttatium.blockRef.get("Iron_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 2 + random.nextInt(3), 25, 15, 50);
		//addOreSpawn(Block block, World world ,Block target, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
		this.addOreSpawn(Telgttatium.blockRef.get("Pink_Sparkle_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(2), 3, 80, 120);
		this.addOreSpawn(Telgttatium.blockRef.get("Pink_Sparkle_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(2), 15, 45, 58);
		this.addOreSpawn(Telgttatium.blockRef.get("Ruby_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(3), 10, 30, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Saphirre_Ore"), world,Blocks.stone ,random, x, z, 16, 16, 1 + random.nextInt(4), 10, 15, 50);
		this.addOreSpawn(Telgttatium.blockRef.get("Clay_Ore"), world,Blocks.clay ,random, x, z, 16, 16, 2 + random.nextInt(3), 50, 30, 80);
		//this.addOreSpawn(Telgttatium.blockRef.get("Coal_Ore"), world,Blocks.coal_ore ,random, x, z, 16, 16, 4 + random.nextInt(3), 100, 10, 150);
		
	}
 
	private void generateNether(World world, Random random, int x, int z)
	{
		int Xcoord = x + random.nextInt(16);
	    int Ycoord = 10 + random.nextInt(128);
	    int Zcoord = z + random.nextInt(16);
	  //  (new WorldGenMinable(Tutorial.tutorialBlock, 1, 15, Blocks.netherrack)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}
	
	private void generateTelgttatium(World world, Random random, int x, int z)
	{
		
	}
	/**
	 * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
	 * 
	 * @param The Block to spawn
	 * @param The World to spawn in
	 * @param A Random object for retrieving random positions within the world to spawn the Block
	 * @param An int for passing the X-Coordinate for the Generation method
	 * @param An int for passing the Z-Coordinate for the Generation method
	 * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
	 * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
	 * @param An int for setting the maximum size of a vein
	 * @param An int for the Number of chances available for the Block to spawn per-chunk
	 * @param An int for the minimum Y-Coordinate height at which this block may spawn
	 * @param An int for the maximum Y-Coordinate height at which this block may spawn
	 **/
	public void addOreSpawn(Block block, World world ,Block target, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
 
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize,target)).generate(world, random, posX, posY, posZ);
		}
	}
	
}