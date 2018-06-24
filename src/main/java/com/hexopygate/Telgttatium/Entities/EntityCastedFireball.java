package com.hexopygate.Telgttatium.Entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityCastedFireball extends EntityFireball {

	public EntityCastedFireball(World p_i1759_1_) {
		super(p_i1759_1_);
		// TODO Auto-generated constructor stub
	}
    @SideOnly(Side.CLIENT)
    public EntityCastedFireball(World p_i1768_1_, double p_i1768_2_, double p_i1768_4_, double p_i1768_6_, double p_i1768_8_, double p_i1768_10_, double p_i1768_12_)
    {
        super(p_i1768_1_, p_i1768_2_, p_i1768_4_, p_i1768_6_, p_i1768_8_, p_i1768_10_, p_i1768_12_);
    }

    public EntityCastedFireball(World p_i1769_1_, EntityLivingBase p_i1769_2_, double p_i1769_3_, double p_i1769_5_, double p_i1769_7_)
    {
        super(p_i1769_1_, p_i1769_2_, p_i1769_3_, p_i1769_5_, p_i1769_7_);
    }
	@Override
	protected void onImpact(MovingObjectPosition p_70227_1_) {
		// TODO Auto-generated method stub
		  if (!this.worldObj.isRemote)
	        {
	            if (p_70227_1_.entityHit != null)
	            {
	                if (!p_70227_1_.entityHit.isImmuneToFire() && p_70227_1_.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 10.0F))
	                {
	                    p_70227_1_.entityHit.setFire(5);
	                }
	            }
	            else
	            {
	                int i = p_70227_1_.blockX;
	                int j = p_70227_1_.blockY;
	                int k = p_70227_1_.blockZ;
	                
	                switch (p_70227_1_.sideHit)
	                {
	                    case 0:
	                        --j;
	                        break;
	                    case 1:
	                        ++j;
	                        break;
	                    case 2:
	                        --k;
	                        break;
	                    case 3:
	                        ++k;
	                        break;
	                    case 4:
	                        --i;
	                        break;
	                    case 5:
	                        ++i;
	                }
	              
	                if (this.worldObj.isAirBlock(i, j, k))
	                {
	                	
	                    //Vec3 dir =  getShootingDirection(this.shootingEntity.getLookVec());
	                	for(int range =0; range < 6; range++ )
	                	{	                      
	                		i += this.shootingEntity.getLookVec().xCoord;
	                		k += this.shootingEntity.getLookVec().zCoord;
	                		this.worldObj.setBlock(i, j, k, Blocks.fire);
	                	}
	                    
	                }
	            }

	            this.setDead();
	        }
	}
	
	private Vec3 getShootingDirection(Vec3 player, Vec3 projectile)
	{
		//Use X,Z plane
		double tan  =(projectile.zCoord - player.zCoord)  /(projectile.xCoord - player.xCoord);
		double direction = Math.atan(tan);
		//Positive X-Axis
		if(direction > .001 && direction< .009)
		{
			return Vec3.createVectorHelper(1, 0, 0);
		}
		//First Quadrant
		else if(direction > 0 && direction < 90)
		{
			return Vec3.createVectorHelper(1, 0, 1);
		}
		//Positive Z-Axis
		else if (direction >89 && direction <91)
		{
			return Vec3.createVectorHelper(0, 0, 1);
		}
		//Second Quadrant
		else if (direction > 90 && direction < 180)
		{
			return Vec3.createVectorHelper(-1, 0, 1);
		}
		//-X-Axis
		else if (direction >179 && direction < 181)
		{
			return Vec3.createVectorHelper(-1, 0, 0);
		}
		//Third quadrant
		else if (direction >180 && direction <270)
		{
			return Vec3.createVectorHelper(-1, 0, -1);
		}
		//-Z-Axis
		else if(direction >269 && direction < 271)
		{
			return Vec3.createVectorHelper(0, 0, -1);
		}
		//Forth Quadrant
		else if (direction >270 && direction <359)
		{
			return Vec3.createVectorHelper(1, 0, -1);
		}
		return Vec3.createVectorHelper(0, 0, 0);
	}
}
