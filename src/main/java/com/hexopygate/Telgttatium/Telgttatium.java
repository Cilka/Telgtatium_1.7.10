package com.hexopygate.Telgttatium;

import java.util.HashMap;
import com.hexopygate.Telgttatium.buildingblocks.runes.*;
import com.hexopygate.Telgttatium.buildingblocks.bricks.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.framesborders.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglasspanes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.*;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglasssideframes.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.grasshd.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.*;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.*;
import com.hexopygate.Telgttatium.Biomes.Volcano.*;
import com.hexopygate.Telgttatium.Biomes.Winter.*;
import com.hexopygate.Telgttatium.Food.*;
import com.hexopygate.Telgttatium.Food.Candy.*;
import com.hexopygate.Telgttatium.Food.FastFood.*;
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
	public static HashMap<String,Item> itemRef = new HashMap<String,Item>();
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

blockRef.put("Bamboo_Wall",new Bamboo_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Beach_Wall",new Beach_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Black_Wall",new Black_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Bloody_Wall",new Bloody_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Blue_Wall",new Blue_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Cherry_Wall",new Cherry_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Blue_Wall",new Dark_Blue_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Purple_Wall",new Dark_Purple_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Red_Wall",new Dark_Red_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Light_Blue_Wall",new Light_Blue_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Lime_Green_Wall",new Lime_Green_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Luxury_Boat_Wall",new Luxury_Boat_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Magenta_Wall",new Magenta_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Mesquite_Wall",new Mesquite_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Normal_Wall",new Normal_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Broken_Wall",new Old_Broken_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Wall",new Old_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Vintage_Wall",new Old_Vintage_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Vintage_White_Wall",new Old_Vintage_White_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Orange_Wall",new Orange_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Green_Wall",new Pastel_Green_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Orange_Wall",new Pastel_Orange_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Pink_Wall",new Pastel_Pink_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Purple_Wall",new Pastel_Purple_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Red_Wall",new Pastel_Red_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Yellow_Wall",new Pastel_Yellow_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pink_Wall",new Pink_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Purple_Wall",new Purple_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Red_Wall",new Red_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Solea_Wall",new Solea_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("White_Wall",new White_Wall().setCreativeTab(tabTelgttatium));
	
blockRef.put("Yellow_Wall",new Yellow_Wall().setCreativeTab(tabTelgttatium));
	

blockRef.put("Bamboo_Floor_Wood",new Bamboo_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Beach_Floor_Wood",new Beach_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Black_Floor_Wood",new Black_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Bloody_Floor_Wood",new Bloody_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Blue_Floor_Wood",new Blue_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Cherry_Floor_Wood",new Cherry_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Blue_Floor_Wood",new Dark_Blue_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Purple_Floor_Wood",new Dark_Purple_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Dark_Red_Floor_Wood",new Dark_Red_Floor_Wood().setCreativeTab(tabTelgttatium));
		
blockRef.put("Light_Blue_Floor_Wood",new Light_Blue_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Lime_Green_Floor_Wood",new Lime_Green_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Luxury_Boat_Floor_Wood",new Luxury_Boat_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Magenta_Floor_Wood",new Magenta_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Mesquite_Floor_Wood",new Mesquite_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Normal_Floor_Wood",new Normal_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Broken_Floor_Wood",new Old_Broken_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Floor_Wood",new Old_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Vintage_Floor_Wood",new Old_Vintage_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Old_Vintage_White_Floor_Wood",new Old_Vintage_White_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Orange_Floor_Wood",new Orange_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Green_Floor_Wood",new Pastel_Green_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Orange_Floor_Wood",new Pastel_Orange_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Pink_Floor_Wood",new Pastel_Pink_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Purple_Floor_Wood",new Pastel_Purple_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Red_Floor_Wood",new Pastel_Red_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pastel_Yellow_Floor_Wood",new Pastel_Yellow_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Pink_Floor_Wood",new Pink_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Purple_Floor_Wood",new Purple_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Red_Floor_Wood",new Red_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Solea_Floor_Wood",new Solea_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("White_Floor_Wood",new White_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Yellow_Floor_Wood",new Yellow_Floor_Wood().setCreativeTab(tabTelgttatium));
	
blockRef.put("Alpa_Chiseled",new Alpa_Chiseled().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Chiseled_Neon_night",new Alpa_Chiseled_Neon_night().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Chiseled_Stone",new Alpa_Chiseled_Stone().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Chiseled_Sunset",new Alpa_Chiseled_Sunset().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Decorative_Wall",new Alpa_Decorative_Wall().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Decorative_Wall_Sunset",new Alpa_Decorative_Wall_Sunset().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Decorative_Wall__Neon_night",new Alpa_Decorative_Wall__Neon_night().setCreativeTab(tabTelRunes));
	
blockRef.put("Alpa_Decorative_Wall__Stone",new Alpa_Decorative_Wall__Stone().setCreativeTab(tabTelRunes));
	
blockRef.put("Another_World_rune",new Another_World_rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled",new Arka_Chiseled().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled_Blue",new Arka_Chiseled_Blue().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled_Gold",new Arka_Chiseled_Gold().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled_Green",new Arka_Chiseled_Green().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled_Grey",new Arka_Chiseled_Grey().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Chiseled_Red",new Arka_Chiseled_Red().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall",new Arka_Decorative_Wall().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall_Blue",new Arka_Decorative_Wall_Blue().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall__Gold",new Arka_Decorative_Wall__Gold().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall__Green",new Arka_Decorative_Wall__Green().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall__Grey",new Arka_Decorative_Wall__Grey().setCreativeTab(tabTelRunes));
	
blockRef.put("Arka_Decorative_Wall__Red",new Arka_Decorative_Wall__Red().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Rune_Tile",new Celtic_Rune_Tile().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Another_World",new Celtic_Tile_Another_World().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Blue",new Celtic_Tile_Blue().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Cream",new Celtic_Tile_Cream().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Gold",new Celtic_Tile_Gold().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Green",new Celtic_Tile_Green().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Grey",new Celtic_Tile_Grey().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Lightblue",new Celtic_Tile_Lightblue().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Magenta",new Celtic_Tile_Magenta().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Purple",new Celtic_Tile_Purple().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Purple_Another_World",new Celtic_Tile_Purple_Another_World().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Red",new Celtic_Tile_Red().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_White",new Celtic_Tile_White().setCreativeTab(tabTelRunes));
	
blockRef.put("Celtic_Tile_Yellow",new Celtic_Tile_Yellow().setCreativeTab(tabTelRunes));
	
blockRef.put("Dark_Temple_Rune",new Dark_Temple_Rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Giant_Carnival_Plant_Rune",new Giant_Carnival_Plant_Rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled",new Rabic_Chiseled().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Cave_Aqua",new Rabic_Chiseled_Cave_Aqua().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Grey",new Rabic_Chiseled_Grey().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Pink_Pearl",new Rabic_Chiseled_Pink_Pearl().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Wall",new Rabic_Chiseled_Wall().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Wall__Grey",new Rabic_Chiseled_Wall__Grey().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Wall__Yellow",new Rabic_Chiseled_Wall__Yellow().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Wall___Cave_Aqua",new Rabic_Chiseled_Wall___Cave_Aqua().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Wall___Pink_Pearl",new Rabic_Chiseled_Wall___Pink_Pearl().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Chiseled_Yellow",new Rabic_Chiseled_Yellow().setCreativeTab(tabTelRunes));
	
blockRef.put("Rabic_Rune",new Rabic_Rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Red_Eel_Rune",new Red_Eel_Rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Robot_Rune",new Robot_Rune().setCreativeTab(tabTelRunes));
	
blockRef.put("Squid_Rune",new Squid_Rune().setCreativeTab(tabTelRunes));
	
itemRef.put("Apple", new Apple(2,false).setCreativeTab(tabTelFood));
itemRef.put("Apple_Jam_Jar", new Apple_Jam_Jar(2,false).setCreativeTab(tabTelFood));
itemRef.put("Arika_Pumpkin", new Arika_Pumpkin(2,false).setCreativeTab(tabTelFood));
itemRef.put("Ashed_Bread", new Ashed_Bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Banana", new Banana(2,false).setCreativeTab(tabTelFood));
itemRef.put("Barley", new Barley(2,false).setCreativeTab(tabTelFood));
itemRef.put("Blackberry", new Blackberry(2,false).setCreativeTab(tabTelFood));
itemRef.put("Blackberry_Jam_Jar", new Blackberry_Jam_Jar(2,false).setCreativeTab(tabTelFood));
itemRef.put("Blueberry", new Blueberry(2,false).setCreativeTab(tabTelFood));
itemRef.put("Blueberry_Jam_Jar", new Blueberry_Jam_Jar(2,false).setCreativeTab(tabTelFood));
itemRef.put("Blue_Fish", new Blue_Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Border_Bread", new Border_Bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Bread", new Bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Brocoli", new Brocoli(2,false).setCreativeTab(tabTelFood));
itemRef.put("Brown_Mushroom", new Brown_Mushroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Carrot", new Carrot(2,false).setCreativeTab(tabTelFood));
itemRef.put("Chicken", new Chicken(2,false).setCreativeTab(tabTelFood));
itemRef.put("Chicken_thigh", new Chicken_thigh(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cooked_Beef_Meat", new Cooked_Beef_Meat(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cooked_Chiken", new Cooked_Chiken(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cooked_Turkey", new Cooked_Turkey(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cooked_Turkey_copy", new Cooked_Turkey_copy(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cow_Meat", new Cow_Meat(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cow_Milk", new Cow_Milk(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Apple", new Cutted_Apple(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Banana", new Cutted_Banana(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Carrot", new Cutted_Carrot(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_mushroom", new Cutted_mushroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Onion", new Cutted_Onion(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Pear", new Cutted_Pear(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Pineapple", new Cutted_Pineapple(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Pumpkin", new Cutted_Pumpkin(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_strawberry", new Cutted_strawberry(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Turnip", new Cutted_Turnip(2,false).setCreativeTab(tabTelFood));
itemRef.put("Cutted_Watermelon", new Cutted_Watermelon(2,false).setCreativeTab(tabTelFood));
itemRef.put("Decomposed_Shana", new Decomposed_Shana(2,false).setCreativeTab(tabTelFood));
itemRef.put("Desert_Octopus_tentacle", new Desert_Octopus_tentacle(2,false).setCreativeTab(tabTelFood));
itemRef.put("Fish", new Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Fish_Fillet", new Fish_Fillet(2,false).setCreativeTab(tabTelFood));
itemRef.put("Goldem_Turkey", new Goldem_Turkey(2,false).setCreativeTab(tabTelFood));
itemRef.put("Golden_Cooked_Turkey", new Golden_Cooked_Turkey(2,false).setCreativeTab(tabTelFood));
itemRef.put("Green_Fish", new Green_Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Kakurna_Pumpkin", new Kakurna_Pumpkin(2,false).setCreativeTab(tabTelFood));
itemRef.put("Light_Octopus_Tentacle", new Light_Octopus_Tentacle(2,false).setCreativeTab(tabTelFood));
itemRef.put("Light_Teshia", new Light_Teshia(2,false).setCreativeTab(tabTelFood));
itemRef.put("Lima_Slides", new Lima_Slides(2,false).setCreativeTab(tabTelFood));
itemRef.put("Limon_Jam_Jar", new Limon_Jam_Jar(2,false).setCreativeTab(tabTelFood));
itemRef.put("Limon_Slides", new Limon_Slides(2,false).setCreativeTab(tabTelFood));
itemRef.put("Maicy_Mushroom", new Maicy_Mushroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Maicy_Posioned_Mushroom", new Maicy_Posioned_Mushroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mango", new Mango(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mango_Slides", new Mango_Slides(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Blue_bread", new Mysterious_Blue_bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Gold_bread", new Mysterious_Gold_bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Pumpkin_type_1", new Mysterious_Pumpkin_type_1(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Pumpkin_type_2", new Mysterious_Pumpkin_type_2(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Pumpkin_type_3", new Mysterious_Pumpkin_type_3(2,false).setCreativeTab(tabTelFood));
itemRef.put("Mysterious_Red_Bread", new Mysterious_Red_Bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Octopus_Tentacle", new Octopus_Tentacle(2,false).setCreativeTab(tabTelFood));
itemRef.put("Onion", new Onion(2,false).setCreativeTab(tabTelFood));
itemRef.put("Orange", new Orange(2,false).setCreativeTab(tabTelFood));
itemRef.put("Orange_Fish", new Orange_Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Orange_Slides", new Orange_Slides(2,false).setCreativeTab(tabTelFood));
itemRef.put("Pear", new Pear(2,false).setCreativeTab(tabTelFood));
itemRef.put("Pineapple", new Pineapple(2,false).setCreativeTab(tabTelFood));
itemRef.put("Poisoned_Teshia", new Poisoned_Teshia(2,false).setCreativeTab(tabTelFood));
itemRef.put("Poisoning_Mushroom", new Poisoning_Mushroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Poison_Cow_Meat", new Poison_Cow_Meat(2,false).setCreativeTab(tabTelFood));
itemRef.put("Pre_HotDog", new Pre_HotDog(2,false).setCreativeTab(tabTelFood));
itemRef.put("Pumpkin", new Pumpkin(2,false).setCreativeTab(tabTelFood));
itemRef.put("Purple_Fish", new Purple_Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Red_Fish", new Red_Fish(2,false).setCreativeTab(tabTelFood));
itemRef.put("Red_musroom", new Red_musroom(2,false).setCreativeTab(tabTelFood));
itemRef.put("Shana", new Shana(2,false).setCreativeTab(tabTelFood));
itemRef.put("Slide_of_bread", new Slide_of_bread(2,false).setCreativeTab(tabTelFood));
itemRef.put("Strawberry", new Strawberry(2,false).setCreativeTab(tabTelFood));
itemRef.put("Strawberry_Jam_Jar", new Strawberry_Jam_Jar(2,false).setCreativeTab(tabTelFood));
itemRef.put("Teshia", new Teshia(2,false).setCreativeTab(tabTelFood));
itemRef.put("Tupia", new Tupia(2,false).setCreativeTab(tabTelFood));
itemRef.put("Turnip", new Turnip(2,false).setCreativeTab(tabTelFood));
itemRef.put("Water_Melon", new Water_Melon(2,false).setCreativeTab(tabTelFood));
itemRef.put("Wheat", new Wheat(2,false).setCreativeTab(tabTelFood));
itemRef.put("Yellow_Fish", new Yellow_Fish(2,false).setCreativeTab(tabTelFood));

itemRef.put("Arkea_Drink_Big_size", new Arkea_Drink_Big_size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Arkea_Drink_Regular_Size", new Arkea_Drink_Regular_Size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("ArkTeshia_wine", new ArkTeshia_wine(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Ark_Orange_Wine", new Ark_Orange_Wine(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Ark_Shana_wine", new Ark_Shana_wine(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Ark_Wine", new Ark_Wine(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Blueberry_ice_cream_bowl", new Blueberry_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Blue_Jelly_Full_Pizza", new Blue_Jelly_Full_Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Blue_Jelly_Pizza", new Blue_Jelly_Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Blue_Strawberry_mix_ice_cream_bowl", new Blue_Strawberry_mix_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Brochettes", new Brochettes(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Burger", new Burger(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Chiken_tenders", new Chiken_tenders(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Chinesse_food", new Chinesse_food(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Coffee", new Coffee(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Cooked_patty", new Cooked_patty(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Cooked_Roll_patty", new Cooked_Roll_patty(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("DeepSeafood", new DeepSeafood(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("French_fries", new French_fries(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Full_Pizza", new Full_Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Grape_ice_cream_bowl", new Grape_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Hot_Dog", new Hot_Dog(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Jelly_Full_Pizza", new Jelly_Full_Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Jelly_Pizza", new Jelly_Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Lemon_ice_cream_bowl", new Lemon_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Mango_ice_cream_bowl", new Mango_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Mixed_Ramen", new Mixed_Ramen(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Orange_Blue_mix_ice_cream_bowl", new Orange_Blue_mix_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Orange_Drink", new Orange_Drink(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Orange_ice_cream_bowl", new Orange_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Patty", new Patty(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Pineapple_Drink_Big_size", new Pineapple_Drink_Big_size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Pineapple_Drink_Regular_Size", new Pineapple_Drink_Regular_Size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Pizza", new Pizza(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Popcorn", new Popcorn(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Ramen", new Ramen(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Random_food_Item_Gift", new Random_food_Item_Gift(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Random_Seed_Gift", new Random_Seed_Gift(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Random_Weapon_Gift", new Random_Weapon_Gift(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Rice", new Rice(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Riceball", new Riceball(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Rich_Rice", new Rich_Rice(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Roll_patty", new Roll_patty(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Seafood", new Seafood(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Shana_Drink", new Shana_Drink(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Soda_Drink_Big_Size", new Soda_Drink_Big_Size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Soda_Drink_Regular_Size", new Soda_Drink_Regular_Size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("SpringHeart_Drink_Big_size", new SpringHeart_Drink_Big_size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("SpringHeart_Drink_Regular_Size", new SpringHeart_Drink_Regular_Size(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Strawberry_Green_mix_ice_cream_bowl", new Strawberry_Green_mix_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Strawberry_ice_cream_bowl", new Strawberry_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Tea", new Tea(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Teshia_Drink", new Teshia_Drink(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Vanilla_ice_cream_bowl", new Vanilla_ice_cream_bowl(7,false).setCreativeTab(tabTelFastFood));
itemRef.put("Wine_Drink", new Wine_Drink(7,false).setCreativeTab(tabTelFastFood));

itemRef.put("Ark_Diet_soda", new Ark_Diet_soda(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Ark_Light_Soda", new Ark_Light_Soda(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Ark_Soda", new Ark_Soda(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Banana_Bombon", new Banana_Bombon(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Blackberry_sweet", new Blackberry_sweet(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Blueberry_sweet", new Blueberry_sweet(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Blue_Lolipop", new Blue_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Candy_cane", new Candy_cane(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cherry_sweet", new Cherry_sweet(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Chocolate_bar", new Chocolate_bar(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Chocolate_chip_Cookie", new Chocolate_chip_Cookie(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Chocolate_ice_cream", new Chocolate_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cool_Blue_ice_cream", new Cool_Blue_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cool_Green_ice_cream", new Cool_Green_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cool_Orange_ice_cream", new Cool_Orange_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cool_Purple_ice_cream", new Cool_Purple_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Cool_Red_ice_cream", new Cool_Red_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Fruits_Item", new Fruits_Item(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Gingerbreadman", new Gingerbreadman(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Green_Lolipop", new Green_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Lemon_sweet", new Lemon_sweet(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Orange_Lolipop", new Orange_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Pink_Lolipop", new Pink_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Purple_Lolipop", new Purple_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Rainbow_Lolipop", new Rainbow_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Random_Lolipop", new Random_Lolipop(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Strawberry_ice_cream", new Strawberry_ice_cream(4,false).setCreativeTab(tabTelCandy));
itemRef.put("White_chocolate_bar", new White_chocolate_bar(4,false).setCreativeTab(tabTelCandy));
itemRef.put("Yellow_Lolipop", new Yellow_Lolipop(4,false).setCreativeTab(tabTelCandy));
blockRef.put("Ashed_Tree_Wood",new Ashed_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Birch_Tree_Wood",new Birch_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Cherry_Tree_Wood",new Cherry_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Jungle_Rare_Tree_Wood",new Jungle_Rare_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Palm_Tree_Wood__1",new Palm_Tree_Wood__1().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Palm_Tree_Wood__2",new Palm_Tree_Wood__2().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Pine_Tree_Wood",new Pine_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Purple_Tree_Wood",new Purple_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Red_Tree_Wood",new Red_Tree_Wood().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Solea_Palm__1",new Solea_Palm__1().setCreativeTab(tabNatrualBlocks));
	
blockRef.put("Solea_Palm__2",new Solea_Palm__2().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Autum_yellow_Grass",new Autum_yellow_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Grass",new Black_Ashes_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Blue_Grass",new Ocean_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Grass",new Cyan_Aquarium_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_poison_grass",new Dark_poison_grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_cave_Grass",new Deep_Blue_cave_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Grass",new Forest_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Grass",new Light_Icey_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Grass",new Normal_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Grass",new Orange_Warm_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Grass",new Purple_Lunatic_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Grass",new Purple_Snow_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Grass",new Red_Sweet_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Grass",new Red_Wood_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1",new Weird_Grass_1().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2",new Weird_Grass_2().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3",new Weird_Grass_3().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Grass",new White_Grass().setCreativeTab(tabNatrualBlocks));



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
	public static CreativeTabs tabTelRunes = new CreativeTabs("tabTelRunes") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockRef.get("Alpa_Chiseled_Neon_night")).getItem();
		}
	};
public static CreativeTabs tabTelFood = new CreativeTabs("tabTelFood") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(itemRef.get("Arika_Pumpkin")).getItem();
	}
};
public static CreativeTabs tabTelFastFood = new CreativeTabs("tabTelFastFood") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(itemRef.get("Chiken_tenders")).getItem();
	}
	
};
public static CreativeTabs tabTelCandy = new CreativeTabs("tabTelCandy") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(itemRef.get("Rainbow_Lolipop")).getItem();
	}
};
}
