package com.xaviernyte.gemCraft.items.averageRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPotionRing extends Item {
	
	public ItemPotionRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected){
		
		EntityPlayer player = (EntityPlayer)entityIn;
		if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.speed_ring)))){
			effectPlayer(player, 1, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.haste_ring)))){
			effectPlayer(player, 3, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.strength_ring)))){
			effectPlayer(player, 5, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.jump_ring)))){
			effectPlayer(player, 8, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.regen_ring)))){
			effectPlayer(player, 10, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.resistance_ring)))){
			effectPlayer(player, 11, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.fresistance_ring)))){
			effectPlayer(player, 12, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.wresistance_ring)))){
			effectPlayer(player, 13, 0);
		}if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.nightvision_ring)))){
			effectPlayer(player, 16, 0);
		}
	}
	
	private void effectPlayer(EntityPlayer player, int ID, int amplifier) {
	    // Constant effect for about 11 seconds
	    if (player.getActivePotionEffect(Potion.getPotionById(ID)) == null || player.getActivePotionEffect(Potion.getPotionById(ID)).getDuration() <= 219)
	        player.addPotionEffect(new PotionEffect(Potion.getPotionById(ID), 239, amplifier, true, true));
	}
}
