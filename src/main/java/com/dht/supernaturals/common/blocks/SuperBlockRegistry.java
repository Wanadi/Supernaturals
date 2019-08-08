package com.dht.supernaturals.common.blocks;

import com.dht.supernaturals.common.blocks.tree.*;
import com.dht.supernaturals.util.SuperItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class SuperBlockRegistry
{
    public static void init()
    {
        SuperBlockNames.darkcherrysap = registerBlock(new SuperSapling(new DarkCherryTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)), "darkcherrysap");
        SuperBlockNames.deadwoodsap = registerBlock(new SuperSapling(new DeadwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)), "deadwoodsap");
        SuperBlockNames.spookyoaksap = registerBlock(new SuperSapling(new SpookyOakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)), "spookyoaksap");
        SuperBlockNames.spookywillowsap = registerBlock(new SuperSapling(new SpookyWillowTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)), "spookywillowsap");
        SuperBlockNames.mountainashsap = registerBlock(new SuperSapling(new MountainAshTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)), "mountainashsap");

        SuperBlockNames.darkcherrylog = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "darkcherrylog");
        SuperBlockNames.deadwoodlog = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "deadwoodlog");
        SuperBlockNames.spookyoaklog = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "spookyoaklog");
        SuperBlockNames.spookywillowlog = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "spookywillowlog");
        SuperBlockNames.mountainashlog = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "mountainashlog");

        SuperBlockNames.darkcherryplank = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "darkcherryplank");
        SuperBlockNames.deadwoodplank = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "deadwoodplank");
        SuperBlockNames.spookyoakplank = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "spookyoakplank");
        SuperBlockNames.spookywillowplank = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "spookywillowplank");
        SuperBlockNames.mountainashplank = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mountainashplank");

        SuperBlockNames.darkcherrystairs = registerBlock(new SuperStairs(SuperBlockNames.darkcherryplank.getDefaultState(), Block.Properties.from(SuperBlockNames.darkcherryplank)), "darkcherrystairs");
        SuperBlockNames.deadwoodstairs = registerBlock(new SuperStairs(SuperBlockNames.deadwoodplank.getDefaultState(), Block.Properties.from(SuperBlockNames.deadwoodplank)), "deadwoodstairs");
        SuperBlockNames.spookyoakstairs = registerBlock(new SuperStairs(SuperBlockNames.spookyoakplank.getDefaultState(), Block.Properties.from(SuperBlockNames.spookyoakplank)), "spookyoakstairs");
        SuperBlockNames.spookywillowstairs = registerBlock(new SuperStairs(SuperBlockNames.spookywillowplank.getDefaultState(), Block.Properties.from(SuperBlockNames.spookywillowplank)), "spookywillowstairs");
        SuperBlockNames.mountainashstairs = registerBlock(new SuperStairs(SuperBlockNames.mountainashplank.getDefaultState(), Block.Properties.from(SuperBlockNames.mountainashplank)), "mountainashstairs");

        SuperBlockNames.darkcherryleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "darkcherryleaves");
        SuperBlockNames.deadwoodleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "deadwoodleaves");
        SuperBlockNames.spookywillowleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "spookywillowleaves");
        SuperBlockNames.spookyoakleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "spookyoakleaves");
        SuperBlockNames.mountainashleaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "mountainashleaves");

        SuperBlockNames.darkcherryslab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "darkcherryslab");
        SuperBlockNames.deadwoodslab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "deadwoodslab");
        SuperBlockNames.spookywillowslab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "spookywillowslab");
        SuperBlockNames.spookyoakslab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "spookyoakslab");
        SuperBlockNames.mountainashslab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mountainashslab");



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
