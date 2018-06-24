package com.hexopygate.Telgttatium.ore;

import java.util.Random;
import com.hexopygate.Telgttatium.Telgttatium;
import net.minecraft.item.Item;
import com.hexopygate.Telgttatium.blockarchtype.TelOre;
public class Emerald_Ore_Final_Step extends TelOre {

	
	
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Telgttatium.itemRef.get("Emerald");
    }
}
