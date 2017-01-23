package com.xaviernyte.gemCraft.items.advancedRings;

import com.xaviernyte.gemCraft.config.GemCraftConfig;
import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemGrowthRing extends Item{

	public ItemGrowthRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		this.setMaxDamage(2000);
	}
	
	int range = GemCraftConfig.radius;
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		
		if(player.worldObj.isRemote){
			return null;
		}
    	
		for(int ix = -range; ix <= range; ix++){
			
			for(int iz = -range; iz <= range; iz++){
				
				BlockPos pos1 = new BlockPos(pos.getX() + ix, pos.getY(), pos.getZ() + iz);
			
		        if(!bonemeal(player, pos1)){
		            bonemeal(player, pos1.down());
		            player.swingArm(hand);
		            if(iz == range) // Damages once every click, not 9
		            	stack.damageItem(1, player);
		        }
			}
		}
        
		return EnumActionResult.SUCCESS;
    }
	
	@SubscribeEvent
	public void BonemealEvent(EntityPlayer player, World world, BlockPos pos, IBlockState block){
		
	}
	
	public boolean bonemeal(EntityPlayer player, BlockPos pos) {
		
		boolean did = ItemDye.applyBonemeal(new ItemStack(Items.DYE, 1, 15), player.worldObj, pos, player);
		if(did)
			player.worldObj.playEvent(2005, pos, 0);
		return did;
	}
}
