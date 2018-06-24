package com.hexopygate.Telgttatium.ore;

import com.hexopygate.Telgttatium.Telgttatium;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemCoal extends Item {

	
	IIcon icon;
	public ItemCoal()
	{
		super();
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name).setCreativeTab(Telgttatium.tabTelFood);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	public String getUnlocalizedName(ItemStack p_77667_1_)
	    {
	        return "tel:"+this.getClass().getSimpleName();
	    }
}
