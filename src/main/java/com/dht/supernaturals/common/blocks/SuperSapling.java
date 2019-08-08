package com.dht.supernaturals.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class SuperSapling extends SaplingBlock {

    protected SuperSapling(Tree tree, Properties properties) {
        super(tree, properties);
    }


    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        Block ground = worldIn.getBlockState(pos.down()).getBlock();

        if (this == SuperBlockNames.deadwoodsap)
        {
            return ground == SuperBlockNames.spookygrassblock || super.isValidPosition(state, worldIn, pos);
        }
        if (this == SuperBlockNames.darkcherrysap)
        {
            return ground == SuperBlockNames.spookygrassblock || super.isValidPosition(state, worldIn, pos);
        }
        if (this == SuperBlockNames.spookyoaksap)
        {
            return ground == SuperBlockNames.spookygrassblock || super.isValidPosition(state, worldIn, pos);
        }
        if (this == SuperBlockNames.mountainashsap)
        {
            return ground == SuperBlockNames.spookygrassblock || super.isValidPosition(state, worldIn, pos);
        }
        if (this == SuperBlockNames.spookywillowsap)
        {
            return ground == SuperBlockNames.spookygrassblock || super.isValidPosition(state, worldIn, pos);
        }

        return super.isValidPosition(state, worldIn, pos);
    }



}
