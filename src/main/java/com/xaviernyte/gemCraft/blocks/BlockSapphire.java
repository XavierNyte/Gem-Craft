package com.xaviernyte.gemCraft.blocks;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSapphire extends Block {
	
	public BlockSapphire() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.SAPPHIRE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.SAPPHIRE.getRegistryName());
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
