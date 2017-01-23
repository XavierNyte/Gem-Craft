package com.xaviernyte.gemCraft.blocks;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEndWhiteGoldOre extends Block {
	
	public BlockEndWhiteGoldOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TutorialBlocks.END_WHITEGOLD_ORE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.END_WHITEGOLD_ORE.getRegistryName());
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
