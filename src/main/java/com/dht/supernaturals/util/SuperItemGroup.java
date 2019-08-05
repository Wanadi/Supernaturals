package com.dht.supernaturals.util;

import com.dht.supernaturals.common.items.SuperItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SuperItemGroup extends ItemGroup {

    public static final SuperItemGroup instance = new SuperItemGroup(ItemGroup.GROUPS.length, "supernaturals");

    private SuperItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(SuperItems.super_icon);
    }


}
