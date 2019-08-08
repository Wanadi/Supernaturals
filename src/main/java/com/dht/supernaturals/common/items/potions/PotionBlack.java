package com.dht.supernaturals.common.items.potions;

import com.dht.supernaturals.common.items.SuperItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class PotionBlack extends Item {

    public PotionBlack(Properties properties)
    {
        super(properties);

    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        if(entityLiving instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entityLiving;
            entityLiving.addPotionEffect(new EffectInstance(Effects.NAUSEA, 100, 1, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(SuperItems.potionempty));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
