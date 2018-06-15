package com.hexopygate.Telgttatium.Biomes;

import java.util.HashMap;

import com.hexopygate.Telgttatium.Biomes.types.BiomeGenValley;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
public class BiomeRegistry {

	private static Integer ID =100;
	public static void MainClass()
	{
		initialzeBiome();
		registerBiome();
	}
	public static void initialzeBiome()
	{
		biomelist.put(ID, new BiomeGenValley(ID++).setBiomeName("Valley"));
	}
	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(biomelist.get(100), Type.SPARSE);
		BiomeManager.addSpawnBiome(biomelist.get(100));
	}
	
	public static HashMap<Integer,BiomeGenBase> biomelist;
}
