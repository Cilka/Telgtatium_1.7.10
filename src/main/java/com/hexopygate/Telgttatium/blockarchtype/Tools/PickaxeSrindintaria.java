package com.hexopygate.Telgttatium.blockarchtype.Tools;

import com.hexopygate.Telgttatium.Items.ToolMaterials;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickaxeSrindintaria extends ItemPickaxe {

	protected PickaxeSrindintaria(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	public PickaxeSrindintaria() {
		this(ToolMaterials.SrindintariaMaterial);
	}

}
