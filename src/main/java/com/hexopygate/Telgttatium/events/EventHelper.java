package com.hexopygate.Telgttatium.events;

import com.hexopygate.Telgttatium.blockarchtype.Tools.PickaxeSrindintaria;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class EventHelper {

	/** Used to make the sapling grow the tree **/
	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event) {
	
		/*if(event.world.getBlock(event.x, event.y, event.z) == Blockss.lightSapling) {
			((BlockModLightSapling)Blockss.lightSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}*/
	}

/*
	@SubscribeEvent
	public void wingPickaxeUsed(PlayerInteractEvent event) {
		if(PlayerInteractEvent.Action.RIGHT_CLICK_AIR == event.action || PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK== event.action) {
			ItemStack stack =  event.entityPlayer.getCurrentEquippedItem() ;
			if(stack != null && stack.getItem() instanceof PickaxeWing) {
				PickaxeWing axe =  (PickaxeWing)stack.getItem();
				event.entityPlayer.motionY += .3;

			}
		}
	}*/
	/**
	 * Register this event helper
	 */
	public static void registerEvents() {
		 MinecraftForge.EVENT_BUS.register(new EventHelper());
	}
}
