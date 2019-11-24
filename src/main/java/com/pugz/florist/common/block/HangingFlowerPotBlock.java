package com.pugz.florist.common.block;

import com.pugz.florist.core.registry.BlockRegistry;
import com.pugz.florist.core.util.FlowerPotUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block neighbor, BlockPos neighborPos, boolean moving) {
        if (world.getBlockState(pos.up()).isAir(world, pos)) {
            world.setBlockState(pos, BlockRegistry.FLOWER_POT.getDefaultState(), 3);
        }
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        ItemStack held = player.getHeldItem(hand);
        Direction direction = player.getHorizontalFacing().getOpposite();
        String name = "HANGING_" + FlowerPotUtils.getFieldName(held.getItem().getRegistryName().toString());
        Direction hitFace = ray.getFace();
        Direction axisDirection = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : hitFace;
        tryForPumpkin(world, pos, state, player, held, axisDirection);
        if (flower == Items.AIR && FlowerPotUtils.isPottable(held.getItem())) {
            fillPot(world, pos, player, held, name);
            player.addStat(Stats.POT_FLOWER);
            if (!player.abilities.isCreativeMode) {
                held.shrink(1);
            }
            return true;
        }
        else {
            world.setBlockState(pos, BlockRegistry.FLOWER_POT.getDefaultState(), 3);
            if (held.isEmpty()) {
                player.setHeldItem(hand, new ItemStack(flower));
            }
            else if (!player.abilities.isCreativeMode) {
                if (!player.inventory.addItemStackToInventory(new ItemStack(flower))) {
                    player.dropItem(new ItemStack(flower), false);
                }
            }
            return true;
        }
    }
}