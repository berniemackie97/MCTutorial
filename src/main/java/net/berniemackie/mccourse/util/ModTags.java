package net.berniemackie.mccourse.util;

import net.berniemackie.mccourse.MCCourseMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Items {
        private static TagKey<Item> Tag(String pName) {
            return ItemTags.create(new ResourceLocation(MCCourseMod.MOD_ID, pName));
        }
        private static TagKey<Item> forgeTag(String pName) {
            return ItemTags.create(new ResourceLocation("forge", pName));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = Tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_ALEXANDRITE_TOOL = Tag("needs_alexandrite_tool");

        private static TagKey<Block> Tag(String pName) {
            return BlockTags.create(new ResourceLocation(MCCourseMod.MOD_ID, pName));
        }
        private static TagKey<Block> forgeTag(String pName) {
            return BlockTags.create(new ResourceLocation("forge", pName));
        }
    }
}
