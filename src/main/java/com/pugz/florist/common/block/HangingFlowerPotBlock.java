package com.pugz.florist.common.block;

import com.pugz.florist.core.registry.BlockRegistry;
import com.pugz.florist.core.util.FlowerPotUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class HangingFlowerPotBlock extends FlowerPotBlock {
    public HangingFlowerPotBlock(Item flowerIn, Block.Properties properties) {
        super(flowerIn, properties);
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        ItemStack held = player.getHeldItem(hand);
        Direction direction = player.getHorizontalFacing().getOpposite();
        String name = "HANGING_POTTED_" + held.getItem().getRegistryName().toString().replace("minecraft:", "").toUpperCase();
        Direction hitFace = ray.getFace();
        Direction axisDirection = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : hitFace;
        if (held.getItem() == Items.SHEARS && state.getBlock() == BlockRegistry.POTTED_PUMPKIN) {
            world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(Directional.FACING, direction), 3);
            held.getItem().setDamage(held, held.getDamage() - 1);
            ItemEntity seeds = new ItemEntity(world, (double)pos.getX() + 0.5D + (double)axisDirection.getXOffset() * 0.65D, (double)pos.getY() + 0.1D, (double)pos.getZ() + 0.5D + (double)axisDirection.getZOffset() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
            seeds.setMotion(0.05D * (double)axisDirection.getXOffset() + world.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double)axisDirection.getZOffset() + world.rand.nextDouble() * 0.02D);
            world.playSound(player, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.addEntity(seeds);
            return true;
        }
        if (flower == Items.AIR) {
            switch (held.getItem().getRegistryName().toString()) {
                case "minecraft:carved_pumpkin":
                    world.setBlockState(pos, BlockRegistry.HANGING_POTTED_CARVED_PUMPKIN.getDefaultState().with(Directional.FACING, direction), 3);
                    break;
                case "minecraft:jack_o_lantern":
                    world.setBlockState(pos, BlockRegistry.HANGING_POTTED_JACK_O_LANTERN.getDefaultState().with(Directional.FACING, direction), 3);
                    break;
                default:
                    for (String string : FlowerPotUtils.VANILLA_FLOWER_POT_ITEMS) {
                        if (name.equals(string)) {
                            world.setBlockState(pos, FlowerPotUtils.getBlockByFieldVanilla(name).getDefaultState(), 3);
                        }
                    }
                    for (String string : FlowerPotUtils.MODDED_FLOWER_POT_ITEMS) {
                        if (name.equals(string)) {
                            world.setBlockState(pos, FlowerPotUtils.getBlockByField(name).getDefaultState(), 3);
                        }
                    }
                    break;
            }
            player.addStat(Stats.POT_FLOWER);
            if (!player.abilities.isCreativeMode) {
                held.shrink(1);
            }
            return true;
        }
        else {
            world.setBlockState(pos, BlockRegistry.HANGING_FLOWER_POT.getDefaultState(), 3);
            if (held.isEmpty()) {
                player.setHeldItem(hand, new ItemStack(flower));
            }
            else {
                if (!player.abilities.isCreativeMode) {
                    player.inventory.addItemStackToInventory(new ItemStack(flower));
                }
            }
            return true;
        }
    }
}