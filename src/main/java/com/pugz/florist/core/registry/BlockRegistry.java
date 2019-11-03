package com.pugz.florist.core.registry;

import com.pugz.florist.common.block.DirectionalFlowerPotBlock;
import com.pugz.florist.common.block.FlowerPotBlock;
import com.pugz.florist.core.util.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "florist", bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

    public static Block FLOWER_POT_OVERRIDE = new net.minecraft.block.FlowerPotBlock(Blocks.AIR, BlockProperties.OVERRIDE).setRegistryName("minecraft:flower_pot");

    public static Block FLOWER_POT = new FlowerPotBlock(Blocks.AIR, BlockProperties.FLOWER_POT).setRegistryName("flower_pot");
    public static Block POTTED_BAMBOO = new FlowerPotBlock(Block.getBlockFromItem(Items.BAMBOO), BlockProperties.FLOWER_POT).setRegistryName("potted_bamboo");
    public static Block POTTED_OAK_SAPLING = new FlowerPotBlock(Blocks.OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_oak_sapling");
    public static Block POTTED_SPRUCE_SAPLING = new FlowerPotBlock(Blocks.SPRUCE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_spruce_sapling");
    public static Block POTTED_BIRCH_SAPLING = new FlowerPotBlock(Blocks.BIRCH_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_birch_sapling");
    public static Block POTTED_JUNGLE_SAPLING = new FlowerPotBlock(Blocks.JUNGLE_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_jungle_sapling");
    public static Block POTTED_ACACIA_SAPLING = new FlowerPotBlock(Blocks.ACACIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_acacia_sapling");
    public static Block POTTED_DARK_OAK_SAPLING = new FlowerPotBlock(Blocks.DARK_OAK_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("potted_dark_oak_sapling");
    public static Block POTTED_FERN = new FlowerPotBlock(Blocks.FERN, BlockProperties.FLOWER_POT).setRegistryName("potted_fern");
    public static Block POTTED_DANDELION = new FlowerPotBlock(Blocks.DANDELION, BlockProperties.FLOWER_POT).setRegistryName("potted_dandelion");
    public static Block POTTED_POPPY = new FlowerPotBlock(Blocks.POPPY, BlockProperties.FLOWER_POT).setRegistryName("potted_poppy");
    public static Block POTTED_BLUE_ORCHID = new FlowerPotBlock(Blocks.BLUE_ORCHID, BlockProperties.FLOWER_POT).setRegistryName("potted_blue_orchid");
    public static Block POTTED_ALLIUM = new FlowerPotBlock(Blocks.ALLIUM, BlockProperties.FLOWER_POT).setRegistryName("potted_allium");
    public static Block POTTED_AZURE_BLUET = new FlowerPotBlock(Blocks.AZURE_BLUET, BlockProperties.FLOWER_POT).setRegistryName("potted_azure_bluet");
    public static Block POTTED_RED_TULIP = new FlowerPotBlock(Blocks.RED_TULIP, BlockProperties.FLOWER_POT).setRegistryName("potted_red_tulip");
    public static Block POTTED_ORANGE_TULIP = new FlowerPotBlock(Blocks.ORANGE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("potted_orange_tulip");
    public static Block POTTED_WHITE_TULIP = new FlowerPotBlock(Blocks.WHITE_TULIP, BlockProperties.FLOWER_POT).setRegistryName("potted_white_tulip");
    public static Block POTTED_PINK_TULIP = new FlowerPotBlock(Blocks.PINK_TULIP, BlockProperties.FLOWER_POT).setRegistryName("potted_pink_tulip");
    public static Block POTTED_OXEYE_DAISY = new FlowerPotBlock(Blocks.OXEYE_DAISY, BlockProperties.FLOWER_POT).setRegistryName("potted_oxeye_daisy");
    public static Block POTTED_CORNFLOWER = new FlowerPotBlock(Blocks.CORNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("potted_cornflower");
    public static Block POTTED_LILY_OF_THE_VALLEY = new FlowerPotBlock(Blocks.LILY_OF_THE_VALLEY, BlockProperties.FLOWER_POT).setRegistryName("potted_lily_of_the_valley");
    public static Block POTTED_WITHER_ROSE = new FlowerPotBlock(Blocks.WITHER_ROSE, BlockProperties.FLOWER_POT).setRegistryName("potted_wither_rose");
    public static Block POTTED_RED_MUSHROOM = new FlowerPotBlock(Blocks.RED_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("potted_red_mushroom");
    public static Block POTTED_BROWN_MUSHROOM = new FlowerPotBlock(Blocks.BROWN_MUSHROOM, BlockProperties.FLOWER_POT).setRegistryName("potted_brown_mushroom");
    public static Block POTTED_DEAD_BUSH = new FlowerPotBlock(Blocks.DEAD_BUSH, BlockProperties.FLOWER_POT).setRegistryName("potted_dead_bush");
    public static Block POTTED_CACTUS = new FlowerPotBlock(Blocks.CACTUS, BlockProperties.FLOWER_POT).setRegistryName("potted_cactus");

    public static Block POTTED_WHEAT = new FlowerPotBlock(Block.getBlockFromItem(Items.WHEAT), BlockProperties.FLOWER_POT).setRegistryName("potted_wheat");
    public static Block POTTED_CARROT = new FlowerPotBlock(Block.getBlockFromItem(Items.CARROT), BlockProperties.FLOWER_POT).setRegistryName("potted_carrot");
    public static Block POTTED_POTATO = new FlowerPotBlock(Block.getBlockFromItem(Items.POTATO), BlockProperties.FLOWER_POT).setRegistryName("potted_potato");
    public static Block POTTED_BEETROOT = new FlowerPotBlock(Block.getBlockFromItem(Items.BEETROOT), BlockProperties.FLOWER_POT).setRegistryName("potted_beetroot");
    public static Block POTTED_SUGAR_CANE = new FlowerPotBlock(Block.getBlockFromItem(Items.SUGAR_CANE), BlockProperties.FLOWER_POT).setRegistryName("potted_sugar_cane");
    public static Block POTTED_NETHER_WART = new FlowerPotBlock(Block.getBlockFromItem(Items.NETHER_WART), BlockProperties.FLOWER_POT).setRegistryName("potted_nether_wart");
    public static Block POTTED_CHORUS_FRUIT = new FlowerPotBlock(Block.getBlockFromItem(Items.CHORUS_FRUIT), BlockProperties.FLOWER_POT).setRegistryName("potted_chorus_fruit");
    public static Block POTTED_PUMPKIN = new FlowerPotBlock(Blocks.PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("potted_pumpkin");
    public static Block POTTED_MELON = new FlowerPotBlock(Blocks.MELON, BlockProperties.FLOWER_POT).setRegistryName("potted_melon");
    public static Block POTTED_ROSE_BUSH = new FlowerPotBlock(Blocks.ROSE_BUSH, BlockProperties.FLOWER_POT).setRegistryName("potted_rose_bush");
    public static Block POTTED_SUNFLOWER = new FlowerPotBlock(Blocks.SUNFLOWER, BlockProperties.FLOWER_POT).setRegistryName("potted_sunflower");
    public static Block POTTED_LILAC = new FlowerPotBlock(Blocks.LILAC, BlockProperties.FLOWER_POT).setRegistryName("potted_lilac");
    public static Block POTTED_PEONY = new FlowerPotBlock(Blocks.PEONY, BlockProperties.FLOWER_POT).setRegistryName("potted_peony");
    public static Block POTTED_GRASS = new FlowerPotBlock(Blocks.GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_grass");
    public static Block POTTED_TALL_GRASS = new FlowerPotBlock(Blocks.TALL_GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_tall_grass");
    public static Block POTTED_LARGE_FERN = new FlowerPotBlock(Blocks.LARGE_FERN, BlockProperties.FLOWER_POT).setRegistryName("potted_large_fern");
    public static Block POTTED_CARVED_PUMPKIN = new DirectionalFlowerPotBlock(Blocks.CARVED_PUMPKIN, BlockProperties.FLOWER_POT).setRegistryName("potted_carved_pumpkin");
    public static Block POTTED_JACK_O_LANTERN = new DirectionalFlowerPotBlock(Blocks.JACK_O_LANTERN, BlockProperties.POTTED_JACK_O_LANTERN).setRegistryName("potted_jack_o_lantern");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                FLOWER_POT_OVERRIDE,
                FLOWER_POT,

                POTTED_WHEAT,
                POTTED_CARROT,
                POTTED_POTATO,
                POTTED_BEETROOT,
                POTTED_SUGAR_CANE,
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
                POTTED_CACTUS
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item.Properties none = new Item.Properties();
        Item.Properties decorations = new Item.Properties().group(ItemGroup.DECORATIONS);
        event.getRegistry().registerAll(
                new BlockItem(FLOWER_POT_OVERRIDE, none).setRegistryName(FLOWER_POT_OVERRIDE.getRegistryName()),
                new BlockItem(FLOWER_POT, decorations).setRegistryName(FLOWER_POT.getRegistryName())
        );
    }
}