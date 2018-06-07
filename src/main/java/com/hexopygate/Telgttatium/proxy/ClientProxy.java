package com.hexopygate.Telgttatium.proxy;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.Items.GenericBlockItemRenderer;
import com.hexopygate.Telgttatium.TileEntities.*;
import com.hexopygate.Telgttatium.models.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
int ModEntityID;

@Override
public void registerRendering(){
	ClientRegistry.bindTileEntitySpecialRenderer(TEFence.class, new RenderBambooFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEDecoFence.class, new RenderDecoFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEHutyveFence.class, new RenderHutyveFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TESindrintariaFence.class, new RenderSindrintariaFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEWoodFence.class, new RenderWoodenFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEWoodType2Fence.class, new RenderWoodenType2Fence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEWoodFlowerFence.class, new RenderWoodenFlowerFence());
	ClientRegistry.bindTileEntitySpecialRenderer(TEWoodVineFence.class, new RenderWoodenVineFence());
	
	registerItemRenderers();
}
public void registerItemRenderers() {
	MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Bamboo_fence")), 
			new GenericBlockItemRenderer(new TEFence(Telgttatium.blockRef.get("Bamboo_fence").getClass().getSimpleName(),1), new RenderBambooFence()));
	MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Bamboo_fence_Green")), 
			new GenericBlockItemRenderer(new TEFence(Telgttatium.blockRef.get("Bamboo_fence_Green").getClass().getSimpleName(),1), new RenderBambooFence()));
MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Black_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("Black_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Gold_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("Gold_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Iron_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("Iron_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("TDive_Green_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("TDive_Green_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Turquoise_plaza_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("Turquoise_plaza_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Valley_Romance_Deco_Fence")), 
			new GenericBlockItemRenderer(new TEDecoFence(Telgttatium.blockRef.get("Valley_Romance_Deco_Fence").getClass().getSimpleName(),1), new RenderDecoFence()));


MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Blue_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Blue_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Cyan_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Cyan_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Dark_Blue_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Dark_Blue_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Green_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Green_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Magenta_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Magenta_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Orange_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Orange_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Pink_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Pink_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Purple_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Purple_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Red_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Red_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Hutyve_Yellow_Glass_fence")), 
			new GenericBlockItemRenderer(new TEHutyveFence(Telgttatium.blockRef.get("Hutyve_Yellow_Glass_fence").getClass().getSimpleName(),1), new RenderHutyveFence()));



MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Sindrintaria_Diamon_gem_fence")), 
			new GenericBlockItemRenderer(new TESindrintariaFence(Telgttatium.blockRef.get("Sindrintaria_Diamon_gem_fence").getClass().getSimpleName(),1), new RenderSindrintariaFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Sindrintaria_Athemyst_gem_fence")), 
			new GenericBlockItemRenderer(new TESindrintariaFence(Telgttatium.blockRef.get("Sindrintaria_Athemyst_gem_fence").getClass().getSimpleName(),1), new RenderSindrintariaFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Sindrintaria_Emerald_gem_fence")), 
			new GenericBlockItemRenderer(new TESindrintariaFence(Telgttatium.blockRef.get("Sindrintaria_Emerald_gem_fence").getClass().getSimpleName(),1), new RenderSindrintariaFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Sindrintaria_Orange_gem_fence")), 
			new GenericBlockItemRenderer(new TESindrintariaFence(Telgttatium.blockRef.get("Sindrintaria_Orange_gem_fence").getClass().getSimpleName(),1), new RenderSindrintariaFence()));


MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Sindrintaria_Saphirre_gem_fence")), 
			new GenericBlockItemRenderer(new TESindrintariaFence(Telgttatium.blockRef.get("Sindrintaria_Saphirre_gem_fence").getClass().getSimpleName(),1), new RenderSindrintariaFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Birch_wood")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Birch_wood").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Black_wood")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Black_wood").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Dark_Oak_wood")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Dark_Oak_wood").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Green")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Green").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Orange_wood")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Orange_wood").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Red")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Red").getClass().getSimpleName(),1), new RenderWoodenFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_planks_Yevollo")), 
			new GenericBlockItemRenderer(new TEWoodFence(Telgttatium.blockRef.get("Wood_fence_planks_Yevollo").getClass().getSimpleName(),1), new RenderWoodenFence()));


MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Coral")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Coral").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Dark_blue")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Dark_blue").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Blue")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Blue").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Coral")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Coral").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Lime_Green")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Lime_Green").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pastel_Orange")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pastel_Orange").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pastel_Yellow")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pastel_Yellow").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pink")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Pink").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Purple")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Doula_Purple").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_LimeGreen")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_LimeGreen").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Purple")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_Purple").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_white")), 
			new GenericBlockItemRenderer(new TEWoodType2Fence(Telgttatium.blockRef.get("Wood_fence_type_2_white").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));


MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Blue")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Blue").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Dark_Blue")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Dark_Blue").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Orange")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Orange").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Purple")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Purple").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Red")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Red").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Rose")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Rose").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Soft_Yellow")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Soft_Yellow").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Sweet_Green")), 
			new GenericBlockItemRenderer(new TEWoodFlowerFence(Telgttatium.blockRef.get("Wood_fence_type_2_Floral_Sweet_Green").getClass().getSimpleName(),1), new RenderWoodenFlowerFence()));


MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Carpentry_Yellow")), 
			new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_Carpentry_Yellow").getClass().getSimpleName(),1), new RenderWoodenVineFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_old")), 
			new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_old").getClass().getSimpleName(),1), new RenderWoodenVineFence()));

MinecraftForgeClient.registerItemRenderer(
			Item.getItemFromBlock(
					Telgttatium.blockRef.get("Wood_fence_type_2_Vines")), 
			new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_Vines").getClass().getSimpleName(),1), new RenderWoodenVineFence()));

MinecraftForgeClient.registerItemRenderer(
		Item.getItemFromBlock(
				Telgttatium.blockRef.get("Wood_fence_type_2_Vines_Solea")), 
		new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_Vines_Solea").getClass().getSimpleName(),1), new RenderWoodenVineFence()));
MinecraftForgeClient.registerItemRenderer(
		Item.getItemFromBlock(
				Telgttatium.blockRef.get("Wood_fence_type_2_Vines_white")), 
		new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_Vines_white").getClass().getSimpleName(),1), new RenderWoodenVineFence()));

MinecraftForgeClient.registerItemRenderer(
		Item.getItemFromBlock(
				Telgttatium.blockRef.get("Wood_fence_type_2_Solea")), 
		new GenericBlockItemRenderer(new TEWoodVineFence(Telgttatium.blockRef.get("Wood_fence_type_2_Solea").getClass().getSimpleName(),1), new RenderWoodenType2Fence()));


}
public void registerEntities() {
	
}
}
