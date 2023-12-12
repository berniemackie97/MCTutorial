package com.bernie.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PIZZA = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationMod(0.6F).effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 1f)
            .build();
}
