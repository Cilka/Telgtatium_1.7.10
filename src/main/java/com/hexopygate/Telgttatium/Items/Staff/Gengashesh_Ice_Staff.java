package com.hexopygate.Telgttatium.Items.Staff;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Gengashesh_Ice_Staff extends Item {
	public Gengashesh_Ice_Staff()
	{
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	@Override
	public boolean onEntitySwing(EntityLivingBase livingBase,ItemStack stack)
	{
		
		return false;
	} 
}
