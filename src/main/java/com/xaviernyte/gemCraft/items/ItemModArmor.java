package com.xaviernyte.gemCraft.items;

import java.util.List;

import com.xaviernyte.gemCraft.config.GemCraftConfig;
import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {
	
	private String name;

	public ItemModArmor(String name, ArmorMaterial material, EntityEquipmentSlot slot) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (GemCraftConfig.helmetEffect && stack.getItem() == ModItems.gem_helmet){
			list.add("Adds night vision");
		}else if (GemCraftConfig.chestEffect && stack.getItem() == ModItems.gem_chestplate){
			list.add("Adds fire resistance");
		}else if (GemCraftConfig.legEffect && stack.getItem() == ModItems.gem_leggings){
			list.add("Adds speed boost");
		}else if (GemCraftConfig.bootEffect && stack.getItem() == ModItems.gem_boots){
			list.add("Adds jump boost");
		}
		
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (GemCraftConfig.helmetEffect && itemStack.getItem() == ModItems.gem_helmet) {
	    	effectPlayer(player, 16, 0);
	    }
	    if (GemCraftConfig.chestEffect && itemStack.getItem() == ModItems.gem_chestplate) {
	        effectPlayer(player, 12, 0);
	    }
	    if (GemCraftConfig.legEffect && itemStack.getItem() == ModItems.gem_leggings) {
	        effectPlayer(player, 1, 1);
	    }
	    if (GemCraftConfig.bootEffect && itemStack.getItem() == ModItems.gem_boots) {
	        effectPlayer(player, 8, 1);
	    }
	    
	    if (GemCraftConfig.setEffect == true &&
	    	player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && 
	    	player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.gem_helmet && 
	    	player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && 
	    	player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.gem_chestplate && 
	    	player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && 
	        player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.gem_leggings && 
	        player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && 
	        player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.gem_boots) {
	    	
	    		effectPlayer(player, 5, 2);
	    }
	} 
	
	private void effectPlayer(EntityPlayer player, int ID, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(Potion.getPotionById(ID)) == null || player.getActivePotionEffect(Potion.getPotionById(ID)).getDuration() <= 219)
	        player.addPotionEffect(new PotionEffect(Potion.getPotionById(ID), 239, amplifier, true, true));
	}
	

}
