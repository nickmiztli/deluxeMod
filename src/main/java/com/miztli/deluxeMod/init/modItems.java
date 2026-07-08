package com.miztli.deluxeMod.init;

import com.miztli.deluxeMod.deluxeRuby;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, deluxeRuby.MODID);

    public static final RegistryObject<Item> RUBY_DELUXE = ITEMS.register("ruby_deluxe" ,
            () -> new Item(new Item.Properties()));

}
