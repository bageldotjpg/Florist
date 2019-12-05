package com.pugz.florist.core.registry;

import com.pugz.florist.common.block.FlowerPotBlock;
import com.pugz.florist.common.block.HangingFlowerPotBlock;
import com.pugz.florist.core.util.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

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

    public static Item BAMBOO_TORCH = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bambooblocks:bamboo_torch"));

    public static Item WHITE_DELPHINIUM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:white_delphinium"));
    public static Item BLUE_DELPHINIUM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:blue_delphinium"));
    public static Item PINK_DELPHINIUM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:pink_delphinium"));
    public static Item PURPLE_DELPHINIUM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:purple_delphinium"));
    public static Item WHITE_WISTERIA_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:white_wisteria_sapling"));
    public static Item BLUE_WISTERIA_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:blue_wisteria_sapling"));
    public static Item PINK_WISTERIA_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:pink_wisteria_sapling"));
    public static Item PURPLE_WISTERIA_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("bloomful:purple_wisteria_sapling"));

    public static Item RED_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:red_lotus"));
    public static Item ORANGE_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:orange_lotus"));
    public static Item YELLOW_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:yellow_lotus"));
    public static Item CYAN_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:cyan_lotus"));
    public static Item BLUE_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:blue_lotus"));
    public static Item PURPLE_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:purple_lotus"));
    public static Item PINK_LOTUS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("tropics:pink_lotus"));

    public static Item PICKEREL_WEED_BLUE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:pickerel_weed_blue"));
    public static Item PICKEREL_WEED_PURPLE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:pickerel_weed_purple"));
    public static Item SEAROCKET_WHITE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:searocket_white"));
    public static Item SEAROCKET_PINK = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:searocket_pink"));
    public static Item FLOWERING_RUSH = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:flowering_rush"));

    //public static Block ACAN_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:acan_coral"));
    //public static Block FINGER_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:finger_coral"));
    //public static Block STAR_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:star_coral"));
    //public static Block MOSS_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:moss_coral"));
    //public static Block PETAL_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:petal_coral"));
    //public static Block BRANCH_ROCK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:branch_coral"));
    //public static Block ROCK_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:rock_coral"));
    //public static Block PILLOW_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:pillow_coral"));
    //public static Block SILK_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:silk_coral"));
    //public static Block PRISMARINE_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:prismarine_coral"));
    //public static Block DEAD_ACAN_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_acan_coral"));
    //public static Block DEAD_FINGER_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_finger_coral"));
    //public static Block DEAD_STAR_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_star_coral"));
    //public static Block DEAD_MOSS_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_moss_coral"));
    //public static Block DEAD_PETAL_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_petal_coral"));
    //public static Block DEAD_BRANCH_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_branch_coral"));
    //public static Block DEAD_ROCK_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_rock_coral"));
    //public static Block DEAD_PILLOW_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_pillow_coral"));
    //public static Block DEAD_SILK_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_silk_coral"));
    //public static Block ELDER_PRISMARINE_CORAL = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:elder_prismarine_coral"));
    //public static Block ACAN_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:acacn_coral_fan"));
    //public static Block FINGER_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:finger_coral_fan"));
    //public static Block STAR_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:star_coral_fan"));
    //public static Block MOSS_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:moss_coral_fan"));
    //public static Block PETAL_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:petal_coral_fan"));
    //public static Block BRANCH_ROCK_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:branch_coral_fan"));
    //public static Block ROCK_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:rock_coral_fan"));
    //public static Block PILLOW_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:pillow_coral_fan"));
    //public static Block SILK_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:silk_coral_fan"));
    //public static Block PRISMARINE_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:prismarine_coral_fan"));
    //public static Block DEAD_ACAN_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_acan_coral_fan"));
    //public static Block DEAD_FINGER_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_finger_coral_fan"));
    //public static Block DEAD_STAR_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_star_coral_fan"));
    //public static Block DEAD_MOSS_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_moss_coral_fan"));
    //public static Block DEAD_PETAL_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_petal_coral_fan"));
    //public static Block DEAD_BRANCH_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_branch_coral_fan"));
    //public static Block DEAD_ROCK_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_rock_coral_fan"));
    //public static Block DEAD_PILLOW_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_pillow_coral_fan"));
    //public static Block DEAD_SILK_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:dead_silk_coral_fan"));
    //public static Block ELDER_PRISMARINE_CORAL_FAN = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("upgrade_aquatic:elder_prismarine_coral_fan"));

    public static Item CORROCK_CROWN_STANDING_OVERWORLD = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_overworld"));
    public static Item CORROCK_CROWN_STANDING_NETHER = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_nether"));
    public static Item CORROCK_CROWN_STANDING_END = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_end"));
    public static Item POISE_GRASS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:poise_grass"));
    public static Item POISE_GRASS_TALL = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:poise_grass_tall"));
    public static Item CORROCK_OVERWORLD = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_overworld"));
    public static Item CORROCK_NETHER = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_nether"));
    public static Item CORROCK_END = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_end"));

    public static Item ROOT = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:root"));
    public static Item GLOWSHROOM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:glowshroom"));
    public static Item LAVENDER_BLOSSOM_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:lavender_blossom_sapling"));
    public static Item ORANGE_BLOSSOM_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:orange_blossom_sapling"));
    public static Item PINK_BLOSSOM_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:pink_blossom_sapling"));
    public static Item BLUE_BLOSSOM_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:blue_blossom_sapling"));
    public static Item YELLOW_BLOSSOM_SAPLING = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:yellow_blossom_sapling"));

    public static Item ORANGE_FRUIT_TREE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:orange_fruit_tree"));
    public static Item APRICOT_FRUIT_TREE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:apricot_fruit_tree"));
    public static Item APPLE_FRUIT_TREE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:apple_fruit_tree"));
    public static Item DAYROOT = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:dayroot"));

    public static Item BUTTERCUP = ForgeRegistries.ITEMS.getValue(new ResourceLocation("earthmobsmod:buttercup"));

    public static Block HANGING_POTTED_BAMBOO_TORCH = new HangingFlowerPotBlock(BAMBOO_TORCH, BlockProperties.POTTED_TORCH).setRegistryName("hanging_potted_bamboo_torch");
    public static Block POTTED_BAMBOO_TORCH = new FlowerPotBlock(BAMBOO_TORCH, BlockProperties.POTTED_TORCH).setRegistryName("bambooblocks:potted_bamboo_torch");

    public static Block POTTED_WHITE_DELPHINIUM = new FlowerPotBlock(WHITE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("potted_white_delphinium");
    public static Block POTTED_PINK_DELPHINIUM = new FlowerPotBlock(PINK_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("potted_pink_delphinium");
    public static Block POTTED_PURPLE_DELPHINIUM = new FlowerPotBlock(PURPLE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("potted_purple_delphinium");
    public static Block POTTED_BLUE_DELPHINIUM = new FlowerPotBlock(BLUE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("potted_blue_delphinium");
    public static Block POTTED_WHITE_WISTERIA_SAPLING = new FlowerPotBlock(WHITE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("bloomful:potted_white_wisteria_sapling");
    public static Block POTTED_PINK_WISTERIA_SAPLING = new FlowerPotBlock(PINK_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("bloomful:potted_pink_wisteria_sapling");
    public static Block POTTED_PURPLE_WISTERIA_SAPLING = new FlowerPotBlock(PURPLE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("bloomful:potted_purple_wisteria_sapling");
    public static Block POTTED_BLUE_WISTERIA_SAPLING = new FlowerPotBlock(BLUE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("bloomful:potted_blue_wisteria_sapling");
    public static Block HANGING_POTTED_WHITE_DELPHINIUM = new HangingFlowerPotBlock(WHITE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_white_delphinium");
    public static Block HANGING_POTTED_PINK_DELPHINIUM = new HangingFlowerPotBlock(PINK_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_delphinium");
    public static Block HANGING_POTTED_PURPLE_DELPHINIUM = new HangingFlowerPotBlock(PURPLE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_purple_delphinium");
    public static Block HANGING_POTTED_BLUE_DELPHINIUM = new HangingFlowerPotBlock(BLUE_DELPHINIUM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_delphinium");
    public static Block HANGING_POTTED_WHITE_WISTERIA_SAPLING = new HangingFlowerPotBlock(WHITE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_white_wisteria_sapling");
    public static Block HANGING_POTTED_PINK_WISTERIA_SAPLING = new HangingFlowerPotBlock(PINK_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_wisteria_sapling");
    public static Block HANGING_POTTED_PURPLE_WISTERIA_SAPLING = new HangingFlowerPotBlock(PURPLE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_purple_wisteria_sapling");
    public static Block HANGING_POTTED_BLUE_WISTERIA_SAPLING = new HangingFlowerPotBlock(BLUE_WISTERIA_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_wisteria_sapling");

    public static Block POTTED_RED_LOTUS = new FlowerPotBlock(RED_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_red_lotus");
    public static Block POTTED_ORANGE_LOTUS = new FlowerPotBlock(ORANGE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_orange_lotus");
    public static Block POTTED_YELLOW_LOTUS = new FlowerPotBlock(YELLOW_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_yellow_lotus");
    public static Block POTTED_CYAN_LOTUS = new FlowerPotBlock(CYAN_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_cyan_lotus");
    public static Block POTTED_BLUE_LOTUS = new FlowerPotBlock(BLUE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_blue_lotus");
    public static Block POTTED_PURPLE_LOTUS = new FlowerPotBlock(PURPLE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_purple_lotus");
    public static Block POTTED_PINK_LOTUS = new FlowerPotBlock(PINK_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("tropics:potted_pink_lotus");
    public static Block HANGING_POTTED_RED_LOTUS = new HangingFlowerPotBlock(RED_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_red_lotus");
    public static Block HANGING_POTTED_ORANGE_LOTUS = new HangingFlowerPotBlock(ORANGE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_orange_lotus");
    public static Block HANGING_POTTED_YELLOW_LOTUS = new HangingFlowerPotBlock(YELLOW_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_yellow_lotus");
    public static Block HANGING_POTTED_CYAN_LOTUS = new HangingFlowerPotBlock(CYAN_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_cyan_lotus");
    public static Block HANGING_POTTED_BLUE_LOTUS = new HangingFlowerPotBlock(BLUE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_lotus");
    public static Block HANGING_POTTED_PURPLE_LOTUS = new HangingFlowerPotBlock(PURPLE_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_purple_lotus");
    public static Block HANGING_POTTED_PINK_LOTUS = new HangingFlowerPotBlock(PINK_LOTUS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_lotus");

    public static Block POTTED_PICKEREL_WEED_BLUE = new FlowerPotBlock(PICKEREL_WEED_BLUE, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_pickerelweed_blue");
    public static Block POTTED_PICKEREL_WEED_PURPLE = new FlowerPotBlock(PICKEREL_WEED_PURPLE, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_pickerelweed_purple");
    public static Block POTTED_SEAROCKET_WHITE = new FlowerPotBlock(SEAROCKET_WHITE, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_searocket_white");
    public static Block POTTED_SEAROCKET_PINK = new FlowerPotBlock(SEAROCKET_PINK, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_searocket_pink");
    public static Block HANGING_POTTED_PICKEREL_WEED_BLUE = new HangingFlowerPotBlock(PICKEREL_WEED_BLUE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pickerel_weed_blue");
    public static Block HANGING_POTTED_PICKEREL_WEED_PURPLE = new HangingFlowerPotBlock(PICKEREL_WEED_PURPLE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pickerel_weed_purple");
    public static Block HANGING_POTTED_SEAROCKET_WHITE = new HangingFlowerPotBlock(SEAROCKET_WHITE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_searocket_white");
    public static Block HANGING_POTTED_SEAROCKET_PINK = new HangingFlowerPotBlock(SEAROCKET_PINK, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_searocket_pink");
    //public static Block POTTED_FLOWERING_RUSH = new FlowerPotBlock(FLOWERING_RUSH, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_bamboo_torch");
    //public static Block HANGING_POTTED_FLOWERING_RUSH = new HangingFlowerPotBlock(FLOWERING_RUSH, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_bamboo_torch");
    //public static Block POTTED_ACAN_CORAL = new FlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_acan_coral");
    //public static Block POTTED_DEAD_ACAN_CORAL = new FlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_dead_acan_coral");
    //public static Block POTTED_ACAN_CORAL_FAN = new FlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_acan_coral_fan");
    //public static Block POTTED_DEAD_ACAN_CORAL_FAN = new FlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("potted_dead_acan_coral_fan");
    //public static Block HANGING_POTTED_ACAN_CORAL = new HangingFlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_acan_coral");
    //public static Block HANGING_POTTED_DEAD_ACAN_CORAL = new HangingFlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_acan_coral");
    //public static Block HANGING_POTTED_ACAN_CORAL_FAN = new HangingFlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_acan_coral");
    //public static Block HANGING_POTTED_DEAD_ACAN_CORAL_FAN = new HangingFlowerPotBlock.Coral(ACAN_CORAL, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_acan_coral");

    public static Block POTTED_CORROCK_CROWN_STANDING_OVERWORLD = new FlowerPotBlock(CORROCK_CROWN_STANDING_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_standing_overworld");
    public static Block POTTED_CORROCK_CROWN_STANDING_NETHER = new FlowerPotBlock(CORROCK_CROWN_STANDING_NETHER, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_standing_nether");
    public static Block POTTED_CORROCK_CROWN_STANDING_END = new FlowerPotBlock(CORROCK_CROWN_STANDING_END, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_standing_end");
    public static Block HANGING_POTTED_CORROCK_CROWN_STANDING_OVERWORLD = new HangingFlowerPotBlock(CORROCK_CROWN_STANDING_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_standing_overworld");
    public static Block HANGING_POTTED_CORROCK_CROWN_STANDING_NETHER = new HangingFlowerPotBlock(CORROCK_CROWN_STANDING_NETHER, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_standing_nether");
    public static Block HANGING_POTTED_CORROCK_CROWN_STANDING_END = new HangingFlowerPotBlock(CORROCK_CROWN_STANDING_END, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_standing_end");
    public static Block POTTED_POISE_GRASS = new FlowerPotBlock(POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_poise_grass");
    public static Block HANGING_POTTED_POISE_GRASS = new HangingFlowerPotBlock(POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_poise_grass");
    public static Block POTTED_POISE_GRASS_TALL = new FlowerPotBlock(POISE_GRASS_TALL, BlockProperties.FLOWER_POT).setRegistryName("potted_poise_grass_tall");
    public static Block HANGING_POTTED_POISE_GRASS_TALL = new HangingFlowerPotBlock(POISE_GRASS_TALL, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_poise_grass_tall");
    public static Block POTTED_CORROCK_OVERWORLD = new FlowerPotBlock(CORROCK_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_overworld");
    public static Block POTTED_CORROCK_NETHER = new FlowerPotBlock(CORROCK_NETHER, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_nether");
    public static Block POTTED_CORROCK_END = new FlowerPotBlock(CORROCK_END, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_end");
    public static Block HANGING_POTTED_CORROCK_OVERWORLD = new HangingFlowerPotBlock(CORROCK_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_overworld");
    public static Block HANGING_POTTED_CORROCK_NETHER = new HangingFlowerPotBlock(CORROCK_NETHER, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_nether");
    public static Block HANGING_POTTED_CORROCK_END = new HangingFlowerPotBlock(CORROCK_END, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_end");

    public static Block POTTED_ROOT = new FlowerPotBlock(ROOT, BlockProperties.FLOWER_POT).setRegistryName("potted_root");
    public static Block POTTED_GLOWSHROOM = new FlowerPotBlock(GLOWSHROOM, BlockProperties.POTTED_TORCH).setRegistryName("quark:potted_glowshroom");
    public static Block POTTED_LAVENDER_BLOSSOM_SAPLING = new FlowerPotBlock(LAVENDER_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_lavender_blossom_sapling");
    public static Block POTTED_ORANGE_BLOSSOM_SAPLING = new FlowerPotBlock(ORANGE_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_orange_blossom_sapling");
    public static Block POTTED_PINK_BLOSSOM_SAPLING = new FlowerPotBlock(PINK_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_pink_blossom_sapling");
    public static Block POTTED_BLUE_BLOSSOM_SAPLING = new FlowerPotBlock(BLUE_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_blue_blossom_sapling");
    public static Block POTTED_YELLOW_BLOSSOM_SAPLING = new FlowerPotBlock(YELLOW_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_yellow_blossom_sapling");
    public static Block POTTED_COCOA_BEAN = new FlowerPotBlock(Items.COCOA_BEANS, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_cocoa_bean");
    public static Block POTTED_SEA_PICKLE = new FlowerPotBlock(Items.SEA_PICKLE, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_sea_pickle");
    public static Block HANGING_POTTED_ROOT = new HangingFlowerPotBlock(ROOT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_root");
    public static Block HANGING_POTTED_GLOWSHROOM = new HangingFlowerPotBlock(GLOWSHROOM, BlockProperties.POTTED_TORCH).setRegistryName("hanging_potted_glowshroom");
    public static Block HANGING_POTTED_LAVENDER_BLOSSOM_SAPLING = new HangingFlowerPotBlock(LAVENDER_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_lavender_blossom_sapling");
    public static Block HANGING_POTTED_ORANGE_BLOSSOM_SAPLING = new HangingFlowerPotBlock(ORANGE_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_orange_blossom_sapling");
    public static Block HANGING_POTTED_PINK_BLOSSOM_SAPLING = new HangingFlowerPotBlock(PINK_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_blossom_sapling");
    public static Block HANGING_POTTED_BLUE_BLOSSOM_SAPLING = new HangingFlowerPotBlock(BLUE_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_blossom_sapling");
    public static Block HANGING_POTTED_YELLOW_BLOSSOM_SAPLING = new HangingFlowerPotBlock(YELLOW_BLOSSOM_SAPLING, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_yellow_blossom_sapling");
    public static Block HANGING_POTTED_COCOA_BEAN = new HangingFlowerPotBlock(Items.COCOA_BEANS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_cocoa_bean");
    public static Block HANGING_POTTED_SEA_PICKLE = new HangingFlowerPotBlock(Items.SEA_PICKLE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_sea_pickle");

    public static Block POTTED_ORANGE_FRUIT_TREE = new FlowerPotBlock(ORANGE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("potted_orange_fruit_tree");
    public static Block POTTED_APRICOT_FRUIT_TREE = new FlowerPotBlock(APRICOT_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("potted_apricot_fruit_tree");
    public static Block POTTED_APPLE_FRUIT_TREE = new FlowerPotBlock(APPLE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("potted_apple_fruit_tree");
    public static Block POTTED_DAYROOT = new FlowerPotBlock(DAYROOT, BlockProperties.FLOWER_POT).setRegistryName("potted_dayroot");
    public static Block HANGING_POTTED_ORANGE_FRUIT_TREE = new HangingFlowerPotBlock(ORANGE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_orange_fruit_tree");
    public static Block HANGING_POTTED_APRICOT_FRUIT_TREE = new HangingFlowerPotBlock(APRICOT_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_apricot_fruit_tree");
    public static Block HANGING_POTTED_APPLE_FRUIT_TREE = new HangingFlowerPotBlock(APPLE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_apple_fruit_tree");
    public static Block HANGING_POTTED_DAYROOT = new HangingFlowerPotBlock(DAYROOT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_dayroot");

    public static Block POTTED_BUTTERCUP = new FlowerPotBlock(BUTTERCUP, BlockProperties.FLOWER_POT).setRegistryName("earthmobsmod:potted_buttercup");
    public static Block HANGING_POTTED_BUTTERCUP = new HangingFlowerPotBlock(BUTTERCUP, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_buttercup");

    @SubscribeEvent
    public static void registerCompatibilityBlocks(RegistryEvent.Register<Block> event) {
        if (ModList.get().isLoaded("bambooblocks")) {
            event.getRegistry().registerAll(
                    HANGING_POTTED_BAMBOO_TORCH, POTTED_BAMBOO_TORCH
            );
        }
        if (ModList.get().isLoaded("bloomful")) {
            event.getRegistry().registerAll(
                    POTTED_WHITE_DELPHINIUM, POTTED_PINK_DELPHINIUM, POTTED_PURPLE_DELPHINIUM, POTTED_BLUE_DELPHINIUM,
                    POTTED_WHITE_WISTERIA_SAPLING, POTTED_PINK_WISTERIA_SAPLING, POTTED_PURPLE_WISTERIA_SAPLING, POTTED_BLUE_WISTERIA_SAPLING,
                    HANGING_POTTED_WHITE_DELPHINIUM, HANGING_POTTED_PINK_DELPHINIUM, HANGING_POTTED_PURPLE_DELPHINIUM, HANGING_POTTED_BLUE_DELPHINIUM,
                    HANGING_POTTED_WHITE_WISTERIA_SAPLING, HANGING_POTTED_PINK_WISTERIA_SAPLING, HANGING_POTTED_PURPLE_WISTERIA_SAPLING, HANGING_POTTED_BLUE_WISTERIA_SAPLING
            );
        }
        if (ModList.get().isLoaded("tropics")) {
            event.getRegistry().registerAll(
                    POTTED_RED_LOTUS, POTTED_ORANGE_LOTUS, POTTED_YELLOW_LOTUS, POTTED_CYAN_LOTUS, POTTED_BLUE_LOTUS, POTTED_PURPLE_LOTUS, POTTED_PINK_LOTUS,
                    HANGING_POTTED_RED_LOTUS, HANGING_POTTED_ORANGE_LOTUS, HANGING_POTTED_YELLOW_LOTUS, HANGING_POTTED_CYAN_LOTUS, HANGING_POTTED_BLUE_LOTUS, HANGING_POTTED_PURPLE_LOTUS, HANGING_POTTED_PINK_LOTUS
            );
        }
        if (ModList.get().isLoaded("upgrade_aquatic")) {
            event.getRegistry().registerAll(
                    POTTED_PICKEREL_WEED_BLUE, POTTED_PICKEREL_WEED_PURPLE,
                    POTTED_SEAROCKET_WHITE, POTTED_SEAROCKET_PINK,
                    HANGING_POTTED_PICKEREL_WEED_BLUE, HANGING_POTTED_PICKEREL_WEED_PURPLE,
                    HANGING_POTTED_SEAROCKET_WHITE, HANGING_POTTED_SEAROCKET_PINK
            );
        }
        if (ModList.get().isLoaded("endergetic")) {
            event.getRegistry().registerAll(
                    POTTED_CORROCK_CROWN_STANDING_OVERWORLD, POTTED_CORROCK_CROWN_STANDING_NETHER, POTTED_CORROCK_CROWN_STANDING_END,
                    HANGING_POTTED_CORROCK_CROWN_STANDING_OVERWORLD, HANGING_POTTED_CORROCK_CROWN_STANDING_NETHER, HANGING_POTTED_CORROCK_CROWN_STANDING_END,
                    POTTED_POISE_GRASS, HANGING_POTTED_POISE_GRASS, POTTED_POISE_GRASS_TALL, HANGING_POTTED_POISE_GRASS_TALL,
                    POTTED_CORROCK_OVERWORLD, POTTED_CORROCK_NETHER, POTTED_CORROCK_END,
                    HANGING_POTTED_CORROCK_OVERWORLD, HANGING_POTTED_CORROCK_NETHER, HANGING_POTTED_CORROCK_END
                    );
        }
        if (ModList.get().isLoaded("quark")) {
            event.getRegistry().registerAll(
                    //HANGING_POTTED_ROOT, POTTED_ROOT,
                    HANGING_POTTED_GLOWSHROOM, POTTED_GLOWSHROOM,
                    POTTED_COCOA_BEAN, POTTED_SEA_PICKLE,
                    POTTED_LAVENDER_BLOSSOM_SAPLING, POTTED_ORANGE_BLOSSOM_SAPLING, POTTED_PINK_BLOSSOM_SAPLING, POTTED_BLUE_BLOSSOM_SAPLING, POTTED_YELLOW_BLOSSOM_SAPLING,
                    HANGING_POTTED_COCOA_BEAN, HANGING_POTTED_SEA_PICKLE,
                    HANGING_POTTED_LAVENDER_BLOSSOM_SAPLING, HANGING_POTTED_ORANGE_BLOSSOM_SAPLING, HANGING_POTTED_PINK_BLOSSOM_SAPLING, HANGING_POTTED_BLUE_BLOSSOM_SAPLING, HANGING_POTTED_YELLOW_BLOSSOM_SAPLING
            );
        }
        if (ModList.get().isLoaded("rys")) {
            event.getRegistry().registerAll(
                    POTTED_ORANGE_FRUIT_TREE, POTTED_APRICOT_FRUIT_TREE, POTTED_APPLE_FRUIT_TREE, //POTTED_DAYROOT,
                    HANGING_POTTED_ORANGE_FRUIT_TREE, HANGING_POTTED_APRICOT_FRUIT_TREE, HANGING_POTTED_APPLE_FRUIT_TREE//, HANGING_POTTED_DAYROOT
            );
        }
        if (ModList.get().isLoaded("earthmobsmod")) {
            event.getRegistry().registerAll(
                    HANGING_POTTED_BUTTERCUP, POTTED_BUTTERCUP
            );
        }
    }
}