package com.pugz.florist.core.util;

import com.pugz.florist.core.registry.BlockRegistry;
import net.minecraft.block.Block;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static com.pugz.florist.core.registry.BlockRegistry.*;

public class FlowerPotUtils {

    public static Map<Field, Block> FLOWER_POT_DATA = new HashMap<Field, Block>();

    public static void addFlowerPotData(String field, Block pot) {
        Class clazz = BlockRegistry.class;
        try {
            FLOWER_POT_DATA.put(clazz.getField(field), pot);
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static Block getBlockByField(String field) {
        Class clazz = BlockRegistry.class;
        try {
            if (FLOWER_POT_DATA.containsKey(clazz.getField(field))) {
                return FLOWER_POT_DATA.get(clazz.getField(field));
            }
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return BlockRegistry.FLOWER_POT;
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
    }
}