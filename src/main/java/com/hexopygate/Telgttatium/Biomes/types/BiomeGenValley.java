package com.hexopygate.Telgttatium.Biomes.types;

import com.hexopygate.Telgttatium.Telgttatium;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenValley extends BiomeGenBase{

	@SuppressWarnings("unchecked")
	public BiomeGenValley(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk =1;
		this.theBiomeDecorator.grassPerChunk=7;
		this.topBlock =  Telgttatium.blockRef.get("desvalGrass");
		this.fillerBlock = Telgttatium.blockRef.get("Dirt");
		//this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class,5,3,10));
       
	}
}
