package com.pugz.florist.common.block;

import com.pugz.florist.core.util.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class PottedSweetBerriesBlock extends FlowerPotBlock {

    public static final VoxelShape FLOWER = Block.makeCuboidShape(9.0D, 6.0D, 9.0D, 9.0D, 16.0D, 9.0D);
    public static final VoxelShape POT = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    private static final VoxelShape FLOWER_POT = VoxelShapes.or(FLOWER, POT);

    public PottedSweetBerriesBlock() {
        super(Items.SWEET_BERRIES, BlockProperties.FLOWER_POT);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return FLOWER_POT;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return POT;
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX) {
            entity.setMotionMultiplier(state, new Vec3d((double)0.8F, 0.75D, (double)0.8F));
            if (entity.lastTickPosX != entity.posX || entity.lastTickPosZ != entity.posZ) {
                double x = Math.abs(entity.posX - entity.lastTickPosX);
                double y = Math.abs(entity.posZ - entity.lastTickPosZ);
                if (x >= (double)0.003F || y >= (double)0.003F) {
                    entity.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, 1.0F);
                }
            }

        }
    }
}