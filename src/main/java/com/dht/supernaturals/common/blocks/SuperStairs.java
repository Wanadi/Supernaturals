package com.dht.supernaturals.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;

public class SuperStairs extends StairsBlock {
    private final Block modelBlock;
    private final BlockState modelState;

    public SuperStairs(BlockState state, Properties properties) {
        super(state, properties);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateContainer.getBaseState()).with(FACING, Direction.NORTH)).with(HALF, Half.BOTTOM)).with(SHAPE, StairsShape.STRAIGHT)).with(WATERLOGGED, false));
        this.modelBlock = state.getBlock();
        this.modelState = state;
    }
}
