package com.gs.supernaturals.core;

import com.gs.supernaturals.item.weapon.Dagger;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.gs.supernaturals.Supernaturals.creativeTab;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

    // Register Blocks
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegisteryEvent) {
        blockRegisteryEvent.getRegistry().register(new OreBlock(OreBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f)).setRegistryName("silver_ore"));
    }

    // Register Items
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegisteryEvent) {
        itemRegisteryEvent.getRegistry().register(new BlockItem(ModBlocks.SILVERORE, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.SILVERORE.getRegistryName()));
        itemRegisteryEvent.getRegistry().register(new Dagger(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(150).group(creativeTab)).setRegistryName("dagger"));
    }
}