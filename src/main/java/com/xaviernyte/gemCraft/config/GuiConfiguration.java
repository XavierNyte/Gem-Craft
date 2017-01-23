package com.xaviernyte.gemCraft.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.xaviernyte.gemCraft.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class GuiConfiguration extends GuiConfig{

    public GuiConfiguration(GuiScreen parentScreen){
        super(parentScreen, getAllElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(GemCraftConfig.config.toString()));
    }
    
    private static List<IConfigElement> getAllElements(){
    	
    	List<IConfigElement> list = new ArrayList<IConfigElement>();
    	
		String[] categories = {GemCraftConfig.CATEGORY_ARMOR, GemCraftConfig.CATEGORY_WORLDGEN, GemCraftConfig.CATEGORY_RINGS};
		for(String s : categories){
			if(!s.contains(".")){
				list.add(new DummyConfigElement.DummyCategoryElement(s, s, new ConfigElement(GemCraftConfig.config.getCategory(s)).getChildElements()));
			}
		}
    
    	return list;
    }
}
