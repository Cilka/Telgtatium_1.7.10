package com.hexopygate.Telgttatium.blockarchtype.Tools;

import com.hexopygate.Telgttatium.Items.ToolMaterials;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Athemyst_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Cyan_Stone_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Emerald_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Ruby_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.blockarchtype.TelOre;
import com.hexopygate.Telgttatium.ore.Diamon_Ore_Final_Step;
import com.hexopygate.Telgttatium.ore.Gold_Ore_Final_Step;
import com.hexopygate.Telgttatium.ore.Iron_Ore_Final_Step;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
