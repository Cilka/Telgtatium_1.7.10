package com.hexopygate.Telgttatium.buildingblocks.lujillkanses;

import com.hexopygate.Telgttatium.Telgttatium;
import com.hexopygate.Telgttatium.TileEntities.TEKunkasieSummonRune;
import com.hexopygate.Telgttatium.blockarchtype.TelStone;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Kunkasie_Summon_Rune extends BlockContainer {

	private IIcon[] icons = new IIcon[16];

	public Kunkasie_Summon_Rune() {
		super(Material.rock);
		setBlockName(Telgttatium.ModId + "_" + this.getClass().getSimpleName());
		setHardness(2f);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(this, this.getClass().getSimpleName());
		GameRegistry.registerTileEntity(TEKunkasieSummonRune.class, "TEKunkasieSummonRune");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			icons[i] = reg.registerIcon("tel:" + this.getClass().getSimpleName() + "_" + i);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}

	@Override
	public TileEntity createNewTileEntity(World world, int num) {
		return new TEKunkasieSummonRune();
	}



}