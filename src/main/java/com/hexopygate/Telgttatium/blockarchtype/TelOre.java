package com.hexopygate.Telgttatium.blockarchtype;

import java.util.Random;

import com.hexopygate.Telgttatium.Telgttatium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockOre;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class TelOre extends BlockOre {
	private String name ;
	public TelOre()
	{
		 super();
		 name = this.getClass().getSimpleName();			
		 this.setBlockName(name).setBlockTextureName("tel:"+name);		 
		 GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isFinalStep()
	{
		return this.getUnlocalizedName().contains("Final_Step");
	}
	@Override
    public int quantityDropped(Random rand)
    {
        return 3 + rand.nextInt(3);
    }
	@Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
    	if(!isFinalStep()) {
    		world.setBlock(x, y, z, Telgttatium.blockRef.get(getName() + "_Final_Step"));
    	}
    }

	@Override
	 public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return isFinalStep() ? super.getItemDropped(p_149650_1_, p_149650_2_, p_149650_3_) : null;
	    }
}
