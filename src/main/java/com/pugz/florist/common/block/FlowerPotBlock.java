package com.pugz.florist.common.block;

import com.pugz.florist.core.registry.BlockRegistry;
import com.pugz.florist.core.util.BlockProperties;
import com.pugz.florist.core.util.FlowerPotUtils;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class FlowerPotBlock extends Block {
    protected static final VoxelShape POT = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    protected final Item flower;

    public FlowerPotBlock(Item flowerIn, Block.Properties properties) {
        super(properties);
        flower = flowerIn;
    }

    @Override
    public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
        if (flower == Items.AIR) return new ItemStack(BlockRegistry.FLOWER_POT);
        else return new ItemStack(flower);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return POT;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        ItemStack stack = context.getItem();
        Direction direction = context.getFace();
        if (stack.getItem() == Items.FLOWER_POT && direction == Direction.DOWN) {
            return BlockRegistry.HANGING_FLOWER_POT.getDefaultState();
        }
        else return getDefaultState();
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        ItemStack held = player.getHeldItem(hand);
        Direction direction = player.getHorizontalFacing().getOpposite();
        String name = FlowerPotUtils.getFieldName(held.getItem().getRegistryName().toString());
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
                player.setHeldItem(hand, new ItemStack(FlowerPotUtils.getBlockByField(name)));
            }
            else if (!player.abilities.isCreativeMode) {
                if (!player.inventory.addItemStackToInventory(new ItemStack(FlowerPotUtils.getBlockByField(name)))) {
                    player.dropItem(new ItemStack(FlowerPotUtils.getBlockByField(name)), false);
                }
            }
            return true;
        }
    }

    public static void tryForPumpkin(World world, BlockPos pos, BlockState state, PlayerEntity player, ItemStack held, Direction axisDirection) {
        if (held.getItem() == Items.SHEARS && state.getBlock() == BlockRegistry.POTTED_PUMPKIN) {
            Direction direction = player.getHorizontalFacing().getOpposite();
            world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(Directional.FACING, direction), 3);
            held.getItem().setDamage(held, held.getDamage() - 1);
            ItemEntity seeds = new ItemEntity(world, (double)pos.getX() + 0.5D + (double)axisDirection.getXOffset() * 0.65D, (double)pos.getY() + 0.1D, (double)pos.getZ() + 0.5D + (double)axisDirection.getZOffset() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
            seeds.setMotion(0.05D * (double)axisDirection.getXOffset() + world.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double)axisDirection.getZOffset() + world.rand.nextDouble() * 0.02D);
            world.playSound(player, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.addEntity(seeds);
        }
    }

    public static void fillPot(World world, BlockPos pos, PlayerEntity player, ItemStack held, String name) {
        Direction direction = player.getHorizontalFacing().getOpposite();
        switch (held.getItem().getRegistryName().toString()) {
            case "minecraft:carved_pumpkin":
                world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(Directional.FACING, direction), 3);
                break;
            case "minecraft:jack_o_lantern":
                world.setBlockState(pos, BlockRegistry.POTTED_JACK_O_LANTERN.getDefaultState().with(Directional.FACING, direction), 3);
                break;
            default:
                world.setBlockState(pos, FlowerPotUtils.getBlockByField(name).getDefaultState(), 3);
                break;
        }
    }

    public static class Directional extends FlowerPotBlock {
        public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

        public Directional(Item flowerIn, Properties properties) {
            super(flowerIn, properties);
            setDefaultState(stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }
    }

    public static class SweetBerry extends FlowerPotBlock {
        public static final VoxelShape FLOWER = Block.makeCuboidShape(9.0D, 6.0D, 9.0D, 9.0D, 16.0D, 9.0D);
        private static final VoxelShape FLOWER_POT = VoxelShapes.or(FLOWER, POT);

        public SweetBerry() {
            super(Items.SWEET_BERRIES, BlockProperties.FLOWER_POT);
            setDefaultState(stateContainer.getBaseState());
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
}