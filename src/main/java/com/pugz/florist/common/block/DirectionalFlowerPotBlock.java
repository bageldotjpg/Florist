package com.pugz.florist.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

public class DirectionalFlowerPotBlock extends FlowerPotBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;;

    public DirectionalFlowerPotBlock(Item flowerIn, Properties properties) {
        super(flowerIn, properties);
        setDefaultState(getDefaultState().with(HANGING, false).with(FACING, Direction.NORTH));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HANGING, FACING);
    }
}