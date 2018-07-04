package com.hexopygate.Telgttatium.Items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterials {
	//l(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
	public static Item.ToolMaterial SrindintariaMaterial = EnumHelper.addToolMaterial("SrindintariaToolMaterial", 3, 650, 10, 10, 5);
	public static Item.ToolMaterial WingMaterial = EnumHelper.addToolMaterial("WingToolMaterial", 3, 750,8, 7, 3);
	public static Item.ToolMaterial KifavaraMaterial = EnumHelper.addToolMaterial("KifavaraToolMaterial", 3, 650, 10, 10, 5);
	public static Item.ToolMaterial ErlashihuruMaterial = EnumHelper.addToolMaterial("ErlashihuruToolMaterial", 3, 2000, 15, 12, 10);

}
