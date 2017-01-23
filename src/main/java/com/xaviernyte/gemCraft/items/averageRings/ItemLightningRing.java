package com.xaviernyte.gemCraft.items.averageRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemLightningRing extends Item {
	
	public ItemLightningRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		this.setMaxDamage(2000);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		 
		 RayTraceResult mop = Minecraft.getMinecraft().getRenderViewEntity().rayTrace(64, 1.0F);
		 
		 int x = mop.getBlockPos().getX();
		 int y = mop.getBlockPos().getY();
		 int z = mop.getBlockPos().getZ();
		
		 if(mop != null){
			EntityLightningBolt lightning = new EntityLightningBolt(world, x, y, z, false);
	     	player.worldObj.addWeatherEffect(lightning);
	     	player.swingArm(hand);
	     	stack.damageItem(1, player);
		 }
		
	     return new ActionResult(EnumActionResult.PASS, stack);
    }
}
