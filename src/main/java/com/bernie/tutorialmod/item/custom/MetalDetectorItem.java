package com.bernie.tutorialmod.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        if(!pContext.getLevel().isClientSide) {
            BlockPos pos = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= pos.getY() + 64; i++){
                BlockState state = pContext.getLevel().getBlockState(pos.below(i));

                if(isValuableBlock(state)){
                    outputValuableCoordinates(pos.below(i), player, state.getBlock());
                    foundBlock = true;

                    break;
                }
            }

            if (!foundBlock) {
                player.sendSystemMessage(Component.literal("No valuable blocks found"));
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), (player) ->
                player.broadcastBreakEvent(pContext.getHand()));

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.metal_detector.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {

        // Send a message to the player "Found <block> at (<x>, <y>, <z>)"
        player.sendSystemMessage(Component.literal("Found " + I18n.get(block.getDescriptionId()) +
                " at " + "(" + below.getX() + ", " + below.getY() + "," + below.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState state) {
        return state.is(Blocks.DIAMOND_ORE) || state.is(Blocks.EMERALD_ORE) || state.is(Blocks.GOLD_ORE) || state.is(Blocks.IRON_ORE);
    }
}
