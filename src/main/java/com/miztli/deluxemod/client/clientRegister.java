package com.miztli.deluxemod.client;


import com.miztli.deluxemod.Tags;
import com.miztli.deluxemod.init.modItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber( modid = Tags.MOD_ID , value = Side.CLIENT)
public class clientRegister {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        if (modItems.RUBY_DELUXE != null && modItems.RUBY_DELUXE.getRegistryName() != null) {

            ModelLoader.setCustomModelResourceLocation(
                    modItems.RUBY_DELUXE,
                    0,
                    new ModelResourceLocation(modItems.RUBY_DELUXE.getRegistryName(), "inventory")
            );

        }
    }
}
