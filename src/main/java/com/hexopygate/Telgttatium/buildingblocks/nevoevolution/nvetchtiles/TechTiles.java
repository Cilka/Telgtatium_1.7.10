package com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles;

import com.hexopygate.Telgttatium.blockarchtype.TelStone;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TechTiles extends TelStone {
	protected IIcon[] icons = new IIcon[6];
	
	
	
	   @Override
	    public void registerBlockIcons(IIconRegister reg)
	    {
		  String name = this.getClass().getSimpleName();
		  String [] nameSplit =  name.split("_");
		  String color = nameSplit[3];
		
	      icons[0] = reg.registerIcon("tel:NvE_Tch_Tile_Top_"+color);
	      icons[1]= reg.registerIcon("tel:NvE_Tch_Tile_Top_"+color);
	      icons[2]=reg.registerIcon("tel:NvE_Tch_Tile_side_"+color);
	      icons[3]=reg.registerIcon("tel:NvE_Tch_Tile_side_"+color);
	      icons[4]=reg.registerIcon("tel:NvE_Tch_Tile_side_"+color);
	      icons[5]=reg.registerIcon("tel:NvE_Tch_Tile_side_"+color);
	    }
	   @Override
	    public IIcon getIcon(int side, int meta)
	    {
	        return icons[side];
	    }
}
