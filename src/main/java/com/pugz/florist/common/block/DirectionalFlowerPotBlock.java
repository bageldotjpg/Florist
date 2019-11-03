package com.pugz.florist.common.block;

import com.pugz.florist.core.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class DirectionalFlowerPotBlock extends net.minecraft.block.FlowerPotBlock {

    public static final BooleanProperty HANGING = BooleanProperty.create("hanging");
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;;
    protected final Block flower;

    public DirectionalFlowerPotBlock(Block flowerIn, Properties properties) {
        super(flowerIn, properties);
        setDefaultState(getDefaultState().with(HANGING, false).with(FACING, Direction.NORTH));
        flower = flowerIn;
        // set facing based on side sheared
        // set facing based on side placed
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        if (direction == Direction.DOWN) return getDefaultState().with(HANGING, true);
        else return getDefaultState();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HANGING, FACING);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block neighbor, BlockPos neighborPos, boolean moving) {
        if (state.get(HANGING)) {
            if (world.getBlockState(pos.up()).isAir(world, pos)) {
                if (!world.getBlockState(pos.down()).isAir()) {
                    world.setBlockState(pos, state.with(HANGING, false), 3);
                }
                else {
                    world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                    if (flower == Blocks.AIR) world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockRegistry.FLOWER_POT, 1)));
                    else world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(flower, 1)));
                }
            }
        }
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        ItemStack held = player.getHeldItem(hand);
        if (held.getItem() == Items.SHEARS && state.getBlock() == BlockRegistry.POTTED_PUMPKIN) {
            world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(HANGING, state.get(HANGING)).with(FACING, player.getHorizontalFacing()), 3);
            held.getItem().setDamage(held, held.getDamage() - 1);
            return true;
        }
        if (state.getBlock().getRegistryName().toString().equals("florist:flower_pot")) {
            switch (held.getItem().getRegistryName().toString()) {
                case "minecraft:carved_pumpkin":
                    world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(HANGING, state.get(HANGING)).with(FACING, player.getHorizontalFacing()), 3);
                    break;
                case "minecraft:jack_o_lantern":
                    world.setBlockState(pos, BlockRegistry.POTTED_JACK_O_LANTERN.getDefaultState().with(HANGING, state.get(HANGING)).with(FACING, player.getHorizontalFacing()), 3);
                    break;
            }
            player.addStat(Stats.POT_FLOWER);
            if (!player.abilities.isCreativeMode) {
                held.shrink(1);
            }
            return true;
        }
        else {
            ItemStack flowerStack = new ItemStack(flower);
            world.setBlockState(pos, BlockRegistry.FLOWER_POT.getDefaultState().with(HANGING, state.get(HANGING)), 3);
            if (held.isEmpty()) {
                player.setHeldItem(hand, flowerStack);
                return true;
            }
            else if (held.getItem() == flower.asItem()) {
                player.inventory.addItemStackToInventory(flowerStack);
                return true;
            }
            return false;
        }
    }
}