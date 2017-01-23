package com.xaviernyte.gemCraft.blocks;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAmethyst extends Block {
	
	public BlockAmethyst() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.AMETHYST.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.AMETHYST.getRegistryName());
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
