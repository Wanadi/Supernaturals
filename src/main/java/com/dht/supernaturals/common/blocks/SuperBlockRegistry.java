package com.dht.supernaturals.common.blocks;

import com.dht.supernaturals.util.SuperItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class SuperBlockRegistry
{
    public static void init()
    {
        SuperBlockNames.darkcherrysap = registerBlock(new Block((Block.Properties.create(Material.ORGANIC, MaterialColor.BROWN).hardnessAndResistance(0.6f, 0).sound(SoundType.PLANT))), "darkcherrysap");
        SuperBlockNames.darkcherryleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "darkcherryleaves");
        SuperBlockNames.darkcherryleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "darkcherryleaves");
        SuperBlockNames.darkcherryleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "darkcherryleaves");
        SuperBlockNames.darkcherryleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "darkcherryleaves");




    }
    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(SuperItemGroup.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlock(Block block, BlockItem itemBlock, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null)
        {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }

}
