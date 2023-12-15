package net.berniemackie.mccourse.datagen;

import net.berniemackie.mccourse.MCCourseMod;
import net.berniemackie.mccourse.block.ModBlocks;
import net.berniemackie.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.NETHER_ALEXANDRITE_ORE.get())
                .add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get())
                .addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.SOUND_BLOCK.get())
                .add(ModBlocks.NETHER_ALEXANDRITE_ORE.get())
                .add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get())
                .add(ModBlocks.ALEXANDRITE_STAIRS.get())
                .add(ModBlocks.ALEXANDRITE_SLAB.get())
                .add(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get())
                .add(ModBlocks.ALEXANDRITE_DOOR.get())
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get())
                .add(ModBlocks.NETHER_ALEXANDRITE_ORE.get())
                .add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());

        this.tag(BlockTags.FENCES)
            .add(ModBlocks.ALEXANDRITE_FENCE.get());
        this.tag(BlockTags.WALLS)
            .add(ModBlocks.ALEXANDRITE_WALL.get());
        this.tag(BlockTags.FENCE_GATES)
            .add(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
        this.tag(BlockTags.DOORS)
                .add(ModBlocks.ALEXANDRITE_DOOR.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
