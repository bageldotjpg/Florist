package com.pugz.florist.core.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockProperties {
    public static Block.Properties FLOWER_POT = Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F);
    public static Block.Properties POTTED_JACK_O_LANTERN = Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F).lightValue(15);
    public static Block.Properties OVERRIDE = Block.Properties.create(Material.MISCELLANEOUS);
}