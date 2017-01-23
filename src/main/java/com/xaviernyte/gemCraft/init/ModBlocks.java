package com.xaviernyte.gemCraft.init;

import com.xaviernyte.gemCraft.blocks.BlockAmethyst;
import com.xaviernyte.gemCraft.blocks.BlockAmethystOre;
import com.xaviernyte.gemCraft.blocks.BlockEndWhiteGoldOre;
import com.xaviernyte.gemCraft.blocks.BlockNetherWhiteGoldOre;
import com.xaviernyte.gemCraft.blocks.BlockRuby;
import com.xaviernyte.gemCraft.blocks.BlockRubyOre;
import com.xaviernyte.gemCraft.blocks.BlockSapphire;
import com.xaviernyte.gemCraft.blocks.BlockSapphireOre;
import com.xaviernyte.gemCraft.blocks.BlockWhiteGold;
import com.xaviernyte.gemCraft.blocks.BlockWhiteGoldOre;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block sapphire;
	public static Block ruby;
	public static Block amethyst;
	public static Block whitegold;
	
	public static Block sapphire_ore;
	public static Block ruby_ore;
	public static Block amethyst_ore;
	public static Block whitegold_ore;
	public static Block nether_whitegold_ore;
	public static Block end_whitegold_ore;
	
	public static void init(){
		sapphire = new BlockSapphire();
		ruby = new BlockRuby();
		amethyst = new BlockAmethyst();
		whitegold = new BlockWhiteGold();
		
		sapphire_ore = new BlockSapphireOre();
		ruby_ore = new BlockRubyOre();
		amethyst_ore = new BlockAmethystOre();
		whitegold_ore = new BlockWhiteGoldOre();
		nether_whitegold_ore = new BlockNetherWhiteGoldOre();
		end_whitegold_ore = new BlockEndWhiteGoldOre();
	}
	
	public static void register(){
		registerBlock(sapphire);
		registerBlock(ruby);
		registerBlock(amethyst);
		registerBlock(whitegold);
		
		registerBlock(sapphire_ore);
		registerBlock(ruby_ore);
		registerBlock(amethyst_ore);
		registerBlock(whitegold_ore);
		registerBlock(nether_whitegold_ore);
		registerBlock(end_whitegold_ore);
	}
	
	public static void registerRenders(){
		registerRender(sapphire);
		registerRender(ruby);
		registerRender(amethyst);
		registerRender(whitegold);
		
		registerRender(sapphire_ore);
		registerRender(ruby_ore);
		registerRender(amethyst_ore);
	    registerRender(whitegold_ore);
	    registerRender(nether_whitegold_ore);
	    registerRender(end_whitegold_ore);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}