package com.hexopygate.Telgttatium.blockarchtype;

import java.util.Random;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Athemyst_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Cyan_Stone_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Emerald_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.Items.Pickaxe.Srindintaria_Ruby_Upgrade_Pickaxe;
import com.hexopygate.Telgttatium.blockarchtype.Tools.PickaxeSrindintaria;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class TelOre extends BlockOre {
	private String name;
	private int quantity;
	protected boolean RubyBoost;
	protected boolean CyanBoost;
	protected boolean EmeraldBoost;
	protected boolean AmythistBoost;

	public TelOre() {
		super();
		name = this.getClass().getSimpleName();
		this.setBlockName(name).setBlockTextureName("tel:" + name);
		this.setHardness(3);
		this.setResistance(100);
		this.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}

	public boolean UsedSrindintariaPickaxe(Item pickaxe) {
		return pickaxe != null && pickaxe instanceof PickaxeSrindintaria;
	}

	public String getName() {
		return name;
	}

	public boolean isFinalStep() {
		return this.getUnlocalizedName().contains("Final_Step");
	}

	@Override
	public int quantityDropped(Random rand) {
		quantity = 1;
		return quantity;
	}

	@Override
	public int quantityDroppedWithBonus(int amount, Random rand) {

		quantity = RubyBoost?  4 :  EmeraldBoost ? 3 : AmythistBoost ? 6+  rand.nextInt(2) : CyanBoost ? 2 + rand.nextInt(7) : 1;
		return quantity;
	}

	protected void NullBoost()
	{
		RubyBoost = false;
		EmeraldBoost = false; 
		CyanBoost = false;
		AmythistBoost= false;
	}
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof  PickaxeSrindintaria) {
			PickaxeSrindintaria pickaxe = (PickaxeSrindintaria) player.getCurrentEquippedItem().getItem();
			if (pickaxe != null) {
				if (pickaxe instanceof Srindintaria_Ruby_Upgrade_Pickaxe) {
					NullBoost();

						RubyBoost = true;
					 
						
					

				} else if (pickaxe instanceof Srindintaria_Emerald_Upgrade_Pickaxe) {
					

						NullBoost();
						EmeraldBoost = true;

					
				} else if (pickaxe instanceof Srindintaria_Cyan_Stone_Upgrade_Pickaxe) {
					
						NullBoost();
						CyanBoost = true;

					
				} else if (pickaxe instanceof Srindintaria_Athemyst_Upgrade_Pickaxe) {
					NullBoost();
					AmythistBoost =true;
				}
				return;
			}
		

		}
		NullBoost();
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		if (!isFinalStep()) {
			world.setBlock(x, y, z, Telgttatium.blockRef.get(getName() + "_Final_Step"));
		} else {
			System.out.println("Number of " + getName() + " given: " + quantity);
		}
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return isFinalStep() ? super.getItemDropped(p_149650_1_, p_149650_2_, p_149650_3_) : null;
	}
}
