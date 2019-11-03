package com.pugz.florist.core;

import com.pugz.florist.core.proxy.ClientProxy;
import com.pugz.florist.core.proxy.ServerProxy;
import com.pugz.florist.core.util.FlowerPotUtils;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("florist")
public class Florist {

    public static ServerProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public Florist() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        proxy.init();
        FlowerPotUtils.registerFlowerPotData();
    }
}