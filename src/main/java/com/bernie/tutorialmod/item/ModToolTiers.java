package com.bernie.tutorialmod.item;

import com.bernie.tutorialmod.TutorialMod;
import com.bernie.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000,10,15,20,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.PIZZA.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());


}
