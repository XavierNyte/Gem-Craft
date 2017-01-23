package com.xaviernyte.gemCraft.items.advancedRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemBlinkRing extends Item{

	public ItemBlinkRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		this.setMaxDamage(2000);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){

		RayTraceResult mop = Minecraft.getMinecraft().getRenderViewEntity().rayTrace(32, 1.0F);
		 
		 int x = mop.getBlockPos().getX();
		 int y = mop.getBlockPos().getY();
		 int z = mop.getBlockPos().getZ();
		
		 if(mop != null){
             if (world.isAirBlock(mop.getBlockPos().up()) && world.isAirBlock(mop.getBlockPos().up(2))) {
                 player.setPositionAndUpdate(x+0.5, y + 1, z+0.5);
                 player.swingArm(hand);
     	     	 stack.damageItem(1, player);
             } else {
                 switch (mop.sideHit) {
                     case DOWN:
                         player.setPositionAndUpdate(x+0.5, y - 2, z+0.5);
                         break;
                     case NORTH:
                         player.setPositionAndUpdate(x+0.5, y, z - 1+0.5);
                         break;
                     case SOUTH:
                         player.setPositionAndUpdate(x+0.5, y, z + 1+0.5);
                         break;
                     case WEST:
                         player.setPositionAndUpdate(x - 1+0.5, y, z+0.5);
                         break;
                     case EAST:
                         player.setPositionAndUpdate(x + 1+0.5, y, z+0.5);
                         break;
                     case UP:
                         return new ActionResult(EnumActionResult.PASS, stack);
                 }
                 
                 player.swingArm(hand);
     	     	 stack.damageItem(1, player);
             }
		 }
		return new ActionResult(EnumActionResult.PASS, stack);
   }
}
