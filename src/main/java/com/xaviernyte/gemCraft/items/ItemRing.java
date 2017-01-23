package com.xaviernyte.gemCraft.items;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRing extends Item {
	
	public ItemRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
	}
}
