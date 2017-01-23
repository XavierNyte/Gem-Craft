package com.xaviernyte.gemCraft.items.basicRings;

import java.util.List;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemVoidRing extends Item {
	
	public ItemVoidRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected){
		
		EntityPlayer player = (EntityPlayer)entityIn;
		
		ItemStack cobble = new ItemStack(Blocks.COBBLESTONE);
		
		if(player.inventory.isHotbar(player.inventory.getSlotFor(new ItemStack(ModItems.void_ring))) && player.inventory.hasItemStack(cobble)){	
			
				player.inventory.clearMatchingItems(cobble.getItem(), 0, 64, (NBTTagCompound)null);
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
			list.add("Voids all cobblestone");
	}
}
