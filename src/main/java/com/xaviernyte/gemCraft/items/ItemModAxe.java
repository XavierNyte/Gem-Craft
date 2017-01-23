package com.xaviernyte.gemCraft.items;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

/**
 * This is an implementation of the ItemAxe. This class was created
 * due to a bug in ItemAxe that results in an "Array out of Bound"
 * exception in the constructor. 
 * 
 * Note: You don't need permission from me to use this code. Just use it
 * if your having the same problem I'm having. :)
 * @author derf6060
 */
public class ItemModAxe extends ItemTool {

	// A holder object for the tool material
	private ToolMaterial material = null;
	// This is a list of 
	private static Set<Block> blocks = null;
	
	/**
	 * This initializes the ItemAxeCustom object.
	 * @param ToolMaterial material
	 * @return 
	 */
	public ItemModAxe(String name, ToolMaterial material) {
		super(material, getEffectedBlocks());
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.material = material;
	}

	/**
	 * This create a list of vanilla blocks that the custom
	 * axe can be used on.
	 * @return Set<Block>
	 */
	private static Set<Block> getEffectedBlocks() {
		// TODO Auto-generated method stub
		
		if(blocks == null) {
			blocks = new HashSet<Block>();
			// Acacia
			blocks.add(Blocks.ACACIA_DOOR);
			blocks.add(Blocks.ACACIA_FENCE);
			blocks.add(Blocks.ACACIA_FENCE_GATE);
			blocks.add(Blocks.ACACIA_STAIRS);
			// Birch
			blocks.add(Blocks.BIRCH_DOOR);
			blocks.add(Blocks.BIRCH_FENCE);
			blocks.add(Blocks.BIRCH_FENCE_GATE);
			blocks.add(Blocks.BIRCH_STAIRS);
			// Dark Oak
			blocks.add(Blocks.DARK_OAK_DOOR);
			blocks.add(Blocks.DARK_OAK_FENCE);
			blocks.add(Blocks.DARK_OAK_FENCE_GATE);
			blocks.add(Blocks.DARK_OAK_STAIRS);
			// Jungle
			blocks.add(Blocks.JUNGLE_DOOR);
			blocks.add(Blocks.JUNGLE_FENCE);
			blocks.add(Blocks.JUNGLE_FENCE_GATE);
			blocks.add(Blocks.JUNGLE_STAIRS);
			// Oak 
			blocks.add(Blocks.OAK_DOOR);
			blocks.add(Blocks.OAK_FENCE);
			blocks.add(Blocks.OAK_FENCE_GATE);
			blocks.add(Blocks.OAK_STAIRS);
			// Spruce
			blocks.add(Blocks.SPRUCE_DOOR);
			blocks.add(Blocks.SPRUCE_FENCE);
			blocks.add(Blocks.SPRUCE_FENCE_GATE);
			blocks.add(Blocks.SPRUCE_STAIRS);
			// Logs
			blocks.add(Blocks.LOG);
			blocks.add(Blocks.LOG2);
			// Leaves
			blocks.add(Blocks.LEAVES);
			blocks.add(Blocks.LEAVES2);
			// Planks
			blocks.add(Blocks.PLANKS);
			// Crafting Table
			blocks.add(Blocks.CRAFTING_TABLE);
			// Pumkin
			blocks.add(Blocks.PUMPKIN);
			// Lit Pumkin
			blocks.add(Blocks.LIT_PUMPKIN);
			// Vines
			blocks.add(Blocks.VINE);
			// Melon
			blocks.add(Blocks.MELON_BLOCK);
		}
		return blocks;
	}

	/**
	 * This check if the block can be mined by the custom axe
	 * @param ItemStack stack
	 * @param IBlockState state
	 * @return
	 */
	private boolean checkStrVsBlock(ItemStack stack, IBlockState state) {
		
		boolean b = false;
		
		// Check Block List that the axe can mine...
		Iterator<Block> it = blocks.iterator();
		
		while(it.hasNext()) {
			Block block = it.next();
			
			if(block == state.getBlock()) {
				b = true;
				break;
			}
		}
		
		
		// Check Materials
		Material material = state.getMaterial();
		
		// Added in harvest tool and harvest level
		return b || 
			   material == Material.WOOD || 
			   material == Material.PLANTS || 
			   material == Material.VINE || 
			   (((state.getBlock().getHarvestTool(state) != null && state.getBlock().getHarvestTool(state).equals("axe"))? true : false) && state.getBlock().getHarvestLevel(state) <= this.material.getHarvestLevel());
	}
	
	
	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		// TODO Auto-generated method stub
		return (!checkStrVsBlock(stack, state))? super.getStrVsBlock(stack, state) : this.material.getEfficiencyOnProperMaterial();
	}
}
