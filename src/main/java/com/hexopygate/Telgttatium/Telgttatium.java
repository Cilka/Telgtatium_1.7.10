package com.hexopygate.Telgttatium;

import java.util.HashMap;

import com.hexopygate.Telgttatium.Biomes.EventManager;
import com.hexopygate.Telgttatium.Biomes.Volcano.Lava;
import com.hexopygate.Telgttatium.Biomes.Volcano.Lava_Rock;
import com.hexopygate.Telgttatium.Biomes.Volcano.Magma_Cracked_Rock;
import com.hexopygate.Telgttatium.Biomes.Volcano.Magma_Rock;
import com.hexopygate.Telgttatium.Biomes.Volcano.Magma_Rock_alt;
import com.hexopygate.Telgttatium.Biomes.Winter.Cracked_Ice;
import com.hexopygate.Telgttatium.Biomes.Winter.Hardened_Cracked_Ice;
import com.hexopygate.Telgttatium.Biomes.Winter.Hardened_Ice;
import com.hexopygate.Telgttatium.Biomes.Winter.Ice;
import com.hexopygate.Telgttatium.Biomes.Winter.Ice_Floor;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Ashed_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Blue_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Cyan_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Dark_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Grass_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Green_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Pink_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Purple_Grass;
import com.hexopygate.Telgttatium.Biomes.Winter.Snowcapped_Valley_Grass;
import com.hexopygate.Telgttatium.Biomes.types.TelBiomeGenBase;
import com.hexopygate.Telgttatium.Biomes.types.WorldTypeTelgttatium;
import com.hexopygate.Telgttatium.Dimension.Dimension;
import com.hexopygate.Telgttatium.Food.Apple;
import com.hexopygate.Telgttatium.Food.Apple_Jam_Jar;
import com.hexopygate.Telgttatium.Food.Arika_Pumpkin;
import com.hexopygate.Telgttatium.Food.Ashed_Bread;
import com.hexopygate.Telgttatium.Food.Banana;
import com.hexopygate.Telgttatium.Food.Barley;
import com.hexopygate.Telgttatium.Food.Blackberry;
import com.hexopygate.Telgttatium.Food.Blackberry_Jam_Jar;
import com.hexopygate.Telgttatium.Food.Blue_Fish;
import com.hexopygate.Telgttatium.Food.Blueberry;
import com.hexopygate.Telgttatium.Food.Blueberry_Jam_Jar;
import com.hexopygate.Telgttatium.Food.Border_Bread;
import com.hexopygate.Telgttatium.Food.Bread;
import com.hexopygate.Telgttatium.Food.Brocoli;
import com.hexopygate.Telgttatium.Food.Brown_Mushroom;
import com.hexopygate.Telgttatium.Food.Carrot;
import com.hexopygate.Telgttatium.Food.Chicken;
import com.hexopygate.Telgttatium.Food.Chicken_thigh;
import com.hexopygate.Telgttatium.Food.Cooked_Beef_Meat;
import com.hexopygate.Telgttatium.Food.Cooked_Chiken;
import com.hexopygate.Telgttatium.Food.Cooked_Turkey;
import com.hexopygate.Telgttatium.Food.Cooked_Turkey_copy;
import com.hexopygate.Telgttatium.Food.Cow_Meat;
import com.hexopygate.Telgttatium.Food.Cow_Milk;
import com.hexopygate.Telgttatium.Food.Cutted_Apple;
import com.hexopygate.Telgttatium.Food.Cutted_Banana;
import com.hexopygate.Telgttatium.Food.Cutted_Carrot;
import com.hexopygate.Telgttatium.Food.Cutted_Onion;
import com.hexopygate.Telgttatium.Food.Cutted_Pear;
import com.hexopygate.Telgttatium.Food.Cutted_Pineapple;
import com.hexopygate.Telgttatium.Food.Cutted_Pumpkin;
import com.hexopygate.Telgttatium.Food.Cutted_Turnip;
import com.hexopygate.Telgttatium.Food.Cutted_Watermelon;
import com.hexopygate.Telgttatium.Food.Cutted_mushroom;
import com.hexopygate.Telgttatium.Food.Cutted_strawberry;
import com.hexopygate.Telgttatium.Food.Decomposed_Shana;
import com.hexopygate.Telgttatium.Food.Desert_Octopus_tentacle;
import com.hexopygate.Telgttatium.Food.Fish;
import com.hexopygate.Telgttatium.Food.Fish_Fillet;
import com.hexopygate.Telgttatium.Food.Goldem_Turkey;
import com.hexopygate.Telgttatium.Food.Golden_Cooked_Turkey;
import com.hexopygate.Telgttatium.Food.Green_Fish;
import com.hexopygate.Telgttatium.Food.Kakurna_Pumpkin;
import com.hexopygate.Telgttatium.Food.Light_Octopus_Tentacle;
import com.hexopygate.Telgttatium.Food.Light_Teshia;
import com.hexopygate.Telgttatium.Food.Lima_Slides;
import com.hexopygate.Telgttatium.Food.Limon_Jam_Jar;
import com.hexopygate.Telgttatium.Food.Limon_Slides;
import com.hexopygate.Telgttatium.Food.Maicy_Mushroom;
import com.hexopygate.Telgttatium.Food.Maicy_Posioned_Mushroom;
import com.hexopygate.Telgttatium.Food.Mango;
import com.hexopygate.Telgttatium.Food.Mango_Slides;
import com.hexopygate.Telgttatium.Food.Mysterious_Blue_bread;
import com.hexopygate.Telgttatium.Food.Mysterious_Gold_bread;
import com.hexopygate.Telgttatium.Food.Mysterious_Pumpkin_type_1;
import com.hexopygate.Telgttatium.Food.Mysterious_Pumpkin_type_2;
import com.hexopygate.Telgttatium.Food.Mysterious_Pumpkin_type_3;
import com.hexopygate.Telgttatium.Food.Mysterious_Red_Bread;
import com.hexopygate.Telgttatium.Food.Octopus_Tentacle;
import com.hexopygate.Telgttatium.Food.Onion;
import com.hexopygate.Telgttatium.Food.Orange;
import com.hexopygate.Telgttatium.Food.Orange_Fish;
import com.hexopygate.Telgttatium.Food.Orange_Slides;
import com.hexopygate.Telgttatium.Food.Pear;
import com.hexopygate.Telgttatium.Food.Pineapple;
import com.hexopygate.Telgttatium.Food.Poison_Cow_Meat;
import com.hexopygate.Telgttatium.Food.Poisoned_Teshia;
import com.hexopygate.Telgttatium.Food.Poisoning_Mushroom;
import com.hexopygate.Telgttatium.Food.Pre_HotDog;
import com.hexopygate.Telgttatium.Food.Pumpkin;
import com.hexopygate.Telgttatium.Food.Purple_Fish;
import com.hexopygate.Telgttatium.Food.Red_Fish;
import com.hexopygate.Telgttatium.Food.Red_musroom;
import com.hexopygate.Telgttatium.Food.Shana;
import com.hexopygate.Telgttatium.Food.Slide_of_bread;
import com.hexopygate.Telgttatium.Food.Strawberry;
import com.hexopygate.Telgttatium.Food.Strawberry_Jam_Jar;
import com.hexopygate.Telgttatium.Food.Teshia;
import com.hexopygate.Telgttatium.Food.Tupia;
import com.hexopygate.Telgttatium.Food.Turnip;
import com.hexopygate.Telgttatium.Food.Water_Melon;
import com.hexopygate.Telgttatium.Food.Wheat;
import com.hexopygate.Telgttatium.Food.Yellow_Fish;
import com.hexopygate.Telgttatium.Food.Candy.Ark_Diet_soda;
import com.hexopygate.Telgttatium.Food.Candy.Ark_Light_Soda;
import com.hexopygate.Telgttatium.Food.Candy.Ark_Soda;
import com.hexopygate.Telgttatium.Food.Candy.Banana_Bombon;
import com.hexopygate.Telgttatium.Food.Candy.Blackberry_sweet;
import com.hexopygate.Telgttatium.Food.Candy.Blue_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Blueberry_sweet;
import com.hexopygate.Telgttatium.Food.Candy.Candy_cane;
import com.hexopygate.Telgttatium.Food.Candy.Cherry_sweet;
import com.hexopygate.Telgttatium.Food.Candy.Chocolate_bar;
import com.hexopygate.Telgttatium.Food.Candy.Chocolate_chip_Cookie;
import com.hexopygate.Telgttatium.Food.Candy.Chocolate_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Cool_Blue_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Cool_Green_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Cool_Orange_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Cool_Purple_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Cool_Red_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.Fruits_Item;
import com.hexopygate.Telgttatium.Food.Candy.Gingerbreadman;
import com.hexopygate.Telgttatium.Food.Candy.Green_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Lemon_sweet;
import com.hexopygate.Telgttatium.Food.Candy.Orange_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Pink_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Purple_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Rainbow_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Random_Lolipop;
import com.hexopygate.Telgttatium.Food.Candy.Strawberry_ice_cream;
import com.hexopygate.Telgttatium.Food.Candy.White_chocolate_bar;
import com.hexopygate.Telgttatium.Food.Candy.Yellow_Lolipop;
import com.hexopygate.Telgttatium.Food.FastFood.ArkTeshia_wine;
import com.hexopygate.Telgttatium.Food.FastFood.Ark_Orange_Wine;
import com.hexopygate.Telgttatium.Food.FastFood.Ark_Shana_wine;
import com.hexopygate.Telgttatium.Food.FastFood.Ark_Wine;
import com.hexopygate.Telgttatium.Food.FastFood.Arkea_Drink_Big_size;
import com.hexopygate.Telgttatium.Food.FastFood.Arkea_Drink_Regular_Size;
import com.hexopygate.Telgttatium.Food.FastFood.Blue_Jelly_Full_Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Blue_Jelly_Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Blue_Strawberry_mix_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Blueberry_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Brochettes;
import com.hexopygate.Telgttatium.Food.FastFood.Burger;
import com.hexopygate.Telgttatium.Food.FastFood.Chiken_tenders;
import com.hexopygate.Telgttatium.Food.FastFood.Chinesse_food;
import com.hexopygate.Telgttatium.Food.FastFood.Coffee;
import com.hexopygate.Telgttatium.Food.FastFood.Cooked_Roll_patty;
import com.hexopygate.Telgttatium.Food.FastFood.Cooked_patty;
import com.hexopygate.Telgttatium.Food.FastFood.DeepSeafood;
import com.hexopygate.Telgttatium.Food.FastFood.French_fries;
import com.hexopygate.Telgttatium.Food.FastFood.Full_Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Grape_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Hot_Dog;
import com.hexopygate.Telgttatium.Food.FastFood.Jelly_Full_Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Jelly_Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Lemon_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Mango_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Mixed_Ramen;
import com.hexopygate.Telgttatium.Food.FastFood.Orange_Blue_mix_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Orange_Drink;
import com.hexopygate.Telgttatium.Food.FastFood.Orange_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Patty;
import com.hexopygate.Telgttatium.Food.FastFood.Pineapple_Drink_Big_size;
import com.hexopygate.Telgttatium.Food.FastFood.Pineapple_Drink_Regular_Size;
import com.hexopygate.Telgttatium.Food.FastFood.Pizza;
import com.hexopygate.Telgttatium.Food.FastFood.Popcorn;
import com.hexopygate.Telgttatium.Food.FastFood.Ramen;
import com.hexopygate.Telgttatium.Food.FastFood.Random_Seed_Gift;
import com.hexopygate.Telgttatium.Food.FastFood.Random_Weapon_Gift;
import com.hexopygate.Telgttatium.Food.FastFood.Random_food_Item_Gift;
import com.hexopygate.Telgttatium.Food.FastFood.Rice;
import com.hexopygate.Telgttatium.Food.FastFood.Riceball;
import com.hexopygate.Telgttatium.Food.FastFood.Rich_Rice;
import com.hexopygate.Telgttatium.Food.FastFood.Roll_patty;
import com.hexopygate.Telgttatium.Food.FastFood.Seafood;
import com.hexopygate.Telgttatium.Food.FastFood.Shana_Drink;
import com.hexopygate.Telgttatium.Food.FastFood.Soda_Drink_Big_Size;
import com.hexopygate.Telgttatium.Food.FastFood.Soda_Drink_Regular_Size;
import com.hexopygate.Telgttatium.Food.FastFood.SpringHeart_Drink_Big_size;
import com.hexopygate.Telgttatium.Food.FastFood.SpringHeart_Drink_Regular_Size;
import com.hexopygate.Telgttatium.Food.FastFood.Strawberry_Green_mix_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Strawberry_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Tea;
import com.hexopygate.Telgttatium.Food.FastFood.Teshia_Drink;
import com.hexopygate.Telgttatium.Food.FastFood.Vanilla_ice_cream_bowl;
import com.hexopygate.Telgttatium.Food.FastFood.Wine_Drink;
import com.hexopygate.Telgttatium.TileEntities.TEDecoFence;
import com.hexopygate.Telgttatium.TileEntities.TEFence;
import com.hexopygate.Telgttatium.TileEntities.TEHutyveFence;
import com.hexopygate.Telgttatium.TileEntities.TESindrintariaFence;
import com.hexopygate.Telgttatium.TileEntities.TEWoodFence;
import com.hexopygate.Telgttatium.TileEntities.TEWoodFlowerFence;
import com.hexopygate.Telgttatium.TileEntities.TEWoodType2Fence;
import com.hexopygate.Telgttatium.TileEntities.TEWoodVineFence;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Abandoned_Hospital_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Butcher_Kitchen_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Happy_Morning_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Hospital_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Lea_Decorative_Wall;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Lea_Decorative_Wall_Black_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Lea_Decorative_Wall_Black_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Lea_Decorative_Wall_Black_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Lea_Decorative_Wall_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Medieval_Leadu_Wall;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Morning_Kitchen_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Playing_Purple_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Taitud_Vintage_Ceramic_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Taitud_Vintage_Ceramic_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Taitud_Vintage_Ceramic_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.Toxinology_Floor;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Pink;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Purple;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_White;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_Black_Block_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Pastel_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Pastel_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Pastel_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Pastel_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Pink;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Purple;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.BigBlock.Big_White_Block_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Pink;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Purple;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_White;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.Black_Block_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Pastel_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Pastel_Green;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Pastel_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Pastel_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Pink;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Purple;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Red;
import com.hexopygate.Telgttatium.buildingblocks.Ceramics.CheckeredFloor.White_Block_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Empire.Empire_Gray;
import com.hexopygate.Telgttatium.buildingblocks.Empire.Empire_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Empire.Empire_Red;
import com.hexopygate.Telgttatium.buildingblocks.Empire.Empire_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Blue;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Bluestone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Green;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Orange;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Purple;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Red;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Sandstone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_2_Solea_Coral;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_Blue_Moon_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune_Red_Moon_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune__Green_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune__Orange_Moon_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune__Purple_Moon_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Rune__Purpula_Gem;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Deep_Dessert_Stone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Deep_Snow_Cavestone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Deep_Solea_Stone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Forest_stone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Redstone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Sandstone;
import com.hexopygate.Telgttatium.buildingblocks.Sridintaria.Srindintaria_Wall_Stone;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Alternative_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Black_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Blue_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Decorative_Sandstone_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Green_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Mossy_Stone_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Red_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Sandstone_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Snow_Brick;
import com.hexopygate.Telgttatium.buildingblocks.bricks.Stone_Brick;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_x1_0;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_x1_1;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_y1_0;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_y1_1;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_z1_0;
import com.hexopygate.Telgttatium.buildingblocks.city.Cut_lines_z1_1;
import com.hexopygate.Telgttatium.buildingblocks.city.Middle_Line_0;
import com.hexopygate.Telgttatium.buildingblocks.city.Middle_Line_1;
import com.hexopygate.Telgttatium.buildingblocks.city.x1_yellow_ray_0;
import com.hexopygate.Telgttatium.buildingblocks.city.x1_yellow_ray_1;
import com.hexopygate.Telgttatium.buildingblocks.city.y1_yellow_ray_0;
import com.hexopygate.Telgttatium.buildingblocks.city.y1_yellow_ray_1;
import com.hexopygate.Telgttatium.buildingblocks.fences.Bamboo_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Bamboo_fence_Green;
import com.hexopygate.Telgttatium.buildingblocks.fences.Black_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Gold_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Blue_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Cyan_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Dark_Blue_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Green_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Magenta_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Orange_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Pink_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Purple_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Red_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_Yellow_Glass_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Hutyve_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Iron_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Sindrintaria_Athemyst_gem_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Sindrintaria_Diamon_gem_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Sindrintaria_Emerald_gem_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Sindrintaria_Orange_gem_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Sindrintaria_Saphirre_gem_fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.TDive_Green_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Turquoise_plaza_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Valley_Romance_Deco_Fence;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Birch_wood;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Black_wood;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Dark_Oak_wood;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Green;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Orange_wood;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Red;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_planks_Yevollo;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Carpentry_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Coral;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Dark_blue;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Blue;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Coral;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Lime_Green;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Pastel_Orange;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Pastel_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Pink;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Doula_Purple;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Blue;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Dark_Blue;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Orange;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Purple;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Red;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Rose;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Soft_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Floral_Sweet_Green;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_LimeGreen;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Purple;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Solea;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Vines;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Vines_Solea;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_Vines_white;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_old;
import com.hexopygate.Telgttatium.buildingblocks.fences.Wood_fence_type_2_white;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.Black_Elegant_Wooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.Clear_Elegant_Wooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.Dark_Green_Elegant_Wooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.Elegant_Wooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.Light_Blue_Elegant_Wooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.black.BlackElegantWooden_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.clear.ClearElegantWooden_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.darkgreen.DarkGreenElegantWooden_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.lightblue.LightBlueElegantWooden_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.elegantwooden.panes.normal.ElegantWooden_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Black_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Another_World;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Cream;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Gold;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Green;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Grey;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Light_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Purple;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Purple_Another_World;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Red;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Celtic_Glass_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Clear_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Cyan_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Dark_Blue_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Dark_Green_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Dark_Purple_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Green_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Magenta_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Black;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Dark_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Dark_Green;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Dark_Orange;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Dark_Purple;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Green;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Orange;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Pink;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Purple;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Red;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_White;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.NvE_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Orange_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Pink_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Purple_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Red_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.White_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.fullglass.Yellow_Glass;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Another_World_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Cream_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Gold_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Green_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Grey_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Light_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Purple_Another_World_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Purple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Red_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.Celtic_Glass_Yellow_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Black_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Cyan_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Dark_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Dark_Green_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Dark_Orange_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Dark_Purple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Green_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Orange_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Pink_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Purple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Red_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_White_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.panes.NvE_Yellow_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Black;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Clear;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Dark_Blue;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Dark_Green;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Dark_Purple;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Green;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Orange;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Pink;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Purple;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Red;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_White;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.Simple_Glass_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Black_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Clear_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Cyan_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Dark_Blue_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Dark_Green_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Dark_Purple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Green_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Magenta_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Orange_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Pink_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Purple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Red_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_White_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simplefullglass.panes.Simple_Glass_Yellow_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.black.BlackSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.blue.BlueSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.clear.ClearSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.cyan.CyanSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkblue.DarkBlueSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkgreen.DarkGreenSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.darkpurple.DarkPurpleSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.green.GreenSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.magenta.MagentaSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.normal.Simple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.orange.OrangeSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.pink.PinkSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.purple.PurpleSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.red.RedSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.white.WhiteSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.wooden.WoodenSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Down_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Down_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Down_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Down_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Full_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Horizontal_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Left_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Middle_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Pane;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Right_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Top_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Top_Left_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Top_Right_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Top_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.glass.simpleglassframes.yellow.YellowSimple_Vertical_Middle_Single_Frame;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_Orange;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_Pink;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_Red;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_blue;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_purple;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_white;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Kojisin_yellow;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_Pink;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_blue;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_orange;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_purple;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_white;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__Koloji_yellow;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__fusy_Kounlik_001;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__fusy_Kounlik_002;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Cleursardi__fusy_Kounlik_003;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Clonexysis_Tile_Green;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Clonexysis_Tile_Lila;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Clonexysis_Tile_Original;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Clonexysis_Tile_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Fivhyna__Green;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Fivhyna__Puple;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Fivhyna__Red;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Fivhyna__yellow;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Blue;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Gold;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Neon_Pink;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Orange;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Pink;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Purple;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_Red;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_neon_cyan;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kuhuno_neon_green;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Summon_Rune;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Zuupa;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Zuupa_Green_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Zuupa_Moon_Blue;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Zuupa_Orange_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_Zuupa_Red_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_rune;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_rune_2;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_2;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_Crimson_moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_Green_moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_Orange_moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_Purple_moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_tile_moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_wall_Simbol;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Kunkasie_wall_Simbol_decorated;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_1;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_2;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_3;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_3_Blue_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_3_Green_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_3_Orange_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_Rune_3_Red_Moon;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_tile_Koonkip_1;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_tile_Koonkip_2;
import com.hexopygate.Telgttatium.buildingblocks.lujillkanses.Senaanti_tile_Koonkip_3;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Ashed_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Ashed_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Blood_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Blue_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Blue_Purple_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Blue_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dark_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dark_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Desert_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Desert_Grass_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Desert_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Desert_Sand_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Desert_Valley_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirty_Grass_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirty_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirty_Valley_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Green_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Green_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Lavender_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Mossy_Green_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Orange_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Pink_Ashed_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Pink_Cyan_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Pink_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Purple_Red_Grass;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Underground_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Underwater_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.White_Stone;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Ashed_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Blue_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Dark_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Dark_Mud;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Desert_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Green_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Mud;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Pink_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Dirt.Purple_Dirt;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Autumn_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Birch_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Blue_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Forest_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Purple_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Red_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.Snow_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.TreeLeaves.White_Leaves;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Ashed_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Birch_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Cherry_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Jungle_Rare_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Palm_Tree_Wood__1;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Palm_Tree_Wood__2;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Pine_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Purple_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Red_Tree_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Solea_Palm__1;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.Solea_Palm__2;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Bamboo_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Beach_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Black_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Bloody_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Blue_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Cherry_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Dark_Blue_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Dark_Purple_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Dark_Red_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Light_Blue_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Lime_Green_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Luxury_Boat_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Magenta_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Mesquite_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Normal_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Old_Broken_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Old_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Old_Vintage_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Old_Vintage_White_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Orange_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Green_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Orange_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Pink_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Purple_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Red_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pastel_Yellow_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Pink_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Purple_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Red_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Solea_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.White_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.floor.Yellow_Floor_Wood;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Bamboo_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Beach_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Black_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Bloody_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Blue_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Cherry_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Dark_Blue_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Dark_Purple_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Dark_Red_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Light_Blue_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Lime_Green_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Luxury_Boat_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Magenta_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Mesquite_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Normal_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Old_Broken_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Old_Vintage_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Old_Vintage_White_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Old_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Orange_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Green_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Orange_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Pink_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Purple_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Red_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pastel_Yellow_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Pink_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Purple_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Red_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Solea_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.White_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.Wood.wall.Yellow_Wall;
import com.hexopygate.Telgttatium.buildingblocks.naturalblocks.grasshd.*;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Aqua;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Orange;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_Sun;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Bionic_Flower_Floor_White;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Orange;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Original;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Galactic_Leaves_Floor_Red;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Orange;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Red;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_White;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.Machine_Arrow_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Orange;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Pink;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Red;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_White;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.bionicstained.Bionic_Stained_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Pink;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Red;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_White;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvestained.NvE_Stained_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Blue;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Cyan;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Green;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Orange;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Pink;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Purple;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Red;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_White;
import com.hexopygate.Telgttatium.buildingblocks.nevoevolution.nvetchtiles.NvE_Tch_Tile_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Chiseled;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Chiseled_Neon_night;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Chiseled_Stone;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Chiseled_Sunset;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Decorative_Wall;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Decorative_Wall_Sunset;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Decorative_Wall__Neon_night;
import com.hexopygate.Telgttatium.buildingblocks.runes.Alpa_Decorative_Wall__Stone;
import com.hexopygate.Telgttatium.buildingblocks.runes.Another_World_rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled_Blue;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled_Gold;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled_Green;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled_Grey;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Chiseled_Red;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall_Blue;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall__Gold;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall__Green;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall__Grey;
import com.hexopygate.Telgttatium.buildingblocks.runes.Arka_Decorative_Wall__Red;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Rune_Tile;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Another_World;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Blue;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Cream;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Gold;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Green;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Grey;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Lightblue;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Magenta;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Purple;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Purple_Another_World;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Red;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_White;
import com.hexopygate.Telgttatium.buildingblocks.runes.Celtic_Tile_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.runes.Dark_Temple_Rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Giant_Carnival_Plant_Rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Cave_Aqua;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Grey;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Pink_Pearl;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Wall;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Wall__Grey;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Wall__Yellow;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Wall___Cave_Aqua;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Wall___Pink_Pearl;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Chiseled_Yellow;
import com.hexopygate.Telgttatium.buildingblocks.runes.Rabic_Rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Red_Eel_Rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Robot_Rune;
import com.hexopygate.Telgttatium.buildingblocks.runes.Squid_Rune;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolAnotherWorld;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolAnotherWorld_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolBlue;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolBlue_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolCream;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolCream_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGold;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGold_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGreen;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGreen_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGrey;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolGrey_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolLightBlue;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolLightBlue_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolMagenta;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolMagenta_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolPurple;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolPurpleAnotherWorld;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolPurpleAnotherWorld_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolPurple_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolRed;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolRed_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolWhite;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolWhite_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolYellow;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CelticWoolYellow_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CoolMountainSportRed;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.CoolMountainSportRed_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicDiamond;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicDiamond_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicWarmMountain;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicWarmMountainYellowWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicWarmMountainYellowWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.DynamicWarmMountain_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondBlueWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondBlueWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondDeepBlueWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondDeepBlueWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondGreenWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondGreenWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondOrangeWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondOrangeWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondPinkWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondPinkWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondPurpleWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondPurpleWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondRedWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondRedWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondWhiteWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondWhiteWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondYellowWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ElegantDiamondYellowWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetBlue;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetBlue_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetGreen;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetGreen_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetRed;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.EmpireMedievalCarpetRed_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoBlueWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoBlueWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoCyanWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoCyanWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoOrangeWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoOrangeWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoPinkWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoPinkWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoPurpleWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.ExoPurpleWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaBlue;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaBlue_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaCream;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaCream_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaGreen;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaGreen_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaPink;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaPink_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaPurple;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.LuminariaPurple_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.MedievalLeaWallWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.MedievalLeaWallWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WarmerMountainWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WarmerMountainWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WinterMountainBlueWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WinterMountainBlueWool_Carpet;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WinterMountainRedWool;
import com.hexopygate.Telgttatium.buildingblocks.woolcarpet.WinterMountainRedWool_Carpet;
import com.hexopygate.Telgttatium.events.EventHelper;
import com.hexopygate.Telgttatium.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;

@Mod(modid="tel", name="Telgttatium", version = "1.0")

public class Telgttatium {
//public static Item itemTable;

	public static String ModId = "tel";
	public static String Name = "Telgttatium";
	public static String Version = "1.0";

	public static HashMap<String,Block> blockRef =  new HashMap<String,Block>();
	public static HashMap<String,Item> itemRef = new HashMap<String,Item>();
	@SidedProxy( clientSide = "com.hexopygate.Telgttatium.proxy.ClientProxy",
			serverSide = "com.hexopygate.Telgttatium.proxy.CommonProxy")
	public static CommonProxy proxy;
@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//config handling
		//itemTable =  new ItemTable().setUnlocalizedName("ItemTable").setTextureName("tel:itemTable").setCreativeTab(tabTelgttatium);
	blockRef.put("celticWoolAW",new CelticWoolAnotherWorld().setCreativeTab(tabCeltic));
	blockRef.put("celticWoolBlue",new CelticWoolBlue().setCreativeTab(tabCeltic));
	blockRef.put("celticWoolCream",new CelticWoolCream(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolGold",new CelticWoolGold(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolGrey",new CelticWoolGrey(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolGreen",new CelticWoolGreen(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolLightBlue",new CelticWoolLightBlue(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolMagenta",new CelticWoolMagenta(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolpurple",new CelticWoolPurple(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolPurpleAW",new CelticWoolPurpleAnotherWorld(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolRed",new CelticWoolRed(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolWhite",new CelticWoolWhite(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("celticWoolYellow",new CelticWoolYellow(Material.cloth).setCreativeTab(tabCeltic));
	blockRef.put("coolMountainSportRed",new CoolMountainSportRed(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicDiamond",new DynamicDiamond(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicWarmMountain",new DynamicWarmMountain(Material.cloth).setBlockName("DynamicWarmMountainWool").setBlockTextureName("tel:Dynamic Warm Mountain").setCreativeTab(tabTelgttatium));
	blockRef.put("dynamicWarmMountainYellow",new DynamicWarmMountainYellowWool(Material.cloth).setCreativeTab(tabTelgttatium));
	blockRef.put("elegentDiamondBlue",new ElegantDiamondBlueWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondDeepBlue",new ElegantDiamondDeepBlueWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondGreen",new ElegantDiamondGreenWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondOrange",new ElegantDiamondOrangeWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondPink",new ElegantDiamondPinkWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondPurple",new ElegantDiamondPurpleWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondRed",new ElegantDiamondRedWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondWhite",new ElegantDiamondWhiteWool(Material.cloth).setCreativeTab(tabElegantLife));
	blockRef.put("elegentDiamondYellow",new ElegantDiamondYellowWool(Material.cloth).setBlockName("ElegantDiamondYellowWool").setBlockTextureName("tel:Elegant Diamond Yellow Wool").setCreativeTab(tabElegantLife));
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
	
	blockRef.put("CelticWoolAnotherWorld_Carpet",new CelticWoolAnotherWorld_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolBlue_Carpet",new CelticWoolBlue_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolCream_Carpet",new CelticWoolCream_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolGold_Carpet",new CelticWoolGold_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolGreen_Carpet",new CelticWoolGreen_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolGrey_Carpet",new CelticWoolGrey_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolLightBlue_Carpet",new CelticWoolLightBlue_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolMagenta_Carpet",new CelticWoolMagenta_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolPurpleAnotherWorld_Carpet",new CelticWoolPurpleAnotherWorld_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolPurple_Carpet",new CelticWoolPurple_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolRed_Carpet",new CelticWoolRed_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolWhite_Carpet",new CelticWoolWhite_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CelticWoolYellow_Carpet",new CelticWoolYellow_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("CoolMountainSportRed_Carpet",new CoolMountainSportRed_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("DynamicDiamond_Carpet",new DynamicDiamond_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("DynamicWarmMountainYellowWool_Carpet",new DynamicWarmMountainYellowWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("DynamicWarmMountain_Carpet",new DynamicWarmMountain_Carpet().setBlockTextureName("tel:Dynamic Warm Mountain").setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondBlueWool_Carpet",new ElegantDiamondBlueWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondDeepBlueWool_Carpet",new ElegantDiamondDeepBlueWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondGreenWool_Carpet",new ElegantDiamondGreenWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondOrangeWool_Carpet",new ElegantDiamondOrangeWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondPinkWool_Carpet",new ElegantDiamondPinkWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondPurpleWool_Carpet",new ElegantDiamondPurpleWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondRedWool_Carpet",new ElegantDiamondRedWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondWhiteWool_Carpet",new ElegantDiamondWhiteWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ElegantDiamondYellowWool_Carpet",new ElegantDiamondYellowWool_Carpet().setBlockTextureName("tel:Elegant Diamond Yellow Wool").setCreativeTab(tabTelgttatium));
blockRef.put("EmpireMedievalCarpetBlue_Carpet",new EmpireMedievalCarpetBlue_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("EmpireMedievalCarpetGreen_Carpet",new EmpireMedievalCarpetGreen_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("EmpireMedievalCarpetRed_Carpet",new EmpireMedievalCarpetRed_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ExoBlueWool_Carpet",new ExoBlueWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ExoCyanWool_Carpet",new ExoCyanWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ExoOrangeWool_Carpet",new ExoOrangeWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ExoPinkWool_Carpet",new ExoPinkWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("ExoPurpleWool_Carpet",new ExoPurpleWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("LuminariaBlue_Carpet",new LuminariaBlue_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("LuminariaCream_Carpet",new LuminariaCream_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("LuminariaGreen_Carpet",new LuminariaGreen_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("LuminariaPink_Carpet",new LuminariaPink_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("LuminariaPurple_Carpet",new LuminariaPurple_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("MedievalLeaWallWool_Carpet",new MedievalLeaWallWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("WarmerMountainWool_Carpet",new WarmerMountainWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("WinterMountainBlueWool_Carpet",new WinterMountainBlueWool_Carpet().setCreativeTab(tabTelgttatium));
blockRef.put("WinterMountainRedWool_Carpet",new WinterMountainRedWool_Carpet().setCreativeTab(tabTelgttatium));

	
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
	blockRef.put("blood_stone",new Blood_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("orange_stone",new Orange_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("white_stone",new White_Stone().setCreativeTab(tabNatrualBlocks));
	blockRef.put("lavender_stone",new Lavender_Stone().setCreativeTab(tabNatrualBlocks));
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
	blockRef.put("Hardened_Cracked_Ice",new Hardened_Cracked_Ice().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Cracked_Ice",new Cracked_Ice().setCreativeTab(tabNatrualBlocks));
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
	blockRef.put("Magma_Rock_alt",new Magma_Rock_alt().setCreativeTab(tabNatrualBlocks));
	blockRef.put("Magma_Cracked_Rock",new Magma_Cracked_Rock().setCreativeTab(tabNatrualBlocks));

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
	blockRef.put("NVE_Dark_Green",new NvE_Dark_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NVE_Green",new NvE_Green().setCreativeTab(tabNevoEvolution));
	blockRef.put("NVE_White",new NvE_White().setCreativeTab(tabNevoEvolution));

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
	
	blockRef.put("Celtic_Glass_Another_World",new Celtic_Glass_Another_World().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Blue",new Celtic_Glass_Blue().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Cream",new Celtic_Glass_Cream().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Gold",new Celtic_Glass_Gold().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Green",new Celtic_Glass_Green().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Grey",new Celtic_Glass_Grey().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Light_Blue",new Celtic_Glass_Light_Blue().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Purple",new Celtic_Glass_Purple().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Purple_Another_World",new Celtic_Glass_Purple_Another_World().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Red",new Celtic_Glass_Red().setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Yellow",new Celtic_Glass_Yellow().setCreativeTab(tabCeltic));
	
	blockRef.put("Celtic_Glass_Cream_Pane",new Celtic_Glass_Cream_Pane("Celtic_Glass_Cream").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Blue_Pane",new Celtic_Glass_Blue_Pane("Celtic_Glass_Blue").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Another_World_Pane",new Celtic_Glass_Another_World_Pane("Celtic_Glass_Another_World").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Green_Pane",new Celtic_Glass_Green_Pane("Celtic_Glass_Green").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Gold_Pane",new Celtic_Glass_Gold_Pane("Celtic_Glass_Gold").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Grey_Pane",new Celtic_Glass_Grey_Pane("Celtic_Glass_Grey").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Light_Blue_Pane",new Celtic_Glass_Light_Blue_Pane("Celtic_Glass_Light_Blue").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Purple_Pane",new Celtic_Glass_Purple_Pane("Celtic_Glass_Purple").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Purple_Another_World_Pane",new Celtic_Glass_Purple_Another_World_Pane("Celtic_Glass_Purple_Another_World").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Red_Pane",new Celtic_Glass_Red_Pane("Celtic_Glass_Red").setCreativeTab(tabCeltic));
	blockRef.put("Celtic_Glass_Yellow_Pane",new Celtic_Glass_Yellow_Pane("Celtic_Glass_Yellow").setCreativeTab(tabCeltic));
	
	blockRef.put("NvE_Black",new NvE_Black().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Blue",new NvE_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Cyan",new NvE_Cyan().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Blue",new NvE_Dark_Blue().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Orange",new NvE_Dark_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Purple",new NvE_Dark_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Orange",new NvE_Orange().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Pink",new NvE_Pink().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Purple",new NvE_Purple().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Red",new NvE_Red().setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Yellow",new NvE_Yellow().setCreativeTab(tabNevoEvolution));	
	
	blockRef.put("NvE_Black_Pane",new NvE_Black_Pane("NvE_Black").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Blue_Pane",new NvE_Blue_Pane("NvE_Blue").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Cyan_Pane",new NvE_Cyan_Pane("NvE_Cyan").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Blue_Pane",new NvE_Dark_Blue_Pane("NvE_Dark_Blue").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Orange_Pane",new NvE_Dark_Orange_Pane("NvE_Dark_Orange").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Purple_Pane",new NvE_Dark_Purple_Pane("NvE_Dark_Purple").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Orange_Pane",new NvE_Orange_Pane("NvE_Orange").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Purple_Pane",new NvE_Purple_Pane("NvE_Purple").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Pink_Pane",new NvE_Pink_Pane("NvE_Pink").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Red_Pane",new NvE_Red_Pane("NvE_Red").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Yellow_Pane",new NvE_Yellow_Pane("NvE_Yellow").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Green_Pane",new NvE_Green_Pane("NvE_Green").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_Dark_Green_Pane",new NvE_Dark_Green_Pane("NvE_Dark_Green").setCreativeTab(tabNevoEvolution));
	blockRef.put("NvE_White_Pane",new NvE_White_Pane("NvE_White").setCreativeTab(tabNevoEvolution));

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
	
/*
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
	*/
	blockRef.put("Simple_Glass_Black",new Simple_Glass_Black().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Blue",new Simple_Glass_Blue().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Clear",new Simple_Glass_Clear().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Cyan",new Simple_Glass_Cyan().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Blue",new Simple_Glass_Dark_Blue().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Green",new Simple_Glass_Dark_Green().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Purple",new Simple_Glass_Dark_Purple().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Green",new Simple_Glass_Green().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Magenta",new Simple_Glass_Magenta().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Orange",new Simple_Glass_Orange().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Pink",new Simple_Glass_Pink().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Purple",new Simple_Glass_Purple().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Red",new Simple_Glass_Red().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_White",new Simple_Glass_White().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Yellow",new Simple_Glass_Yellow().setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Black_Pane",new Simple_Glass_Black_Pane("Simple_Glass_Black").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Blue_Pane",new Simple_Glass_Blue_Pane("Simple_Glass_Blue").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Clear_Pane",new Simple_Glass_Clear_Pane("Simple_Glass_Clear").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Cyan_Pane",new Simple_Glass_Cyan_Pane("Simple_Glass_Cyan").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Blue_Pane",new Simple_Glass_Dark_Blue_Pane("Simple_Glass_Dark_Blue").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Green_Pane",new Simple_Glass_Dark_Green_Pane("Simple_Glass_Dark_Green").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Dark_Purple_Pane",new Simple_Glass_Dark_Purple_Pane("Simple_Glass_Dark_Purple").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Green_Pane",new Simple_Glass_Green_Pane("Simple_Glass_Green").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Magenta_Pane",new Simple_Glass_Magenta_Pane("Simple_Glass_Magenta").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Orange_Pane",new Simple_Glass_Orange_Pane("Simple_Glass_Orange").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Pink_Pane",new Simple_Glass_Pink_Pane("Simple_Glass_Pink").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Purple_Pane",new Simple_Glass_Purple_Pane("Simple_Glass_Purple").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Red_Pane",new Simple_Glass_Red_Pane("Simple_Glass_Red").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_White_Pane",new Simple_Glass_White_Pane("Simple_Glass_White").setCreativeTab(tabSimpleLife));
	
blockRef.put("Simple_Glass_Yellow_Pane",new Simple_Glass_Yellow_Pane("Simple_Glass_Yellow").setCreativeTab(tabSimpleLife));

	
blockRef.put("Elegant_Wooden_Full_Frame", new Elegant_Wooden_Full_Frame().setCreativeTab(tabElegantLife));


blockRef.put("ElegantWooden_Pane", new ElegantWooden_Pane("ElegantWooden").setCreativeTab(tabElegantLife));
blockRef.put("ElegantWooden_Down_Frame",new ElegantWooden_Down_Frame("ElegantWooden_Down_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Bottom_Left_Frame",new ElegantWooden_Down_Left_Frame("ElegantWooden_Bottom_Left_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Down_Single_Frame",new ElegantWooden_Down_Single_Frame("ElegantWooden_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Full_Frame",new ElegantWooden_Full_Frame("ElegantWooden_Full_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Horizontal_Middle_Single_Frame",new ElegantWooden_Horizontal_Middle_Single_Frame("ElegantWooden_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Left_Frame",new ElegantWooden_Left_Frame("ElegantWooden_Left_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Left_Single_Frame",new ElegantWooden_Left_Single_Frame("ElegantWooden_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Left_Top_Frame",new ElegantWooden_Top_Left_Frame("ElegantWooden_Left_Top_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Middle_Frame",new ElegantWooden_Middle_Frame("ElegantWooden_Middle_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Right_Down_Corner_Frame",new ElegantWooden_Down_Right_Frame("ElegantWooden_Right_Down_Corner_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Right_Frame",new ElegantWooden_Right_Frame("ElegantWooden_Right_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Top_Frame",new ElegantWooden_Top_Frame("ElegantWooden_Top_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Top_Single_Frame",new ElegantWooden_Top_Single_Frame("ElegantWooden_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("ElegantWooden_Vertial_Middle_Single_Frame",new ElegantWooden_Vertical_Middle_Single_Frame("ElegantWooden_Vertial_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("Elegant_Wooden_Right_Single_Frame",new ElegantWooden_Right_Single_Frame("Elegant_Wooden_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("Elegant_Wooden_Top_Right_Frame",new ElegantWooden_Top_Right_Frame("Elegant_Wooden_Top_Right_Frame","Glass_Trim"));
	

blockRef.put("BlackElegantWooden_Pane", new BlackElegantWooden_Pane("BlackElegantWooden").setCreativeTab(tabElegantLife));
blockRef.put("BlackElegantWooden_Down_Frame",new BlackElegantWooden_Down_Frame("BlackElegantWooden_Down_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Down_Left_Frame",new BlackElegantWooden_Down_Left_Frame("BlackElegantWooden_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Down_Right_Frame",new BlackElegantWooden_Down_Right_Frame("BlackElegantWooden_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Down_Single_Frame",new BlackElegantWooden_Down_Single_Frame("BlackElegantWooden_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Full_Frame",new BlackElegantWooden_Full_Frame("BlackElegantWooden_Full_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Horizontal_Middle_Single_Frame",new BlackElegantWooden_Horizontal_Middle_Single_Frame("BlackElegantWooden_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Left_Frame",new BlackElegantWooden_Left_Frame("BlackElegantWooden_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Left_Single_Frame",new BlackElegantWooden_Left_Single_Frame("BlackElegantWooden_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Middle_Frame",new BlackElegantWooden_Middle_Frame("BlackElegantWooden_Middle_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Right_Frame",new BlackElegantWooden_Right_Frame("BlackElegantWooden_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Right_Single_Frame",new BlackElegantWooden_Right_Single_Frame("BlackElegantWooden_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Top_Frame",new BlackElegantWooden_Top_Frame("BlackElegantWooden_Top_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Top_Left_Frame",new BlackElegantWooden_Top_Left_Frame("BlackElegantWooden_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Top_Right_Frame",new BlackElegantWooden_Top_Right_Frame("BlackElegantWooden_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Top_Single_Frame",new BlackElegantWooden_Top_Single_Frame("BlackElegantWooden_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackElegantWooden_Vertical_Middle_Single_Frame",new BlackElegantWooden_Vertical_Middle_Single_Frame("BlackElegantWooden_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("ClearElegantWooden_Pane", new ClearElegantWooden_Pane("ClearElegantWooden").setCreativeTab(tabElegantLife));
blockRef.put("ClearElegantWooden_Down_Frame",new ClearElegantWooden_Down_Frame("ClearElegantWooden_Down_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Down_Left_Frame",new ClearElegantWooden_Down_Left_Frame("ClearElegantWooden_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Down_Right_Frame",new ClearElegantWooden_Down_Right_Frame("ClearElegantWooden_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Down_Single_Frame",new ClearElegantWooden_Down_Single_Frame("ClearElegantWooden_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Full_Frame",new ClearElegantWooden_Full_Frame("ClearElegantWooden_Full_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Horizontal_Middle_Single_Frame",new ClearElegantWooden_Horizontal_Middle_Single_Frame("ClearElegantWooden_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Left_Frame",new ClearElegantWooden_Left_Frame("ClearElegantWooden_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Left_Single_Frame",new ClearElegantWooden_Left_Single_Frame("ClearElegantWooden_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Middle_Frame",new ClearElegantWooden_Middle_Frame("ClearElegantWooden_Middle_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Right_Frame",new ClearElegantWooden_Right_Frame("ClearElegantWooden_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Right_Single_Frame",new ClearElegantWooden_Right_Single_Frame("ClearElegantWooden_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Top_Frame",new ClearElegantWooden_Top_Frame("ClearElegantWooden_Top_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Top_Left_Frame",new ClearElegantWooden_Top_Left_Frame("ClearElegantWooden_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Top_Right_Frame",new ClearElegantWooden_Top_Right_Frame("ClearElegantWooden_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Top_Single_Frame",new ClearElegantWooden_Top_Single_Frame("ClearElegantWooden_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearElegantWooden_Vertical_Middle_Single_Frame",new ClearElegantWooden_Vertical_Middle_Single_Frame("ClearElegantWooden_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("DarkGreenElegantWooden_Pane", new DarkGreenElegantWooden_Pane("DarkGreenElegantWooden").setCreativeTab(tabElegantLife));
blockRef.put("DarkGreenElegantWooden_Down_Frame",new DarkGreenElegantWooden_Down_Frame("DarkGreenElegantWooden_Down_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Down_Left_Frame",new DarkGreenElegantWooden_Down_Left_Frame("DarkGreenElegantWooden_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Down_Right_Frame",new DarkGreenElegantWooden_Down_Right_Frame("DarkGreenElegantWooden_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Down_Single_Frame",new DarkGreenElegantWooden_Down_Single_Frame("DarkGreenElegantWooden_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Full_Frame",new DarkGreenElegantWooden_Full_Frame("DarkGreenElegantWooden_Full_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Horizontal_Middle_Single_Frame",new DarkGreenElegantWooden_Horizontal_Middle_Single_Frame("DarkGreenElegantWooden_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Left_Frame",new DarkGreenElegantWooden_Left_Frame("DarkGreenElegantWooden_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Left_Single_Frame",new DarkGreenElegantWooden_Left_Single_Frame("DarkGreenElegantWooden_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Middle_Frame",new DarkGreenElegantWooden_Middle_Frame("DarkGreenElegantWooden_Middle_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Right_Frame",new DarkGreenElegantWooden_Right_Frame("DarkGreenElegantWooden_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Right_Single_Frame",new DarkGreenElegantWooden_Right_Single_Frame("DarkGreenElegantWooden_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Top_Frame",new DarkGreenElegantWooden_Top_Frame("DarkGreenElegantWooden_Top_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Top_Left_Frame",new DarkGreenElegantWooden_Top_Left_Frame("DarkGreenElegantWooden_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Top_Single_Frame",new DarkGreenElegantWooden_Top_Single_Frame("DarkGreenElegantWooden_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegantWooden_Vertical_Middle_Single_Frame",new DarkGreenElegantWooden_Vertical_Middle_Single_Frame("DarkGreenElegantWooden_Vertical_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenElegant_Wooden_Top_Right_Frame",new DarkGreenElegantWooden_Top_Right_Frame("DarkGreenElegant_Wooden_Top_Right_Frame","Glass_Trim"));
	


blockRef.put("LightBlueElegantWooden_Pane", new LightBlueElegantWooden_Pane("LightBlueElegantWooden").setCreativeTab(tabElegantLife));
blockRef.put("LightBlueElegantWooden_Down_Frame",new LightBlueElegantWooden_Down_Frame("LightBlueElegantWooden_Down_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Down_Left_Frame",new LightBlueElegantWooden_Down_Left_Frame("LightBlueElegantWooden_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Down_Right_Frame",new LightBlueElegantWooden_Down_Right_Frame("LightBlueElegantWooden_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Down_Single_Frame",new LightBlueElegantWooden_Down_Single_Frame("LightBlueElegantWooden_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Full_Frame",new LightBlueElegantWooden_Full_Frame("LightBlueElegantWooden_Full_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Horizontal_Middle_Single_Frame",new LightBlueElegantWooden_Horizontal_Middle_Single_Frame("LightBlueElegantWooden_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Left_Frame",new LightBlueElegantWooden_Left_Frame("LightBlueElegantWooden_Left_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Middle_Frame",new LightBlueElegantWooden_Middle_Frame("LightBlueElegantWooden_Middle_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Right_Frame",new LightBlueElegantWooden_Right_Frame("LightBlueElegantWooden_Right_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Right_Single_Frame",new LightBlueElegantWooden_Right_Single_Frame("LightBlueElegantWooden_Right_Single_Frame","Glass_Trim"));
blockRef.put("LightBlueElegantWooden_Left_Single_Frame",new LightBlueElegantWooden_Left_Single_Frame("LightBlueElegantWooden_Left_Single_Frame","Glass_Trim"));

blockRef.put("LightBlueElegantWooden_Top_Frame",new LightBlueElegantWooden_Top_Frame("LightBlueElegantWooden_Top_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Top_Left_Frame",new LightBlueElegantWooden_Top_Left_Frame("LightBlueElegantWooden_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Top_Right_Frame",new LightBlueElegantWooden_Top_Right_Frame("LightBlueElegantWooden_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Top_Single_Frame",new LightBlueElegantWooden_Top_Single_Frame("LightBlueElegantWooden_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("LightBlueElegantWooden_Vertical_Middle_Single_Frame",new LightBlueElegantWooden_Vertical_Middle_Single_Frame("LightBlueElegantWooden_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("Clear_Elegant_Wooden_Full_Frame", new Clear_Elegant_Wooden_Full_Frame().setCreativeTab(tabElegantLife));
blockRef.put("Dark_Green_Elegant_Wooden_Full_Frame", new Dark_Green_Elegant_Wooden_Full_Frame().setCreativeTab(tabElegantLife));
blockRef.put("Black_Elegant_Wooden_Full_Frame", new Black_Elegant_Wooden_Full_Frame().setCreativeTab(tabElegantLife));
blockRef.put("Light_Blue_Elegant_Wooden_Full_Frame", new Light_Blue_Elegant_Wooden_Full_Frame().setCreativeTab(tabElegantLife));

blockRef.put("BlackSimple_Pane", new BlackSimple_Pane("BlackSimple").setCreativeTab(tabSimpleLife));
blockRef.put("BlackSimple_Down_Frame",new BlackSimple_Down_Frame("BlackSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Down_Left_Frame",new BlackSimple_Down_Left_Frame("BlackSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Down_Right_Frame",new BlackSimple_Down_Right_Frame("BlackSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Down_Single_Frame",new BlackSimple_Down_Single_Frame("BlackSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Full_Frame",new BlackSimple_Full_Frame("BlackSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Horizontal_Middle_Single_Frame",new BlackSimple_Horizontal_Middle_Single_Frame("BlackSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Left_Frame",new BlackSimple_Left_Frame("BlackSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Left_Single_Frame",new BlackSimple_Left_Single_Frame("BlackSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Right_Frame",new BlackSimple_Right_Frame("BlackSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Right_Single_Frame",new BlackSimple_Right_Single_Frame("BlackSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Top_Frame",new BlackSimple_Top_Frame("BlackSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Top_Left_Frame",new BlackSimple_Top_Left_Frame("BlackSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Top_Right_Frame",new BlackSimple_Top_Right_Frame("BlackSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Top_Single_Frame",new BlackSimple_Top_Single_Frame("BlackSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Vertical_Middle_Single_Frame",new BlackSimple_Vertical_Middle_Single_Frame("BlackSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("BlackSimple_Middle_Frame",new BlackSimple_Middle_Frame("BlackSimple_Middle_Frame","Glass_Trim"));


blockRef.put("BlueSimple_Pane", new BlueSimple_Pane("BlueSimple").setCreativeTab(tabSimpleLife));
blockRef.put("BlueSimple_Down_Frame",new BlueSimple_Down_Frame("BlueSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Down_Left_Frame",new BlueSimple_Down_Left_Frame("BlueSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Down_Right_Frame",new BlueSimple_Down_Right_Frame("BlueSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Down_Single_Frame",new BlueSimple_Down_Single_Frame("BlueSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Full_Frame",new BlueSimple_Full_Frame("BlueSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Horizontal_Middle_Single_Frame",new BlueSimple_Horizontal_Middle_Single_Frame("BlueSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("BlueSimple_Vertical_Middle_Single_Frame",new BlueSimple_Vertical_Middle_Single_Frame("BlueSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("BlueSimple_Left_Frame",new BlueSimple_Left_Frame("BlueSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Left_Single_Frame",new BlueSimple_Left_Single_Frame("BlueSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Middle_Frame",new BlueSimple_Middle_Frame("BlueSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Right_Frame",new BlueSimple_Right_Frame("BlueSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Right_Single_Frame",new BlueSimple_Right_Single_Frame("BlueSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Top_Frame",new BlueSimple_Top_Frame("BlueSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Top_Left_Frame",new BlueSimple_Top_Left_Frame("BlueSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Top_Right_Frame",new BlueSimple_Top_Right_Frame("BlueSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("BlueSimple_Top_Single_Frame",new BlueSimple_Top_Single_Frame("BlueSimple_Top_Single_Frame","Glass_Trim"));
	


blockRef.put("ClearSimple_Pane", new ClearSimple_Pane("ClearSimple").setCreativeTab(tabSimpleLife));
blockRef.put("ClearSimple_Down_Frame",new ClearSimple_Down_Frame("ClearSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Down_Left_Frame",new ClearSimple_Down_Left_Frame("ClearSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Down_Right_Frame",new ClearSimple_Down_Right_Frame("ClearSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Down_Single_Frame",new ClearSimple_Down_Single_Frame("ClearSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Full_Frame",new ClearSimple_Full_Frame("ClearSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Horizontal_Middle_Single_Frame",new ClearSimple_Horizontal_Middle_Single_Frame("ClearSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Left_Frame",new ClearSimple_Left_Frame("ClearSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Left_Single_Frame",new ClearSimple_Left_Single_Frame("ClearSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Middle_Frame",new ClearSimple_Middle_Frame("ClearSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Right_Frame",new ClearSimple_Right_Frame("ClearSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Right_Single_Frame",new ClearSimple_Right_Single_Frame("ClearSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Top_Frame",new ClearSimple_Top_Frame("ClearSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Top_Left_Frame",new ClearSimple_Top_Left_Frame("ClearSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Top_Right_Frame",new ClearSimple_Top_Right_Frame("ClearSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Top_Single_Frame",new ClearSimple_Top_Single_Frame("ClearSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("ClearSimple_Vertical_Middle_Single_Frame",new ClearSimple_Vertical_Middle_Single_Frame("ClearSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("CyanSimple_Pane", new CyanSimple_Pane("CyanSimple").setCreativeTab(tabSimpleLife));
blockRef.put("CyanSimple_Down_Frame",new CyanSimple_Down_Frame("CyanSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Down_Left_Frame",new CyanSimple_Down_Left_Frame("CyanSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Down_Right_Frame",new CyanSimple_Down_Right_Frame("CyanSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Down_Single_Frame",new CyanSimple_Down_Single_Frame("CyanSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Full_Frame",new CyanSimple_Full_Frame("CyanSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Horizontal_Middle_Single_Frame",new CyanSimple_Horizontal_Middle_Single_Frame("CyanSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("CyanSimple_Vertical_Middle_Single_Frame",new CyanSimple_Vertical_Middle_Single_Frame("CyanSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("CyanSimple_Left_Frame",new CyanSimple_Left_Frame("CyanSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Left_Single_Frame",new CyanSimple_Left_Single_Frame("CyanSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Middle_Frame",new CyanSimple_Middle_Frame("CyanSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Right_Frame",new CyanSimple_Right_Frame("CyanSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Right_Single_Frame",new CyanSimple_Right_Single_Frame("CyanSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Top_Frame",new CyanSimple_Top_Frame("CyanSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Top_Left_Frame",new CyanSimple_Top_Left_Frame("CyanSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Top_Right_Frame",new CyanSimple_Top_Right_Frame("CyanSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("CyanSimple_Top_Single_Frame",new CyanSimple_Top_Single_Frame("CyanSimple_Top_Single_Frame","Glass_Trim"));
	
	


blockRef.put("DarkBlueSimple_Pane", new DarkBlueSimple_Pane("DarkBlueSimple").setCreativeTab(tabSimpleLife));
blockRef.put("DarkBlueSimple_Down_Frame",new DarkBlueSimple_Down_Frame("DarkBlueSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Down_Left_Frame",new DarkBlueSimple_Down_Left_Frame("DarkBlueSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Down_Right_Frame",new DarkBlueSimple_Down_Right_Frame("DarkBlueSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Down_Single_Frame",new DarkBlueSimple_Down_Single_Frame("DarkBlueSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Horizontal_Middle_Single_Frame",new DarkBlueSimple_Horizontal_Middle_Single_Frame("DarkBlueSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("DarkBlueSimple_Vertical_Middle_Single_Frame",new DarkBlueSimple_Vertical_Middle_Single_Frame("DarkBlueSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("DarkBlueSimple_Left_Frame",new DarkBlueSimple_Left_Frame("DarkBlueSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Left_Single_Frame",new DarkBlueSimple_Left_Single_Frame("DarkBlueSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Middle_Frame",new DarkBlueSimple_Middle_Frame("DarkBlueSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Right_Frame",new DarkBlueSimple_Right_Frame("DarkBlueSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Right_Single_Frame",new DarkBlueSimple_Right_Single_Frame("DarkBlueSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Top_Frame",new DarkBlueSimple_Top_Frame("DarkBlueSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Top_Left_Frame",new DarkBlueSimple_Top_Left_Frame("DarkBlueSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Top_Right_Frame",new DarkBlueSimple_Top_Right_Frame("DarkBlueSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkBlueSimple_Full_Frame",new DarkBlueSimple_Full_Frame("DarkBlueSimple_Full_Frame","Glass_Trim"));
	


blockRef.put("DarkGreenSimple_Pane", new DarkGreenSimple_Pane("DarkGreenSimple").setCreativeTab(tabSimpleLife));
blockRef.put("DarkGreenSimple_Down_Frame",new DarkGreenSimple_Down_Frame("DarkGreenSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Down_Left_Frame",new DarkGreenSimple_Down_Left_Frame("DarkGreenSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Down_Right_Frame",new DarkGreenSimple_Down_Right_Frame("DarkGreenSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Down_Single_Frame",new DarkGreenSimple_Down_Single_Frame("DarkGreenSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Full_Frame",new DarkGreenSimple_Full_Frame("DarkGreenSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Horizontal_Middle_Single_Frame",new DarkGreenSimple_Horizontal_Middle_Single_Frame("DarkGreenSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Left_Frame",new DarkGreenSimple_Left_Frame("DarkGreenSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Left_Single_Frame",new DarkGreenSimple_Left_Single_Frame("DarkGreenSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Right_Frame",new DarkGreenSimple_Right_Frame("DarkGreenSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Right_Single_Frame",new DarkGreenSimple_Right_Single_Frame("DarkGreenSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Top_Frame",new DarkGreenSimple_Top_Frame("DarkGreenSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Top_Left_Frame",new DarkGreenSimple_Top_Left_Frame("DarkGreenSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Top_Right_Frame",new DarkGreenSimple_Top_Right_Frame("DarkGreenSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Top_Single_Frame",new DarkGreenSimple_Top_Single_Frame("DarkGreenSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkGreenSimple_Vertical_Middle_Single_Frame",new DarkGreenSimple_Vertical_Middle_Single_Frame("DarkGreenSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("DarkPurpleSimple_Pane", new DarkPurpleSimple_Pane("DarkPurpleSimple").setCreativeTab(tabSimpleLife));
blockRef.put("DarkPurpleSimple_Down_Frame",new DarkPurpleSimple_Down_Frame("DarkPurpleSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Down_Left_Frame",new DarkPurpleSimple_Down_Left_Frame("DarkPurpleSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Down_Right_Frame",new DarkPurpleSimple_Down_Right_Frame("DarkPurpleSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Down_Single_Frame",new DarkPurpleSimple_Down_Single_Frame("DarkPurpleSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Full_Frame",new DarkPurpleSimple_Full_Frame("DarkPurpleSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Horizontal_Middle_Single_Frame",new DarkPurpleSimple_Horizontal_Middle_Single_Frame("DarkPurpleSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("DarkPurpleSimple_Vertical_Middle_Single_Frame",new DarkPurpleSimple_Vertical_Middle_Single_Frame("DarkPurpleSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("DarkPurpleSimple_Left_Frame",new DarkPurpleSimple_Left_Frame("DarkPurpleSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Left_Single_Frame",new DarkPurpleSimple_Left_Single_Frame("DarkPurpleSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Middle_Frame",new DarkPurpleSimple_Middle_Frame("DarkPurpleSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Right_Frame",new DarkPurpleSimple_Right_Frame("DarkPurpleSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Right_Single_Frame",new DarkPurpleSimple_Right_Single_Frame("DarkPurpleSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Top_Frame",new DarkPurpleSimple_Top_Frame("DarkPurpleSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Top_Left_Frame",new DarkPurpleSimple_Top_Left_Frame("DarkPurpleSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Top_Right_Frame",new DarkPurpleSimple_Top_Right_Frame("DarkPurpleSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("DarkPurpleSimple_Top_Single_Frame",new DarkPurpleSimple_Top_Single_Frame("DarkPurpleSimple_Top_Single_Frame","Glass_Trim"));
	


blockRef.put("GreenSimple_Pane", new GreenSimple_Pane("GreenSimple").setCreativeTab(tabSimpleLife));
blockRef.put("GreenSimple_Down_Frame",new GreenSimple_Down_Frame("GreenSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Down_Left_Frame",new GreenSimple_Down_Left_Frame("GreenSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Down_Right_Frame",new GreenSimple_Down_Right_Frame("GreenSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Down_Single_Frame",new GreenSimple_Down_Single_Frame("GreenSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Full_Frame",new GreenSimple_Full_Frame("GreenSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Horizontal_Middle_Single_Frame",new GreenSimple_Horizontal_Middle_Single_Frame("GreenSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Left_Frame",new GreenSimple_Left_Frame("GreenSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Left_Single_Frame",new GreenSimple_Left_Single_Frame("GreenSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Right_Frame",new GreenSimple_Right_Frame("GreenSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Right_Single_Frame",new GreenSimple_Right_Single_Frame("GreenSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Top_Frame",new GreenSimple_Top_Frame("GreenSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Top_Left_Frame",new GreenSimple_Top_Left_Frame("GreenSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Top_Right_Frame",new GreenSimple_Top_Right_Frame("GreenSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("GreenSimple_Top_Single_Frame",new GreenSimple_Top_Single_Frame("GreenSimple_Top_Single_Frame","Glass_Trim"));
blockRef.put("GreenSimple_Middle_Frame",new GreenSimple_Middle_Frame("GreenSimple_Middle_Frame","Glass_Trim"));

blockRef.put("GreenSimple_Vertical_Middle_Single_Frame",new GreenSimple_Vertical_Middle_Single_Frame("GreenSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("MagentaSimple_Pane", new MagentaSimple_Pane("MagentaSimple").setCreativeTab(tabSimpleLife));
blockRef.put("MagentaSimple_Down_Frame",new MagentaSimple_Down_Frame("MagentaSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Down_Left_Frame",new MagentaSimple_Down_Left_Frame("MagentaSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Down_Right_Frame",new MagentaSimple_Down_Right_Frame("MagentaSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Down_Single_Frame",new MagentaSimple_Down_Single_Frame("MagentaSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Full_Frame",new MagentaSimple_Full_Frame("MagentaSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Horizontal_Middle_Single_Frame",new MagentaSimple_Horizontal_Middle_Single_Frame("MagentaSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Left_Frame",new MagentaSimple_Left_Frame("MagentaSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Left_Single_Frame",new MagentaSimple_Left_Single_Frame("MagentaSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Middle_Frame",new MagentaSimple_Middle_Frame("MagentaSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Right_Frame",new MagentaSimple_Right_Frame("MagentaSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Right_Single_Frame",new MagentaSimple_Right_Single_Frame("MagentaSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Top_Frame",new MagentaSimple_Top_Frame("MagentaSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Top_Left_Frame",new MagentaSimple_Top_Left_Frame("MagentaSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Top_Right_Frame",new MagentaSimple_Top_Right_Frame("MagentaSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Top_Single_Frame",new MagentaSimple_Top_Single_Frame("MagentaSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("MagentaSimple_Vertical_Middle_Single_Frame",new MagentaSimple_Vertical_Middle_Single_Frame("MagentaSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("Simple_Pane", new Simple_Pane("Simple").setCreativeTab(tabSimpleLife));
blockRef.put("Simple_Down_Frame",new Simple_Down_Frame("Simple_Down_Frame","Glass_Trim"));
blockRef.put("Simple_Full_Frame",new Simple_Full_Frame("Simple_Full_Frame","Glass_Trim"));

blockRef.put("Simple_Down_Left_Frame",new Simple_Down_Left_Frame("Simple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("Simple_Down_Right_Frame",new Simple_Down_Right_Frame("Simple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("Simple_Down_Single_Frame",new Simple_Down_Single_Frame("Simple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("Simple_Horizontal_Middle_Single_Frame",new Simple_Horizontal_Middle_Single_Frame("Simple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("Simple_Left_Frame",new Simple_Left_Frame("Simple_Left_Frame","Glass_Trim"));
	
blockRef.put("Simple_Left_Single_Frame",new Simple_Left_Single_Frame("Simple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("Simple_Middle_Frame",new Simple_Middle_Frame("Simple_Middle_Frame","Glass_Trim"));
	
blockRef.put("Simple_Right_Frame",new Simple_Right_Frame("Simple_Right_Frame","Glass_Trim"));
	
blockRef.put("Simple_Right_Single_Frame",new Simple_Right_Single_Frame("Simple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("Simple_Top_Frame",new Simple_Top_Frame("Simple_Top_Frame","Glass_Trim"));
	
blockRef.put("Simple_Top_Left_Frame",new Simple_Top_Left_Frame("Simple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("Simple_Top_Right_Frame",new Simple_Top_Right_Frame("Simple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("Simple_Top_Single_Frame",new Simple_Top_Single_Frame("Simple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("Simple_Vertical_Middle_Single_Frame",new Simple_Vertical_Middle_Single_Frame("Simple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("OrangeSimple_Pane", new OrangeSimple_Pane("OrangeSimple").setCreativeTab(tabSimpleLife));
blockRef.put("OrangeSimple_Down_Frame",new OrangeSimple_Down_Frame("OrangeSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Down_Left_Frame",new OrangeSimple_Down_Left_Frame("OrangeSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Down_Right_Frame",new OrangeSimple_Down_Right_Frame("OrangeSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Down_Single_Frame",new OrangeSimple_Down_Single_Frame("OrangeSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Full_Frame",new OrangeSimple_Full_Frame("OrangeSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Horizontal_Middle_Single_Frame",new OrangeSimple_Horizontal_Middle_Single_Frame("OrangeSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Left_Frame",new OrangeSimple_Left_Frame("OrangeSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Left_Single_Frame",new OrangeSimple_Left_Single_Frame("OrangeSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Middle_Frame",new OrangeSimple_Middle_Frame("OrangeSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Right_Frame",new OrangeSimple_Right_Frame("OrangeSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Right_Single_Frame",new OrangeSimple_Right_Single_Frame("OrangeSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Top_Frame",new OrangeSimple_Top_Frame("OrangeSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Top_Left_Frame",new OrangeSimple_Top_Left_Frame("OrangeSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Top_Right_Frame",new OrangeSimple_Top_Right_Frame("OrangeSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Top_Single_Frame",new OrangeSimple_Top_Single_Frame("OrangeSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("OrangeSimple_Vertical_Middle_Single_Frame",new OrangeSimple_Vertical_Middle_Single_Frame("OrangeSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("PinkSimple_Pane", new PinkSimple_Pane("PinkSimple").setCreativeTab(tabSimpleLife));
blockRef.put("PinkSimple_Down_Frame",new PinkSimple_Down_Frame("PinkSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Down_Left_Frame",new PinkSimple_Down_Left_Frame("PinkSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Down_Right_Frame",new PinkSimple_Down_Right_Frame("PinkSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Down_Single_Frame",new PinkSimple_Down_Single_Frame("PinkSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Full_Frame",new PinkSimple_Full_Frame("PinkSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Horizontal_Middle_Single_Frame",new PinkSimple_Horizontal_Middle_Single_Frame("PinkSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("PinkSimple_Vertical_Middle_Single_Frame",new PinkSimple_Vertical_Middle_Single_Frame("PinkSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("PinkSimple_Left_Frame",new PinkSimple_Left_Frame("PinkSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Left_Single_Frame",new PinkSimple_Left_Single_Frame("PinkSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Middle_Frame",new PinkSimple_Middle_Frame("PinkSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Right_Frame",new PinkSimple_Right_Frame("PinkSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Right_Single_Frame",new PinkSimple_Right_Single_Frame("PinkSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Top_Frame",new PinkSimple_Top_Frame("PinkSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Top_Left_Frame",new PinkSimple_Top_Left_Frame("PinkSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Top_Right_Frame",new PinkSimple_Top_Right_Frame("PinkSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("PinkSimple_Top_Single_Frame",new PinkSimple_Top_Single_Frame("PinkSimple_Top_Single_Frame","Glass_Trim"));
	


blockRef.put("PurpleSimple_Pane", new PurpleSimple_Pane("PurpleSimple").setCreativeTab(tabSimpleLife));
blockRef.put("PurpleSimple_Down_Frame",new PurpleSimple_Down_Frame("PurpleSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Down_Left_Frame",new PurpleSimple_Down_Left_Frame("PurpleSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Down_Right_Frame",new PurpleSimple_Down_Right_Frame("PurpleSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Down_Single_Frame",new PurpleSimple_Down_Single_Frame("PurpleSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Full_Frame",new PurpleSimple_Full_Frame("PurpleSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Horizontal_Middle_Single_Frame",new PurpleSimple_Horizontal_Middle_Single_Frame("PurpleSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
blockRef.put("PurpleSimple_Vertical_Middle_Single_Frame",new PurpleSimple_Vertical_Middle_Single_Frame("PurpleSimple_Vertical_Middle_Single_Frame","Glass_Trim"));

blockRef.put("PurpleSimple_Left_Frame",new PurpleSimple_Left_Frame("PurpleSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Left_Single_Frame",new PurpleSimple_Left_Single_Frame("PurpleSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Middle_Frame",new PurpleSimple_Middle_Frame("PurpleSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Right_Frame",new PurpleSimple_Right_Frame("PurpleSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Right_Single_Frame",new PurpleSimple_Right_Single_Frame("PurpleSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Top_Frame",new PurpleSimple_Top_Frame("PurpleSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Top_Left_Frame",new PurpleSimple_Top_Left_Frame("PurpleSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Top_Right_Frame",new PurpleSimple_Top_Right_Frame("PurpleSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("PurpleSimple_Top_Single_Frame",new PurpleSimple_Top_Single_Frame("PurpleSimple_Top_Single_Frame","Glass_Trim"));
	


blockRef.put("RedSimple_Pane", new RedSimple_Pane("RedSimple").setCreativeTab(tabSimpleLife));
blockRef.put("RedSimple_Down_Frame",new RedSimple_Down_Frame("RedSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Down_Left_Frame",new RedSimple_Down_Left_Frame("RedSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Down_Right_Frame",new RedSimple_Down_Right_Frame("RedSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Down_Single_Frame",new RedSimple_Down_Single_Frame("RedSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Full_Frame",new RedSimple_Full_Frame("RedSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Horizontal_Middle_Single_Frame",new RedSimple_Horizontal_Middle_Single_Frame("RedSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Left_Frame",new RedSimple_Left_Frame("RedSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Left_Single_Frame",new RedSimple_Left_Single_Frame("RedSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Middle_Frame",new RedSimple_Middle_Frame("RedSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Right_Frame",new RedSimple_Right_Frame("RedSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Right_Single_Frame",new RedSimple_Right_Single_Frame("RedSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Top_Frame",new RedSimple_Top_Frame("RedSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Top_Left_Frame",new RedSimple_Top_Left_Frame("RedSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Top_Right_Frame",new RedSimple_Top_Right_Frame("RedSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Top_Single_Frame",new RedSimple_Top_Single_Frame("RedSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("RedSimple_Vertical_Middle_Single_Frame",new RedSimple_Vertical_Middle_Single_Frame("RedSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("WhiteSimple_Pane", new WhiteSimple_Pane("WhiteSimple").setCreativeTab(tabSimpleLife));
blockRef.put("WhiteSimple_Down_Frame",new WhiteSimple_Down_Frame("WhiteSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Down_Left_Frame",new WhiteSimple_Down_Left_Frame("WhiteSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Down_Right_Frame",new WhiteSimple_Down_Right_Frame("WhiteSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Down_Single_Frame",new WhiteSimple_Down_Single_Frame("WhiteSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Full_Frame",new WhiteSimple_Full_Frame("WhiteSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Horizontal_Middle_Single_Frame",new WhiteSimple_Horizontal_Middle_Single_Frame("WhiteSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Left_Frame",new WhiteSimple_Left_Frame("WhiteSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Left_Single_Frame",new WhiteSimple_Left_Single_Frame("WhiteSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Middle_Frame",new WhiteSimple_Middle_Frame("WhiteSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Right_Frame",new WhiteSimple_Right_Frame("WhiteSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Right_Single_Frame",new WhiteSimple_Right_Single_Frame("WhiteSimple_Right_Single_Frame","Glass_Trim"));
blockRef.put("WhiteSimple_Top_Frame",new WhiteSimple_Top_Frame("WhiteSimple_Top_Frame","Glass_Trim"));

blockRef.put("WhiteSimple_Top_Left_Frame",new WhiteSimple_Top_Left_Frame("WhiteSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Top_Right_Frame",new WhiteSimple_Top_Right_Frame("WhiteSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Top_Single_Frame",new WhiteSimple_Top_Single_Frame("WhiteSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("WhiteSimple_Vertical_Middle_Single_Frame",new WhiteSimple_Vertical_Middle_Single_Frame("WhiteSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("WoodenSimple_Pane", new WoodenSimple_Pane("WoodenSimple").setCreativeTab(tabSimpleLife));
blockRef.put("WoodenSimple_Down_Frame",new WoodenSimple_Down_Frame("WoodenSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Down_Left_Frame",new WoodenSimple_Down_Left_Frame("WoodenSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Down_Right_Frame",new WoodenSimple_Down_Right_Frame("WoodenSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Down_Single_Frame",new WoodenSimple_Down_Single_Frame("WoodenSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Full_Frame",new WoodenSimple_Full_Frame("WoodenSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Horizontal_Middle_Single_Frame",new WoodenSimple_Horizontal_Middle_Single_Frame("WoodenSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Left_Frame",new WoodenSimple_Left_Frame("WoodenSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Left_Single_Frame",new WoodenSimple_Left_Single_Frame("WoodenSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Middle_Frame",new WoodenSimple_Middle_Frame("WoodenSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Right_Frame",new WoodenSimple_Right_Frame("WoodenSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Right_Single_Frame",new WoodenSimple_Right_Single_Frame("WoodenSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Top_Frame",new WoodenSimple_Top_Frame("WoodenSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Top_Left_Frame",new WoodenSimple_Top_Left_Frame("WoodenSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Top_Right_Frame",new WoodenSimple_Top_Right_Frame("WoodenSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Top_Single_Frame",new WoodenSimple_Top_Single_Frame("WoodenSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("WoodenSimple_Vertical_Middle_Single_Frame",new WoodenSimple_Vertical_Middle_Single_Frame("WoodenSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	


blockRef.put("YellowSimple_Pane", new YellowSimple_Pane("YellowSimple").setCreativeTab(tabSimpleLife));
blockRef.put("YellowSimple_Down_Frame",new YellowSimple_Down_Frame("YellowSimple_Down_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Down_Left_Frame",new YellowSimple_Down_Left_Frame("YellowSimple_Down_Left_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Down_Right_Frame",new YellowSimple_Down_Right_Frame("YellowSimple_Down_Right_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Down_Single_Frame",new YellowSimple_Down_Single_Frame("YellowSimple_Down_Single_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Full_Frame",new YellowSimple_Full_Frame("YellowSimple_Full_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Horizontal_Middle_Single_Frame",new YellowSimple_Horizontal_Middle_Single_Frame("YellowSimple_Horizontal_Middle_Single_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Left_Frame",new YellowSimple_Left_Frame("YellowSimple_Left_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Left_Single_Frame",new YellowSimple_Left_Single_Frame("YellowSimple_Left_Single_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Middle_Frame",new YellowSimple_Middle_Frame("YellowSimple_Middle_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Right_Frame",new YellowSimple_Right_Frame("YellowSimple_Right_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Right_Single_Frame",new YellowSimple_Right_Single_Frame("YellowSimple_Right_Single_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Top_Frame",new YellowSimple_Top_Frame("YellowSimple_Top_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Top_Left_Frame",new YellowSimple_Top_Left_Frame("YellowSimple_Top_Left_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Top_Right_Frame",new YellowSimple_Top_Right_Frame("YellowSimple_Top_Right_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Top_Single_Frame",new YellowSimple_Top_Single_Frame("YellowSimple_Top_Single_Frame","Glass_Trim"));
	
blockRef.put("YellowSimple_Vertical_Middle_Single_Frame",new YellowSimple_Vertical_Middle_Single_Frame("YellowSimple_Vertical_Middle_Single_Frame","Glass_Trim"));
	



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
	
blockRef.put("Celtic_Rune_Tile",new Celtic_Rune_Tile().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Another_World",new Celtic_Tile_Another_World().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Blue",new Celtic_Tile_Blue().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Cream",new Celtic_Tile_Cream().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Gold",new Celtic_Tile_Gold().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Green",new Celtic_Tile_Green().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Grey",new Celtic_Tile_Grey().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Lightblue",new Celtic_Tile_Lightblue().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Magenta",new Celtic_Tile_Magenta().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Purple",new Celtic_Tile_Purple().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Purple_Another_World",new Celtic_Tile_Purple_Another_World().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Red",new Celtic_Tile_Red().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_White",new Celtic_Tile_White().setCreativeTab(tabCeltic));
	
blockRef.put("Celtic_Tile_Yellow",new Celtic_Tile_Yellow().setCreativeTab(tabCeltic));
	
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


blockRef.put("Autum_yellow_Ashed_Grass",new Autum_yellow_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Blue_Grass",new Autum_yellow_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Dark_Grass",new Autum_yellow_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Green_Grass",new Autum_yellow_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Pink_Grass",new Autum_yellow_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Purple_Grass",new Autum_yellow_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Autum_yellow_Valley_Grass",new Autum_yellow_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Ashed_Grass",new Black_Ashes_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Blue_Grass",new Black_Ashes_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Dark_Grass",new Black_Ashes_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Green_Grass",new Black_Ashes_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Pink_Grass",new Black_Ashes_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Purple_Grass",new Black_Ashes_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Black_Ashes_Valley_Grass",new Black_Ashes_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Ashed_Grass",new Cyan_Aquarium_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Blue_Grass",new Cyan_Aquarium_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Dark_Grass",new Cyan_Aquarium_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Green_Grass",new Cyan_Aquarium_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Pink_Grass",new Cyan_Aquarium_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Purple_Grass",new Cyan_Aquarium_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Cyan_Aquarium_Valley_Grass",new Cyan_Aquarium_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Ashed_Grass",new Dark_Poison_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Blue_Grass",new Dark_Poison_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Dark_Grass",new Dark_Poison_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Green_Grass",new Dark_Poison_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Pink_Grass",new Dark_Poison_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Purple_Grass",new Dark_Poison_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Dark_Poison_Valley_Grass",new Dark_Poison_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Ashed_Grass",new Deep_Blue_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Blue_Grass",new Deep_Blue_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Dark_Grass",new Deep_Blue_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Green_Grass",new Deep_Blue_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Pink_Grass",new Deep_Blue_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Purple_Grass",new Deep_Blue_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Deep_Blue_Valley_Grass",new Deep_Blue_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Ashed_Grass",new Forest_Green_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Blue_Grass",new Forest_Green_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Dark_Grass",new Forest_Green_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Green_Grass",new Forest_Green_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Pink_Grass",new Forest_Green_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Purple_Grass",new Forest_Green_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Forest_Green_Valley_Grass",new Forest_Green_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Ashed_Grass",new Light_Icey_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Blue_Grass",new Light_Icey_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Dark_Grass",new Light_Icey_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Green_Grass",new Light_Icey_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Pink_Grass",new Light_Icey_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Purple_Grass",new Light_Icey_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Light_Icey_Valley_Grass",new Light_Icey_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Ashed_Grass",new Normal_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Blue_Grass",new Normal_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Dark_Grass",new Normal_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Grass",new Normal_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Green_Grass",new Normal_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Pink_Grass",new Normal_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Purple_Grass",new Normal_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Normal_Valley_Grass",new Normal_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Ashed_Grass",new Ocean_Blue_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Blue_Grass",new Ocean_Blue_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Dark_Grass",new Ocean_Blue_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Green_Grass",new Ocean_Blue_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Pink_Grass",new Ocean_Blue_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Purple_Grass",new Ocean_Blue_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Ocean_Blue_Valley_Grass",new Ocean_Blue_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Ashed_Grass",new Orange_Warm_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Blue_Grass",new Orange_Warm_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Dark_Grass",new Orange_Warm_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Green_Grass",new Orange_Warm_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Pink_Grass",new Orange_Warm_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Purple_Grass",new Orange_Warm_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Orange_Warm_Valley_Grass",new Orange_Warm_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Ashed_Grass",new Purple_Lunatic_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Blue_Grass",new Purple_Lunatic_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Dark_Grass",new Purple_Lunatic_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Green_Grass",new Purple_Lunatic_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Pink_Grass",new Purple_Lunatic_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Purple_Grass",new Purple_Lunatic_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Lunatic_Valley_Grass",new Purple_Lunatic_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Ashed_Grass",new Purple_Snow_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Blue_Grass",new Purple_Snow_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Dark_Grass",new Purple_Snow_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Green_Grass",new Purple_Snow_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Pink_Grass",new Purple_Snow_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Purple_Grass",new Purple_Snow_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Purple_Snow_Valley_Grass",new Purple_Snow_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Ashed_Grass",new Red_Sweet_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Blue_Grass",new Red_Sweet_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Dark_Grass",new Red_Sweet_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Green_Grass",new Red_Sweet_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Pink_Grass",new Red_Sweet_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Purple_Grass",new Red_Sweet_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Sweet_Valley_Grass",new Red_Sweet_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Ashed_Grass",new Red_Wood_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Blue_Grass",new Red_Wood_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Dark_Grass",new Red_Wood_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Green_Grass",new Red_Wood_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Pink_Grass",new Red_Wood_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Purple_Grass",new Red_Wood_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Red_Wood_Valley_Grass",new Red_Wood_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Ashed_Grass",new Weird_Grass_1_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Blue_Grass",new Weird_Grass_1_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Dark_Grass",new Weird_Grass_1_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Green_Grass",new Weird_Grass_1_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Pink_Grass",new Weird_Grass_1_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Purple_Grass",new Weird_Grass_1_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_1_Valley_Grass",new Weird_Grass_1_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Ashed_Grass",new Weird_Grass_2_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Blue_Grass",new Weird_Grass_2_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Dark_Grass",new Weird_Grass_2_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Green_Grass",new Weird_Grass_2_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Pink_Grass",new Weird_Grass_2_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Purple_Grass",new Weird_Grass_2_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_2_Valley_Grass",new Weird_Grass_2_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Ashed_Grass",new Weird_Grass_3_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Blue_Grass",new Weird_Grass_3_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Dark_Grass",new Weird_Grass_3_Dark_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Green_Grass",new Weird_Grass_3_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Pink_Grass",new Weird_Grass_3_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Purple_Grass",new Weird_Grass_3_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("Weird_Grass_3_Valley_Grass",new Weird_Grass_3_Valley_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Ashed_Grass",new White_Ashed_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Blue_Grass",new White_Blue_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Green_Grass",new White_Green_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Pink_Grass",new White_Pink_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Purple_Grass",new White_Purple_Grass().setCreativeTab(tabNatrualBlocks));
blockRef.put("White_Valley_Grass",new White_Valley_Grass().setCreativeTab(tabNatrualBlocks));


blockRef.put("Cut_lines_x1_0",new Cut_lines_x1_0().setCreativeTab(tabCityBlocks));
blockRef.put("Cut_lines_x1_1",new Cut_lines_x1_1().setCreativeTab(tabCityBlocks));
blockRef.put("Cut_lines_y1_0",new Cut_lines_y1_0().setCreativeTab(tabCityBlocks));
blockRef.put("Cut_lines_y1_1",new Cut_lines_y1_1().setCreativeTab(tabCityBlocks));
blockRef.put("Cut_lines_z1_0",new Cut_lines_z1_0().setCreativeTab(tabCityBlocks));
blockRef.put("Cut_lines_z1_1",new Cut_lines_z1_1().setCreativeTab(tabCityBlocks));
blockRef.put("Middle_Line_0",new Middle_Line_0().setCreativeTab(tabCityBlocks));
blockRef.put("Middle_Line_1",new Middle_Line_1().setCreativeTab(tabCityBlocks));
blockRef.put("x1_yellow_ray_0",new x1_yellow_ray_0().setCreativeTab(tabCityBlocks));
blockRef.put("x1_yellow_ray_1",new x1_yellow_ray_1().setCreativeTab(tabCityBlocks));
blockRef.put("y1_yellow_ray_0",new y1_yellow_ray_0().setCreativeTab(tabCityBlocks));
blockRef.put("y1_yellow_ray_1",new y1_yellow_ray_1().setCreativeTab(tabCityBlocks));



blockRef.put("Srindintaria_Rune",new Srindintaria_Rune().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2",new Srindintaria_Rune_2().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Blue",new Srindintaria_Rune_2_Blue().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Bluestone",new Srindintaria_Rune_2_Bluestone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Green",new Srindintaria_Rune_2_Green().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Orange",new Srindintaria_Rune_2_Orange().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Purple",new Srindintaria_Rune_2_Purple().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Red",new Srindintaria_Rune_2_Red().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Sandstone",new Srindintaria_Rune_2_Sandstone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_2_Solea_Coral",new Srindintaria_Rune_2_Solea_Coral().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_Blue_Moon_Gem",new Srindintaria_Rune_Blue_Moon_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune_Red_Moon_Gem",new Srindintaria_Rune_Red_Moon_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune__Green_Gem",new Srindintaria_Rune__Green_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune__Orange_Moon_Gem",new Srindintaria_Rune__Orange_Moon_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune__Purple_Moon_Gem",new Srindintaria_Rune__Purple_Moon_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Rune__Purpula_Gem",new Srindintaria_Rune__Purpula_Gem().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Deep_Dessert_Stone",new Srindintaria_Wall_Deep_Dessert_Stone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Deep_Snow_Cavestone",new Srindintaria_Wall_Deep_Snow_Cavestone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Deep_Solea_Stone",new Srindintaria_Wall_Deep_Solea_Stone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Forest_stone",new Srindintaria_Wall_Forest_stone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Redstone",new Srindintaria_Wall_Redstone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Sandstone",new Srindintaria_Wall_Sandstone().setCreativeTab(tabSridintaria));
blockRef.put("Srindintaria_Wall_Stone",new Srindintaria_Wall_Stone().setCreativeTab(tabSridintaria));

blockRef.put("Bamboo_fence",new Bamboo_fence().setCreativeTab(tabFences));

blockRef.put("Bamboo_fence_Green",new Bamboo_fence_Green().setCreativeTab(tabFences));
blockRef.put("Black_Deco_Fence",new Black_Deco_Fence().setCreativeTab(tabFences));
blockRef.put("Gold_Deco_Fence",new Gold_Deco_Fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Blue_Glass_fence",new Hutyve_Blue_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Cyan_Glass_fence",new Hutyve_Cyan_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Dark_Blue_Glass_fence",new Hutyve_Dark_Blue_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_fence",new Hutyve_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Green_Glass_fence",new Hutyve_Green_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Magenta_Glass_fence",new Hutyve_Magenta_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Orange_Glass_fence",new Hutyve_Orange_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Pink_Glass_fence",new Hutyve_Pink_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Purple_Glass_fence",new Hutyve_Purple_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Red_Glass_fence",new Hutyve_Red_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Hutyve_Yellow_Glass_fence",new Hutyve_Yellow_Glass_fence().setCreativeTab(tabFences));
blockRef.put("Iron_Deco_Fence",new Iron_Deco_Fence().setCreativeTab(tabFences));
/*blockRef.put("Iron_Fences_x1",new Iron_Fences_x1().setCreativeTab(tabFences));
blockRef.put("Iron_Fences_xy1",new Iron_Fences_xy1().setCreativeTab(tabFences));
blockRef.put("Iron_Fences_y2",new Iron_Fences_y2().setCreativeTab(tabFences));
blockRef.put("Oxided_fence_x1",new Oxided_fence_x1().setCreativeTab(tabFences));
blockRef.put("Oxided_fence_xy1",new Oxided_fence_xy1().setCreativeTab(tabFences));
blockRef.put("Oxided_fence_y2",new Oxided_fence_y2().setCreativeTab(tabFences));*/

blockRef.put("Sindrintaria_Athemyst_gem_fence",new Sindrintaria_Athemyst_gem_fence().setCreativeTab(tabFences));
blockRef.put("Sindrintaria_Diamon_gem_fence",new Sindrintaria_Diamon_gem_fence().setCreativeTab(tabFences));
blockRef.put("Sindrintaria_Emerald_gem_fence",new Sindrintaria_Emerald_gem_fence().setCreativeTab(tabFences));
blockRef.put("Sindrintaria_Orange_gem_fence",new Sindrintaria_Orange_gem_fence().setCreativeTab(tabFences));

blockRef.put("Sindrintaria_Saphirre_gem_fence",new Sindrintaria_Saphirre_gem_fence().setCreativeTab(tabFences));

blockRef.put("TDive_Green_Deco_Fence",new TDive_Green_Deco_Fence().setCreativeTab(tabFences));
blockRef.put("Turquoise_plaza_Deco_Fence",new Turquoise_plaza_Deco_Fence().setCreativeTab(tabFences));
blockRef.put("Valley_Romance_Deco_Fence",new Valley_Romance_Deco_Fence().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks",new Wood_fence_planks().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Birch_wood",new Wood_fence_planks_Birch_wood().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Black_wood",new Wood_fence_planks_Black_wood().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Dark_Oak_wood",new Wood_fence_planks_Dark_Oak_wood().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Green",new Wood_fence_planks_Green().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Orange_wood",new Wood_fence_planks_Orange_wood().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Red",new Wood_fence_planks_Red().setCreativeTab(tabFences));
blockRef.put("Wood_fence_planks_Yevollo",new Wood_fence_planks_Yevollo().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2",new Wood_fence_type_2().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Carpentry_Yellow",new Wood_fence_type_2_Carpentry_Yellow().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Coral",new Wood_fence_type_2_Coral().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Dark_blue",new Wood_fence_type_2_Dark_blue().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Blue",new Wood_fence_type_2_Doula_Blue().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Coral",new Wood_fence_type_2_Doula_Coral().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Lime_Green",new Wood_fence_type_2_Doula_Lime_Green().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Pastel_Orange",new Wood_fence_type_2_Doula_Pastel_Orange().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Pastel_Yellow",new Wood_fence_type_2_Doula_Pastel_Yellow().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Pink",new Wood_fence_type_2_Doula_Pink().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Doula_Purple",new Wood_fence_type_2_Doula_Purple().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Blue",new Wood_fence_type_2_Floral_Blue().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Dark_Blue",new Wood_fence_type_2_Floral_Dark_Blue().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Orange",new Wood_fence_type_2_Floral_Orange().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Purple",new Wood_fence_type_2_Floral_Purple().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Red",new Wood_fence_type_2_Floral_Red().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Rose",new Wood_fence_type_2_Floral_Rose().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Soft_Yellow",new Wood_fence_type_2_Floral_Soft_Yellow().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Floral_Sweet_Green",new Wood_fence_type_2_Floral_Sweet_Green().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_LimeGreen",new Wood_fence_type_2_LimeGreen().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_old",new Wood_fence_type_2_old().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Purple",new Wood_fence_type_2_Purple().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Solea",new Wood_fence_type_2_Solea().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Vines",new Wood_fence_type_2_Vines().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Vines_Solea",new Wood_fence_type_2_Vines_Solea().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_Vines_white",new Wood_fence_type_2_Vines_white().setCreativeTab(tabFences));
blockRef.put("Wood_fence_type_2_white",new Wood_fence_type_2_white().setCreativeTab(tabFences));

blockRef.put("Cleursardi__fusy_Kounlik_001",new Cleursardi__fusy_Kounlik_001().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__fusy_Kounlik_002",new Cleursardi__fusy_Kounlik_002().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__fusy_Kounlik_003",new Cleursardi__fusy_Kounlik_003().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin",new Cleursardi__Kojisin().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_blue",new Cleursardi__Kojisin_blue().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_Orange",new Cleursardi__Kojisin_Orange().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_Pink",new Cleursardi__Kojisin_Pink().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_purple",new Cleursardi__Kojisin_purple().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_Red",new Cleursardi__Kojisin_Red().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_white",new Cleursardi__Kojisin_white().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Kojisin_yellow",new Cleursardi__Kojisin_yellow().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji",new Cleursardi__Koloji().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_blue",new Cleursardi__Koloji_blue().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_orange",new Cleursardi__Koloji_orange().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_Pink",new Cleursardi__Koloji_Pink().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_purple",new Cleursardi__Koloji_purple().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_white",new Cleursardi__Koloji_white().setCreativeTab(tabLujillKanses));
blockRef.put("Cleursardi__Koloji_yellow",new Cleursardi__Koloji_yellow().setCreativeTab(tabLujillKanses));
blockRef.put("Clonexysis_Tile_Green",new Clonexysis_Tile_Green().setCreativeTab(tabLujillKanses));
blockRef.put("Clonexysis_Tile_Lila",new Clonexysis_Tile_Lila().setCreativeTab(tabLujillKanses));
blockRef.put("Clonexysis_Tile_Original",new Clonexysis_Tile_Original().setCreativeTab(tabLujillKanses));
blockRef.put("Clonexysis_Tile_Yellow",new Clonexysis_Tile_Yellow().setCreativeTab(tabLujillKanses));

blockRef.put("Fivhyna__Green",new Fivhyna__Green().setCreativeTab(tabLujillKanses));
blockRef.put("Fivhyna__Puple",new Fivhyna__Puple().setCreativeTab(tabLujillKanses));
blockRef.put("Fivhyna__Red",new Fivhyna__Red().setCreativeTab(tabLujillKanses));
blockRef.put("Fivhyna__yellow",new Fivhyna__yellow().setCreativeTab(tabLujillKanses));

blockRef.put("Kuhuno_Blue",new Kuhuno_Blue().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Gold",new Kuhuno_Gold().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_neon_cyan",new Kuhuno_neon_cyan().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_neon_green",new Kuhuno_neon_green().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Neon_Pink",new Kuhuno_Neon_Pink().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Orange",new Kuhuno_Orange().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Pink",new Kuhuno_Pink().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Purple",new Kuhuno_Purple().setCreativeTab(tabLujillKanses));
blockRef.put("Kuhuno_Red",new Kuhuno_Red().setCreativeTab(tabLujillKanses));

blockRef.put("Senaanti_Rune_1",new Senaanti_Rune_1().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_2",new Senaanti_Rune_2().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_3",new Senaanti_Rune_3().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_3_Blue_Moon",new Senaanti_Rune_3_Blue_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_3_Green_Moon",new Senaanti_Rune_3_Green_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_3_Orange_Moon",new Senaanti_Rune_3_Orange_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_Rune_3_Red_Moon",new Senaanti_Rune_3_Red_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_tile_Koonkip_1",new Senaanti_tile_Koonkip_1().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_tile_Koonkip_2",new Senaanti_tile_Koonkip_2().setCreativeTab(tabLujillKanses));
blockRef.put("Senaanti_tile_Koonkip_3",new Senaanti_tile_Koonkip_3().setCreativeTab(tabLujillKanses));

blockRef.put("Kunkasie_rune",new Kunkasie_rune().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_rune_2",new Kunkasie_rune_2().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Summon_Rune",new Kunkasie_Summon_Rune().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile",new Kunkasie_tile().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_2",new Kunkasie_tile_2().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_Crimson_moon",new Kunkasie_tile_Crimson_moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_Green_moon",new Kunkasie_tile_Green_moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_moon",new Kunkasie_tile_moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_Orange_moon",new Kunkasie_tile_Orange_moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_tile_Purple_moon",new Kunkasie_tile_Purple_moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_wall_Simbol",new Kunkasie_wall_Simbol().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_wall_Simbol_decorated",new Kunkasie_wall_Simbol_decorated().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Zuupa",new Kunkasie_Zuupa().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Zuupa_Green_Moon",new Kunkasie_Zuupa_Green_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Zuupa_Moon_Blue",new Kunkasie_Zuupa_Moon_Blue().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Zuupa_Orange_Moon",new Kunkasie_Zuupa_Orange_Moon().setCreativeTab(tabLujillKanses));
blockRef.put("Kunkasie_Zuupa_Red_Moon",new Kunkasie_Zuupa_Red_Moon().setCreativeTab(tabLujillKanses));


GameRegistry.registerTileEntity(TEFence.class,"TEFence");
GameRegistry.registerTileEntity(TEDecoFence.class,"TEDecoFence");
GameRegistry.registerTileEntity(TEHutyveFence.class,"TEHutyveFence");
GameRegistry.registerTileEntity(TESindrintariaFence.class,"TESindrintariaFence");
GameRegistry.registerTileEntity(TEWoodFence.class,"TEWoodFence");
GameRegistry.registerTileEntity(TEWoodType2Fence.class,"TEWoodType2Fence");
GameRegistry.registerTileEntity(TEWoodFlowerFence.class,"TEWoodFlowerFence");
GameRegistry.registerTileEntity(TEWoodVineFence.class,"TEWoodVineFence");


}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRendering();
		TelBiomeGenBase.registerWithBiomeDictionary();

		Dimension.registerWorldProvider();
		Dimension.registerDimensions();
		WorldTypeTelgttatium.addCustomWorldTypes();
		EventHelper.registerEvents();
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
public static CreativeTabs tabSimpleLife = new CreativeTabs("tabSimpleLife") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Simple_Glass_Purple")).getItem();
	}
};
public static CreativeTabs tabCeltic = new CreativeTabs("tabCeltic") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Celtic_Rune_Tile")).getItem();
	}
};
public static CreativeTabs tabElegantLife = new CreativeTabs("ElegantLife") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Elegant_Wooden_Full_Frame")).getItem();
	}
};
public static CreativeTabs tabCityBlocks = new CreativeTabs("CityLife") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Cut_lines_x1_0")).getItem();
	}
};
public static CreativeTabs tabSridintaria = new CreativeTabs("Sridintaria") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Srindintaria_Rune_Blue_Moon_Gem")).getItem();
	}
};

public static CreativeTabs tabLujillKanses = new CreativeTabs("Lujill_Kanses") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Cleursardi__fusy_Kounlik_001")).getItem();
	}
};

public static CreativeTabs tabFences = new CreativeTabs("telFences") {
	@Override
	public Item getTabIconItem() {
		return new ItemStack(blockRef.get("Bamboo_fence")).getItem();
	}
};

}
