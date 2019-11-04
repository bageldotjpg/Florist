package com.pugz.florist.core.proxy;

import com.pugz.florist.core.registry.BlockRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;

public class ClientProxy extends ServerProxy {

    @Override
    public void init() {
        registerBlockColors();
    }

    public void registerBlockColors() {
        BlockColors colors = Minecraft.getInstance().getBlockColors();
        colors.register((x, world, pos, u)
                -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.get(0.5D, 1.0D), BlockRegistry.POTTED_FERN);
        colors.register((x, world, pos, u)
                -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.get(0.5D, 1.0D), BlockRegistry.POTTED_GRASS);
        colors.register((x, world, pos, u)
                -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.get(0.5D, 1.0D), BlockRegistry.POTTED_LARGE_FERN);
        colors.register((x, world, pos, u)
                -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos)
                : GrassColors.get(0.5D, 1.0D), BlockRegistry.POTTED_TALL_GRASS);
    }
}