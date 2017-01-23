package com.xaviernyte.gemCraft.items.advancedRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTimeRing extends Item {

	public ItemTimeRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		this.setMaxDamage(2000);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		
		if (player.isSneaking()){
			world.setWorldTime(14000);
			stack.damageItem(1, player);
		}else{
			world.setWorldTime(0);
			stack.damageItem(1, player);
		}
		
		return new ActionResult(EnumActionResult.PASS, stack);
	}
}
