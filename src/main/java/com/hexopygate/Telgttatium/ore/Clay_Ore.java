package com.hexopygate.Telgttatium.ore;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.blockarchtype.TelOre;
public  class Clay_Ore extends TelOre {
	@Override
	public boolean isFinalStep()
	{
		return true;
	}
	
	@Override
    public int quantityDropped(Random rand)
    {
		
        return  3 + rand.nextInt(3);
    }
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Telgttatium.itemRef.get("Clay");
        
  
    }
	
}
