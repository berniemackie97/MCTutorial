package com.bernie.tutorialmod.datagen;

import com.bernie.tutorialmod.TutorialMod;
import com.bernie.tutorialmod.block.ModBlocks;
import com.bernie.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //oreSmelting(recipeOutput, ModTags.Items.ORES_SAPPHIRE, RecipeCategory.SMELTING, ModItems.SAPPHIRE.get(), 0.7F, 200, "smelting");
        //oreBlasting(recipeOutput, ModTags.Items.ORES_SAPPHIRE, RecipeCategory.BLASTING, ModItems.SAPPHIRE.get(), 0.7F, 100, "blasting");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PIZZA.get())
                .unlockedBy(getHasName(ModItems.PIZZA.get()), has(ModItems.PIZZA.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .define('#', ModItems.PIZZA.get())
                .define('X', Items.STICK)
                .unlockedBy(getHasName(ModItems.PIZZA.get()), has(ModItems.PIZZA.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern(" # ")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.PIZZA.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.PIZZA.get()), has(ModItems.PIZZA.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE.get())
                .pattern("## ")
                .pattern("#| ")
                .pattern(" | ")
                .define('#', ModItems.PIZZA.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.PIZZA.get()), has(ModItems.PIZZA.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" | ")
                .define('#', ModItems.PIZZA.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.PIZZA.get()), has(ModItems.PIZZA.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PIZZA.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(recipeOutput);
    }
}
