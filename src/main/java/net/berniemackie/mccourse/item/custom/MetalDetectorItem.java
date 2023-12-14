package net.berniemackie.mccourse.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            BlockPos posClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i< posClicked.getY() + 64; i++){
                BlockState blockState = pContext.getLevel().getBlockState(posClicked.below(i));

                if (isValuableBlock(blockState)){
                    assert player != null;
                    outputValuableCoords(posClicked, player, blockState.getBlock());
                    foundBlock = true;

                    break;
                }
            }
            if (!foundBlock){
                assert player != null;
                outputNoValuableFound(player);
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void outputNoValuableFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.mccourse.metal_detector.no_valuable_found"));
    }

    private void outputValuableCoords(BlockPos posClicked, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Valuable Found: " + I18n.get(block.getDescriptionId()) +
                " at (" + posClicked.getX() + ", " + posClicked.getY() + ", " + posClicked.getZ() + ")" ));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.is(Blocks.DIAMOND_ORE) ||
                blockState.is(Blocks.IRON_ORE) ||
                blockState.is(Blocks.GOLD_ORE) ||
                blockState.is(Blocks.EMERALD_ORE);
    }
}
