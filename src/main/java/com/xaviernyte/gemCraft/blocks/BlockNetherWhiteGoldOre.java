package com.xaviernyte.gemCraft.blocks;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNetherWhiteGoldOre extends Block {
	
	public BlockNetherWhiteGoldOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TutorialBlocks.NETHER_WHITEGOLD_ORE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.NETHER_WHITEGOLD_ORE.getRegistryName());
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
