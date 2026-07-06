package com.miztli.deluxemod.init;


import com.miztli.deluxemod.Tags;
import com.miztli.deluxemod.items.itemDeluxe;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class modItems {

    @GameRegistry.ObjectHolder(Tags.MOD_ID + ":ruby_deluxe")
    public static final Item RUBY_DELUXE = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new itemDeluxe("ruby_deluxe"));
    }

}
