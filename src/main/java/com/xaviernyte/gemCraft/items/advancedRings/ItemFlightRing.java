package com.xaviernyte.gemCraft.items.advancedRings;

import com.xaviernyte.gemCraft.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemFlightRing extends Item{

	public ItemFlightRing(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		setCreativeTab(ModItems.RINGS);
		this.setMaxStackSize(1);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
    public void livingUpdateEvent(LivingEvent.LivingUpdateEvent event){
        	
        if(event.getEntity() instanceof EntityPlayer){
        	
        EntityPlayer player = (EntityPlayer)event.getEntity();
        	
            if(ringInInventory(player)){
            	
                player.capabilities.allowFlying = true;  
                        
            }else if (!ringInInventory(player) && !player.capabilities.isCreativeMode){
		
            	player.capabilities.isFlying = false;
                player.capabilities.allowFlying = false;
            
            }
        }
    }
	
    public boolean ringInInventory(EntityPlayer player){
    	
        for(int i = 0; i < player.inventory.getSizeInventory(); i++){
            if(player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() instanceof ItemFlightRing){
            	
                return true;
                
            }
        }
        
        return false;
    }
	
    @Override
    public EnumRarity getRarity(ItemStack stack){
        return EnumRarity.EPIC;
    }
}
