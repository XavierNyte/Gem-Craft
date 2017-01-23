package com.xaviernyte.gemCraft.init;

import com.xaviernyte.gemCraft.config.GemCraftConfig;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	// Potion Item Stacks
	public static ItemStack speed = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS);
	public static ItemStack strength = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH);
	public static ItemStack jump = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LEAPING);
	public static ItemStack regen = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.REGENERATION);
	public static ItemStack fresistance = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.FIRE_RESISTANCE);
	public static ItemStack wresistance = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER_BREATHING);
	public static ItemStack nightvision = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.NIGHT_VISION);

	public static void register(){
		// Shaped Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ruby), "RRR", "RRR", "RRR", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphire), "SSS", "SSS", "SSS", 'S', ModItems.sapphire);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethyst), "AAA", "AAA", "AAA", 'A', ModItems.amethyst);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.whitegold), "III", "III", "III", 'I', ModItems.whitegold_ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst), "ONO", "NAN", "ONO", 'A', ModItems.amethyst, 'N', ModItems.whitegold_nugget, 'I', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.whitegold_ingot), "BNB", "NDN", "BNB", 'N', ModItems.whitegold_nugget, 'B', Items.BLAZE_POWDER, 'D', Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.armor_core), "AIA", "IDI", "AIA", 'A', ModItems.reinforced_amethyst, 'I', ModItems.whitegold_ingot, 'D', Items.DIAMOND);
		
		// Swords
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_sword), " S ", " S ", " I ", 'S', ModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_sword), " R ", " R ", " I ", 'R', ModItems.ruby, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_sword), " A ", " A ", " I ", 'A', ModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_sword), " E ", " E ", " I ", 'E', Items.EMERALD, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst_sword), " R ", " R ", " O ", 'R', ModItems.reinforced_amethyst, 'O', Blocks.OBSIDIAN);
		
		// Pickaxes
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_pickaxe), "SSS", " I ", " I ", 'S', ModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_pickaxe), "RRR", " I ", " I ", 'R', ModItems.ruby, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_pickaxe), "AAA", " I ", " I ", 'A', ModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_pickaxe), "EEE", " I ", " I ", 'E', Items.EMERALD, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst_pickaxe), "RRR", " O ", " O ", 'R', ModItems.reinforced_amethyst, 'O', Blocks.OBSIDIAN);
		
		// Axes
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_axe), "SS ", "SI ", " I ", 'S', ModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_axe), "RR ", "RI ", " I ", 'R', ModItems.ruby, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_axe), "AA ", "AI ", " I ", 'A', ModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_axe), "EE ", "EI ", " I ", 'E', Items.EMERALD, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst_axe), "RR ", "RO ", " O ", 'R', ModItems.reinforced_amethyst, 'O', Blocks.OBSIDIAN);
		
		// Shovels
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_spade), " S ", " I ", " I ", 'S', ModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_spade), " R ", " I ", " I ", 'R', ModItems.ruby, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_spade), " A ", " I ", " I ", 'A', ModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_spade), " E ", " I ", " I ", 'E', Items.EMERALD, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst_spade), " R ", " O ", " O ", 'R', ModItems.reinforced_amethyst, 'O', Blocks.OBSIDIAN);
		
		// Hoes
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_hoe), "SS ", " I ", " I ", 'S', ModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_hoe), "RR ", " I ", " I ", 'R', ModItems.ruby, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_hoe), "AA ", " I ", " I ", 'A', ModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_hoe), "EE ", " I ", " I ", 'E', Items.EMERALD, 'I', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforced_amethyst_spade), "RR ", " O ", " O ", 'R', ModItems.reinforced_amethyst, 'O', Blocks.OBSIDIAN);
		
		// Sapphire Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_helmet), "SSS", "S S", "   ", 'S', ModItems.sapphire);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_chestplate), "S S", "SSS", "SSS", 'S', ModItems.sapphire);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_leggings), "SSS", "S S", "S S", 'S', ModItems.sapphire);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sapphire_boots), "S S", "S S", "   ", 'S', ModItems.sapphire);
		
		// Ruby Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_helmet), "RRR", "R R", "   ", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_chestplate), "R R", "RRR", "RRR", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_leggings), "RRR", "R R", "R R", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ruby_boots), "R R", "R R", "   ", 'R', ModItems.ruby);
		
		// Amethyst Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_helmet), "AAA", "A A", "   ", 'A', ModItems.amethyst);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_chestplate), "A A", "AAA", "AAA", 'A', ModItems.amethyst);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_leggings), "AAA", "A A", "A A", 'A', ModItems.amethyst);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethyst_boots), "A A", "A A", "   ", 'A', ModItems.amethyst);
		
		// Emerald Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_helmet), "EEE", "E E", "   ", 'E', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_chestplate), "E E", "EEE", "EEE", 'E', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_leggings), "EEE", "E E", "E E", 'E', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_boots), "E E", "E E", "   ", 'E', Items.EMERALD);
		
		// Gem Armor
		if(GemCraftConfig.armorEnabled){
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.gem_helmet), "GAG", "G G", "   ", 'G', Items.GOLD_INGOT, 'A', ModItems.armor_core);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.gem_chestplate), "G G", "GAG", "GGG", 'G', Items.GOLD_INGOT, 'A', ModItems.armor_core);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.gem_leggings), "GAG", "G G", "G G", 'G', Items.GOLD_INGOT, 'A', ModItems.armor_core);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.gem_boots), "A A", "G G", "   ", 'G', Items.GOLD_INGOT, 'A', ModItems.reinforced_amethyst);
		}
		
		// Basic Rings
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.basic_ring), "III", "ISI", "III", 'I', Items.IRON_INGOT, 'S', ModItems.sapphire);
		if(GemCraftConfig.torch)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.torch_ring), "GLG", "TRT", "GTG", 'G', Blocks.GLOWSTONE, 'L', Blocks.REDSTONE_LAMP, 'T', Blocks.TORCH, 'R', ModItems.basic_ring);
		if(GemCraftConfig.water)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.water_ring), "PSP", "WRW", "PWP", 'S', ModItems.sapphire, 'R', ModItems.basic_ring, 'P', Items.PRISMARINE_SHARD, 'W', Items.WATER_BUCKET);
		if(GemCraftConfig.lava)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.lava_ring), "FRF", "LBL", "FLF", 'R', ModItems.ruby, 'B', ModItems.basic_ring, 'F', Items.BLAZE_ROD, 'L', Items.LAVA_BUCKET);
		if(GemCraftConfig.Void)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.void_ring), "OTO", "CRC", "OCO", 'O', Blocks.OBSIDIAN, 'T', Blocks.TNT, 'C', Blocks.COBBLESTONE, 'R', ModItems.basic_ring);
		
		// Average Rings
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.average_ring), "GGG", "GRG", "GGG", 'G', Items.GOLD_INGOT, 'R', ModItems.ruby);
		if(GemCraftConfig.lightning)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightning_ring), "BRB", "GAG", "BGB", 'A', ModItems.average_ring, 'G', Items.GUNPOWDER, 'B', Items.BLAZE_POWDER, 'R', ModItems.ruby);
		if(GemCraftConfig.potion){
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.speed_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', speed, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.haste_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', Items.GOLDEN_PICKAXE, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.strength_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', strength, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.jump_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', jump, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.regen_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', regen, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.resistance_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', Items.GOLDEN_CHESTPLATE, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.fresistance_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', fresistance, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.wresistance_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', wresistance, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.nightvision_ring), "PRP", "NAN", "PFP", 'A', ModItems.average_ring, 'P', nightvision, 'R', ModItems.ruby, 'N', Items.NETHER_WART, 'F', Items.FERMENTED_SPIDER_EYE);
		}
			
		// Advanced Rings
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.advanced_ring), "NIN", "NAN", "NNN", 'N', ModItems.whitegold_nugget, 'A', ModItems.amethyst, 'I', ModItems.whitegold_ingot);
		if(GemCraftConfig.time)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.time_ring), "CAC", "DRD", "CDC", 'C', Items.CLOCK, 'A', ModItems.amethyst, 'R', ModItems.advanced_ring, 'D', Items.REDSTONE);
		if(GemCraftConfig.teleport)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.blink_ring), "EAE", "PRP", "EPE", 'E', Items.ENDER_EYE, 'P', Items.ENDER_PEARL, 'A', ModItems.amethyst, 'R', ModItems.advanced_ring);
		if(GemCraftConfig.growth)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.growth_ring), "BAB", "SRS", "BSB", 'S', Blocks.SAPLING, 'B', Items.BONE, 'A', ModItems.amethyst, 'R', ModItems.advanced_ring);
		if(GemCraftConfig.flight)
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.flight_ring), "ANA", "FRF", "FFF", 'N', Items.NETHER_STAR, 'F', Items.FEATHER, 'A', ModItems.amethyst, 'R', ModItems.advanced_ring);
		
		// Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.whitegold_ore, new ItemStack(ModItems.whitegold_nugget), 2.0F);
		GameRegistry.addSmelting(ModBlocks.nether_whitegold_ore, new ItemStack(ModItems.whitegold_nugget), 2.0F);
		GameRegistry.addSmelting(ModBlocks.end_whitegold_ore, new ItemStack(ModItems.whitegold_nugget), 2.0F);
	}
}
