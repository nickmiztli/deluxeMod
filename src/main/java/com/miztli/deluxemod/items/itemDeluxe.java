package com.miztli.deluxemod.items;

import com.miztli.deluxemod.Tags;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemDeluxe extends Item {

    public itemDeluxe(String name) {
        setRegistryName(name);
        setTranslationKey(Tags.MOD_ID + "." + name);
        setCreativeTab(CreativeTabs.MISC);
    }

}
