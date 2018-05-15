package com.hexopygate.Telgttatium;

import java.util.HashMap;

import com.hexopygate.Telgttatium.buildingblocks.bricks.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.framesborders.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglasspanes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglasssideframes.*;
import com.hexopygate.Telgttatium.buildingblocks.natrualblocks.*;
import com.hexopygate.Telgttatium.buildingblocks.natrualblocks.Dirt.*;
import com.hexopygate.Telgttatium.buildingblocks.natrualblocks.TreeLeaves.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.*;
import com.hexopygate.Telgttatium.Biomes.Volcano.*;
import com.hexopygate.Telgttatium.Biomes.Winter.*;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.*;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.*;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.*;
import com.hexopygate.Telgttatium.buildingblocks.Empire.*;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="tel", name="Telgttatium", version = "1.0")
public class Telgttatium {
//public static Item itemTable;
	public static String ModId = "tel";
	public static String Name = "Telgttatium";
	public static String Version = "1.0";
	
	public static HashMap<String,Block> blockRef =  new HashMap<String,Block>();
	
@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//config handling
		//itemTable =  new ItemTable().setUnlocalizedName("ItemTable").setTextureName("tel:itemTable").setCreativeTab(tabTelgttatium);
	blockRef.put("celticWoolAW",new CelticWoolAnotherWorld().setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolBlue",new CelticWoolBlue().setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolCream",new CelticWoolCream(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolGold",new CelticWoolGold(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolGrey",new CelticWoolGrey(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolGreen",new CelticWoolGreen(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolLightBlue",new CelticWoolLightBlue(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolMagenta",new CelticWoolMagenta(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolpurple",new CelticWoolPurple(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolPurpleAW",new CelticWoolPurpleAnotherWorld(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolRed",new CelticWoolRed(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolWhite",new CelticWoolWhite(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("celticWoolYellow",new CelticWoolYellow(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("coolMountainSportRed",new CoolMountainSportRed(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicDiamond",new DynamicDiamond(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicWarmMountain",new DynamicWarmMountain(Material.cloth).setBlockName("DynamicWarmMountainWool").setBlockTextureName("tel:Dynamic Warm Mountain").setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicWarmMountainYellow",new DynamicWarmMountainYellowWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondBlue",new ElegantDiamondBlueWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondDeepBlue",new ElegantDiamondDeepBlueWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondGreen",new ElegantDiamondGreenWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondOrange",new ElegantDiamondOrangeWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondPink",new ElegantDiamondPinkWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondPurple",new ElegantDiamondPurpleWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondRed",new ElegantDiamondRedWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondWhite",new ElegantDiamondWhiteWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondYellow",new ElegantDiamondYellowWool(Material.cloth).setBlockName("ElegantDiamondYellowWool").setBlockTextureName("tel:Elegant Diamond Yellow Wool").setCreativeTab(tabTelgttatium));
	blockRef.put("empireMedievalCarpetGreen",new EmpireMedievalCarpetGreen(Material.carpet).setCreativeTab(tabTelgttatium));
	blockRef.put("empireMedievalCarpetRed",new EmpireMedievalCarpetRed(Material.carpet).setCreativeTab(tabTelgttatium));
	blockRef.put("empireMedievalCarpetBlue",new EmpireMedievalCarpetBlue(Material.carpet).setCreativeTab(tabTelgttatium));
	blockRef.put("exoBlue", new ExoBlueWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("exoCyan", new ExoCyanWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("exoOrange", new ExoOrangeWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("exoPink", new ExoPinkWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("exoPurple", new ExoPurpleWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("luminariaBlue", new LuminariaBlue(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("luminariaCream", new LuminariaCream(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("luminariaGreen", new LuminariaGreen(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("luminariaPink", new LuminariaPink(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("luminariaPurple", new LuminariaPurple(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("medievalLeaWallWool", new MedievalLeaWallWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("warmerMountain", new WarmerMountainWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("winterMountainBlue", new WinterMountainBlueWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("winterMountainRed", new WinterMountainRedWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("ashashGrass",new Ashed_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("ashredGrass",new Ashed_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("bluashGrass",new Blue_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("blupurGrass",new Blue_Purple_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("bluredGrass",new Blue_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("darredGrass",new Dark_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("darashGrass",new Dark_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("desashGrass",new Desert_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("desgraGrass",new Desert_Grass_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("desredGrass",new Desert_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("desvalGrass",new Desert_Valley_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("dirgraGrass",new Dirty_Grass_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("dirredGrass",new Dirty_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("dirvalGlass",new Dirty_Valley_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("greashGrass",new Green_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("greredGrass",new Green_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("pinashGrass",new Pink_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("pincyaGrass",new Pink_Cyan_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("pinredGrass",new Pink_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("purredGrass",new Purple_Red_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("stone",new Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("underwaterStone",new Underwater_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("undergroundStone",new Underground_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("desertStone",new Desert_Sand_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("mossStone",new Mossy_Green_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("altBrick",new Alternative_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("blackBrick",new Black_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("blueBrick",new Blue_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("decSandstoneBrick",new Decorative_Sandstone_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("greenBrick",new Green_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("mossyStoneBrick",new Mossy_Stone_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("redBrick",new Red_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("sandstoneBrick",new Sandstone_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("snowBrick",new Snow_Brick().setCreativeTab(tabTelgttatium));
	blockRef.put("stoneBrick",new Stone_Brick().setCreativeTab(tabTelgttatium));
	
	blockRef.put("Abandoned_Hospital_Floor",new Abandoned_Hospital_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Butcher_Kitchen_Floor",new Butcher_Kitchen_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Happy_Morning_Floor",new Happy_Morning_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Hospital_Floor",new Hospital_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Lea_Decorative_Wall_Black_Blue",new Lea_Decorative_Wall_Black_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Lea_Decorative_Wall",new Lea_Decorative_Wall().setCreativeTab(tabTelgttatium));
	blockRef.put("Lea_Decorative_Wall_Black_Magenta",new Lea_Decorative_Wall_Black_Magenta().setCreativeTab(tabTelgttatium));
	blockRef.put("Lea_Decorative_Wall_Black_Orange",new Lea_Decorative_Wall_Black_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("Lea_Decorative_Wall_Red",new Lea_Decorative_Wall_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Medieval_Leadu_Wall",new Medieval_Leadu_Wall().setCreativeTab(tabTelgttatium));
	blockRef.put("Morning_Kitchen_Floor",new Morning_Kitchen_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Playing_Purple_Floor",new Playing_Purple_Floor().setCreativeTab(tabTelgttatium));
	blockRef.put("Taitud_Vintage_Ceramic_Blue",new Taitud_Vintage_Ceramic_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Taitud_Vintage_Ceramic_Red",new Taitud_Vintage_Ceramic_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Taitud_Vintage_Ceramic_Yellow",new Taitud_Vintage_Ceramic_Yellow().setCreativeTab(tabTelgttatium));
	blockRef.put("Toxinology_Floor",new Toxinology_Floor().setCreativeTab(tabTelgttatium));
	
	blockRef.put("Big_Black_Block_Blue",new Big_Black_Block_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Cyan",new Big_Black_Block_Cyan().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Green",new Big_Black_Block_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Magenta",new Big_Black_Block_Magenta().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Orange",new Big_Black_Block_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Pink",new Big_Black_Block_Pink().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Purple",new Big_Black_Block_Purple().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Red",new Big_Black_Block_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_White",new Big_Black_Block_White().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_Black_Block_Yellow",new Big_Black_Block_Yellow().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Blue",new Big_White_Block_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Cyan",new Big_White_Block_Cyan().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Green",new Big_White_Block_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Magenta",new Big_White_Block_Magenta().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Orange",new Big_White_Block_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Pastel_Blue",new Big_White_Block_Pastel_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Pastel_Green",new Big_White_Block_Pastel_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Pastel_Red",new Big_White_Block_Pastel_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Pastel_Yellow",new Big_White_Block_Pastel_Yellow().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Pink",new Big_White_Block_Pink().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Purple",new Big_White_Block_Purple().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Red",new Big_White_Block_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Big_White_Block_Yellow",new Big_White_Block_Yellow().setCreativeTab(tabTelgttatium));
	
	blockRef.put("Black_Block_Blue",new Black_Block_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Cyan",new Black_Block_Cyan().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Green",new Black_Block_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Magenta",new Black_Block_Magenta().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Orange",new Black_Block_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Pink",new Black_Block_Pink().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Purple",new Black_Block_Purple().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Red",new Black_Block_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_White",new Black_Block_White().setCreativeTab(tabTelgttatium));
	blockRef.put("Black_Block_Yellow",new Black_Block_Yellow().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Pastel_Green",new White_Block_Pastel_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Blue",new White_Block_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Cyan",new White_Block_Cyan().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Green",new White_Block_Green().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Magenta",new White_Block_Magenta().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Orange",new White_Block_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Pastel_Blue",new White_Block_Pastel_Blue().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Pastel_Red",new White_Block_Pastel_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Pastel_Yellow",new White_Block_Pastel_Yellow().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Pink",new White_Block_Pink().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Purple",new White_Block_Purple().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Red",new White_Block_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("White_Block_Yellow",new White_Block_Yellow().setCreativeTab(tabTelgttatium));
	
	blockRef.put("Ashed_Dirt",new Ashed_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Blue_Dirt",new Blue_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Dark_Dirt",new Dark_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Desert_Dirt",new Desert_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Dirt",new Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Green_Dirt",new Green_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Pink_Dirt",new Pink_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Purple_Dirt",new Purple_Dirt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Mud",new Mud().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Dark_Mud",new Dark_Mud().setCreativeTab(tabNatrualBlocks));
	
	blockRef.put("Autumn_Leaves",new Autumn_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Birch_Leaves",new Birch_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Blue_Leaves",new Blue_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Forest_Leaves",new Forest_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Leaves",new Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Purple_Leaves",new Purple_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Red_Leaves",new Red_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snow_Leaves",new Snow_Leaves().setCreativeTab(tabNatrualBlocks));
	blockRef.put("White_Leaves",new White_Leaves().setCreativeTab(tabNatrualBlocks));

	blockRef.put("Empire_Gray",new Empire_Gray().setCreativeTab(tabTelgttatium));
	blockRef.put("Empire_Orange",new Empire_Orange().setCreativeTab(tabTelgttatium));
	blockRef.put("Empire_Red",new Empire_Red().setCreativeTab(tabTelgttatium));
	blockRef.put("Empire_Yellow",new Empire_Yellow().setCreativeTab(tabTelgttatium));

	blockRef.put("Ice_Floor",new Ice_Floor().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Ice",new Ice().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Hardened_Ice",new Hardened_Ice().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Ashed_Grass",new Snowcapped_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Cyan_Grass",new Snowcapped_Cyan_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Dark_Grass",new Snowcapped_Dark_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Blue_Grass",new Snowcapped_Blue_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Grass_Grass",new Snowcapped_Grass_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Green_Grass",new Snowcapped_Green_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Pink_Grass",new Snowcapped_Pink_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Purple_Grass",new Snowcapped_Purple_Grass().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Snowcapped_Valley_Grass",new Snowcapped_Valley_Grass().setCreativeTab(tabNatrualBlocks));

	blockRef.put("Lava",new Lava().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Lava_Rock",new Lava_Rock().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Magma_Rock",new Magma_Rock().setCreativeTab(tabNatrualBlocks));

	blockRef.put("Bionic_Flower_Floor_Aqua",new Bionic_Flower_Floor_Aqua().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_Blue",new Bionic_Flower_Floor_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_Green",new Bionic_Flower_Floor_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_Orange",new Bionic_Flower_Floor_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_Purple",new Bionic_Flower_Floor_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_Sun",new Bionic_Flower_Floor_Sun().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Flower_Floor_White",new Bionic_Flower_Floor_White().setCreativeTab(tabNevoEvolution));
	
	blockRef.put("Galactic_Leaves_Floor_Cyan",new Galactic_Leaves_Floor_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Purple",new Galactic_Leaves_Floor_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Blue",new Galactic_Leaves_Floor_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Green",new Galactic_Leaves_Floor_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Orange",new Galactic_Leaves_Floor_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Original",new Galactic_Leaves_Floor_Original().setCreativeTab(tabNevoEvolution));
	blockRef.put("Galactic_Leaves_Floor_Red",new Galactic_Leaves_Floor_Red().setCreativeTab(tabNevoEvolution));
	
	blockRef.put("Machine_Arrow_Blue",new Machine_Arrow_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Cyan",new Machine_Arrow_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Green",new Machine_Arrow_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Magenta",new Machine_Arrow_Magenta().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Orange",new Machine_Arrow_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Purple",new Machine_Arrow_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Red",new Machine_Arrow_Red().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_White",new Machine_Arrow_White().setCreativeTab(tabNevoEvolution));
	blockRef.put("Machine_Arrow_Yellow",new Machine_Arrow_Yellow().setCreativeTab(tabNevoEvolution));
	blockRef.put("NVE_Dark_Green",new NVE_Dark_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NVE_Green",new NVE_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NVE_White",new NVE_White().setCreativeTab(tabNevoEvolution));

	blockRef.put("Bionic_Stained_Blue",new Bionic_Stained_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Cyan",new Bionic_Stained_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Green",new Bionic_Stained_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Orange",new Bionic_Stained_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Pink",new Bionic_Stained_Pink().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Purple",new Bionic_Stained_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Red",new Bionic_Stained_Red().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_White",new Bionic_Stained_White().setCreativeTab(tabNevoEvolution));
	blockRef.put("Bionic_Stained_Yellow",new Bionic_Stained_Yellow().setCreativeTab(tabNevoEvolution));

	blockRef.put("NvE_Stained_Blue",new NvE_Stained_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Cyan",new NvE_Stained_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Green",new NvE_Stained_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Pink",new NvE_Stained_Pink().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Purple",new NvE_Stained_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Red",new NvE_Stained_Red().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_White",new NvE_Stained_White().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Stained_Yellow",new NvE_Stained_Yellow().setCreativeTab(tabNevoEvolution));

	blockRef.put("NvE_Tch_Tile_Blue",new NvE_Tch_Tile_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Cyan",new NvE_Tch_Tile_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Green",new NvE_Tch_Tile_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Orange",new NvE_Tch_Tile_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Pink",new NvE_Tch_Tile_Pink().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Purple",new NvE_Tch_Tile_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Red",new NvE_Tch_Tile_Red().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_White",new NvE_Tch_Tile_White().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Tch_Tile_Yellow",new NvE_Tch_Tile_Yellow().setCreativeTab(tabNevoEvolution));
	
	blockRef.put("Celtic_Glass_Another_World",new Celtic_Glass_Another_World().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Blue",new Celtic_Glass_Blue().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Cream",new Celtic_Glass_Cream().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Gold",new Celtic_Glass_Gold().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Green",new Celtic_Glass_Green().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Grey",new Celtic_Glass_Grey().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Light_Blue",new Celtic_Glass_Light_Blue().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Purple",new Celtic_Glass_Purple().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Purple_Another_World",new Celtic_Glass_Purple_Another_World().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Red",new Celtic_Glass_Red().setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Yellow",new Celtic_Glass_Yellow().setCreativeTab(tabGlass));
	
	blockRef.put("Celtic_Glass_Cream_Pane",new Celtic_Glass_Cream_Pane("Celtic_Glass_Cream").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Blue_Pane",new Celtic_Glass_Blue_Pane("Celtic_Glass_Blue").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Another_World_Pane",new Celtic_Glass_Another_World_Pane("Celtic_Glass_Another_World").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Green_Pane",new Celtic_Glass_Green_Pane("Celtic_Glass_Green").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Gold_Pane",new Celtic_Glass_Gold_Pane("Celtic_Glass_Gold").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Grey_Pane",new Celtic_Glass_Grey_Pane("Celtic_Glass_Grey").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Light_Blue_Pane",new Celtic_Glass_Light_Blue_Pane("Celtic_Glass_Light_Blue").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Purple_Pane",new Celtic_Glass_Purple_Pane("Celtic_Glass_Purple").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Purple_Another_World_Pane",new Celtic_Glass_Purple_Another_World_Pane("Celtic_Glass_Purple_Another_World").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Red_Pane",new Celtic_Glass_Red_Pane("Celtic_Glass_Red").setCreativeTab(tabGlass));
	blockRef.put("Celtic_Glass_Yellow_Pane",new Celtic_Glass_Yellow_Pane("Celtic_Glass_Yellow").setCreativeTab(tabGlass));
	
	blockRef.put("NvE_Black",new NvE_Black().setCreativeTab(tabGlass));
	blockRef.put("NvE_Blue",new NvE_Blue().setCreativeTab(tabGlass));
	blockRef.put("NvE_Cyan",new NvE_Cyan().setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Blue",new NvE_Dark_Blue().setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Orange",new NvE_Dark_Orange().setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Purple",new NvE_Dark_Purple().setCreativeTab(tabGlass));
	blockRef.put("NvE_Orange",new NvE_Orange().setCreativeTab(tabGlass));
	blockRef.put("NvE_Pink",new NvE_Pink().setCreativeTab(tabGlass));
	blockRef.put("NvE_Purple",new NvE_Purple().setCreativeTab(tabGlass));
	blockRef.put("NvE_Red",new NvE_Red().setCreativeTab(tabGlass));
	blockRef.put("NvE_Yellow",new NvE_Yellow().setCreativeTab(tabGlass));	
	
	blockRef.put("NvE_Black_Pane",new NvE_Black_Pane("NvE_Black").setCreativeTab(tabGlass));
	blockRef.put("NvE_Blue_Pane",new NvE_Blue_Pane("NvE_Blue").setCreativeTab(tabGlass));
	blockRef.put("NvE_Cyan_Pane",new NvE_Cyan_Pane("NvE_Cyan").setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Blue_Pane",new NvE_Dark_Blue_Pane("NvE_Dark_Blue").setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Orange_Pane",new NvE_Dark_Orange_Pane("NvE_Dark_Orange").setCreativeTab(tabGlass));
	blockRef.put("NvE_Dark_Purple_Pane",new NvE_Dark_Purple_Pane("NvE_Dark_Purple").setCreativeTab(tabGlass));
	blockRef.put("NvE_Orange_Pane",new NvE_Orange_Pane("NvE_Orange").setCreativeTab(tabGlass));
	blockRef.put("NvE_Purple_Pane",new NvE_Purple_Pane("NvE_Purple").setCreativeTab(tabGlass));
	blockRef.put("NvE_Pink_Pane",new NvE_Pink_Pane("NvE_Pink").setCreativeTab(tabGlass));
	blockRef.put("NvE_Red_Pane",new NvE_Red_Pane("NvE_Red").setCreativeTab(tabGlass));
	blockRef.put("NvE_Yellow_Pane",new NvE_Yellow_Pane("NvE_Yellow").setCreativeTab(tabGlass));
	
	blockRef.put("Black_Glass",new Black_Glass().setCreativeTab(tabGlass));
	blockRef.put("Clear_Glass",new Clear_Glass().setCreativeTab(tabGlass));
	blockRef.put("Cyan_Glass",new Cyan_Glass().setCreativeTab(tabGlass));
	blockRef.put("Dark_Blue_Glass",new Dark_Blue_Glass().setCreativeTab(tabGlass));
	blockRef.put("Dark_Green_Glass",new Dark_Green_Glass().setCreativeTab(tabGlass));
	blockRef.put("Dark_Purple_Glass",new Dark_Purple_Glass().setCreativeTab(tabGlass));
	blockRef.put("Green_Glass",new Green_Glass().setCreativeTab(tabGlass));
	blockRef.put("Magenta_Glass",new Magenta_Glass().setCreativeTab(tabGlass));
	blockRef.put("Orange_Glass",new Orange_Glass().setCreativeTab(tabGlass));
	blockRef.put("Pink_Glass",new Pink_Glass().setCreativeTab(tabGlass));
	blockRef.put("Purple_Glass",new Purple_Glass().setCreativeTab(tabGlass));
	blockRef.put("Red_Glass",new Red_Glass().setCreativeTab(tabGlass));
	blockRef.put("White_Glass",new White_Glass().setCreativeTab(tabGlass));
	blockRef.put("Yellow_Glass",new Yellow_Glass().setCreativeTab(tabGlass));
	
	blockRef.put("Down_Frame__Simple_Pane",new Down_Frame__Simple_Pane("Down_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Down_Single_Frame__Simple_Pane",new Down_Single_Frame__Simple_Pane("Down_Single_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Left_Down_Corner_Frame__Simple_Pane",new Left_Down_Corner_Frame__Simple_Pane("Left_Down_Corner_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Left_Frame__Simple_Pane",new Left_Frame__Simple_Pane("Left_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Left_Single_Frame__Simple_Pane",new Left_Single_Frame__Simple_Pane("Left_Single_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Left_Top_Corner_Frame__Simple_Pane",new Left_Top_Corner_Frame__Simple_Pane("Left_Top_Corner_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Middle_Single_Frame__Simple_Pane",new Middle_Single_Frame__Simple_Pane("Middle_Single_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Right_Down_Corner_Frame__Simple_Pane",new Right_Down_Corner_Frame__Simple_Pane("Right_Down_Corner_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Right_Frame__Simple_Pane",new Right_Frame__Simple_Pane("Right_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Right_Single_Frame__Simple_Pane",new Right_Single_Frame__Simple_Pane("Right_Single_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Right_Top_Corner_Frame__Simple_Pane",new Right_Top_Corner_Frame__Simple_Pane("Right_Top_Corner_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Full_Frame__Simple_Pane",new Simple_Full_Frame__Simple_Pane("Simple_Full_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Top_Frame__Simple_Pane",new Top_Frame__Simple_Pane("Top_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Top_Single_Frame__Simple_Pane",new Top_Single_Frame__Simple_Pane("Top_Single_Frame__Simple","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Down_Frame_Pane",new Wooden_Down_Frame_Pane("Wooden_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Down_Single_Frame_Pane",new Wooden_Down_Single_Frame_Pane("Wooden_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Full_Frame_Pane",new Wooden_Full_Frame_Pane("Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Left_Down_Corner_Frame_Pane",new Wooden_Left_Down_Corner_Frame_Pane("Wooden_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Left_Frame_Pane",new Wooden_Left_Frame_Pane("Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Left_Top_Corner_Frame_Pane",new Wooden_Left_Top_Corner_Frame_Pane("Wooden_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Middle_Single_Frame_Pane",new Wooden_Middle_Single_Frame_Pane("Wooden_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Right_Down_Corner_Frame_Pane",new Wooden_Right_Down_Corner_Frame_Pane("Wooden_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Right_Frame_Pane",new Wooden_Right_Frame_Pane("Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Right_Top_Corner_Frame_Pane",new Wooden_Right_Top_Corner_Frame_Pane("Wooden_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Top_Frame_Pane",new Wooden_Top_Frame_Pane("Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Wooden_Top_single_Frame_Pane",new Wooden_Top_single_Frame_Pane("Wooden_Top_single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Full_Frame__Simple",new Simple_Full_Frame__Simple().setCreativeTab(tabGlass));
blockRef.put("Wooden_Full_Frame",new Wooden_Full_Frame().setCreativeTab(tabGlass));

blockRef.put("Black_Glass_Pane",new Black_Glass_Pane("Black_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Glass_Pane",new Clear_Glass_Pane("Clear_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Glass_Pane",new Cyan_Glass_Pane("Cyan_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Glass_Pane",new Dark_Blue_Glass_Pane("Dark_Blue_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Glass_Pane",new Dark_Green_Glass_Pane("Dark_Green_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Glass_Pane",new Dark_Purple_Glass_Pane("Dark_Purple_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Green_Glass_Pane",new Green_Glass_Pane("Green_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Glass_Pane",new Magenta_Glass_Pane("Magenta_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Glass_Pane",new Orange_Glass_Pane("Orange_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Glass_Pane",new Pink_Glass_Pane("Pink_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Glass_Pane",new Purple_Glass_Pane("Purple_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Red_Glass_Pane",new Red_Glass_Pane("Red_Glass").setCreativeTab(tabGlass));
	
blockRef.put("White_Glass_Pane",new White_Glass_Pane("White_Glass").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Glass_Pane",new Yellow_Glass_Pane("Yellow_Glass").setCreativeTab(tabGlass));
	blockRef.put("Simple_Glass_Black",new Simple_Glass_Black().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Blue",new Simple_Glass_Blue().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Clear",new Simple_Glass_Clear().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Cyan",new Simple_Glass_Cyan().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Blue",new Simple_Glass_Dark_Blue().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Green",new Simple_Glass_Dark_Green().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Purple",new Simple_Glass_Dark_Purple().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Green",new Simple_Glass_Green().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Magenta",new Simple_Glass_Magenta().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Orange",new Simple_Glass_Orange().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Pink",new Simple_Glass_Pink().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Purple",new Simple_Glass_Purple().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Red",new Simple_Glass_Red().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_White",new Simple_Glass_White().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Yellow",new Simple_Glass_Yellow().setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Black_Pane",new Simple_Glass_Black_Pane("Simple_Glass_Black").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Blue_Pane",new Simple_Glass_Blue_Pane("Simple_Glass_Blue").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Clear_Pane",new Simple_Glass_Clear_Pane("Simple_Glass_Clear").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Cyan_Pane",new Simple_Glass_Cyan_Pane("Simple_Glass_Cyan").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Blue_Pane",new Simple_Glass_Dark_Blue_Pane("Simple_Glass_Dark_Blue").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Green_Pane",new Simple_Glass_Dark_Green_Pane("Simple_Glass_Dark_Green").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Dark_Purple_Pane",new Simple_Glass_Dark_Purple_Pane("Simple_Glass_Dark_Purple").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Green_Pane",new Simple_Glass_Green_Pane("Simple_Glass_Green").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Magenta_Pane",new Simple_Glass_Magenta_Pane("Simple_Glass_Magenta").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Orange_Pane",new Simple_Glass_Orange_Pane("Simple_Glass_Orange").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Pink_Pane",new Simple_Glass_Pink_Pane("Simple_Glass_Pink").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Purple_Pane",new Simple_Glass_Purple_Pane("Simple_Glass_Purple").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Red_Pane",new Simple_Glass_Red_Pane("Simple_Glass_Red").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_White_Pane",new Simple_Glass_White_Pane("Simple_Glass_White").setCreativeTab(tabGlass));
	
blockRef.put("Simple_Glass_Yellow_Pane",new Simple_Glass_Yellow_Pane("Simple_Glass_Yellow").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Pane",new Blue_Pane("Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Dark_Green_Pane",new Dark_Green_Pane("Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Black_Pane",new Down_Frame__Black_Pane("Down_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Blue_Pane",new Down_Frame__Blue_Pane("Down_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Cyan_Pane",new Down_Frame__Cyan_Pane("Down_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__DarkGreen_Pane",new Down_Frame__DarkGreen_Pane("Down_Frame__DarkGreen","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Dark_Blue_Pane",new Down_Frame__Dark_Blue_Pane("Down_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Dark_Purple_Pane",new Down_Frame__Dark_Purple_Pane("Down_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Green_Pane",new Down_Frame__Green_Pane("Down_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Magenta_Pane",new Down_Frame__Magenta_Pane("Down_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Pink_Pane",new Down_Frame__Pink_Pane("Down_Frame__Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Purple_Pane",new Down_Frame__Purple_Pane("Down_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Red_Pane",new Down_Frame__Red_Pane("Down_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__White_Pane",new Down_Frame__White_Pane("Down_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame__Yellow_Pane",new Down_Frame__Yellow_Pane("Down_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Frame___Orange_Pane",new Down_Frame___Orange_Pane("Down_Frame___Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Singel_Frame_Pink_Pane",new Down_Singel_Frame_Pink_Pane("Down_Singel_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Singel_Frame__Black_Pane",new Down_Singel_Frame__Black_Pane("Down_Singel_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Singel_Frame__Magenta_Pane",new Down_Singel_Frame__Magenta_Pane("Down_Singel_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Singel_Frame__White_Pane",new Down_Singel_Frame__White_Pane("Down_Singel_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Blue_Pane",new Down_Single_Frame__Blue_Pane("Down_Single_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Cyan_Pane",new Down_Single_Frame__Cyan_Pane("Down_Single_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Dark_Blue_Pane",new Down_Single_Frame__Dark_Blue_Pane("Down_Single_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Dark_Green_Pane",new Down_Single_Frame__Dark_Green_Pane("Down_Single_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Dark_Purple_Pane",new Down_Single_Frame__Dark_Purple_Pane("Down_Single_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Green_Pane",new Down_Single_Frame__Green_Pane("Down_Single_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Orange_Pane",new Down_Single_Frame__Orange_Pane("Down_Single_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Purple_Pane",new Down_Single_Frame__Purple_Pane("Down_Single_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Red_Pane",new Down_Single_Frame__Red_Pane("Down_Single_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Down_Single_Frame__Yellow_Pane",new Down_Single_Frame__Yellow_Pane("Down_Single_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame_Pink_Pane",new Left_Down_Corner_Frame_Pink_Pane("Left_Down_Corner_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Black_Pane",new Left_Down_Corner_Frame__Black_Pane("Left_Down_Corner_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Blue_Pane",new Left_Down_Corner_Frame__Blue_Pane("Left_Down_Corner_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Cyan_Pane",new Left_Down_Corner_Frame__Cyan_Pane("Left_Down_Corner_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Dark_Blue_Pane",new Left_Down_Corner_Frame__Dark_Blue_Pane("Left_Down_Corner_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Dark_Green_Pane",new Left_Down_Corner_Frame__Dark_Green_Pane("Left_Down_Corner_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_frame__Dark_Purple_Pane",new Left_Down_Corner_frame__Dark_Purple_Pane("Left_Down_Corner_frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Green_Pane",new Left_Down_Corner_Frame__Green_Pane("Left_Down_Corner_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Magenta_Pane",new Left_Down_Corner_Frame__Magenta_Pane("Left_Down_Corner_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Orange_Pane",new Left_Down_Corner_Frame__Orange_Pane("Left_Down_Corner_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__Purple_Pane",new Left_Down_Corner_Frame__Purple_Pane("Left_Down_Corner_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame__White_Pane",new Left_Down_Corner_Frame__White_Pane("Left_Down_Corner_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_frame__Yellow_Pane",new Left_Down_Corner_frame__Yellow_Pane("Left_Down_Corner_frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Down_Corner_Frame___Red_Pane",new Left_Down_Corner_Frame___Red_Pane("Left_Down_Corner_Frame___Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frames__Yellow_Pane",new Left_Frames__Yellow_Pane("Left_Frames__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Black_Pane",new Left_Frame__Black_Pane("Left_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Blue_Pane",new Left_Frame__Blue_Pane("Left_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Cyan_Pane",new Left_Frame__Cyan_Pane("Left_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__DarkGreen_Pane",new Left_Frame__DarkGreen_Pane("Left_Frame__DarkGreen","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Dark_Blue_Pane",new Left_Frame__Dark_Blue_Pane("Left_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Dark_Purple_Pane",new Left_Frame__Dark_Purple_Pane("Left_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Green_Pane",new Left_Frame__Green_Pane("Left_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Magenta_Pane",new Left_Frame__Magenta_Pane("Left_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Pink_Pane",new Left_Frame__Pink_Pane("Left_Frame__Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Purple_Pane",new Left_Frame__Purple_Pane("Left_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__Red_Pane",new Left_Frame__Red_Pane("Left_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame__White_Pane",new Left_Frame__White_Pane("Left_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Frame___Orange_Pane",new Left_Frame___Orange_Pane("Left_Frame___Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame_Pink_Pane",new Left_Top_Corner_Frame_Pink_Pane("Left_Top_Corner_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Black_Pane",new Left_Top_Corner_Frame__Black_Pane("Left_Top_Corner_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Blue_Pane",new Left_Top_Corner_Frame__Blue_Pane("Left_Top_Corner_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Cyan_Pane",new Left_Top_Corner_Frame__Cyan_Pane("Left_Top_Corner_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Dark_Blue_Pane",new Left_Top_Corner_Frame__Dark_Blue_Pane("Left_Top_Corner_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Dark_Green_Pane",new Left_Top_Corner_Frame__Dark_Green_Pane("Left_Top_Corner_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_frame__Dark_Purple_Pane",new Left_Top_Corner_frame__Dark_Purple_Pane("Left_Top_Corner_frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Green_Pane",new Left_Top_Corner_Frame__Green_Pane("Left_Top_Corner_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Magenta_Pane",new Left_Top_Corner_Frame__Magenta_Pane("Left_Top_Corner_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Orange_Pane",new Left_Top_Corner_Frame__Orange_Pane("Left_Top_Corner_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Purple_Pane",new Left_Top_Corner_Frame__Purple_Pane("Left_Top_Corner_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__White_Pane",new Left_Top_Corner_Frame__White_Pane("Left_Top_Corner_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame__Yellow_Pane",new Left_Top_Corner_Frame__Yellow_Pane("Left_Top_Corner_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Left_Top_Corner_Frame___Red_Pane",new Left_Top_Corner_Frame___Red_Pane("Left_Top_Corner_Frame___Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middel_Single_Frame__Yellow_Pane",new Middel_Single_Frame__Yellow_Pane("Middel_Single_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame_Pink_Pane",new Middle_Single_Frame_Pink_Pane("Middle_Single_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Black_Pane",new Middle_Single_Frame__Black_Pane("Middle_Single_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Blue_Pane",new Middle_Single_Frame__Blue_Pane("Middle_Single_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Cyan_Pane",new Middle_Single_Frame__Cyan_Pane("Middle_Single_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Dark_Blue_Pane",new Middle_Single_Frame__Dark_Blue_Pane("Middle_Single_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Dark_Green_Pane",new Middle_Single_Frame__Dark_Green_Pane("Middle_Single_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Dark_Puple_Pane",new Middle_Single_Frame__Dark_Puple_Pane("Middle_Single_Frame__Dark_Puple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Green_Pane",new Middle_Single_Frame__Green_Pane("Middle_Single_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Magenta_Pane",new Middle_Single_Frame__Magenta_Pane("Middle_Single_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Orange_Pane",new Middle_Single_Frame__Orange_Pane("Middle_Single_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Purple_Pane",new Middle_Single_Frame__Purple_Pane("Middle_Single_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__Red_Pane",new Middle_Single_Frame__Red_Pane("Middle_Single_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Middle_Single_Frame__White_Pane",new Middle_Single_Frame__White_Pane("Middle_Single_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame_Blue_Pane",new Right_Down_Corner_Frame_Blue_Pane("Right_Down_Corner_Frame_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame_Pink_Pane",new Right_Down_Corner_Frame_Pink_Pane("Right_Down_Corner_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Black_Pane",new Right_Down_Corner_Frame__Black_Pane("Right_Down_Corner_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Cyan_Pane",new Right_Down_Corner_Frame__Cyan_Pane("Right_Down_Corner_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Dark_Blue_Pane",new Right_Down_Corner_Frame__Dark_Blue_Pane("Right_Down_Corner_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Dark_Green_Pane",new Right_Down_Corner_Frame__Dark_Green_Pane("Right_Down_Corner_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_frame__Dark_Purple_Pane",new Right_Down_Corner_frame__Dark_Purple_Pane("Right_Down_Corner_frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Green_Pane",new Right_Down_Corner_Frame__Green_Pane("Right_Down_Corner_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Orange_Pane",new Right_Down_Corner_Frame__Orange_Pane("Right_Down_Corner_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Purple_Pane",new Right_Down_Corner_Frame__Purple_Pane("Right_Down_Corner_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__White_Pane",new Right_Down_Corner_Frame__White_Pane("Right_Down_Corner_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame__Yellow_Pane",new Right_Down_Corner_Frame__Yellow_Pane("Right_Down_Corner_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame___Magenta_Pane",new Right_Down_Corner_Frame___Magenta_Pane("Right_Down_Corner_Frame___Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Down_Corner_Frame___Red_Pane",new Right_Down_Corner_Frame___Red_Pane("Right_Down_Corner_Frame___Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame_Pink_Pane",new Right_Frame_Pink_Pane("Right_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Black_Pane",new Right_Frame__Black_Pane("Right_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Blue_Pane",new Right_Frame__Blue_Pane("Right_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Cyan_Pane",new Right_Frame__Cyan_Pane("Right_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__DarkGreen_Pane",new Right_Frame__DarkGreen_Pane("Right_Frame__DarkGreen","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Dark_Blue_Pane",new Right_Frame__Dark_Blue_Pane("Right_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Dark_Purple_Pane",new Right_Frame__Dark_Purple_Pane("Right_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Green_Pane",new Right_Frame__Green_Pane("Right_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Magenta_Pane",new Right_Frame__Magenta_Pane("Right_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Orange_Pane",new Right_Frame__Orange_Pane("Right_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Purple_Pane",new Right_Frame__Purple_Pane("Right_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__Red_Pane",new Right_Frame__Red_Pane("Right_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame__White_Pane",new Right_Frame__White_Pane("Right_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Frame___Yellow_Pane",new Right_Frame___Yellow_Pane("Right_Frame___Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame_Blue_Pane",new Right_Top_Corner_Frame_Blue_Pane("Right_Top_Corner_Frame_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame_Pink_Pane",new Right_Top_Corner_Frame_Pink_Pane("Right_Top_Corner_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Black_Pane",new Right_Top_Corner_Frame__Black_Pane("Right_Top_Corner_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Cyan_Pane",new Right_Top_Corner_Frame__Cyan_Pane("Right_Top_Corner_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Dark_Blue_Pane",new Right_Top_Corner_Frame__Dark_Blue_Pane("Right_Top_Corner_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Dark_Green_Pane",new Right_Top_Corner_Frame__Dark_Green_Pane("Right_Top_Corner_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_frame__Dark_Purple_Pane",new Right_Top_Corner_frame__Dark_Purple_Pane("Right_Top_Corner_frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Green_Pane",new Right_Top_Corner_Frame__Green_Pane("Right_Top_Corner_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Magenta_Pane",new Right_Top_Corner_Frame__Magenta_Pane("Right_Top_Corner_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Orange_Pane",new Right_Top_Corner_Frame__Orange_Pane("Right_Top_Corner_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Purple_Pane",new Right_Top_Corner_Frame__Purple_Pane("Right_Top_Corner_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Red_Pane",new Right_Top_Corner_Frame__Red_Pane("Right_Top_Corner_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__White_Pane",new Right_Top_Corner_Frame__White_Pane("Right_Top_Corner_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Right_Top_Corner_Frame__Yellow_Pane",new Right_Top_Corner_Frame__Yellow_Pane("Right_Top_Corner_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Black_Pane",new Simple_Left_Single_Frame__Black_Pane("Simple_Left_Single_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Blue_Pane",new Simple_Left_Single_Frame__Blue_Pane("Simple_Left_Single_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Cyan_Pane",new Simple_Left_Single_Frame__Cyan_Pane("Simple_Left_Single_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Dark_Blue_Pane",new Simple_Left_Single_Frame__Dark_Blue_Pane("Simple_Left_Single_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Dark_Green_Pane",new Simple_Left_Single_Frame__Dark_Green_Pane("Simple_Left_Single_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Green_Pane",new Simple_Left_Single_Frame__Green_Pane("Simple_Left_Single_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Magenta_Pane",new Simple_Left_Single_Frame__Magenta_Pane("Simple_Left_Single_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Orange_Pane",new Simple_Left_Single_Frame__Orange_Pane("Simple_Left_Single_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Pink_Pane",new Simple_Left_Single_Frame__Pink_Pane("Simple_Left_Single_Frame__Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Purple_Pane",new Simple_Left_Single_Frame__Purple_Pane("Simple_Left_Single_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Red_Pane",new Simple_Left_Single_Frame__Red_Pane("Simple_Left_Single_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__White_Pane",new Simple_Left_Single_Frame__White_Pane("Simple_Left_Single_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame__Yellow_Pane",new Simple_Left_Single_Frame__Yellow_Pane("Simple_Left_Single_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Left_Single_Frame___Dark_Purple_Pane",new Simple_Left_Single_Frame___Dark_Purple_Pane("Simple_Left_Single_Frame___Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Black_Pane",new Simple_Right_Single_Frame__Black_Pane("Simple_Right_Single_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Cyan_Pane",new Simple_Right_Single_Frame__Cyan_Pane("Simple_Right_Single_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Dark_Blue_Pane",new Simple_Right_Single_Frame__Dark_Blue_Pane("Simple_Right_Single_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Dark_Purple_Pane",new Simple_Right_Single_Frame__Dark_Purple_Pane("Simple_Right_Single_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Green_Pane",new Simple_Right_Single_Frame__Green_Pane("Simple_Right_Single_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Magenta_Pane",new Simple_Right_Single_Frame__Magenta_Pane("Simple_Right_Single_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Orange_Pane",new Simple_Right_Single_Frame__Orange_Pane("Simple_Right_Single_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Pink_Pane",new Simple_Right_Single_Frame__Pink_Pane("Simple_Right_Single_Frame__Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Purple_Pane",new Simple_Right_Single_Frame__Purple_Pane("Simple_Right_Single_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Red_Pane",new Simple_Right_Single_Frame__Red_Pane("Simple_Right_Single_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__White_Pane",new Simple_Right_Single_Frame__White_Pane("Simple_Right_Single_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Simple_Right_Single_Frame__Yellow_Pane",new Simple_Right_Single_Frame__Yellow_Pane("Simple_Right_Single_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame_Pink_Pane",new Top_Frame_Pink_Pane("Top_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Black_Pane",new Top_Frame__Black_Pane("Top_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Blue_Pane",new Top_Frame__Blue_Pane("Top_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Cyan_Pane",new Top_Frame__Cyan_Pane("Top_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Dark_Blue_Pane",new Top_Frame__Dark_Blue_Pane("Top_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Dark_Green_Pane",new Top_Frame__Dark_Green_Pane("Top_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Dark_Purple_Pane",new Top_Frame__Dark_Purple_Pane("Top_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Green_Pane",new Top_Frame__Green_Pane("Top_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Magenta_Pane",new Top_Frame__Magenta_Pane("Top_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Orange_Pane",new Top_Frame__Orange_Pane("Top_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Purple_Pane",new Top_Frame__Purple_Pane("Top_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Red_Pane",new Top_Frame__Red_Pane("Top_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Frame__Yellow_Pane",new Top_Frame__Yellow_Pane("Top_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame_Pink_Pane",new Top_Single_Frame_Pink_Pane("Top_Single_Frame_Pink","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Black_Pane",new Top_Single_Frame__Black_Pane("Top_Single_Frame__Black","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Blue_Pane",new Top_Single_Frame__Blue_Pane("Top_Single_Frame__Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Cyan_Pane",new Top_Single_Frame__Cyan_Pane("Top_Single_Frame__Cyan","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Dark_Blue_Pane",new Top_Single_Frame__Dark_Blue_Pane("Top_Single_Frame__Dark_Blue","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Dark_Green_Pane",new Top_Single_Frame__Dark_Green_Pane("Top_Single_Frame__Dark_Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Dark_Purple_Pane",new Top_Single_Frame__Dark_Purple_Pane("Top_Single_Frame__Dark_Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Green_Pane",new Top_Single_Frame__Green_Pane("Top_Single_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Magenta_Pane",new Top_Single_Frame__Magenta_Pane("Top_Single_Frame__Magenta","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Purple_Pane",new Top_Single_Frame__Purple_Pane("Top_Single_Frame__Purple","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__White_Pane",new Top_Single_Frame__White_Pane("Top_Single_Frame__White","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Single_Frame__Yellow_Pane",new Top_Single_Frame__Yellow_Pane("Top_Single_Frame__Yellow","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("Top_Sinlge_Frame__Orange_Pane",new Top_Sinlge_Frame__Orange_Pane("Top_Sinlge_Frame__Orange","Glass_Trim").setCreativeTab(tabGlass));
blockRef.put("To_Single_Frame__Red_Pane",new To_Single_Frame__Red_Pane("To_Single_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));



	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Proxy, TileEntitiy, entity, gui and packet registration
		//GameRegistry.addRecipe(new ItemStack(itemTable), new Object [] {"WWW"," W "," W ",'W',Blocks.planks});
	//	GameRegistry.addRecipe(new ItemStack(blockTable),new Object[] {"CRC","RRR","CRC",'C',Blocks.coal_block, 'R',Items.redstone});
	
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	public static CreativeTabs tabTelgttatium = new CreativeTabs("tabTelBuildingBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockRef.get("celticWoolAW")).getItem();
		}
	};
	public static CreativeTabs tabNatrualBlocks = new CreativeTabs("tabTelNaturalBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockRef.get("pincyaGrass")).getItem();
		}
	};
	public static CreativeTabs tabNevoEvolution = new CreativeTabs("tabTelNevoEvolution") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockRef.get("Bionic_Flower_Floor_Sun")).getItem();
		}
	};
	public static CreativeTabs tabGlass = new CreativeTabs("tabTelGlass") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockRef.get("Celtic_Glass_Cream")).getItem();
		}
	};
}
