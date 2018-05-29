package com.hexopygate.Telgttatium.Biomes.types;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiome;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class WorldTypeTelgttatium extends WorldType {

	public WorldTypeTelgttatium(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	   public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer)
	    {
	        GenLayer ret = new TelGenLayerBiome(200L, parentLayer, this);
	        ret = GenLayerZoom.magnify(1000L, ret, 2);
	        ret = new GenLayerBiomeEdge(1000L, ret);
	        return ret;
	    }
}
