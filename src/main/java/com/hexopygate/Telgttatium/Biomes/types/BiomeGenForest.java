package com.hexopygate.Telgttatium.Biomes.types;

import java.awt.Color;
import java.util.Random;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirty_Valley_Grass;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class BiomeGenForest extends BiomeGenBase{

	@SuppressWarnings("unchecked")
	public BiomeGenForest(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk =10;
		this.theBiomeDecorator.grassPerChunk=4;
		this.topBlock =  Telgttatium.blockRef.get("Forest_Green_Grass");
		this.fillerBlock = Telgttatium.blockRef.get("Dirt");
        //this.worldGeneratorTrees = new WorldGenTrees();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.theBiomeDecorator.cactiPerChunk =0;
	}
	
	@Override 
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        this.topBlock = Blocks.grass;
        this.field_150604_aj = 0;
        this.fillerBlock = Blocks.dirt;
/*
        if ((p_150573_7_ < -1.0D || p_150573_7_ > 2.0D) && this.field_150638_aH == this.field_150637_aG)
        {
            this.topBlock = Blocks.gravel;
            this.fillerBlock = Blocks.gravel;
        }
        else if (p_150573_7_ > 1.0D && this.field_150638_aH != this.field_150636_aF)
        {
            this.topBlock = Blocks.stone;
            this.fillerBlock = Blocks.stone;
        }
*/
        this.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
	@Override
	public void decorate(World world, Random ran,int x, int z)
	{
		//WorldGenDesertWells world
	}
	@Override
	 public int getSkyColorByTemp(float p_76731_1_)
    {        
        return Color.HSBtoRGB(143f, 1f, .5f);
    }
		//this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class,5,3,10));
}
