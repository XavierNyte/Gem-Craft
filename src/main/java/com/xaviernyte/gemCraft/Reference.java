package com.xaviernyte.gemCraft;

public class Reference {
	
	public static final String MOD_ID = "gemcraft";
	public static final String NAME = "Gem Craft";
	public static final String VERSION = "1.2.5";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	public static final String GUIFACTORY = "com.xaviernyte.gemCraft.config.GuiFactory";
	
	public static final String CLIENT_PROXY_CLASS = "com.xaviernyte.gemCraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.xaviernyte.gemCraft.proxy.ServerProxy";
	
	public static enum TutorialItems{
		SAPPHIRE("sapphire", "ItemSapphire"),
		RUBY("ruby", "ItemRuby"),
		AMETHYST("amethyst", "ItemAmethyst");
		
		public String unlocalizedName;
		public String registryName;
		
		TutorialItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks{
		SAPPHIRE("sapphire", "BlockSapphire"),
		RUBY("ruby", "BlockRuby"),
		AMETHYST("amethyst", "BlockAmethyst"),
		WHITEGOLD("whitegold", "BlockWhiteGold"),
		
		SAPPHIRE_ORE("sapphire_ore", "BlockSapphireOre"),
		RUBY_ORE("ruby_ore", "BlockRubyOre"),
		AMETHYST_ORE("amethyst_ore", "BlockAmethystOre"),
		WHITEGOLD_ORE("whitegold_ore", "BlockWhiteGoldOre"),
		NETHER_WHITEGOLD_ORE("nether_whitegold_ore", "BlockNetherWhiteGoldOre"),
		END_WHITEGOLD_ORE("end_whitegold_ore", "BlockEndWhiteGoldOre");
		
		public String unlocalizedName;
		public String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
