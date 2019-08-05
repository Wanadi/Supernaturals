package com.dht.supernaturals.util;

import com.dht.supernaturals.common.items.SuperItems;
import com.drizzs.grassworld.items.GrassWorldItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupGW extends ItemGroup {

    public static final ItemGroupGW instance = new ItemGroupGW(ItemGroup.GROUPS.length, "grassworld");

    private ItemGroupGW(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(SuperItems.super_icon);
    }


}
