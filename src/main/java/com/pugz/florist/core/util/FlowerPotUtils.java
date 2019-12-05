package com.pugz.florist.core.util;

import com.pugz.florist.core.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.ModList;

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
                "minecraft:sea_pickle", "minecraft:cocoa_beans",
                "bambooblocks:bamboo_torch",
                "bloomful:white_delphinium", "bloomful:blue_delphinium", "bloomful:pink_delphinium", "bloomful:purple_delphinium",
                "bloomful:white_wisteria_sapling", "bloomful:blue_wisteria_sapling", "bloomful:pink_wisteria_sapling", "bloomful:purple_wisteria_sapling",
                "tropics:red_lotus", "tropics:orange_lotus", "tropics:yellow_lotus", "tropics:cyan_lotus", "tropics:blue_lotus", "tropics:purple_lotus", "tropics:pink_lotus",
                "upgrade_aquatic:pickerel_weed_blue", "upgrade_aquatic:pickerel_weed_purple",
                "upgrade_aquatic:searocket_white", "upgrade_aquatic:searocket_pink",
                //"upgrade_aquatic:flowering_rush",
                "endergetic:corrock_crown_standing_overworld", "endergetic:corrock_crown_standing_nether", "endergetic:corrock_crown_standing_end",
                "endergetic:corrock_overworld", "endergetic:corrock_nether", "endergetic:corrock_end",
                "endergetic:poise_grass", "endergetic:poise_grass_tall",
                //"quark:root_item",
                "quark:glowshroom",
                "quark:lavender_blossom_sapling", "quark:orange_blossom_sapling", "quark:pink_blossom_sapling", "quark:blue_blossom_sapling", "quark:yellow_blossom_sapling",
                "rys:orange_fruit_tree", "rys:apricot_fruit_tree", "rys:apple_fruit_tree",
                //"rys:dayroot",
                "earthmobsmod:buttercup"
        };
        for (String name : ITEM_NAMES) {
            if (item.getRegistryName().toString().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String getFieldName(String string) {
        return "POTTED_" + string
                .replace("minecraft:", "")
                .replace("bambooblocks:", "")
                .replace("bloomful:", "")
                .replace("tropics:", "")
                .replace("upgrade_aquatic:", "")
                .replace("endergetic:", "")
                .replace("quark:", "")
                .replace("rys:", "")
                .replace("earthmobsmod:", "")
                .toUpperCase();
    }

    public static void registerFlowerPotData() {
        if (ModList.get().isLoaded("bambooblocks")) {
            addFlowerPotData("HANGING_POTTED_BAMBOO_TORCH", HANGING_POTTED_BAMBOO_TORCH);
            addFlowerPotData("POTTED_BAMBOO_TORCH", POTTED_BAMBOO_TORCH);
        }
        if (ModList.get().isLoaded("bloomful")) {
            addFlowerPotData("POTTED_WHITE_DELPHINIUM", POTTED_WHITE_DELPHINIUM);
            addFlowerPotData("POTTED_PINK_DELPHINIUM", POTTED_PINK_DELPHINIUM);
            addFlowerPotData("POTTED_PURPLE_DELPHINIUM", POTTED_PURPLE_DELPHINIUM);
            addFlowerPotData("POTTED_BLUE_DELPHINIUM", POTTED_BLUE_DELPHINIUM);
            addFlowerPotData("POTTED_WHITE_WISTERIA_SAPLING", POTTED_WHITE_WISTERIA_SAPLING);
            addFlowerPotData("POTTED_PINK_WISTERIA_SAPLING", POTTED_PINK_WISTERIA_SAPLING);
            addFlowerPotData("POTTED_PURPLE_WISTERIA_SAPLING", POTTED_PURPLE_WISTERIA_SAPLING);
            addFlowerPotData("POTTED_BLUE_WISTERIA_SAPLING", POTTED_BLUE_WISTERIA_SAPLING);
            addFlowerPotData("HANGING_POTTED_WHITE_DELPHINIUM", HANGING_POTTED_WHITE_DELPHINIUM);
            addFlowerPotData("HANGING_POTTED_PINK_DELPHINIUM", HANGING_POTTED_PINK_DELPHINIUM);
            addFlowerPotData("HANGING_POTTED_PURPLE_DELPHINIUM", HANGING_POTTED_PURPLE_DELPHINIUM);
            addFlowerPotData("HANGING_POTTED_BLUE_DELPHINIUM", HANGING_POTTED_BLUE_DELPHINIUM);
            addFlowerPotData("HANGING_POTTED_WHITE_WISTERIA_SAPLING", HANGING_POTTED_WHITE_WISTERIA_SAPLING);
            addFlowerPotData("HANGING_POTTED_PINK_WISTERIA_SAPLING", HANGING_POTTED_PINK_WISTERIA_SAPLING);
            addFlowerPotData("HANGING_POTTED_PURPLE_WISTERIA_SAPLING", HANGING_POTTED_PURPLE_WISTERIA_SAPLING);
            addFlowerPotData("HANGING_POTTED_BLUE_WISTERIA_SAPLING", HANGING_POTTED_BLUE_WISTERIA_SAPLING);
        }
        if (ModList.get().isLoaded("tropics")) {
            addFlowerPotData("POTTED_RED_LOTUS", POTTED_RED_LOTUS);
            addFlowerPotData("POTTED_ORANGE_LOTUS", POTTED_ORANGE_LOTUS);
            addFlowerPotData("POTTED_YELLOW_LOTUS", POTTED_YELLOW_LOTUS);
            addFlowerPotData("POTTED_CYAN_LOTUS", POTTED_CYAN_LOTUS);
            addFlowerPotData("POTTED_BLUE_LOTUS", POTTED_BLUE_LOTUS);
            addFlowerPotData("POTTED_PURPLE_LOTUS", POTTED_PURPLE_LOTUS);
            addFlowerPotData("POTTED_PINK_LOTUS", POTTED_PINK_LOTUS);
            addFlowerPotData("HANGING_POTTED_RED_LOTUS", HANGING_POTTED_RED_LOTUS);
            addFlowerPotData("HANGING_POTTED_ORANGE_LOTUS", HANGING_POTTED_ORANGE_LOTUS);
            addFlowerPotData("HANGING_POTTED_YELLOW_LOTUS", HANGING_POTTED_YELLOW_LOTUS);
            addFlowerPotData("HANGING_POTTED_CYAN_LOTUS", HANGING_POTTED_CYAN_LOTUS);
            addFlowerPotData("HANGING_POTTED_BLUE_LOTUS", HANGING_POTTED_BLUE_LOTUS);
            addFlowerPotData("HANGING_POTTED_PURPLE_LOTUS", HANGING_POTTED_PURPLE_LOTUS);
            addFlowerPotData("HANGING_POTTED_PINK_LOTUS", HANGING_POTTED_PINK_LOTUS);
        }
        if (ModList.get().isLoaded("upgrade_aquatic")) {
            addFlowerPotData("POTTED_PICKEREL_WEED_BLUE", POTTED_PICKEREL_WEED_BLUE);
            addFlowerPotData("POTTED_PICKEREL_WEED_PURPLE", POTTED_PICKEREL_WEED_PURPLE);
            addFlowerPotData("POTTED_SEAROCKET_WHITE", POTTED_SEAROCKET_WHITE);
            addFlowerPotData("POTTED_SEAROCKET_PINK", POTTED_SEAROCKET_PINK);
            addFlowerPotData("HANGING_POTTED_PICKEREL_WEED_BLUE", HANGING_POTTED_PICKEREL_WEED_BLUE);
            addFlowerPotData("HANGING_POTTED_PICKEREL_WEED_PURPLE", HANGING_POTTED_PICKEREL_WEED_PURPLE);
            addFlowerPotData("HANGING_POTTED_SEAROCKET_WHITE", HANGING_POTTED_SEAROCKET_WHITE);
            addFlowerPotData("HANGING_POTTED_SEAROCKET_PINK", HANGING_POTTED_SEAROCKET_PINK);
        }
        if (ModList.get().isLoaded("endergetic")) {
            addFlowerPotData("POTTED_CORROCK_CROWN_STANDING_OVERWORLD", POTTED_CORROCK_CROWN_STANDING_OVERWORLD);
            addFlowerPotData("POTTED_CORROCK_CROWN_STANDING_NETHER", POTTED_CORROCK_CROWN_STANDING_NETHER);
            addFlowerPotData("POTTED_CORROCK_CROWN_STANDING_END", POTTED_CORROCK_CROWN_STANDING_END);
            addFlowerPotData("HANGING_POTTED_CORROCK_CROWN_STANDING_OVERWORLD", HANGING_POTTED_CORROCK_CROWN_STANDING_OVERWORLD);
            addFlowerPotData("HANGING_POTTED_CORROCK_CROWN_STANDING_NETHER", HANGING_POTTED_CORROCK_CROWN_STANDING_NETHER);
            addFlowerPotData("HANGING_POTTED_CORROCK_CROWN_STANDING_END", HANGING_POTTED_CORROCK_CROWN_STANDING_END);
            addFlowerPotData("POTTED_POISE_GRASS", POTTED_POISE_GRASS);
            addFlowerPotData("HANGING_POTTED_POISE_GRASS", HANGING_POTTED_POISE_GRASS);
            addFlowerPotData("POTTED_POISE_GRASS_TALL", POTTED_POISE_GRASS_TALL);
            addFlowerPotData("HANGING_POTTED_POISE_GRASS_TALL", HANGING_POTTED_POISE_GRASS_TALL);
            addFlowerPotData("POTTED_CORROCK_OVERWORLD", POTTED_CORROCK_OVERWORLD);
            addFlowerPotData("POTTED_CORROCK_NETHER", POTTED_CORROCK_NETHER);
            addFlowerPotData("POTTED_CORROCK_END", POTTED_CORROCK_END);
            addFlowerPotData("HANGING_POTTED_CORROCK_OVERWORLD", HANGING_POTTED_CORROCK_OVERWORLD);
            addFlowerPotData("HANGING_POTTED_CORROCK_NETHER", HANGING_POTTED_CORROCK_NETHER);
            addFlowerPotData("HANGING_POTTED_CORROCK_END", HANGING_POTTED_CORROCK_END);
        }
        if (ModList.get().isLoaded("quark")) {
            //addFlowerPotData("POTTED_ROOT", POTTED_ROOT);
            addFlowerPotData("POTTED_GLOWSHROOM", POTTED_GLOWSHROOM);
            addFlowerPotData("POTTED_COCOA_BEANS", POTTED_COCOA_BEANS);
            addFlowerPotData("POTTED_SEA_PICKLE", POTTED_SEA_PICKLE);
            addFlowerPotData("POTTED_LAVENDER_BLOSSOM_SAPLING", POTTED_LAVENDER_BLOSSOM_SAPLING);
            addFlowerPotData("POTTED_ORANGE_BLOSSOM_SAPLING", POTTED_ORANGE_BLOSSOM_SAPLING);
            addFlowerPotData("POTTED_PINK_BLOSSOM_SAPLING", POTTED_PINK_BLOSSOM_SAPLING);
            addFlowerPotData("POTTED_BLUE_BLOSSOM_SAPLING", POTTED_BLUE_BLOSSOM_SAPLING);
            addFlowerPotData("POTTED_YELLOW_BLOSSOM_SAPLING", POTTED_YELLOW_BLOSSOM_SAPLING);
            //addFlowerPotData("HANGING_POTTED_ROOT", HANGING_POTTED_ROOT);
            addFlowerPotData("HANGING_POTTED_GLOWSHROOM", HANGING_POTTED_GLOWSHROOM);
            addFlowerPotData("HANGING_POTTED_COCOA_BEANS", HANGING_POTTED_COCOA_BEANS);
            addFlowerPotData("HANGING_POTTED_SEA_PICKLE", HANGING_POTTED_SEA_PICKLE);
            addFlowerPotData("HANGING_POTTED_LAVENDER_BLOSSOM_SAPLING", HANGING_POTTED_LAVENDER_BLOSSOM_SAPLING);
            addFlowerPotData("HANGING_POTTED_ORANGE_BLOSSOM_SAPLING", HANGING_POTTED_ORANGE_BLOSSOM_SAPLING);
            addFlowerPotData("HANGING_POTTED_PINK_BLOSSOM_SAPLING", HANGING_POTTED_PINK_BLOSSOM_SAPLING);
            addFlowerPotData("HANGING_POTTED_BLUE_BLOSSOM_SAPLING", HANGING_POTTED_BLUE_BLOSSOM_SAPLING);
            addFlowerPotData("HANGING_POTTED_YELLOW_BLOSSOM_SAPLING", HANGING_POTTED_YELLOW_BLOSSOM_SAPLING);
        }
        if (ModList.get().isLoaded("rys")) {
            addFlowerPotData("POTTED_ORANGE_FRUIT_TREE", POTTED_ORANGE_FRUIT_TREE);
            addFlowerPotData("POTTED_APRICOT_FRUIT_TREE", POTTED_APRICOT_FRUIT_TREE);
            addFlowerPotData("POTTED_APPLE_FRUIT_TREE", POTTED_APPLE_FRUIT_TREE);
            //addFlowerPotData("POTTED_DAYROOT", POTTED_DAYROOT);
            addFlowerPotData("HANGING_POTTED_ORANGE_FRUIT_TREE", HANGING_POTTED_ORANGE_FRUIT_TREE);
            addFlowerPotData("HANGING_POTTED_APRICOT_FRUIT_TREE", HANGING_POTTED_APRICOT_FRUIT_TREE);
            addFlowerPotData("HANGING_POTTED_APPLE_FRUIT_TREE", HANGING_POTTED_APPLE_FRUIT_TREE);
            //addFlowerPotData("HANGING_POTTED_DAYROOT", HANGING_POTTED_DAYROOT);
        }
        if (ModList.get().isLoaded("earthmobsmod")) {
            addFlowerPotData("POTTED_BUTTERCUP", POTTED_BUTTERCUP);
            addFlowerPotData("HANGING_POTTED_BUTTERCUP", HANGING_POTTED_BUTTERCUP);
        }
        addFlowerPotData("POTTED_BAMBOO", POTTED_BAMBOO);
        addFlowerPotData("POTTED_OAK_SAPLING", POTTED_OAK_SAPLING);
        addFlowerPotData("POTTED_SPRUCE_SAPLING", POTTED_SPRUCE_SAPLING);
        addFlowerPotData("POTTED_BIRCH_SAPLING", POTTED_BIRCH_SAPLING);
        addFlowerPotData("POTTED_JUNGLE_SAPLING", POTTED_JUNGLE_SAPLING);
        addFlowerPotData("POTTED_DARK_OAK_SAPLING", POTTED_DARK_OAK_SAPLING);
        addFlowerPotData("POTTED_ACACIA_SAPLING", POTTED_ACACIA_SAPLING);
        addFlowerPotData("POTTED_FERN", POTTED_FERN);
        addFlowerPotData("POTTED_DANDELION", POTTED_DANDELION);
        addFlowerPotData("POTTED_POPPY", POTTED_POPPY);
        addFlowerPotData("POTTED_ALLIUM", POTTED_ALLIUM);
        addFlowerPotData("POTTED_BLUE_ORCHID", POTTED_BLUE_ORCHID);
        addFlowerPotData("POTTED_AZURE_BLUET", POTTED_AZURE_BLUET);
        addFlowerPotData("POTTED_RED_TULIP", POTTED_RED_TULIP);
        addFlowerPotData("POTTED_ORANGE_TULIP", POTTED_ORANGE_TULIP);
        addFlowerPotData("POTTED_WHITE_TULIP", POTTED_WHITE_TULIP);
        addFlowerPotData("POTTED_PINK_TULIP", POTTED_PINK_TULIP);
        addFlowerPotData("POTTED_OXEYE_DAISY", POTTED_OXEYE_DAISY);
        addFlowerPotData("POTTED_LILY_OF_THE_VALLEY", POTTED_LILY_OF_THE_VALLEY);
        addFlowerPotData("POTTED_CORNFLOWER", POTTED_CORNFLOWER);
        addFlowerPotData("POTTED_WITHER_ROSE", POTTED_WITHER_ROSE);
        addFlowerPotData("POTTED_RED_MUSHROOM", POTTED_RED_MUSHROOM);
        addFlowerPotData("POTTED_BROWN_MUSHROOM", POTTED_BROWN_MUSHROOM);
        addFlowerPotData("POTTED_CACTUS", POTTED_CACTUS);
        addFlowerPotData("POTTED_DEAD_BUSH", POTTED_DEAD_BUSH);
        addFlowerPotData("POTTED_WHEAT", POTTED_WHEAT);
        addFlowerPotData("POTTED_CARROT", POTTED_CARROT);
        addFlowerPotData("POTTED_POTATO", POTTED_POTATO);
        addFlowerPotData("POTTED_SUGAR_CANE", POTTED_SUGAR_CANE);
        addFlowerPotData("POTTED_SWEET_BERRIES", POTTED_SWEET_BERRIES);
        addFlowerPotData("POTTED_BEETROOT", POTTED_BEETROOT);
        addFlowerPotData("POTTED_PUMPKIN", POTTED_PUMPKIN);
        addFlowerPotData("POTTED_MELON", POTTED_MELON);
        addFlowerPotData("POTTED_ROSE_BUSH", POTTED_ROSE_BUSH);
        addFlowerPotData("POTTED_SUNFLOWER", POTTED_SUNFLOWER);
        addFlowerPotData("POTTED_LILAC", POTTED_LILAC);
        addFlowerPotData("POTTED_PEONY", POTTED_PEONY);
        addFlowerPotData("POTTED_NETHER_WART", POTTED_NETHER_WART);
        addFlowerPotData("POTTED_CHORUS_FRUIT", POTTED_CHORUS_FRUIT);
        addFlowerPotData("POTTED_GRASS", POTTED_GRASS);
        addFlowerPotData("POTTED_TALL_GRASS", POTTED_TALL_GRASS);
        addFlowerPotData("POTTED_LARGE_FERN", POTTED_LARGE_FERN);
        addFlowerPotData("POTTED_CARVED_PUMPKIN", POTTED_CARVED_PUMPKIN);
        addFlowerPotData("POTTED_JACK_O_LANTERN", POTTED_JACK_O_LANTERN);
        addFlowerPotData("HANGING_POTTED_BAMBOO", HANGING_POTTED_BAMBOO);
        addFlowerPotData("HANGING_POTTED_OAK_SAPLING", HANGING_POTTED_OAK_SAPLING);
        addFlowerPotData("HANGING_POTTED_SPRUCE_SAPLING", HANGING_POTTED_SPRUCE_SAPLING);
        addFlowerPotData("HANGING_POTTED_BIRCH_SAPLING", HANGING_POTTED_BIRCH_SAPLING);
        addFlowerPotData("HANGING_POTTED_JUNGLE_SAPLING", HANGING_POTTED_JUNGLE_SAPLING);
        addFlowerPotData("HANGING_POTTED_DARK_OAK_SAPLING", HANGING_POTTED_DARK_OAK_SAPLING);
        addFlowerPotData("HANGING_POTTED_ACACIA_SAPLING", HANGING_POTTED_ACACIA_SAPLING);
        addFlowerPotData("HANGING_POTTED_FERN", HANGING_POTTED_FERN);
        addFlowerPotData("HANGING_POTTED_DANDELION", HANGING_POTTED_DANDELION);
        addFlowerPotData("HANGING_POTTED_POPPY", HANGING_POTTED_POPPY);
        addFlowerPotData("HANGING_POTTED_ALLIUM", HANGING_POTTED_ALLIUM);
        addFlowerPotData("HANGING_POTTED_BLUE_ORCHID", HANGING_POTTED_BLUE_ORCHID);
        addFlowerPotData("HANGING_POTTED_AZURE_BLUET", HANGING_POTTED_AZURE_BLUET);
        addFlowerPotData("HANGING_POTTED_RED_TULIP", HANGING_POTTED_RED_TULIP);
        addFlowerPotData("HANGING_POTTED_ORANGE_TULIP", HANGING_POTTED_ORANGE_TULIP);
        addFlowerPotData("HANGING_POTTED_WHITE_TULIP", HANGING_POTTED_WHITE_TULIP);
        addFlowerPotData("HANGING_POTTED_PINK_TULIP", HANGING_POTTED_PINK_TULIP);
        addFlowerPotData("HANGING_POTTED_OXEYE_DAISY", HANGING_POTTED_OXEYE_DAISY);
        addFlowerPotData("HANGING_POTTED_LILY_OF_THE_VALLEY", HANGING_POTTED_LILY_OF_THE_VALLEY);
        addFlowerPotData("HANGING_POTTED_CORNFLOWER", HANGING_POTTED_CORNFLOWER);
        addFlowerPotData("HANGING_POTTED_WITHER_ROSE", HANGING_POTTED_WITHER_ROSE);
        addFlowerPotData("HANGING_POTTED_RED_MUSHROOM", HANGING_POTTED_RED_MUSHROOM);
        addFlowerPotData("HANGING_POTTED_BROWN_MUSHROOM", HANGING_POTTED_BROWN_MUSHROOM);
        addFlowerPotData("HANGING_POTTED_CACTUS", HANGING_POTTED_CACTUS);
        addFlowerPotData("HANGING_POTTED_DEAD_BUSH", HANGING_POTTED_DEAD_BUSH);
        addFlowerPotData("HANGING_POTTED_WHEAT", HANGING_POTTED_WHEAT);
        addFlowerPotData("HANGING_POTTED_CARROT", HANGING_POTTED_CARROT);
        addFlowerPotData("HANGING_POTTED_POTATO", HANGING_POTTED_POTATO);
        addFlowerPotData("HANGING_POTTED_SUGAR_CANE", HANGING_POTTED_SUGAR_CANE);
        addFlowerPotData("HANGING_POTTED_SWEET_BERRIES", HANGING_POTTED_SWEET_BERRIES);
        addFlowerPotData("HANGING_POTTED_BEETROOT", HANGING_POTTED_BEETROOT);
        addFlowerPotData("HANGING_POTTED_PUMPKIN", HANGING_POTTED_PUMPKIN);
        addFlowerPotData("HANGING_POTTED_MELON", HANGING_POTTED_MELON);
        addFlowerPotData("HANGING_POTTED_ROSE_BUSH", HANGING_POTTED_ROSE_BUSH);
        addFlowerPotData("HANGING_POTTED_SUNFLOWER", HANGING_POTTED_SUNFLOWER);
        addFlowerPotData("HANGING_POTTED_LILAC", HANGING_POTTED_LILAC);
        addFlowerPotData("HANGING_POTTED_PEONY", HANGING_POTTED_PEONY);
        addFlowerPotData("HANGING_POTTED_NETHER_WART", HANGING_POTTED_NETHER_WART);
        addFlowerPotData("HANGING_POTTED_CHORUS_FRUIT", HANGING_POTTED_CHORUS_FRUIT);
        addFlowerPotData("HANGING_POTTED_GRASS", HANGING_POTTED_GRASS);
        addFlowerPotData("HANGING_POTTED_TALL_GRASS", HANGING_POTTED_TALL_GRASS);
        addFlowerPotData("HANGING_POTTED_LARGE_FERN", HANGING_POTTED_LARGE_FERN);
        addFlowerPotData("HANGING_POTTED_CARVED_PUMPKIN", HANGING_POTTED_CARVED_PUMPKIN);
        addFlowerPotData("HANGING_POTTED_JACK_O_LANTERN", HANGING_POTTED_JACK_O_LANTERN);
        //addFlowerPotData("POTTED_FIRE_CORAL", POTTED_FIRE_CORAL);
        //addFlowerPotData("POTTED_DEAD_FIRE_CORAL", POTTED_DEAD_FIRE_CORAL);
        //addFlowerPotData("POTTED_FIRE_CORAL_FAN", POTTED_FIRE_CORAL_FAN);
        //addFlowerPotData("POTTED_DEAD_FIRE_CORAL_FAN", POTTED_DEAD_FIRE_CORAL_FAN);
    }
}