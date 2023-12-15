package net.berniemackie.mccourse.datagen.loot;

import net.berniemackie.mccourse.block.ModBlocks;
import net.berniemackie.mccourse.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Regular Blocks
        this.dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        // Stairs
        this.dropSelf(ModBlocks.ALEXANDRITE_STAIRS.get());

        // Buttons
        this.dropSelf(ModBlocks.ALEXANDRITE_BUTTON.get());

        // Pressure Plates
        this.dropSelf(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());

        // Fences
        this.dropSelf(ModBlocks.ALEXANDRITE_FENCE.get());
        this.dropSelf(ModBlocks.ALEXANDRITE_FENCE_GATE.get());

        // Walls
        this.dropSelf(ModBlocks.ALEXANDRITE_WALL.get());



        // Trapdoors
        this.dropSelf(ModBlocks.ALEXANDRITE_TRAPDOOR.get());


        // Ores
        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
                (block) -> createOreDrop(block, ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                (block) -> createOreDrop(block, ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                (block) -> createOreDrop(block, ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                (block) -> createOreDrop(block, ModItems.RAW_ALEXANDRITE.get()));

        // Slabs
        this.add(ModBlocks.ALEXANDRITE_SLAB.get(),
                (block) -> createSlabItemTable(ModBlocks.ALEXANDRITE_SLAB.get()));

        // Doors
        this.add(ModBlocks.ALEXANDRITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.ALEXANDRITE_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
