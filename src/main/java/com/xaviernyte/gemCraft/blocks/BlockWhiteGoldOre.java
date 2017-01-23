package com.xaviernyte.gemCraft.blocks;

import java.util.List;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockWhiteGoldOre extends Block {

	public BlockWhiteGoldOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TutorialBlocks.WHITEGOLD_ORE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.WHITEGOLD_ORE.getRegistryName());
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
