package com.miztli.deluxeMod;

import com.miztli.deluxeMod.init.modItems;
import com.miztli.deluxeMod.init.modTabs;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(deluxeRuby.MODID)
public class deluxeRuby
{
    public static final String MODID = "deluxeruby";

    private static final Logger LOGGER = LogUtils.getLogger();

    public deluxeRuby() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modItems.ITEMS.register(modEventBus);
        modTabs.CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::addCreative);


        MinecraftForge.EVENT_BUS.register(this);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(modItems.RUBY_DELUXE);
        }
    }

}
