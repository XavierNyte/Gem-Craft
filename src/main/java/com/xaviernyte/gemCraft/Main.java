package com.xaviernyte.gemCraft;

import java.io.File;

import com.xaviernyte.gemCraft.config.GemCraftConfig;
import com.xaviernyte.gemCraft.init.ModBlocks;
import com.xaviernyte.gemCraft.init.ModCrafting;
import com.xaviernyte.gemCraft.init.ModItems;
import com.xaviernyte.gemCraft.proxy.CommonProxy;
import com.xaviernyte.gemCraft.world.ModWorldGeneration;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, guiFactory= Reference.GUIFACTORY)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("Pre Init");
		
		GemCraftConfig.preInit();
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("Init");
		
		proxy.init();
		
		ModCrafting.register();
		
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("Post Init");
	}

}
