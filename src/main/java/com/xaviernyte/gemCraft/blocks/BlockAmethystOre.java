package com.xaviernyte.gemCraft.blocks;

import java.util.Random;

import com.xaviernyte.gemCraft.Reference;
import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAmethystOre extends Block {
	
	public BlockAmethystOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TutorialBlocks.AMETHYST_ORE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.AMETHYST_ORE.getRegistryName());
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.amethyst;
    }
    
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        // returns number between 1 and (fortune+1)
        return Math.max(0, random.nextInt(fortune + 2) - 1) + 1;
    }
    
    @Override
    public int damageDropped(IBlockState state)
    {
        return this.getMetaFromState(state);
    }

    // Drop some experience when amethyst is mined
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        return MathHelper.getRandomIntegerInRange(rand, 3, 7);
    }

}
