package com.xaviernyte.gemCraft.proxy;

import com.xaviernyte.gemCraft.config.GemCraftConfig;
import com.xaviernyte.gemCraft.init.ModBlocks;
import com.xaviernyte.gemCraft.init.ModItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		GemCraftConfig.clientPreInit();
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
