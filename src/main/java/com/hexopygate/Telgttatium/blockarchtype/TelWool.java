package com.hexopygate.Telgttatium.blockarchtype;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class TelWool extends Block{
 public TelWool(Material wool) {
	 super(wool);	 
	 //System.out.println(this.getClass().getName());
	 String name = this.getClass().getSimpleName();
	
	 this.setBlockName(name).setBlockTextureName("tel:"+name);
	 
	    GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));

 }
public TelWool() {
	this(Material.cloth);
}

}
