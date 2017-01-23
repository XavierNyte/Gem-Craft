package com.xaviernyte.gemCraft.items.basicRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemLavaRing extends Item {
	
	public ItemLavaRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		this.setMaxDamage(2000);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		
		BlockPos pos0;
		
		switch(facing){
		case NORTH: z--;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		case SOUTH: z++;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		case EAST: x++;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		case WEST: x--;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		case UP: y++;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		case DOWN: y--;
			pos0 = new BlockPos(x, y, z);
			placeLava(stack, player, world, pos0, hand);
			break;
		default:
			break;
		}

        return EnumActionResult.PASS;
    }
	
	private void placeLava(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand){
		if(world.isAirBlock(pos)){
			if(player.getHeldItemMainhand() == null){
				if(player.getHeldItemOffhand().getItem() == ModItems.lava_ring){
					world.setBlockState(pos, Blocks.LAVA.getStateFromMeta(0));
					player.swingArm(hand);
					stack.damageItem(1, player);
			    }
			}else{
				if(player.getHeldItemMainhand().getItem() == ModItems.lava_ring || player.getHeldItemOffhand().getItem() == ModItems.lava_ring){
					world.setBlockState(pos, Blocks.LAVA.getStateFromMeta(0));
					player.swingArm(hand);
					stack.damageItem(1, player);
				}
			}
		}
	}
}
