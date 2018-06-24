package com.hexopygate.Telgttatium.Items.Staff;

import com.hexopygate.Telgttatium.Entities.EntityCastedFireball;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Gengashesh_Fire_Staff extends Item {

	public Gengashesh_Fire_Staff()
	{
		 String name = this.getClass().getSimpleName();			
		 this.setUnlocalizedName(name).setTextureName("tel:"+name);
		 GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	@Override
	public boolean onEntitySwing(EntityLivingBase livingBase,ItemStack stack)
	{
		EntityPlayer player =  (EntityPlayer)livingBase;
		Vec3 look = player.getLookVec();
		EntityCastedFireball fireball = new EntityCastedFireball(player.getEntityWorld(), player, 1, 1, 1);
		fireball.setPosition(player.posX + look.xCoord * 5, player.posY + look.yCoord * 5, player.posZ + look.zCoord * 5);
		fireball.accelerationX = look.xCoord * 0.5;
		fireball.accelerationY = look.yCoord * 0.5;
		fireball.accelerationZ = look.zCoord * 0.5;
		player.worldObj.spawnEntityInWorld(fireball);
		return false;
	}
}
