package com.xaviernyte.gemCraft.config;

import net.minecraftforge.common.config.Property;

public class ConfigHelper {
	
	public static boolean needsRestart;
	
	public static int loadPropInt(String propName, String category, String desc, int default_) {
		
		Property prop = GemCraftConfig.config.get(category, propName, default_);
		prop.setComment(desc);
		setNeedsRestart(prop);
		
		return prop.getInt(default_);
	}
	
	public static boolean loadPropBool(String propName, String category, String desc, boolean default_) {
		
		Property prop = GemCraftConfig.config.get(category, propName, default_);
		prop.setComment(desc);
		setNeedsRestart(prop);
		
		return prop.getBoolean(default_);
		
	}
	
	private static void setNeedsRestart(Property prop) {
		
		if(needsRestart)
			prop.setRequiresMcRestart(needsRestart);
		
		needsRestart = false;
	}
}
