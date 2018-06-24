package com.hexopygate.Telgttatium.blockarchtype.Tools;

import com.hexopygate.Telgttatium.Items.ToolMaterials;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickaxeWing extends ItemPickaxe {

	protected int ticks = 0;
	private boolean isActivated;
	protected PickaxeWing(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

	public PickaxeWing()
	{ this(ToolMaterials.WingMaterial);}
	
	public int getFlyDurationInSeconds()
	{
		return 3;
	}

	@Override
	 public void onUpdate(ItemStack stack, World world, Entity entity, int par1, boolean par2) {
	  
		if(isActivated)
		{
			ticks++;
		entity.motionY += .013f;
		}
		
		if(ticks/20 >= getFlyDurationInSeconds())
		{
			isActivated = false;
			ticks =0;
			entity.motionY =0;
		}
		//System.out.println("Motion Y: "+entity.motionY);
		//System.out.println("Ticks = " + ticks);
		//System.out.println("Isactivated : " + isActivated);
		super.onUpdate(stack,world,entity,par1,par2);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
	
		if(player.motionY <=0 &&ticks/20 < getFlyDurationInSeconds() )
		{
			isActivated =  true;
		}
		
		return stack;
	}

}
