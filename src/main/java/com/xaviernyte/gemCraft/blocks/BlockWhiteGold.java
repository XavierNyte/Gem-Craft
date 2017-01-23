package com.xaviernyte.gemCraft.blocks;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWhiteGold extends Block {

	public BlockWhiteGold() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.WHITEGOLD.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.WHITEGOLD.getRegistryName());
		setHardness(10.0F);
		setResistance(50.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
