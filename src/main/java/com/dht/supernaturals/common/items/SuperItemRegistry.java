package com.dht.supernaturals.common.items;

import com.dht.supernaturals.common.items.potions.SuperPotion;
import com.dht.supernaturals.util.SuperItemGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
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

        SuperItems.potionempty = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"potionempty");
        SuperItems.potionblack = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionblack)),"potionblack");
        SuperItems.potionred = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionred)),"potionred");
        SuperItems.potionyellow = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionyellow)),"potionyellow");
        SuperItems.potionblue = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionblue)),"potionblue");
        SuperItems.potiondarkblue = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potiondarkblue)),"potiondarkblue");
        SuperItems.potionorange = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionorange)),"potionorange");
        SuperItems.potionbrown = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionbrown)),"potionbrown");
        SuperItems.potionpink = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionpink)),"potionpink");
        SuperItems.potionpurple = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potionpurple)),"potionpurple");
        SuperItems.potiongreen = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance).food(SuperPotion.potiongreen)),"potiongreen");

        SuperItems.component1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"druidleaf");
        SuperItems.component2 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"fairywings");
        SuperItems.component3 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component3");
        SuperItems.component4 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component4");
        SuperItems.component5 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component5");
        SuperItems.component6 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component6");
        SuperItems.component7 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component7");
        SuperItems.component8 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component8");
        SuperItems.component9 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component9");
        SuperItems.component10 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"component10");

        SuperItems.magicdust1 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"magicdust1");
        SuperItems.magicdust2 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"magicdust2");
        SuperItems.magicdust3 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"magicdust3");
        SuperItems.magicdust4 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"magicdust4");
        SuperItems.magicdust5 = registerItem(new Item(new Item.Properties().group(SuperItemGroup.instance)),"magicdust5");

    }

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

}
