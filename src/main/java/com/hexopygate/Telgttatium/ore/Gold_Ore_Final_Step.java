package com.hexopygate.Telgttatium.ore;

import java.util.Random;
import com.hexopygate.Telgttatium.Telgttatium;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.hexopygate.Telgttatium.blockarchtype.TelOre;
import com.hexopygate.Telgttatium.blockarchtype.Tools.PickaxeSrindintaria;
public class Gold_Ore_Final_Step extends TelOre {

	@Override
    public int quantityDroppedWithBonus(int amount, Random rand)
    {
		
		return  EmeraldBoost ? 4 : 1;
    }
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
	
		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof PickaxeSrindintaria)
			EmeraldBoost =  true;
			else
			NullBoost();
	}

}
