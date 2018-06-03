package com.hexopygate.Telgttatium.proxy;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.Items.GenericBlockItemRenderer;
import com.hexopygate.Telgttatium.TileEntities.TEFence;
import com.hexopygate.Telgttatium.models.RenderBambooFence;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
int ModEntityID;

@Override
public void registerRendering(){
	ClientRegistry.bindTileEntitySpecialRenderer(TEFence.class, new RenderBambooFence());
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

}
public void registerEntities() {
	
}
}
