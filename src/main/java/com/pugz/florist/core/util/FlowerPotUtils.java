package com.pugz.florist.core.util;

import com.pugz.florist.core.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static com.pugz.florist.core.registry.BlockRegistry.*;

public class FlowerPotUtils {
    public static Map<Field, Block> FLOWER_POT_DATA = new HashMap<Field, Block>();

    public static void addFlowerPotData(String field, Block pot) {
        Class blockRegistry = BlockRegistry.class;
        try {
            FLOWER_POT_DATA.put(blockRegistry.getField(field), pot);
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static Block getBlockByField(String field) {
        Class blockRegistry = BlockRegistry.class;
        try {
            return FLOWER_POT_DATA.get(blockRegistry.getField(field));
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isPottable(Item item) {
        String[] ITEM_NAMES = new String[] {
                "minecraft:wheat", "minecraft:carrot", "minecraft:potato", "minecraft:sugar_cane", "minecraft:sweet_berries", "minecraft:beetroot",
                "minecraft:pumpkin", "minecraft:melon",
                "minecraft:rose_bush", "minecraft:sunflower", "minecraft:lilac", "minecraft:peony",
                "minecraft:nether_wart", "minecraft:chorus_fruit",
                "minecraft:grass", "minecraft:tall_grass", "minecraft:large_fern",
                "minecraft:carved_pumpkin", "minecraft:jack_o_lantern",
                "minecraft:bamboo",
                "minecraft:oak_sapling", "minecraft:spruce_sapling", "minecraft:birch_sapling", "minecraft:jungle_sapling", "minecraft:dark_oak_sapling", "minecraft:acacia_sapling",
                "minecraft:fern",
                "minecraft:dandelion", "minecraft:poppy", "minecraft:allium", "minecraft:blue_orchid", "minecraft:azure_bluet", "minecraft:red_tulip", "minecraft:orange_tulip", "minecraft:white_tulip", "minecraft:pink_tulip", "minecraft:oxeye_daisy", "minecraft:lily_of_the_valley", "minecraft:cornflower", "minecraft:wither_rose",
                "minecraft:red_mushroom", "minecraft:brown_mushroom",
                "minecraft:cactus",
                "minecraft:dead_bush",
                "bambooblocks:bamboo_torch",
                "bloomful:white_delphinium",
                "bloomful:blue_delphinium",
                "bloomful:pink_delphinium",
                "bloomful:purple_delphinium",
                "bloomful:white_wisteria_sapling",
                "bloomful:blue_wisteria_sapling",
                "bloomful:pink_wisteria_sapling",
                "bloomful:purple_wisteria_sapling",
                "tropics:red_lotus",
                "tropics:orange_lotus",
                "tropics:yellow_lotus",
                "tropics:cyan_lotus",
                "tropics:blue_lotus",
                "tropics:purple_lotus",
                "tropics:pink_lotus",
                "upgrade_aquatic:pickerel_weed_blue",
                "upgrade_aquatic:pickerel_weed_purple",
                "upgrade_aquatic:searocket_white",
                "upgrade_aquatic:searocket_pink",
                "upgrade_aquatic:flowering_rush",
                "endergetic:corrock_crown_standing_overworld",
                "endergetic:corrock_crown_standing_nether",
                "endergetic:corrock_crown_standing_end",
                "endergetic:poise_grass",
                "endergetic:poise_grass_tall",
                "quark:root_item",
                "quark:glowshroom",
                "rys:orange_fruit_tree",
                "rys:apricot_fruit_tree",
                "rys:dayroot",
                "earthmobsmod:buttercup"
        };
        for (String name : ITEM_NAMES) {
            if (item.getRegistryName().toString().equals(name)) return true;
        }
        return false;
    }

    public static void registerFlowerPotData() {
        FlowerPotUtils.addFlowerPotData("POTTED_BAMBOO", POTTED_BAMBOO);
        FlowerPotUtils.addFlowerPotData("POTTED_OAK_SAPLING", POTTED_OAK_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_SPRUCE_SAPLING", POTTED_SPRUCE_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_BIRCH_SAPLING", POTTED_BIRCH_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_JUNGLE_SAPLING", POTTED_JUNGLE_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_DARK_OAK_SAPLING", POTTED_DARK_OAK_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_ACACIA_SAPLING", POTTED_ACACIA_SAPLING);
        FlowerPotUtils.addFlowerPotData("POTTED_FERN", POTTED_FERN);
        FlowerPotUtils.addFlowerPotData("POTTED_DANDELION", POTTED_DANDELION);
        FlowerPotUtils.addFlowerPotData("POTTED_POPPY", POTTED_POPPY);
        FlowerPotUtils.addFlowerPotData("POTTED_ALLIUM", POTTED_ALLIUM);
        FlowerPotUtils.addFlowerPotData("POTTED_BLUE_ORCHID", POTTED_BLUE_ORCHID);
        FlowerPotUtils.addFlowerPotData("POTTED_AZURE_BLUET", POTTED_AZURE_BLUET);
        FlowerPotUtils.addFlowerPotData("POTTED_RED_TULIP", POTTED_RED_TULIP);
        FlowerPotUtils.addFlowerPotData("POTTED_ORANGE_TULIP", POTTED_ORANGE_TULIP);
        FlowerPotUtils.addFlowerPotData("POTTED_WHITE_TULIP", POTTED_WHITE_TULIP);
        FlowerPotUtils.addFlowerPotData("POTTED_PINK_TULIP", POTTED_PINK_TULIP);
        FlowerPotUtils.addFlowerPotData("POTTED_OXEYE_DAISY", POTTED_OXEYE_DAISY);
        FlowerPotUtils.addFlowerPotData("POTTED_LILY_OF_THE_VALLEY", POTTED_LILY_OF_THE_VALLEY);
        FlowerPotUtils.addFlowerPotData("POTTED_CORNFLOWER", POTTED_CORNFLOWER);
        FlowerPotUtils.addFlowerPotData("POTTED_WITHER_ROSE", POTTED_WITHER_ROSE);
        FlowerPotUtils.addFlowerPotData("POTTED_RED_MUSHROOM", POTTED_RED_MUSHROOM);
        FlowerPotUtils.addFlowerPotData("POTTED_BROWN_MUSHROOM", POTTED_BROWN_MUSHROOM);
        FlowerPotUtils.addFlowerPotData("POTTED_CACTUS", POTTED_CACTUS);
        FlowerPotUtils.addFlowerPotData("POTTED_DEAD_BUSH", POTTED_DEAD_BUSH);
        FlowerPotUtils.addFlowerPotData("POTTED_WHEAT", POTTED_WHEAT);
        FlowerPotUtils.addFlowerPotData("POTTED_CARROT", POTTED_CARROT);
        FlowerPotUtils.addFlowerPotData("POTTED_POTATO", POTTED_POTATO);
        FlowerPotUtils.addFlowerPotData("POTTED_SUGAR_CANE", POTTED_SUGAR_CANE);
        FlowerPotUtils.addFlowerPotData("POTTED_SWEET_BERRIES", POTTED_SWEET_BERRIES);
        FlowerPotUtils.addFlowerPotData("POTTED_BEETROOT", POTTED_BEETROOT);
        FlowerPotUtils.addFlowerPotData("POTTED_PUMPKIN", POTTED_PUMPKIN);
        FlowerPotUtils.addFlowerPotData("POTTED_MELON", POTTED_MELON);
        FlowerPotUtils.addFlowerPotData("POTTED_ROSE_BUSH", POTTED_ROSE_BUSH);
        FlowerPotUtils.addFlowerPotData("POTTED_SUNFLOWER", POTTED_SUNFLOWER);
        FlowerPotUtils.addFlowerPotData("POTTED_LILAC", POTTED_LILAC);
        FlowerPotUtils.addFlowerPotData("POTTED_PEONY", POTTED_PEONY);
        FlowerPotUtils.addFlowerPotData("POTTED_NETHER_WART", POTTED_NETHER_WART);
        FlowerPotUtils.addFlowerPotData("POTTED_CHORUS_FRUIT", POTTED_CHORUS_FRUIT);
        FlowerPotUtils.addFlowerPotData("POTTED_GRASS", POTTED_GRASS);
        FlowerPotUtils.addFlowerPotData("POTTED_TALL_GRASS", POTTED_TALL_GRASS);
        FlowerPotUtils.addFlowerPotData("POTTED_LARGE_FERN", POTTED_LARGE_FERN);
        FlowerPotUtils.addFlowerPotData("POTTED_CARVED_PUMPKIN", POTTED_CARVED_PUMPKIN);
        FlowerPotUtils.addFlowerPotData("POTTED_JACK_O_LANTERN", POTTED_JACK_O_LANTERN);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_BAMBOO", HANGING_POTTED_BAMBOO);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_OAK_SAPLING", HANGING_POTTED_OAK_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_SPRUCE_SAPLING", HANGING_POTTED_SPRUCE_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_BIRCH_SAPLING", HANGING_POTTED_BIRCH_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_JUNGLE_SAPLING", HANGING_POTTED_JUNGLE_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_DARK_OAK_SAPLING", HANGING_POTTED_DARK_OAK_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_ACACIA_SAPLING", HANGING_POTTED_ACACIA_SAPLING);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_FERN", HANGING_POTTED_FERN);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_DANDELION", HANGING_POTTED_DANDELION);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_POPPY", HANGING_POTTED_POPPY);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_ALLIUM", HANGING_POTTED_ALLIUM);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_BLUE_ORCHID", HANGING_POTTED_BLUE_ORCHID);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_AZURE_BLUET", HANGING_POTTED_AZURE_BLUET);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_RED_TULIP", HANGING_POTTED_RED_TULIP);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_ORANGE_TULIP", HANGING_POTTED_ORANGE_TULIP);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_WHITE_TULIP", HANGING_POTTED_WHITE_TULIP);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_PINK_TULIP", HANGING_POTTED_PINK_TULIP);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_OXEYE_DAISY", HANGING_POTTED_OXEYE_DAISY);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_LILY_OF_THE_VALLEY", HANGING_POTTED_LILY_OF_THE_VALLEY);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_CORNFLOWER", HANGING_POTTED_CORNFLOWER);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_WITHER_ROSE", HANGING_POTTED_WITHER_ROSE);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_RED_MUSHROOM", HANGING_POTTED_RED_MUSHROOM);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_BROWN_MUSHROOM", HANGING_POTTED_BROWN_MUSHROOM);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_CACTUS", HANGING_POTTED_CACTUS);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_DEAD_BUSH", HANGING_POTTED_DEAD_BUSH);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_WHEAT", HANGING_POTTED_WHEAT);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_CARROT", HANGING_POTTED_CARROT);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_POTATO", HANGING_POTTED_POTATO);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_SUGAR_CANE", HANGING_POTTED_SUGAR_CANE);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_SWEET_BERRIES", HANGING_POTTED_SWEET_BERRIES);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_BEETROOT", HANGING_POTTED_BEETROOT);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_PUMPKIN", HANGING_POTTED_PUMPKIN);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_MELON", HANGING_POTTED_MELON);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_ROSE_BUSH", HANGING_POTTED_ROSE_BUSH);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_SUNFLOWER", HANGING_POTTED_SUNFLOWER);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_LILAC", HANGING_POTTED_LILAC);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_PEONY", HANGING_POTTED_PEONY);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_NETHER_WART", HANGING_POTTED_NETHER_WART);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_CHORUS_FRUIT", HANGING_POTTED_CHORUS_FRUIT);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_GRASS", HANGING_POTTED_GRASS);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_TALL_GRASS", HANGING_POTTED_TALL_GRASS);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_LARGE_FERN", HANGING_POTTED_LARGE_FERN);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_CARVED_PUMPKIN", HANGING_POTTED_CARVED_PUMPKIN);
        FlowerPotUtils.addFlowerPotData("HANGING_POTTED_JACK_O_LANTERN", HANGING_POTTED_JACK_O_LANTERN);
        //FlowerPotUtils.addFlowerPotData("POTTED_FIRE_CORAL", POTTED_FIRE_CORAL);
        //FlowerPotUtils.addFlowerPotData("POTTED_DEAD_FIRE_CORAL", POTTED_DEAD_FIRE_CORAL);
        //FlowerPotUtils.addFlowerPotData("POTTED_FIRE_CORAL_FAN", POTTED_FIRE_CORAL_FAN);
        //FlowerPotUtils.addFlowerPotData("POTTED_DEAD_FIRE_CORAL_FAN", POTTED_DEAD_FIRE_CORAL_FAN);
    }
}