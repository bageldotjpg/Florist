package com.pugz.florist.core.registry;

import com.pugz.florist.common.block.FlowerPotBlock;
import com.pugz.florist.common.block.HangingFlowerPotBlock;
import com.pugz.florist.core.util.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "florist", bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompatibilityRegistry {
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

    public static Item BLUE_PICKERELWEED = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:pickerel_weed_blue"));
    public static Item PURPLE_PICKERELWEED = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:pickerel_weed_purple"));
    public static Item WHITE_SEAROCKET = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:searocket_white"));
    public static Item PINK_SEAROCKET = ForgeRegistries.ITEMS.getValue(new ResourceLocation("upgrade_aquatic:searocket_pink"));
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

    public static Item CORROCK_CROWN_OVERWORLD = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_overworld"));
    public static Item CORROCK_CROWN_NETHER = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_nether"));
    public static Item CORROCK_CROWN_END = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:corrock_crown_standing_end"));
    public static Item POISE_GRASS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:poise_grass"));
    public static Item TALL_POISE_GRASS = ForgeRegistries.ITEMS.getValue(new ResourceLocation("endergetic:poise_grass_tall"));

    public static Item CAVE_ROOT = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:root_item"));
    public static Item GLOWSHROOM = ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark:glowshroom"));

    public static Item ORANGE_FRUIT_TREE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:orange_fruit_tree"));
    public static Item APRICOT_FRUIT_TREE = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rys:apricot_fruit_tree"));
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

    public static Block POTTED_BLUE_PICKERELWEED = new FlowerPotBlock(BLUE_PICKERELWEED, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_blue_pickerelweed");
    public static Block POTTED_PURPLE_PICKERELWEED = new FlowerPotBlock(PURPLE_PICKERELWEED, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_purple_pickerelweed");
    public static Block POTTED_WHITE_SEAROCKET = new FlowerPotBlock(WHITE_SEAROCKET, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_white_searocket");
    public static Block POTTED_PINK_SEAROCKET = new FlowerPotBlock(PINK_SEAROCKET, BlockProperties.FLOWER_POT).setRegistryName("upgrade_aquatic:potted_pink_searocket");
    public static Block HANGING_POTTED_BLUE_PICKERELWEED = new HangingFlowerPotBlock(BLUE_PICKERELWEED, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_blue_pickerelweed");
    public static Block HANGING_POTTED_PURPLE_PICKERELWEED = new HangingFlowerPotBlock(PURPLE_PICKERELWEED, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_purple_pickerelweed");
    public static Block HANGING_POTTED_WHITE_SEAROCKET = new HangingFlowerPotBlock(WHITE_SEAROCKET, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_white_searocket");
    public static Block HANGING_POTTED_PINK_SEAROCKET = new HangingFlowerPotBlock(PINK_SEAROCKET, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_pink_searocket");
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

    public static Block POTTED_CORROCK_CROWN_OVERWORLD = new FlowerPotBlock(CORROCK_CROWN_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_overworld");
    public static Block POTTED_CORROCK_CROWN_NETHER = new FlowerPotBlock(CORROCK_CROWN_NETHER, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_nether");
    public static Block POTTED_CORROCK_CROWN_END = new FlowerPotBlock(CORROCK_CROWN_END, BlockProperties.FLOWER_POT).setRegistryName("potted_corrock_crown_end");
    public static Block HANGING_POTTED_CORROCK_CROWN_OVERWORLD = new HangingFlowerPotBlock(CORROCK_CROWN_OVERWORLD, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_overworld");
    public static Block HANGING_POTTED_CORROCK_CROWN_NETHER = new HangingFlowerPotBlock(CORROCK_CROWN_NETHER, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_nether");
    public static Block HANGING_POTTED_CORROCK_CROWN_END = new HangingFlowerPotBlock(CORROCK_CROWN_END, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_corrock_crown_end");
    public static Block POTTED_POISE_BUSH = new FlowerPotBlock(POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("endergetic:potted_poise_bush");
    public static Block HANGING_POTTED_POISE_BUSH = new HangingFlowerPotBlock(POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_poise_bush");
    public static Block POTTED_TALL_POISE_BUSH = new FlowerPotBlock(TALL_POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("potted_tall_poise_bush");
    public static Block HANGING_POTTED_TALL_POISE_BUSH = new HangingFlowerPotBlock(TALL_POISE_GRASS, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_tall_poise_bush");

    public static Block POTTED_CAVE_ROOT = new FlowerPotBlock(CAVE_ROOT, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_cave_root");
    public static Block POTTED_GLOWSHROOM = new FlowerPotBlock(GLOWSHROOM, BlockProperties.FLOWER_POT).setRegistryName("quark:potted_glowshroom");
    public static Block HANGING_POTTED_CAVE_ROOT = new HangingFlowerPotBlock(CAVE_ROOT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_cave_root");
    public static Block HANGING_POTTED_GLOWSHROOM = new HangingFlowerPotBlock(GLOWSHROOM, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_glowshroom");

    public static Block POTTED_ORANGE = new FlowerPotBlock(ORANGE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("potted_orange");
    public static Block POTTED_APRICOT = new FlowerPotBlock(APRICOT_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("potted_apricot");
    public static Block POTTED_DAYROOT = new FlowerPotBlock(DAYROOT, BlockProperties.FLOWER_POT).setRegistryName("potted_dayroot");
    public static Block HANGING_POTTED_ORANGE = new HangingFlowerPotBlock(ORANGE_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_orange");
    public static Block HANGING_POTTED_APRICOT = new HangingFlowerPotBlock(APRICOT_FRUIT_TREE, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_apricot");
    public static Block HANGING_POTTED_DAYROOT = new HangingFlowerPotBlock(DAYROOT, BlockProperties.FLOWER_POT).setRegistryName("hanging_potted_dayroot");

    public static Block POTTED_BUTTERCUP = new FlowerPotBlock(BUTTERCUP, BlockProperties.FLOWER_POT).setRegistryName("earthmobsmod:hanging_potted_buttercup");
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
                    POTTED_BLUE_PICKERELWEED, POTTED_PURPLE_PICKERELWEED,
                    POTTED_WHITE_SEAROCKET, POTTED_PINK_SEAROCKET,
                    HANGING_POTTED_BLUE_PICKERELWEED, HANGING_POTTED_PURPLE_PICKERELWEED,
                    HANGING_POTTED_WHITE_SEAROCKET, HANGING_POTTED_PINK_SEAROCKET
            );
        }
        if (ModList.get().isLoaded("endergetic")) {
            event.getRegistry().registerAll(
                    POTTED_CORROCK_CROWN_OVERWORLD, POTTED_CORROCK_CROWN_NETHER, POTTED_CORROCK_CROWN_END,
                    HANGING_POTTED_CORROCK_CROWN_OVERWORLD, HANGING_POTTED_CORROCK_CROWN_NETHER, HANGING_POTTED_CORROCK_CROWN_END,
                    POTTED_POISE_BUSH, HANGING_POTTED_POISE_BUSH, POTTED_TALL_POISE_BUSH, HANGING_POTTED_TALL_POISE_BUSH
            );
        }
        if (ModList.get().isLoaded("quark")) {
            event.getRegistry().registerAll(
                    HANGING_POTTED_CAVE_ROOT, POTTED_CAVE_ROOT,
                    HANGING_POTTED_GLOWSHROOM, POTTED_GLOWSHROOM
            );
        }
        if (ModList.get().isLoaded("rys")) {
            event.getRegistry().registerAll(
                    POTTED_ORANGE, POTTED_APRICOT, POTTED_DAYROOT,
                    HANGING_POTTED_ORANGE, HANGING_POTTED_APRICOT,
                    HANGING_POTTED_DAYROOT
            );
        }
        if (ModList.get().isLoaded("earthmobsmod")) {
            event.getRegistry().registerAll(
                    HANGING_POTTED_BUTTERCUP, POTTED_BUTTERCUP
            );
        }
    }
}