package com.bernie.tutorialmod.item;

import com.bernie.tutorialmod.TutorialMod;
import com.bernie.tutorialmod.item.custom.FuelItem;
import com.bernie.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> PENJAMIN = ITEMS.register("penjamin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new FuelItem(new Item.Properties().food(ModFoods.PIZZA), 400));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
