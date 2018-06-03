package com.hexopygate.Telgttatium.blockarchtype;

import com.hexopygate.Telgttatium.Telgttatium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class TelFood extends ItemFood {

	public TelFood(int hungerRestored, boolean wolfsFavFood) {
		super(hungerRestored, wolfsFavFood);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name).setCreativeTab(Telgttatium.tabTelFood);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}
