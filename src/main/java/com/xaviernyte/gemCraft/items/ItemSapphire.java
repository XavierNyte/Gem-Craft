package com.xaviernyte.gemCraft.items;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSapphire extends Item {
	
	public ItemSapphire() {
		setUnlocalizedName(Reference.TutorialItems.SAPPHIRE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.SAPPHIRE.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
}
