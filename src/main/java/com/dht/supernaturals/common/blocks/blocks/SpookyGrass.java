package com.dht.supernaturals.common.blocks.blocks;

import com.dht.supernaturals.common.blocks.SuperBlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class SpookyGrass extends TallGrassBlock
{


    public SpookyGrass(Properties properties) {
        super(properties);
    }

    public boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.FARMLAND
                || block == SuperBlockNames.spookygrassblock;
    }





}
