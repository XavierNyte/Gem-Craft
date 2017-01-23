package com.xaviernyte.gemCraft.items;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModMaterials extends Item {
		
	public ItemModMaterials(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
