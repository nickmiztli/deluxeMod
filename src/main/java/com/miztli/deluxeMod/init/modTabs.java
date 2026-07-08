package com.miztli.deluxeMod.init;

import com.miztli.deluxeMod.deluxeRuby;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class modTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, deluxeRuby.MODID);

    public static final RegistryObject<CreativeModeTab> DELUXE_TAB =
            CREATIVE_MODE_TABS.register( "deluxe_tab" ,
                    () ->
                    CreativeModeTab.builder()
                            .icon( () ->
                                    new ItemStack(modItems.RUBY_DELUXE.get()))
                            .title(Component.translatable("creativetab.deluxeruby.deluxe_tab"))
                            .displayItems((parameters, output) -> {
                                output.accept(modItems.RUBY_DELUXE.get());
                            })
                            .build()
                    );

}
