package com.hexopygate.Telgttatium.Dimension;

import com.hexopygate.Telgttatium.Biomes.TelWorldProvider;

import net.minecraftforge.common.DimensionManager;

public class Dimension {
	public static void registerDimensions(){
		DimensionManager.registerDimension(DimensionIDs.HEPOXYSTELGTTATIUM, DimensionIDs.HEPOXYSTELGTTATIUM);
	}
	
	/**
	 * Regster dimension world providers with the dimension manager.
	 */
	public static void registerWorldProvider(){
		DimensionManager.registerProviderType(DimensionIDs.HEPOXYSTELGTTATIUM, TelWorldProvider.class, true);
	}
}
