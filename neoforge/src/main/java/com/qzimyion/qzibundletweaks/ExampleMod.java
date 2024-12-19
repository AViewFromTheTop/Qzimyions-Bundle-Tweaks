package com.qzimyion.qzibundletweaks;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(QzisBundleTweaksConstants.MOD_ID)
public class ExampleMod {

    public ExampleMod(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        QzisBundleTweaksConstants.LOG.info("Hello NeoForge world!");
        CommonClass.init();

    }
}