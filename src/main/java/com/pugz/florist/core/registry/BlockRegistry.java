package com.pugz.florist.core.registry;

import com.pugz.florist.common.block.FlowerPotBlock;
import com.pugz.florist.common.block.HangingFlowerPotBlock;
import com.pugz.florist.core.util.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "florist", bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static Block HANGING_FLOWER_POT = new HangingFlowerPotBlock(Items.AIR, BlockProperties.FLOWER_POT).setRegistryName("hanging_flower_pot");
    public static Block FLOWER_POT = new FlowerPotBlock(Items.AIR, BlockProperties.FLOWER_POT).setRegistryName("minecraft:flower_pot");

    public static Block POTTED_BAMBOO = new FlowerPotBlock(Items.BAMBOO, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_bamboo");
    public static Block POTTED_OAK_SAPLING = new FlowerPotBlock(Items.OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_oak_sapling");
    public static Block POTTED_SPRUCE_SAPLING = new FlowerPotBlock(Items.SPRUCE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_spruce_sapling");
    public static Block POTTED_BIRCH_SAPLING = new FlowerPotBlock(Items.BIRCH_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_birch_sapling");
    public static Block POTTED_JUNGLE_SAPLING = new FlowerPotBlock(Items.JUNGLE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_jungle_sapling");
    public static Block POTTED_ACACIA_SAPLING = new FlowerPotBlock(Items.ACACIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_acacia_sapling");
    public static Block POTTED_DARK_OAK_SAPLING = new FlowerPotBlock(Items.DARK_OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_dark_oak_sapling");
    public static Block POTTED_FERN = new FlowerPotBlock(Items.FERN, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_fern");
    public static Block POTTED_DANDELION = new FlowerPotBlock(Items.DANDELION, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_dandelion");
    public static Block POTTED_POPPY = new FlowerPotBlock(Items.POPPY, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_poppy");
    public static Block POTTED_BLUE_ORCHID = new FlowerPotBlock(Items.BLUE_ORCHID, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_blue_orchid");
    public static Block POTTED_ALLIUM = new FlowerPotBlock(Items.ALLIUM, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_allium");
    public static Block POTTED_AZURE_BLUET = new FlowerPotBlock(Items.AZURE_BLUET, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_azure_bluet");
    public static Block POTTED_RED_TULIP = new FlowerPotBlock(Items.RED_TULIP, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_red_tulip");
    public static Block POTTED_ORANGE_TULIP = new FlowerPotBlock(Items.ORANGE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_orange_tulip");
    public static Block POTTED_WHITE_TULIP = new FlowerPotBlock(Items.WHITE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_white_tulip");
    public static Block POTTED_PINK_TULIP = new FlowerPotBlock(Items.PINK_TULIP, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_pink_tulip");
    public static Block POTTED_OXEYE_DAISY = new FlowerPotBlock(Items.OXEYE_DAISY, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_oxeye_daisy");
    public static Block POTTED_CORNFLOWER = new FlowerPotBlock(Items.CORNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_cornflower");
    public static Block POTTED_LILY_OF_THE_VALLEY = new FlowerPotBlock(Items.LILY_OF_THE_VALLEY, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_lily_of_the_valley");
    public static Block POTTED_WITHER_ROSE = new FlowerPotBlock(Items.WITHER_ROSE, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_wither_rose");
    public static Block POTTED_RED_MUSHROOM = new FlowerPotBlock(Items.RED_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_red_mushroom");
    public static Block POTTED_BROWN_MUSHROOM = new FlowerPotBlock(Items.BROWN_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_brown_mushroom");
    public static Block POTTED_DEAD_BUSH = new FlowerPotBlock(Items.DEAD_BUSH, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_dead_bush");
    public static Block POTTED_CACTUS = new FlowerPotBlock(Items.CACTUS, BlockProperties.FLOWER_POT).setRegistryName("minecraft:potted_cactus");

    public static Block HANGING_POTTED_BAMBOO = new HangingFlowerPotBlock(Items.BAMBOO, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_bamboo");
    public static Block HANGING_POTTED_OAK_SAPLING = new HangingFlowerPotBlock(Items.OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_oak_sapling");
    public static Block HANGING_POTTED_SPRUCE_SAPLING = new HangingFlowerPotBlock(Items.SPRUCE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_spruce_sapling");
    public static Block HANGING_POTTED_BIRCH_SAPLING = new HangingFlowerPotBlock(Items.BIRCH_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_birch_sapling");
    public static Block HANGING_POTTED_JUNGLE_SAPLING = new HangingFlowerPotBlock(Items.JUNGLE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_jungle_sapling");
    public static Block HANGING_POTTED_ACACIA_SAPLING = new HangingFlowerPotBlock(Items.ACACIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_acacia_sapling");
    public static Block HANGING_POTTED_DARK_OAK_SAPLING = new HangingFlowerPotBlock(Items.DARK_OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_dark_oak_sapling");
    public static Block HANGING_POTTED_FERN = new HangingFlowerPotBlock(Items.FERN, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_fern");
    public static Block HANGING_POTTED_DANDELION = new HangingFlowerPotBlock(Items.DANDELION, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_dandelion");
    public static Block HANGING_POTTED_POPPY = new HangingFlowerPotBlock(Items.POPPY, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_poppy");
    public static Block HANGING_POTTED_BLUE_ORCHID = new HangingFlowerPotBlock(Items.BLUE_ORCHID, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_orchid");
    public static Block HANGING_POTTED_ALLIUM = new HangingFlowerPotBlock(Items.ALLIUM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_allium");
    public static Block HANGING_POTTED_AZURE_BLUET = new HangingFlowerPotBlock(Items.AZURE_BLUET, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_azure_bluet");
    public static Block HANGING_POTTED_RED_TULIP = new HangingFlowerPotBlock(Items.RED_TULIP, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_red_tulip");
    public static Block HANGING_POTTED_ORANGE_TULIP = new HangingFlowerPotBlock(Items.ORANGE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_orange_tulip");
    public static Block HANGING_POTTED_WHITE_TULIP = new HangingFlowerPotBlock(Items.WHITE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_white_tulip");
    public static Block HANGING_POTTED_PINK_TULIP = new HangingFlowerPotBlock(Items.PINK_TULIP, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_tulip");
    public static Block HANGING_POTTED_OXEYE_DAISY = new HangingFlowerPotBlock(Items.OXEYE_DAISY, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_oxeye_daisy");
    public static Block HANGING_POTTED_CORNFLOWER = new HangingFlowerPotBlock(Items.CORNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_cornflower");
    public static Block HANGING_POTTED_LILY_OF_THE_VALLEY = new HangingFlowerPotBlock(Items.LILY_OF_THE_VALLEY, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_lily_of_the_valley");
    public static Block HANGING_POTTED_WITHER_ROSE = new HangingFlowerPotBlock(Items.WITHER_ROSE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_wither_rose");
    public static Block HANGING_POTTED_RED_MUSHROOM = new HangingFlowerPotBlock(Items.RED_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_red_mushroom");
    public static Block HANGING_POTTED_BROWN_MUSHROOM = new HangingFlowerPotBlock(Items.BROWN_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_brown_mushroom");
    public static Block HANGING_POTTED_DEAD_BUSH = new HangingFlowerPotBlock(Items.DEAD_BUSH, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_dead_bush");
    public static Block HANGING_POTTED_CACTUS = new HangingFlowerPotBlock(Items.CACTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_cactus");

    public static Block POTTED_WHEAT = new FlowerPotBlock(Items.WHEAT, BlockProperties.FLOWER_POT).setRegistryName("potted_wheat");
    public static Block POTTED_CARROT = new FlowerPotBlock(Items.CARROT, BlockProperties.FLOWER_POT).setRegistryName("potted_carrot");
    public static Block POTTED_POTATO = new FlowerPotBlock(Items.POTATO, BlockProperties.FLOWER_POT).setRegistryName("potted_potato");
    public static Block POTTED_BEETROOT = new FlowerPotBlock(Items.BEETROOT, BlockProperties.FLOWER_POT).setRegistryName("potted_beetroot");
    public static Block POTTED_SWEET_BERRIES = new FlowerPotBlock.SweetBerry().setRegistryName("potted_sweet_berries");
    public static Block POTTED_SUGAR_CANE = new FlowerPotBlock(Items.SUGAR_CANE, BlockProperties.FLOWER_POT).setRegistryName("potted_sugar_cane");
    public static Block POTTED_NETHER_WART = new FlowerPotBlock(Items.NETHER_WART, BlockProperties.FLOWER_POT).setRegistryName("potted_nether_wart");
    public static Block POTTED_CHORUS_FRUIT = new FlowerPotBlock(Items.CHORUS_FRUIT, BlockProperties.FLOWER_POT).setRegistryName("potted_chorus_fruit");
    public static Block POTTED_PUMPKIN = new FlowerPotBlock(Items.PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("potted_pumpkin");
    public static Block POTTED_MELON = new FlowerPotBlock(Items.MELON, BlockProperties.FLOWER_POT).setRegistryName("potted_melon");
    public static Block POTTED_ROSE_BUSH = new FlowerPotBlock(Items.ROSE_BUSH, BlockProperties.FLOWER_POT).setRegistryName("potted_rose_bush");
    public static Block POTTED_SUNFLOWER = new FlowerPotBlock(Items.SUNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("potted_sunflower");
    public static Block POTTED_LILAC = new FlowerPotBlock(Items.LILAC, BlockProperties.FLOWER_POT).setRegistryName("potted_lilac");
    public static Block POTTED_PEONY = new FlowerPotBlock(Items.PEONY, BlockProperties.FLOWER_POT).setRegistryName("potted_peony");
    public static Block POTTED_GRASS = new FlowerPotBlock(Items.GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_grass");
    public static Block POTTED_TALL_GRASS = new FlowerPotBlock(Items.TALL_GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_tall_grass");
    public static Block POTTED_LARGE_FERN = new FlowerPotBlock(Items.LARGE_FERN, BlockProperties.FLOWER_POT).setRegistryName("potted_large_fern");
    public static Block POTTED_CARVED_PUMPKIN = new FlowerPotBlock.Directional(Items.CARVED_PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("potted_carved_pumpkin");
    public static Block POTTED_JACK_O_LANTERN = new FlowerPotBlock.Directional(Items.JACK_O_LANTERN, BlockProperties.POTTED_JACK_O_LANTERN).setRegistryName("potted_jack_o_lantern");

    public static Block HANGING_POTTED_WHEAT = new HangingFlowerPotBlock(Items.WHEAT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_wheat");
    public static Block HANGING_POTTED_CARROT = new HangingFlowerPotBlock(Items.CARROT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_carrot");
    public static Block HANGING_POTTED_POTATO = new HangingFlowerPotBlock(Items.POTATO, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_potato");
    public static Block HANGING_POTTED_BEETROOT = new HangingFlowerPotBlock(Items.BEETROOT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_beetroot");
    public static Block HANGING_POTTED_SWEET_BERRIES = new HangingFlowerPotBlock.SweetBerry().setRegistryName("hanging_potted_sweet_berries");
    public static Block HANGING_POTTED_SUGAR_CANE = new HangingFlowerPotBlock(Items.SUGAR_CANE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_sugar_cane");
    public static Block HANGING_POTTED_NETHER_WART = new HangingFlowerPotBlock(Items.NETHER_WART, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_nether_wart");
    public static Block HANGING_POTTED_CHORUS_FRUIT = new HangingFlowerPotBlock(Items.CHORUS_FRUIT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_chorus_fruit");
    public static Block HANGING_POTTED_PUMPKIN = new HangingFlowerPotBlock(Items.PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pumpkin");
    public static Block HANGING_POTTED_MELON = new HangingFlowerPotBlock(Items.MELON, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_melon");
    public static Block HANGING_POTTED_ROSE_BUSH = new HangingFlowerPotBlock(Items.ROSE_BUSH, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_rose_bush");
    public static Block HANGING_POTTED_SUNFLOWER = new HangingFlowerPotBlock(Items.SUNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_sunflower");
    public static Block HANGING_POTTED_LILAC = new HangingFlowerPotBlock(Items.LILAC, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_lilac");
    public static Block HANGING_POTTED_PEONY = new HangingFlowerPotBlock(Items.PEONY, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_peony");
    public static Block HANGING_POTTED_GRASS = new HangingFlowerPotBlock(Items.GRASS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_grass");
    public static Block HANGING_POTTED_TALL_GRASS = new HangingFlowerPotBlock(Items.TALL_GRASS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_tall_grass");
    public static Block HANGING_POTTED_LARGE_FERN = new HangingFlowerPotBlock(Items.LARGE_FERN, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_large_fern");
    public static Block HANGING_POTTED_CARVED_PUMPKIN = new HangingFlowerPotBlock.Directional(Items.CARVED_PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_carved_pumpkin");
    public static Block HANGING_POTTED_JACK_O_LANTERN = new HangingFlowerPotBlock.Directional(Items.JACK_O_LANTERN, BlockProperties.POTTED_JACK_O_LANTERN).setRegistryName("hanging_potted_jack_o_lantern");

    //public static Block POTTED_FIRE_CORAL = new PottedCoralBlock(Items.FIRE_CORAL, BlockRegistry.POTTED_DEAD_FIRE_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_fire_coral");
    //public static Block POTTED_FIRE_CORAL_FAN = new PottedCoralBlock(Items.FIRE_CORAL_FAN, BlockRegistry.POTTED_DEAD_FIRE_CORAL_FAN, BlockProperties.FLOWER_POT).setRegistryName("potted_fire_coral_fan");
    //public static Block POTTED_DEAD_FIRE_CORAL = new FlowerPotBlock(Items.DEAD_FIRE_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_dead_fire_coral");
    //public static Block POTTED_DEAD_FIRE_CORAL_FAN = new FlowerPotBlock(Items.DEAD_FIRE_CORAL_FAN, BlockProperties.FLOWER_POT).setRegistryName("potted_dead_fire_coral_fan");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                HANGING_FLOWER_POT,
                FLOWER_POT,

                POTTED_WHEAT,
                POTTED_CARROT,
                POTTED_POTATO,
                POTTED_BEETROOT,
                POTTED_SUGAR_CANE,
                POTTED_SWEET_BERRIES,
                POTTED_NETHER_WART,
                POTTED_CHORUS_FRUIT,
                POTTED_PUMPKIN,
                POTTED_MELON,
                POTTED_ROSE_BUSH,
                POTTED_SUNFLOWER,
                POTTED_LILAC,
                POTTED_PEONY,
                POTTED_GRASS,
                POTTED_TALL_GRASS,
                POTTED_LARGE_FERN,
                POTTED_CARVED_PUMPKIN,
                POTTED_JACK_O_LANTERN,
                POTTED_BAMBOO,
                POTTED_OAK_SAPLING,
                POTTED_SPRUCE_SAPLING,
                POTTED_BIRCH_SAPLING,
                POTTED_JUNGLE_SAPLING,
                POTTED_ACACIA_SAPLING,
                POTTED_DARK_OAK_SAPLING,
                POTTED_FERN,
                POTTED_DANDELION,
                POTTED_POPPY,
                POTTED_BLUE_ORCHID,
                POTTED_ALLIUM,
                POTTED_AZURE_BLUET,
                POTTED_RED_TULIP,
                POTTED_ORANGE_TULIP,
                POTTED_WHITE_TULIP,
                POTTED_PINK_TULIP,
                POTTED_OXEYE_DAISY,
                POTTED_CORNFLOWER,
                POTTED_LILY_OF_THE_VALLEY,
                POTTED_WITHER_ROSE,
                POTTED_RED_MUSHROOM,
                POTTED_BROWN_MUSHROOM,
                POTTED_DEAD_BUSH,
                POTTED_CACTUS,

                HANGING_POTTED_WHEAT,
                HANGING_POTTED_CARROT,
                HANGING_POTTED_POTATO,
                HANGING_POTTED_BEETROOT,
                HANGING_POTTED_SUGAR_CANE,
                HANGING_POTTED_SWEET_BERRIES,
                HANGING_POTTED_NETHER_WART,
                HANGING_POTTED_CHORUS_FRUIT,
                HANGING_POTTED_PUMPKIN,
                HANGING_POTTED_MELON,
                HANGING_POTTED_ROSE_BUSH,
                HANGING_POTTED_SUNFLOWER,
                HANGING_POTTED_LILAC,
                HANGING_POTTED_PEONY,
                HANGING_POTTED_GRASS,
                HANGING_POTTED_TALL_GRASS,
                HANGING_POTTED_LARGE_FERN,
                HANGING_POTTED_CARVED_PUMPKIN,
                HANGING_POTTED_JACK_O_LANTERN,
                HANGING_POTTED_BAMBOO,
                HANGING_POTTED_OAK_SAPLING,
                HANGING_POTTED_SPRUCE_SAPLING,
                HANGING_POTTED_BIRCH_SAPLING,
                HANGING_POTTED_JUNGLE_SAPLING,
                HANGING_POTTED_ACACIA_SAPLING,
                HANGING_POTTED_DARK_OAK_SAPLING,
                HANGING_POTTED_FERN,
                HANGING_POTTED_DANDELION,
                HANGING_POTTED_POPPY,
                HANGING_POTTED_BLUE_ORCHID,
                HANGING_POTTED_ALLIUM,
                HANGING_POTTED_AZURE_BLUET,
                HANGING_POTTED_RED_TULIP,
                HANGING_POTTED_ORANGE_TULIP,
                HANGING_POTTED_WHITE_TULIP,
                HANGING_POTTED_PINK_TULIP,
                HANGING_POTTED_OXEYE_DAISY,
                HANGING_POTTED_CORNFLOWER,
                HANGING_POTTED_LILY_OF_THE_VALLEY,
                HANGING_POTTED_WITHER_ROSE,
                HANGING_POTTED_RED_MUSHROOM,
                HANGING_POTTED_BROWN_MUSHROOM,
                HANGING_POTTED_DEAD_BUSH,
                HANGING_POTTED_CACTUS

                //POTTED_FIRE_CORAL,
                //POTTED_FIRE_CORAL_FAN,
                //POTTED_DEAD_FIRE_CORAL,
                //POTTED_DEAD_FIRE_CORAL_FAN
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item.Properties decorations = new Item.Properties().group(ItemGroup.DECORATIONS);
        event.getRegistry().registerAll(
                new BlockItem(FLOWER_POT, decorations).setRegistryName(FLOWER_POT.getRegistryName())
        );
    }
}