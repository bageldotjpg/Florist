package com.pugz.florist.common.block;

import com.pugz.florist.core.registry.BlockRegistry;
import com.pugz.florist.core.util.FlowerPotUtils;
import net.minecraft.block.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class FlowerPotBlock extends Block {

    public static final BooleanProperty HANGING = BooleanProperty.create("hanging");
    protected static final VoxelShape FLOWER_POT = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    protected final Block flower;

    public FlowerPotBlock(Block flowerIn, Block.Properties properties) {
        super(properties);
        setDefaultState(getDefaultState().with(HANGING, false));
        flower = flowerIn;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return FLOWER_POT;
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
        Direction direction = context.getFace();
        if (direction == Direction.DOWN) return getDefaultState().with(HANGING, true);
        else return getDefaultState();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HANGING);
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
        if (!world.isRemote) {
            ItemStack held = player.getHeldItem(hand);
            Direction direction = player.getHorizontalFacing().getOpposite();
            String name = "POTTED_" + held.getItem().getRegistryName().toString().replace("minecraft:", "").toUpperCase();
            if (held.getItem() == Items.SHEARS && state.getBlock() == BlockRegistry.POTTED_PUMPKIN) {
                Direction hitFace = ray.getFace();
                Direction axisDirection = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : hitFace;
                ItemEntity seeds = new ItemEntity(world, (double) pos.getX() + 0.5D + (double) axisDirection.getXOffset() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) axisDirection.getZOffset() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
                world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(HANGING, state.get(HANGING)).with(DirectionalFlowerPotBlock.FACING, direction), 3);
                held.getItem().setDamage(held, held.getDamage() - 1);
                seeds.setMotion(0.05D * (double) axisDirection.getXOffset() + world.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double) axisDirection.getZOffset() + world.rand.nextDouble() * 0.02D);
                world.playSound(player, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.addEntity(seeds);
                return true;
            }
            if (state.getBlock().getRegistryName().toString().equals("florist:flower_pot") && canPot(held)) {
                switch (held.getItem().getRegistryName().toString()) {
                    case "minecraft:carved_pumpkin":
                        world.setBlockState(pos, BlockRegistry.POTTED_CARVED_PUMPKIN.getDefaultState().with(HANGING, state.get(HANGING)).with(DirectionalFlowerPotBlock.FACING, direction), 3);
                        break;
                    case "minecraft:jack_o_lantern":
                        world.setBlockState(pos, BlockRegistry.POTTED_JACK_O_LANTERN.getDefaultState().with(HANGING, state.get(HANGING)).with(DirectionalFlowerPotBlock.FACING, direction), 3);
                        break;
                    default:
                        world.setBlockState(pos, FlowerPotUtils.getBlockByField(name).getDefaultState().with(HANGING, state.get(HANGING)), 3);
                        break;
                }
                player.addStat(Stats.POT_FLOWER);
                if (!player.abilities.isCreativeMode) {
                    held.shrink(1);
                }
                return true;
            } else {
                ItemStack flowerStack = new ItemStack(flower);
                world.setBlockState(pos, BlockRegistry.FLOWER_POT.getDefaultState().with(HANGING, state.get(HANGING)), 3);
                if (held.isEmpty()) {
                    player.setHeldItem(hand, flowerStack);
                    return true;
                } else {
                    player.inventory.addItemStackToInventory(flowerStack);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean canPot(ItemStack stack) {
        ItemStack[] whitelist = new ItemStack[] { new ItemStack(Items.WHEAT), new ItemStack(Items.CARROT), new ItemStack(Items.POTATO), new ItemStack(Items.BEETROOT), new ItemStack(Items.SUGAR_CANE), new ItemStack(Items.NETHER_WART), new ItemStack(Items.CHORUS_FRUIT), new ItemStack(Items.PUMPKIN), new ItemStack(Items.MELON), new ItemStack(Items.ROSE_BUSH), new ItemStack(Items.SUNFLOWER), new ItemStack(Items.LILAC), new ItemStack(Items.PEONY), new ItemStack(Items.GRASS), new ItemStack(Items.TALL_GRASS), new ItemStack(Items.LARGE_FERN), new ItemStack(Items.CARVED_PUMPKIN), new ItemStack(Items.JACK_O_LANTERN), new ItemStack(Items.BAMBOO), new ItemStack(Items.OAK_SAPLING), new ItemStack(Items.SPRUCE_SAPLING), new ItemStack(Items.BIRCH_SAPLING), new ItemStack(Items.JUNGLE_SAPLING), new ItemStack(Items.ACACIA_SAPLING), new ItemStack(Items.DARK_OAK_SAPLING), new ItemStack(Items.FERN), new ItemStack(Items.DANDELION), new ItemStack(Items.POPPY), new ItemStack(Items.BLUE_ORCHID), new ItemStack(Items.ALLIUM), new ItemStack(Items.AZURE_BLUET), new ItemStack(Items.RED_TULIP), new ItemStack(Items.ORANGE_TULIP), new ItemStack(Items.WHITE_TULIP), new ItemStack(Items.PINK_TULIP), new ItemStack(Items.OXEYE_DAISY), new ItemStack(Items.CORNFLOWER), new ItemStack(Items.LILY_OF_THE_VALLEY), new ItemStack(Items.WITHER_ROSE), new ItemStack(Items.RED_MUSHROOM), new ItemStack(Items.BROWN_MUSHROOM), new ItemStack(Items.DEAD_BUSH), new ItemStack(Items.CACTUS) };
        for (ItemStack i : whitelist) {
            if (stack == i) {
                return true;
            }
        }
        return false;
    }
}