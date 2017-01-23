package com.xaviernyte.gemCraft.items;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAmethyst extends Item {
	
	public ItemAmethyst() {
		setUnlocalizedName(Reference.TutorialItems.AMETHYST.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.AMETHYST.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}

