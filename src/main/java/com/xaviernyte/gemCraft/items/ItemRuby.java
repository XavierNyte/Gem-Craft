package com.xaviernyte.gemCraft.items;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item {
	
	public ItemRuby() {
		setUnlocalizedName(Reference.TutorialItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.RUBY.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
