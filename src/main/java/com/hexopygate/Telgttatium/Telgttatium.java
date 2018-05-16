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
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.plank.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.*;
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
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.*;
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

blockRef.put("Black_Simple_Down_Frame_Pane",new Black_Simple_Down_Frame_Pane("Black_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Down_Single_Frame_Pane",new Black_Simple_Down_Single_Frame_Pane("Black_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Left_Down_Corner_Frame_Pane",new Black_Simple_Left_Down_Corner_Frame_Pane("Black_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Left_Frame_Pane",new Black_Simple_Left_Frame_Pane("Black_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Left_Top_Corner_Frame_Pane",new Black_Simple_Left_Top_Corner_Frame_Pane("Black_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Middle_Single_Frame_Pane",new Black_Simple_Middle_Single_Frame_Pane("Black_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Right_Down_Corner_Frame_Pane",new Black_Simple_Right_Down_Corner_Frame_Pane("Black_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Right_Frame_Pane",new Black_Simple_Right_Frame_Pane("Black_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Right_Single_Frame_Pane",new Black_Simple_Right_Single_Frame_Pane("Black_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Right_Top_Corner_Frame_Pane",new Black_Simple_Right_Top_Corner_Frame_Pane("Black_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Simple_Left_Single_Frame_Pane",new Black_Simple_Simple_Left_Single_Frame_Pane("Black_Simple_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Top_Frame_Pane",new Black_Simple_Top_Frame_Pane("Black_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Simple_Top_Single_Frame_Pane",new Black_Simple_Top_Single_Frame_Pane("Black_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Down_Frame_Pane",new Blue_Simple_Down_Frame_Pane("Blue_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Down_Single_Frame_Pane",new Blue_Simple_Down_Single_Frame_Pane("Blue_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Left_Down_Corner_Frame_Pane",new Blue_Simple_Left_Down_Corner_Frame_Pane("Blue_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Left_Frame_Pane",new Blue_Simple_Left_Frame_Pane("Blue_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Left_Single_Frame_Pane",new Blue_Simple_Left_Single_Frame_Pane("Blue_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Left_Top_Corner_Frame_Pane",new Blue_Simple_Left_Top_Corner_Frame_Pane("Blue_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Middle_Single_Frame_Pane",new Blue_Simple_Middle_Single_Frame_Pane("Blue_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Right_Down_Corner_Frame_Pane",new Blue_Simple_Right_Down_Corner_Frame_Pane("Blue_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Right_Frame_Pane",new Blue_Simple_Right_Frame_Pane("Blue_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Right_Single_Frame_Pane",new Blue_Simple_Right_Single_Frame_Pane("Blue_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Right_Top_Corner_Frame_Pane",new Blue_Simple_Right_Top_Corner_Frame_Pane("Blue_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Top_Frame_Pane",new Blue_Simple_Top_Frame_Pane("Blue_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Blue_Simple_Top_Single_Frame_Pane",new Blue_Simple_Top_Single_Frame_Pane("Blue_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Down_Frame_Pane",new Clear_Simple_Down_Frame_Pane("Clear_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Down_Single_Frame_Pane",new Clear_Simple_Down_Single_Frame_Pane("Clear_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Left_Down_Corner_Frame_Pane",new Clear_Simple_Left_Down_Corner_Frame_Pane("Clear_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Left_Frame_Pane",new Clear_Simple_Left_Frame_Pane("Clear_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Left_Single_Frame_Pane",new Clear_Simple_Left_Single_Frame_Pane("Clear_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Left_Top_Corner_Frame_Pane",new Clear_Simple_Left_Top_Corner_Frame_Pane("Clear_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Middle_Single_Frame_Pane",new Clear_Simple_Middle_Single_Frame_Pane("Clear_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Right_Down_Corner_Frame_Pane",new Clear_Simple_Right_Down_Corner_Frame_Pane("Clear_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Right_Frame_Pane",new Clear_Simple_Right_Frame_Pane("Clear_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Right_Single_Frame_Pane",new Clear_Simple_Right_Single_Frame_Pane("Clear_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Right_Top_Corner_Frame_Pane",new Clear_Simple_Right_Top_Corner_Frame_Pane("Clear_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Top_Frame_Pane",new Clear_Simple_Top_Frame_Pane("Clear_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Simple_Top_Single_Frame_Pane",new Clear_Simple_Top_Single_Frame_Pane("Clear_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Down_Frame_Pane",new Cyan_Simple_Down_Frame_Pane("Cyan_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Down_Single_Frame_Pane",new Cyan_Simple_Down_Single_Frame_Pane("Cyan_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Left_Down_Corner_Frame_Pane",new Cyan_Simple_Left_Down_Corner_Frame_Pane("Cyan_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Left_Frame_Pane",new Cyan_Simple_Left_Frame_Pane("Cyan_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Left_Top_Corner_Frame_Pane",new Cyan_Simple_Left_Top_Corner_Frame_Pane("Cyan_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Middle_Single_Frame_Pane",new Cyan_Simple_Middle_Single_Frame_Pane("Cyan_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Right_Down_Corner_Frame_Pane",new Cyan_Simple_Right_Down_Corner_Frame_Pane("Cyan_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Right_Frame_Pane",new Cyan_Simple_Right_Frame_Pane("Cyan_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Right_Single_Frame_Pane",new Cyan_Simple_Right_Single_Frame_Pane("Cyan_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Right_Top_Corner_Frame_Pane",new Cyan_Simple_Right_Top_Corner_Frame_Pane("Cyan_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Simple_Left_Single_Frame_Pane",new Cyan_Simple_Simple_Left_Single_Frame_Pane("Cyan_Simple_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Top_Frame_Pane",new Cyan_Simple_Top_Frame_Pane("Cyan_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Cyan_Simple_Top_Single_Frame_Pane",new Cyan_Simple_Top_Single_Frame_Pane("Cyan_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Down_Frame_Pane",new Dark_Blue_Simple_Down_Frame_Pane("Dark_Blue_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Down_Single_Frame_Pane",new Dark_Blue_Simple_Down_Single_Frame_Pane("Dark_Blue_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Left_Down_Corner_Frame_Pane",new Dark_Blue_Simple_Left_Down_Corner_Frame_Pane("Dark_Blue_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Left_Frame_Pane",new Dark_Blue_Simple_Left_Frame_Pane("Dark_Blue_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Left_Single_Frame_Pane",new Dark_Blue_Simple_Left_Single_Frame_Pane("Dark_Blue_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Left_Top_Corner_Frame_Pane",new Dark_Blue_Simple_Left_Top_Corner_Frame_Pane("Dark_Blue_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Middle_Single_Frame_Pane",new Dark_Blue_Simple_Middle_Single_Frame_Pane("Dark_Blue_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Right_Down_Corner_Frame_Pane",new Dark_Blue_Simple_Right_Down_Corner_Frame_Pane("Dark_Blue_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Right_Frame_Pane",new Dark_Blue_Simple_Right_Frame_Pane("Dark_Blue_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Right_Single_Frame_Pane",new Dark_Blue_Simple_Right_Single_Frame_Pane("Dark_Blue_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Right_Top_Corner_Frame_Pane",new Dark_Blue_Simple_Right_Top_Corner_Frame_Pane("Dark_Blue_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Top_Frame_Pane",new Dark_Blue_Simple_Top_Frame_Pane("Dark_Blue_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Blue_Simple_Top_Single_Frame_Pane",new Dark_Blue_Simple_Top_Single_Frame_Pane("Dark_Blue_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Down_Frame_Pane",new Dark_Green_Simple_Down_Frame_Pane("Dark_Green_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Down_Single_Frame_Pane",new Dark_Green_Simple_Down_Single_Frame_Pane("Dark_Green_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Left_Down_Corner_Frame_Pane",new Dark_Green_Simple_Left_Down_Corner_Frame_Pane("Dark_Green_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Left_Frame_Pane",new Dark_Green_Simple_Left_Frame_Pane("Dark_Green_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Left_Single_Frame_Pane",new Dark_Green_Simple_Left_Single_Frame_Pane("Dark_Green_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Left_Top_Corner_Frame_Pane",new Dark_Green_Simple_Left_Top_Corner_Frame_Pane("Dark_Green_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Middle_Single_Frame_Pane",new Dark_Green_Simple_Middle_Single_Frame_Pane("Dark_Green_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Right_Down_Corner_Frame_Pane",new Dark_Green_Simple_Right_Down_Corner_Frame_Pane("Dark_Green_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Right_Frame_Pane",new Dark_Green_Simple_Right_Frame_Pane("Dark_Green_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Right_Single_Frame_Pane",new Dark_Green_Simple_Right_Single_Frame_Pane("Dark_Green_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Right_Top_Corner_Frame_Pane",new Dark_Green_Simple_Right_Top_Corner_Frame_Pane("Dark_Green_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Top_Frame_Pane",new Dark_Green_Simple_Top_Frame_Pane("Dark_Green_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Simple_Top_Single_Frame_Pane",new Dark_Green_Simple_Top_Single_Frame_Pane("Dark_Green_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Down_Frame_Pane",new Dark_Purple_Simple_Down_Frame_Pane("Dark_Purple_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Down_Single_Frame_Pane",new Dark_Purple_Simple_Down_Single_Frame_Pane("Dark_Purple_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Left_Down_Corner_Frame_Pane",new Dark_Purple_Simple_Left_Down_Corner_Frame_Pane("Dark_Purple_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Left_Frame_Pane",new Dark_Purple_Simple_Left_Frame_Pane("Dark_Purple_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Left_Single_Frame_Pane",new Dark_Purple_Simple_Left_Single_Frame_Pane("Dark_Purple_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Left_Top_Corner_Frame_Pane",new Dark_Purple_Simple_Left_Top_Corner_Frame_Pane("Dark_Purple_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Middle_Single_Frame_Pane",new Dark_Purple_Simple_Middle_Single_Frame_Pane("Dark_Purple_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Right_Down_Corner_Frame_Pane",new Dark_Purple_Simple_Right_Down_Corner_Frame_Pane("Dark_Purple_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Right_Frame_Pane",new Dark_Purple_Simple_Right_Frame_Pane("Dark_Purple_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Right_Single_Frame_Pane",new Dark_Purple_Simple_Right_Single_Frame_Pane("Dark_Purple_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Right_Top_Corner_Frame_Pane",new Dark_Purple_Simple_Right_Top_Corner_Frame_Pane("Dark_Purple_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Top_Frame_Pane",new Dark_Purple_Simple_Top_Frame_Pane("Dark_Purple_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Purple_Simple_Top_Single_Frame_Pane",new Dark_Purple_Simple_Top_Single_Frame_Pane("Dark_Purple_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Down_Frame__Green_Pane",new Green_Simple_Down_Frame__Green_Pane("Green_Simple_Down_Frame__Green","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Down_Single_Frame_Pane",new Green_Simple_Down_Single_Frame_Pane("Green_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Left_Down_Corner_Frame_Pane",new Green_Simple_Left_Down_Corner_Frame_Pane("Green_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Left_Frame_Pane",new Green_Simple_Left_Frame_Pane("Green_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Left_Single_Frame_Pane",new Green_Simple_Left_Single_Frame_Pane("Green_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Left_Top_Corner_Frame_Pane",new Green_Simple_Left_Top_Corner_Frame_Pane("Green_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Middle_Single_Frame_Pane",new Green_Simple_Middle_Single_Frame_Pane("Green_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Right_Down_Corner_Frame_Pane",new Green_Simple_Right_Down_Corner_Frame_Pane("Green_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Right_Frame_Pane",new Green_Simple_Right_Frame_Pane("Green_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Right_Single_Frame_Pane",new Green_Simple_Right_Single_Frame_Pane("Green_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Right_Top_Corner_Frame_Pane",new Green_Simple_Right_Top_Corner_Frame_Pane("Green_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Top_Frame_Pane",new Green_Simple_Top_Frame_Pane("Green_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Green_Simple_Top_Single_Frame_Pane",new Green_Simple_Top_Single_Frame_Pane("Green_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Down_Frame_Pane",new Magenta_Simple_Down_Frame_Pane("Magenta_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Down_Single_Frame_Pane",new Magenta_Simple_Down_Single_Frame_Pane("Magenta_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Left_Down_Corner_Frame_Pane",new Magenta_Simple_Left_Down_Corner_Frame_Pane("Magenta_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Left_Frame_Pane",new Magenta_Simple_Left_Frame_Pane("Magenta_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Left_Single_Frame_Pane",new Magenta_Simple_Left_Single_Frame_Pane("Magenta_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Left_Top_Corner_Frame_Pane",new Magenta_Simple_Left_Top_Corner_Frame_Pane("Magenta_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Middle_Single_Frame_Pane",new Magenta_Simple_Middle_Single_Frame_Pane("Magenta_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Right_Down_Corner_Frame_Pane",new Magenta_Simple_Right_Down_Corner_Frame_Pane("Magenta_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Right_Frame_Pane",new Magenta_Simple_Right_Frame_Pane("Magenta_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Right_Single_Frame_Pane",new Magenta_Simple_Right_Single_Frame_Pane("Magenta_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Right_Top_Corner_Frame_Pane",new Magenta_Simple_Right_Top_Corner_Frame_Pane("Magenta_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Top_Frame_Pane",new Magenta_Simple_Top_Frame_Pane("Magenta_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Magenta_Simple_Top_Single_Frame_Pane",new Magenta_Simple_Top_Single_Frame_Pane("Magenta_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Down_Frame_Pane",new Orange_Simple_Down_Frame_Pane("Orange_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Down_Single_Frame_Pane",new Orange_Simple_Down_Single_Frame_Pane("Orange_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Left_Down_Corner_Frame_Pane",new Orange_Simple_Left_Down_Corner_Frame_Pane("Orange_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Left_Frame_Pane",new Orange_Simple_Left_Frame_Pane("Orange_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Left_Single_Frame_Pane",new Orange_Simple_Left_Single_Frame_Pane("Orange_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Left_Top_Corner_Frame_Pane",new Orange_Simple_Left_Top_Corner_Frame_Pane("Orange_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Middle_Single_Frame_Pane",new Orange_Simple_Middle_Single_Frame_Pane("Orange_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Right_Down_Corner_Frame_Pane",new Orange_Simple_Right_Down_Corner_Frame_Pane("Orange_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Right_Frame_Pane",new Orange_Simple_Right_Frame_Pane("Orange_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Right_Single_Frame_Pane",new Orange_Simple_Right_Single_Frame_Pane("Orange_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Right_Top_Corner_Frame_Pane",new Orange_Simple_Right_Top_Corner_Frame_Pane("Orange_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Top_Frame_Pane",new Orange_Simple_Top_Frame_Pane("Orange_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Orange_Simple_Top_Single_Frame_Pane",new Orange_Simple_Top_Single_Frame_Pane("Orange_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Down_Frame_Pane",new Pink_Simple_Down_Frame_Pane("Pink_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Down_Single_Frame_Pane",new Pink_Simple_Down_Single_Frame_Pane("Pink_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Left_Down_Corner_Frame_Pane",new Pink_Simple_Left_Down_Corner_Frame_Pane("Pink_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Left_Frame_Pane",new Pink_Simple_Left_Frame_Pane("Pink_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Left_Single_Frame_Pane",new Pink_Simple_Left_Single_Frame_Pane("Pink_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Left_Top_Corner_Frame_Pane",new Pink_Simple_Left_Top_Corner_Frame_Pane("Pink_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Middle_Single_Frame_Pane",new Pink_Simple_Middle_Single_Frame_Pane("Pink_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Right_Down_Corner_Frame_Pane",new Pink_Simple_Right_Down_Corner_Frame_Pane("Pink_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Right_Frame_Pane",new Pink_Simple_Right_Frame_Pane("Pink_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Right_Single_Frame_Pane",new Pink_Simple_Right_Single_Frame_Pane("Pink_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Right_Top_Corner_Frame_Pane",new Pink_Simple_Right_Top_Corner_Frame_Pane("Pink_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Top_Frame_Pane",new Pink_Simple_Top_Frame_Pane("Pink_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Pink_Simple_Top_Single_Frame_Pane",new Pink_Simple_Top_Single_Frame_Pane("Pink_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Down_Frame_Pane",new Purple_Simple_Down_Frame_Pane("Purple_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Down_Single_Frame_Pane",new Purple_Simple_Down_Single_Frame_Pane("Purple_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Left_Down_Corner_Frame_Pane",new Purple_Simple_Left_Down_Corner_Frame_Pane("Purple_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Left_Frame_Pane",new Purple_Simple_Left_Frame_Pane("Purple_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Left_Single_Frame_Pane",new Purple_Simple_Left_Single_Frame_Pane("Purple_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Left_Top_Corner_Frame_Pane",new Purple_Simple_Left_Top_Corner_Frame_Pane("Purple_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Middle_Single_Frame_Pane",new Purple_Simple_Middle_Single_Frame_Pane("Purple_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Right_Down_Corner_Frame_Pane",new Purple_Simple_Right_Down_Corner_Frame_Pane("Purple_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Right_Frame_Pane",new Purple_Simple_Right_Frame_Pane("Purple_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Right_Single_Frame_Pane",new Purple_Simple_Right_Single_Frame_Pane("Purple_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Right_Top_Corner_Frame_Pane",new Purple_Simple_Right_Top_Corner_Frame_Pane("Purple_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Top_Frame_Pane",new Purple_Simple_Top_Frame_Pane("Purple_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Purple_Simple_Top_Single_Frame_Pane",new Purple_Simple_Top_Single_Frame_Pane("Purple_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Down_Frame_Pane",new Red_Simple_Down_Frame_Pane("Red_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Down_Single_Frame_Pane",new Red_Simple_Down_Single_Frame_Pane("Red_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Left_Down_Corner_Frame_Pane",new Red_Simple_Left_Down_Corner_Frame_Pane("Red_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Left_Frame_Pane",new Red_Simple_Left_Frame_Pane("Red_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Left_Single_Frame_Pane",new Red_Simple_Left_Single_Frame_Pane("Red_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Left_Top_Corner_Frame_Pane",new Red_Simple_Left_Top_Corner_Frame_Pane("Red_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Middle_Single_Frame_Pane",new Red_Simple_Middle_Single_Frame_Pane("Red_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Right_Down_Corner_Frame_Pane",new Red_Simple_Right_Down_Corner_Frame_Pane("Red_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Right_Frame__Red_Pane",new Red_Simple_Right_Frame__Red_Pane("Red_Simple_Right_Frame__Red","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Right_Single_Frame_Pane",new Red_Simple_Right_Single_Frame_Pane("Red_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Right_Top_Corner_Frame_Pane",new Red_Simple_Right_Top_Corner_Frame_Pane("Red_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Top_Frame_Pane",new Red_Simple_Top_Frame_Pane("Red_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Red_Simple_Top_Single_Frame_Pane",new Red_Simple_Top_Single_Frame_Pane("Red_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Down_Frame_Pane",new White_Simple_Down_Frame_Pane("White_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Down_Single_Frame_Pane",new White_Simple_Down_Single_Frame_Pane("White_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Left_Down_Corner_Frame_Pane",new White_Simple_Left_Down_Corner_Frame_Pane("White_Simple_Left_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Left_Frame_Pane",new White_Simple_Left_Frame_Pane("White_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Left_Single_Frame_Pane",new White_Simple_Left_Single_Frame_Pane("White_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Left_Top_Corner_Frame_Pane",new White_Simple_Left_Top_Corner_Frame_Pane("White_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Middle_Single_Frame_Pane",new White_Simple_Middle_Single_Frame_Pane("White_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Right_Down_Corner_Frame_Pane",new White_Simple_Right_Down_Corner_Frame_Pane("White_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Right_Frame_Pane",new White_Simple_Right_Frame_Pane("White_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Right_Single_Frame_Pane",new White_Simple_Right_Single_Frame_Pane("White_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Right_Top_Corner_Frame_Pane",new White_Simple_Right_Top_Corner_Frame_Pane("White_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("White_Simple_Top_Single_Frame_Pane",new White_Simple_Top_Single_Frame_Pane("White_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Down_Frame_Pane",new Yellow_Simple_Down_Frame_Pane("Yellow_Simple_Down_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Down_Single_Frame_Pane",new Yellow_Simple_Down_Single_Frame_Pane("Yellow_Simple_Down_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Left_Down_Corner_frame_Pane",new Yellow_Simple_Left_Down_Corner_frame_Pane("Yellow_Simple_Left_Down_Corner_frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Left_Frame_Pane",new Yellow_Simple_Left_Frame_Pane("Yellow_Simple_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Left_Single_Frame_Pane",new Yellow_Simple_Left_Single_Frame_Pane("Yellow_Simple_Left_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Left_Top_Corner_Frame_Pane",new Yellow_Simple_Left_Top_Corner_Frame_Pane("Yellow_Simple_Left_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Middle_Single_Frame_Pane",new Yellow_Simple_Middle_Single_Frame_Pane("Yellow_Simple_Middle_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Right_Down_Corner_Frame_Pane",new Yellow_Simple_Right_Down_Corner_Frame_Pane("Yellow_Simple_Right_Down_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Right_Frame_Pane",new Yellow_Simple_Right_Frame_Pane("Yellow_Simple_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Right_Single_Frame_Pane",new Yellow_Simple_Right_Single_Frame_Pane("Yellow_Simple_Right_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Right_Top_Corner_Frame_Pane",new Yellow_Simple_Right_Top_Corner_Frame_Pane("Yellow_Simple_Right_Top_Corner_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Top_Frame_Pane",new Yellow_Simple_Top_Frame_Pane("Yellow_Simple_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Yellow_Simple_Top_Single_Frame_Pane",new Yellow_Simple_Top_Single_Frame_Pane("Yellow_Simple_Top_Single_Frame","Glass_Trim").setCreativeTab(tabGlass));
	


blockRef.put("Black_Elegant_Wooden_Bottom_Frame_Pane",new Black_Elegant_Wooden_Bottom_Frame_Pane("Black_Elegant_Wooden_Bottom_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Bottom_Left_Frame_Pane",new Black_Elegant_Wooden_Bottom_Left_Frame_Pane("Black_Elegant_Wooden_Bottom_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Bottom_Right_Frame_Pane",new Black_Elegant_Wooden_Bottom_Right_Frame_Pane("Black_Elegant_Wooden_Bottom_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Full_Frame_Pane",new Black_Elegant_Wooden_Full_Frame_Pane("Black_Elegant_Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Left_Frame_Pane",new Black_Elegant_Wooden_Left_Frame_Pane("Black_Elegant_Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Middle_Glass_Pane",new Black_Elegant_Wooden_Middle_Glass_Pane("Black_Elegant_Wooden_Middle_Glass","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Right_Frame_Pane",new Black_Elegant_Wooden_Right_Frame_Pane("Black_Elegant_Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Bottom_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Bottom_Side_Frame_Pane("Black_Elegant_Wooden_Single_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Left_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Left_Side_Frame_Pane("Black_Elegant_Wooden_Single_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane("Black_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame_Pane("Black_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Right_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Right_Side_Frame_Pane("Black_Elegant_Wooden_Single_Right_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Single_Top_Side_Frame_Pane",new Black_Elegant_Wooden_Single_Top_Side_Frame_Pane("Black_Elegant_Wooden_Single_Top_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Top_Frame_Pane",new Black_Elegant_Wooden_Top_Frame_Pane("Black_Elegant_Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Top_Left_Frame_Pane",new Black_Elegant_Wooden_Top_Left_Frame_Pane("Black_Elegant_Wooden_Top_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Black_Elegant_Wooden_Top_Right_Frame_Pane",new Black_Elegant_Wooden_Top_Right_Frame_Pane("Black_Elegant_Wooden_Top_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_WoodenBottom_Left_Frame_Pane",new Clear_Elegant_WoodenBottom_Left_Frame_Pane("Clear_Elegant_WoodenBottom_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Bottom_Frame_Pane",new Clear_Elegant_Wooden_Bottom_Frame_Pane("Clear_Elegant_Wooden_Bottom_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Bottom_Right_Frame_Pane",new Clear_Elegant_Wooden_Bottom_Right_Frame_Pane("Clear_Elegant_Wooden_Bottom_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Full_Frame_Pane",new Clear_Elegant_Wooden_Full_Frame_Pane("Clear_Elegant_Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Left_Frame_Pane",new Clear_Elegant_Wooden_Left_Frame_Pane("Clear_Elegant_Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Right_Frame_Pane",new Clear_Elegant_Wooden_Right_Frame_Pane("Clear_Elegant_Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Bottom_Side_Frame_Pane",new Clear_Elegant_Wooden_Single_Bottom_Side_Frame_Pane("Clear_Elegant_Wooden_Single_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Left_Side_Frame_Pane",new Clear_Elegant_Wooden_Single_Left_Side_Frame_Pane("Clear_Elegant_Wooden_Single_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Middle_Right_Left_Side_Frames_Pane",new Clear_Elegant_Wooden_Single_Middle_Right_Left_Side_Frames_Pane("Clear_Elegant_Wooden_Single_Middle_Right_Left_Side_Frames","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane",new Clear_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane("Clear_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Right_Side_Frame_Pane",new Clear_Elegant_Wooden_Single_Right_Side_Frame_Pane("Clear_Elegant_Wooden_Single_Right_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Single_Top_Side_Frame_Pane",new Clear_Elegant_Wooden_Single_Top_Side_Frame_Pane("Clear_Elegant_Wooden_Single_Top_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Top_Frame_Pane",new Clear_Elegant_Wooden_Top_Frame_Pane("Clear_Elegant_Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Top_Left_Frame_Pane",new Clear_Elegant_Wooden_Top_Left_Frame_Pane("Clear_Elegant_Wooden_Top_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden_Top_Right_Frame_Pane",new Clear_Elegant_Wooden_Top_Right_Frame_Pane("Clear_Elegant_Wooden_Top_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Clear_Elegant_Wooden__Middle_Glass_Pane",new Clear_Elegant_Wooden__Middle_Glass_Pane("Clear_Elegant_Wooden__Middle_Glass","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Bottom_Frame_Pane",new Dark_Green_Elegant_Wooden_Bottom_Frame_Pane("Dark_Green_Elegant_Wooden_Bottom_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Bottom_Left_Frame_Pane",new Dark_Green_Elegant_Wooden_Bottom_Left_Frame_Pane("Dark_Green_Elegant_Wooden_Bottom_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Bottom_Right_Frame_Pane",new Dark_Green_Elegant_Wooden_Bottom_Right_Frame_Pane("Dark_Green_Elegant_Wooden_Bottom_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Full_Frame_Pane",new Dark_Green_Elegant_Wooden_Full_Frame_Pane("Dark_Green_Elegant_Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Left_Frame_Pane",new Dark_Green_Elegant_Wooden_Left_Frame_Pane("Dark_Green_Elegant_Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Right_Frame_Pane",new Dark_Green_Elegant_Wooden_Right_Frame_Pane("Dark_Green_Elegant_Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Bottom_Side_Frame_Pane",new Dark_Green_Elegant_Wooden_Single_Bottom_Side_Frame_Pane("Dark_Green_Elegant_Wooden_Single_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Left_Side_Frame_Pane",new Dark_Green_Elegant_Wooden_Single_Left_Side_Frame_Pane("Dark_Green_Elegant_Wooden_Single_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane",new Dark_Green_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane("Dark_Green_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane",new Dark_Green_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane("Dark_Green_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Right_Side_Frame_Pane",new Dark_Green_Elegant_Wooden_Single_Right_Side_Frame_Pane("Dark_Green_Elegant_Wooden_Single_Right_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Single_Top_Side_Frame_Pane",new Dark_Green_Elegant_Wooden_Single_Top_Side_Frame_Pane("Dark_Green_Elegant_Wooden_Single_Top_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Top_Frame_Pane",new Dark_Green_Elegant_Wooden_Top_Frame_Pane("Dark_Green_Elegant_Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Top_Left_Frame_Pane",new Dark_Green_Elegant_Wooden_Top_Left_Frame_Pane("Dark_Green_Elegant_Wooden_Top_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Elegant_Wooden_Top_Right_Frame_Pane",new Dark_Green_Elegant_Wooden_Top_Right_Frame_Pane("Dark_Green_Elegant_Wooden_Top_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Dark_Green_Middle_Glass_Pane",new Dark_Green_Middle_Glass_Pane("Dark_Green_Middle_Glass","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Bottom_Frame_Pane",new Elegant_Wooden_Bottom_Frame_Pane("Elegant_Wooden_Bottom_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Bottom_Left_Frame_Pane",new Elegant_Wooden_Bottom_Left_Frame_Pane("Elegant_Wooden_Bottom_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Bottom_Right_Frame_Pane",new Elegant_Wooden_Bottom_Right_Frame_Pane("Elegant_Wooden_Bottom_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Full_Frame_Pane",new Elegant_Wooden_Full_Frame_Pane("Elegant_Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Left_Frame_Pane",new Elegant_Wooden_Left_Frame_Pane("Elegant_Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Middle_Glass_Pane",new Elegant_Wooden_Middle_Glass_Pane("Elegant_Wooden_Middle_Glass","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Right_Frame_Pane",new Elegant_Wooden_Right_Frame_Pane("Elegant_Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Bottom_Side_Frame_Pane",new Elegant_Wooden_Single_Bottom_Side_Frame_Pane("Elegant_Wooden_Single_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Left_Side_Frame_Pane",new Elegant_Wooden_Single_Left_Side_Frame_Pane("Elegant_Wooden_Single_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Middle_Right_Left_Side_Frames_Pane",new Elegant_Wooden_Single_Middle_Right_Left_Side_Frames_Pane("Elegant_Wooden_Single_Middle_Right_Left_Side_Frames","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane",new Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames_Pane("Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frames","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Right_Side_Frame_Pane",new Elegant_Wooden_Single_Right_Side_Frame_Pane("Elegant_Wooden_Single_Right_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Single_Top_Side_Frame_Pane",new Elegant_Wooden_Single_Top_Side_Frame_Pane("Elegant_Wooden_Single_Top_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Top_Frame_Pane",new Elegant_Wooden_Top_Frame_Pane("Elegant_Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Top_Left_Frame_Pane",new Elegant_Wooden_Top_Left_Frame_Pane("Elegant_Wooden_Top_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Top_Right_Frame_Pane",new Elegant_Wooden_Top_Right_Frame_Pane("Elegant_Wooden_Top_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Bottom_Frame_Pane",new Light_Blue_Elegant_Wooden_Bottom_Frame_Pane("Light_Blue_Elegant_Wooden_Bottom_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Bottom_Left_Frame_Pane",new Light_Blue_Elegant_Wooden_Bottom_Left_Frame_Pane("Light_Blue_Elegant_Wooden_Bottom_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Bottom_Right_Frame_Pane",new Light_Blue_Elegant_Wooden_Bottom_Right_Frame_Pane("Light_Blue_Elegant_Wooden_Bottom_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Full_Frame_Pane",new Light_Blue_Elegant_Wooden_Full_Frame_Pane("Light_Blue_Elegant_Wooden_Full_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Left_Frame_Pane",new Light_Blue_Elegant_Wooden_Left_Frame_Pane("Light_Blue_Elegant_Wooden_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Middle_Glass_Pane",new Light_Blue_Elegant_Wooden_Middle_Glass_Pane("Light_Blue_Elegant_Wooden_Middle_Glass","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Right_Frame_Pane",new Light_Blue_Elegant_Wooden_Right_Frame_Pane("Light_Blue_Elegant_Wooden_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Single_Bottom_Side_Frame_Pane",new Light_Blue_Elegant_Wooden_Single_Bottom_Side_Frame_Pane("Light_Blue_Elegant_Wooden_Single_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane",new Light_Blue_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame_Pane("Light_Blue_Elegant_Wooden_Single_Middle_Right_Left_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame_Pane",new Light_Blue_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame_Pane("Light_Blue_Elegant_Wooden_Single_Middle_Top_Bottom_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Single_Right_Side_Frame_Pane",new Light_Blue_Elegant_Wooden_Single_Right_Side_Frame_Pane("Light_Blue_Elegant_Wooden_Single_Right_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Single_Top_Side_Frame_Pane",new Light_Blue_Elegant_Wooden_Single_Top_Side_Frame_Pane("Light_Blue_Elegant_Wooden_Single_Top_Side_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Top_Frame_Pane",new Light_Blue_Elegant_Wooden_Top_Frame_Pane("Light_Blue_Elegant_Wooden_Top_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Top_Left_Frame_Pane",new Light_Blue_Elegant_Wooden_Top_Left_Frame_Pane("Light_Blue_Elegant_Wooden_Top_Left_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Light_Blue_Elegant_Wooden_Top_Right_Frame_Pane",new Light_Blue_Elegant_Wooden_Top_Right_Frame_Pane("Light_Blue_Elegant_Wooden_Top_Right_Frame","Glass_Trim").setCreativeTab(tabGlass));
	
blockRef.put("Elegant_Wooden_Full_Frame", new Elegant_Wooden_Full_Frame().setCreativeTab(tabGlass));
blockRef.put("Clear_Elegant_Wooden_Full_Frame", new Clear_Elegant_Wooden_Full_Frame().setCreativeTab(tabGlass));
blockRef.put("Dark_Green_Elegant_Wooden_Full_Frame", new Dark_Green_Elegant_Wooden_Full_Frame().setCreativeTab(tabGlass));
blockRef.put("Black_Elegant_Wooden_Full_Frame", new Black_Elegant_Wooden_Full_Frame().setCreativeTab(tabGlass));
blockRef.put("Light_Blue_Elegant_Wooden_Full_Frame", new Light_Blue_Elegant_Wooden_Full_Frame().setCreativeTab(tabGlass));

blockRef.put("Bamboo_Plank",new Bamboo_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Beach_Plank",new Beach_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Black_Plank",new Black_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Bloody_Plank",new Bloody_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Blue_Plank",new Blue_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Cherry_Plank",new Cherry_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Blue_Plank",new Dark_Blue_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Purple_Plank",new Dark_Purple_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Red_Plank",new Dark_Red_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Light_Blue_Plank",new Light_Blue_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Lime_Green_Plank",new Lime_Green_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Luxury_Boat_Plank",new Luxury_Boat_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Magenta_Plank",new Magenta_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Mesquite_Plank",new Mesquite_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Normal_Plank",new Normal_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Broken_Plank",new Old_Broken_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Plank",new Old_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Vintage_Plank",new Old_Vintage_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Vintage_White_Plank",new Old_Vintage_White_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Orange_Plank",new Orange_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Green_Plank",new Pastel_Green_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Orange_Plank",new Pastel_Orange_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Pink_Plank",new Pastel_Pink_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Purple_Plank",new Pastel_Purple_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Red_Plank",new Pastel_Red_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Yellow_Plank",new Pastel_Yellow_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pink_Plank",new Pink_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Purple_Plank",new Purple_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Red_Plank",new Red_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Solea_Plank",new Solea_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("White_Plank",new White_Plank().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Yellow_Plank",new Yellow_Plank().setCreativeTab(tabNatrualBlocks));
	

blockRef.put("Bamboo_Floor_Wood",new Bamboo_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Beach_Floor_Wood",new Beach_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Black_Floor_Wood",new Black_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Bloody_Floor_Wood",new Bloody_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Blue_Floor_Wood",new Blue_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Cherry_Floor_Wood",new Cherry_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Blue_Floor_Wood",new Dark_Blue_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Purple_Floor_Wood",new Dark_Purple_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Dark_Red_Floor_Wood",new Dark_Red_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("desktop",new desktop().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Light_Blue_Floor_Wood",new Light_Blue_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Lime_Green_Floor_Wood",new Lime_Green_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Luxury_Boat_Floor_Wood",new Luxury_Boat_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Magenta_Floor_Wood",new Magenta_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Mesquite_Floor_Wood",new Mesquite_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Normal_Floor_Wood",new Normal_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Broken_Floor_Wood",new Old_Broken_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Floor_Wood",new Old_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Vintage_Floor_Wood",new Old_Vintage_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Old_Vintage_White_Floor_Wood",new Old_Vintage_White_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Orange_Floor_Wood",new Orange_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Green_Floor_Wood",new Pastel_Green_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Orange_Floor_Wood",new Pastel_Orange_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Pink_Floor_Wood",new Pastel_Pink_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Purple_Floor_Wood",new Pastel_Purple_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Red_Floor_Wood",new Pastel_Red_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pastel_Yellow_Floor_Wood",new Pastel_Yellow_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pink_Floor_Wood",new Pink_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Purple_Floor_Wood",new Purple_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Red_Floor_Wood",new Red_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Solea_Floor_Wood",new Solea_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("White_Floor_Wood",new White_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Yellow_Floor_Wood",new Yellow_Floor_Wood().setCreativeTab(tabNatrualBlocks));
	

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
