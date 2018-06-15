package com.hexopygate.Telgttatium.Biomes.types;

import java.awt.Color;

import com.hexopygate.Telgttatium.Telgttatium;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDesert extends BiomeGenBase{

	@SuppressWarnings("unchecked")
	public BiomeGenDesert(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk =10;
		this.theBiomeDecorator.grassPerChunk=4;
		this.topBlock =  Telgttatium.blockRef.get("Forest_Green_Grass");
		this.fillerBlock = Telgttatium.blockRef.get("Dirt");
        //this.worldGeneratorTrees = new WorldGenTrees();
	}
	
	@Override
	 public int getSkyColorByTemp(float p_76731_1_)
    {        
        return Color.HSBtoRGB(143f, 1f, .5f);
    }
		//this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class,5,3,10));
}
