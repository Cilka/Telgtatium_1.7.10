package com.hexopygate.Telgttatium.Biomes.types;

import java.awt.Color;
import java.util.Random;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.Biomes.Generators.TreeGenerator;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenForest extends BiomeGenBase{

	@SuppressWarnings("unchecked")
	public BiomeGenForest(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk =10;
		this.theBiomeDecorator.grassPerChunk=4;
		this.topBlock =  Telgttatium.blockRef.get("Forest_Green_Grass");
		this.fillerBlock = Telgttatium.blockRef.get("Green_Dirt");
        //this.worldGeneratorTrees = new WorldGenTrees();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.theBiomeDecorator.cactiPerChunk =0;
		this.flowers.clear();
	}
	
	@Override 
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {

        this.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
	@Override
	public void decorate(World world, Random ran,int x, int z)
	{
		if(ran.nextInt(8) == 0)
			new TreeGenerator(Telgttatium.blockRef.get("Pine_Tree_Wood"),Telgttatium.blockRef.get("Forest_Leaves")).generate(world, ran, x, 58+ ran.nextInt(10), z);
		if(ran.nextInt(30) == 0)
		{
			new TreeGenerator(Telgttatium.blockRef.get("Jungle_Rare_Tree_Wood"),Telgttatium.blockRef.get("Forest_Leaves")).generate(world, ran, x, 58+ ran.nextInt(10), z);
		}
	}
	@Override
	 public int getSkyColorByTemp(float p_76731_1_)
    {        
        return Color.HSBtoRGB(143f, 1f, .5f);
    }
		//this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class,5,3,10));
}
