package net.berniemackie.mccourse.item.custom;

import net.berniemackie.mccourse.util.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;

public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(float pAttackDamageModifier, float pAttackSpeedModifier, Tier pTier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINABLE, pProperties);
    }
}
