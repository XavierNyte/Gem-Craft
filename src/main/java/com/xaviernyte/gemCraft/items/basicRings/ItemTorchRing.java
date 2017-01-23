package com.xaviernyte.gemCraft.items.basicRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
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

public class ItemTorchRing extends Item {

	public ItemTorchRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setMaxStackSize(1);
		setCreativeTab(ModItems.RINGS);
		this.setMaxDamage(2000);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		
		BlockPos pos0;
		IBlockState State;
		
		switch(facing){
		case NORTH: z--;
		
			pos0 = new BlockPos(x, y, z);
			State = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.NORTH);
			if(world.isAirBlock(pos0) && world.isBlockFullCube(pos)){
				placeTorch(player, world, pos, pos0, hand, State);
				stack.damageItem(1, player);
			}
			
			break;
			
		case SOUTH: z++;
		
			pos0 = new BlockPos(x, y, z);
			State = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.SOUTH);
			if(world.isAirBlock(pos0) && world.isBlockFullCube(pos)){
				placeTorch(player, world, pos, pos0, hand, State);
				stack.damageItem(1, player);
			}
			
			break;
			
		case EAST: x++;
		
			pos0 = new BlockPos(x, y, z);
			State = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.EAST);
			if(world.isAirBlock(pos0) && world.isBlockFullCube(pos)){
				placeTorch(player, world, pos, pos0, hand, State);
				stack.damageItem(1, player);
			}
			
			break;
			
		case WEST: x--;
		
			pos0 = new BlockPos(x, y, z);
			State = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.WEST);
			if(world.isAirBlock(pos0) && world.isBlockFullCube(pos)){
				placeTorch(player, world, pos, pos0, hand, State);
				stack.damageItem(1, player);
			}
			
			break;
			
		case UP: y++;
		
			pos0 = new BlockPos(x, y, z);
			State = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.UP);
			if(world.isAirBlock(pos0) && world.isBlockFullCube(pos)){
				placeTorch(player, world, pos, pos0, hand, State);
				stack.damageItem(1, player);
			}
			
			break;
			
		default:
			break;
		}

        return EnumActionResult.PASS;
    }
	
	private void placeTorch(EntityPlayer player, World world, BlockPos pos, BlockPos pos0, EnumHand hand, IBlockState state){

			world.setBlockState(pos0, state);
			player.swingArm(hand);
	}
}
