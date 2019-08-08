package com.dht.supernaturals.common.items.potions.potions;

import com.dht.supernaturals.common.items.SuperItems;
import com.dht.supernaturals.common.items.potions.SuperPotion;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class PotionBrown extends SuperPotion {
    public PotionBrown(String name, int hunger, float saturation) {
        super(name, hunger, saturation);
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
