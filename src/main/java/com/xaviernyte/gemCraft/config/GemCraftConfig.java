package com.xaviernyte.gemCraft.config;

import java.io.File;

import com.xaviernyte.gemCraft.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GemCraftConfig {

	public static final String CATEGORY_ARMOR = "armor";
	public static final String CATEGORY_WORLDGEN = "worldgen";
	public static final String CATEGORY_RINGS = "rings";

	public static Configuration config;
	
	// Ore configs
    public static int maxVeinSizeRuby = 8;
    public static int chancesToSpawnRuby = 4;
    public static int maxVeinSizeSapphire = 8;
    public static int chancesToSpawnSapphire = 6;
    public static int maxVeinSizeAmethyst = 8;
    public static int chancesToSpawnAmethyst = 2;
    public static int maxVeinSizeWhite = 4;
    public static int chancesToSpawnWhite = 2;
    public static int maxVeinSizeNether = 4;
    public static int chancesToSpawnNether = 4;
    public static int maxVeinSizeEnd = 4;
    public static int chancesToSpawnEnd = 16;
    
    // Advanced Rings
    public static boolean flight = true;
    public static boolean teleport = true;
    public static boolean growth = true;
    public static int radius = 1;
    public static boolean time = true;
    
    // Average Rings
    public static boolean lightning = true;
    public static boolean potion = true;
    
    // Basic Rings
    public static boolean torch = true;
    public static boolean Void = true;
    public static boolean water = true;
    public static boolean lava = true;
    
    // Gem Armor
    public static boolean armorEnabled = true;
    public static boolean setEffect = true;
    public static boolean helmetEffect = true;
    public static boolean chestEffect = true;
    public static boolean legEffect = true;
    public static boolean bootEffect = true;
    
    
	public static void preInit() 
	{

		File configFile = new File(Loader.instance().getConfigDir(), "gemCraft.cfg");
		config = new Configuration(configFile);

		syncFromFile();
	}
	
	public static void clientPreInit() {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}

	public static Configuration getConfig() {
		return config;
	}

	public static void syncFromFile() {
		syncConfig(true, true);
	}
	
	public static void syncFromGUI() {
		syncConfig(false, true);
	}

	public static void syncFromFields() {
		syncConfig(false, false);
	}
	
	private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig) {
		
		if (loadConfigFromFile) {
			config.load();
		}

		if (readFieldsFromConfig) {
			armorEnabled = ConfigHelper.loadPropBool("Enable Crafting", CATEGORY_ARMOR + ".gem", "Enable recipes for Gem Armor", true);
	        setEffect = ConfigHelper.loadPropBool("Set Effect (Strength)", CATEGORY_ARMOR + ".gem", "Enable Gem Armor set effect", true);
	        helmetEffect = ConfigHelper.loadPropBool("Helmet Effect (Night Vision)", CATEGORY_ARMOR + ".gem", "Enable Gem Helmet effect", true);
	        chestEffect = ConfigHelper.loadPropBool("Chestplate Effect (Fire Resistance)", CATEGORY_ARMOR + ".gem", "Enable Gem Chesplate effect", true);
	        legEffect = ConfigHelper.loadPropBool("Leggings Effect (Speed)", CATEGORY_ARMOR + ".gem", "Enable Gem Leggings effect", true);
	        bootEffect = ConfigHelper.loadPropBool("Boots Effect (Jump Boost)", CATEGORY_ARMOR + ".gem", "Enable Gem Boots effect", true);
	        maxVeinSizeRuby = ConfigHelper.loadPropInt("Ruby Size", CATEGORY_WORLDGEN + ".ruby", "Maximum size of Ruby ore veins", maxVeinSizeRuby);
	        chancesToSpawnRuby = ConfigHelper.loadPropInt("Ruby Chances", CATEGORY_WORLDGEN + ".ruby", "Chances to spawn ruby ore", chancesToSpawnRuby);
	        maxVeinSizeSapphire = ConfigHelper.loadPropInt("Sapphire Size", CATEGORY_WORLDGEN + ".sapphire", "Maximum size of Sapphire ore veins", maxVeinSizeSapphire);
	        chancesToSpawnSapphire = ConfigHelper.loadPropInt("Sapphire Chances", CATEGORY_WORLDGEN + ".sapphire", "Chances to spawn sapphire ore", chancesToSpawnSapphire);
	        maxVeinSizeAmethyst = ConfigHelper.loadPropInt("Amethyst Size", CATEGORY_WORLDGEN + ".amethyst", "Maximum size of Amethyst ore veins", maxVeinSizeAmethyst);
	        chancesToSpawnAmethyst = ConfigHelper.loadPropInt("Amethyst Chances", CATEGORY_WORLDGEN + ".amethyst", "Chances to spawn amethyst ore", chancesToSpawnAmethyst);
	        maxVeinSizeWhite = ConfigHelper.loadPropInt("White Gold Size", CATEGORY_WORLDGEN + ".whitegold", "Maximum size of White Gold ore veins", maxVeinSizeWhite);
	        chancesToSpawnWhite = ConfigHelper.loadPropInt("White Gold Chances", CATEGORY_WORLDGEN + ".whitegold", "Chances to spawn white gold ore", chancesToSpawnWhite);
	        maxVeinSizeNether = ConfigHelper.loadPropInt("Nether White Gold Size", CATEGORY_WORLDGEN + ".nether_whitegold", "Maximum size of Nether White Gold ore veins", maxVeinSizeNether);
	        chancesToSpawnNether = ConfigHelper.loadPropInt("Nether White Gold Chances", CATEGORY_WORLDGEN + ".nether_whitegold", "Chances to spawn nether white gold ore", chancesToSpawnNether);
	        maxVeinSizeEnd = ConfigHelper.loadPropInt("End White Gold Size", CATEGORY_WORLDGEN + ".end_whitegold", "Maximum size of End White Gold ore veins", maxVeinSizeEnd);
	        chancesToSpawnEnd = ConfigHelper.loadPropInt("End White Gold Chances", CATEGORY_WORLDGEN + ".end_whitegold", "Chances to spawn end white gold ore", chancesToSpawnEnd);
	        flight = ConfigHelper.loadPropBool("Flight Ring Recipe", CATEGORY_RINGS + ".advanced", "Enable recipe for Flight Ring", true);
	        teleport = ConfigHelper.loadPropBool("Blink Ring Recipe", CATEGORY_RINGS + ".advanced", "Enable recipe for Blink Ring", true);
	        growth = ConfigHelper.loadPropBool("Growth Ring Recipe", CATEGORY_RINGS + ".advanced", "Enable recipe for Growth Ring", true);
	        radius = ConfigHelper.loadPropInt("Growth Ring Radius", CATEGORY_RINGS + ".advanced", "Radius for Growth Ring effect (0 = one block)", radius);
	        time = ConfigHelper.loadPropBool("Time Ring Recipe", CATEGORY_RINGS + ".advanced", "Enable recipe for Time Ring", true);
	        lightning = ConfigHelper.loadPropBool("Lightning Recipe", CATEGORY_RINGS + ".average", "Enable recipe for Lightning Ring", true);
	        potion = ConfigHelper.loadPropBool("Potion Rings Recipe", CATEGORY_RINGS + ".average", "Enable recipe for Potion Rings", true);
	        torch = ConfigHelper.loadPropBool("Torch Ring Recipe", CATEGORY_RINGS + ".basic", "Enable recipe for Torch Ring", true);
	        Void = ConfigHelper.loadPropBool("Void Ring Recipe", CATEGORY_RINGS + ".basic", "Enable recipe for Void Ring", true);
	        water = ConfigHelper.loadPropBool("Water Ring Recipe", CATEGORY_RINGS + ".basic", "Enable recipe for Water Ring", true);
	        lava = ConfigHelper.loadPropBool("Lava Ring Recipe", CATEGORY_RINGS + ".basic", "Enable recipe for Lava Ring", true);
		}
		
		if(config.hasChanged()){
			config.save();
		}
	}

	public static class ConfigEventHandler {

		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) 
		{
			if (Reference.MOD_ID.equals(event.getModID()) && !event.isWorldRunning()) 
			{
				if (event.getConfigID().equals(CATEGORY_ARMOR) || event.getConfigID().equals(CATEGORY_WORLDGEN) || event.getConfigID().equals(CATEGORY_RINGS)) 
				{
					syncFromGUI();
				}
			}
		}
	}
}
