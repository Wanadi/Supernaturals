package com.dht.supernaturals.common.items;

import com.dht.supernaturals.util.SuperItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class SuperItemRegistry {

    public static void init()
    {
    SuperItems.super_icon = registerItem(new Item(new Item.Properties()),"super_icon");

        SuperItems.nugget1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"whitegoldn");
        SuperItems.nugget2 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"silvern");
        SuperItems.ingot1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"whitegoldi");
        SuperItems.ingot2 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"silveri");
        SuperItems.crystal1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"crystalm");
        SuperItems.gem1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"amethyst");
        SuperItems.ash = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"mountainash");

}

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
