package com.xaviernyte.gemCraft.init;

import com.xaviernyte.gemCraft.items.ItemAmethyst;
import com.xaviernyte.gemCraft.items.ItemModArmor;
import com.xaviernyte.gemCraft.items.ItemModAxe;
import com.xaviernyte.gemCraft.items.ItemModHoe;
import com.xaviernyte.gemCraft.items.ItemModMaterials;
import com.xaviernyte.gemCraft.items.ItemModPickaxe;
import com.xaviernyte.gemCraft.items.ItemModSpade;
import com.xaviernyte.gemCraft.items.ItemModSword;
import com.xaviernyte.gemCraft.items.ItemRing;
import com.xaviernyte.gemCraft.items.ItemRuby;
import com.xaviernyte.gemCraft.items.ItemSapphire;
import com.xaviernyte.gemCraft.items.advancedRings.ItemBlinkRing;
import com.xaviernyte.gemCraft.items.advancedRings.ItemFlightRing;
import com.xaviernyte.gemCraft.items.advancedRings.ItemGrowthRing;
import com.xaviernyte.gemCraft.items.advancedRings.ItemTimeRing;
import com.xaviernyte.gemCraft.items.averageRings.ItemLightningRing;
import com.xaviernyte.gemCraft.items.averageRings.ItemPotionRing;
import com.xaviernyte.gemCraft.items.basicRings.ItemLavaRing;
import com.xaviernyte.gemCraft.items.basicRings.ItemTorchRing;
import com.xaviernyte.gemCraft.items.basicRings.ItemVoidRing;
import com.xaviernyte.gemCraft.items.basicRings.ItemWaterRing;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static CreativeTabs RINGS = new CreativeTabs("Rings"){
	    @Override 
	    public Item getTabIconItem() {
	        return ModItems.average_ring;
	    }
	};
	
	
	// Basic Items
	public static Item sapphire;
	public static Item ruby;
	public static Item amethyst;
	public static Item whitegold_ingot;
	public static Item whitegold_nugget;
	public static Item reinforced_amethyst;
	public static Item armor_core;
	
	// Swords
	public static Item sapphire_sword;
	public static Item ruby_sword;
	public static Item amethyst_sword;
	public static Item emerald_sword;
	public static Item reinforced_amethyst_sword;
	
	// Pickaxes
	public static Item sapphire_pickaxe;
	public static Item ruby_pickaxe;
	public static Item amethyst_pickaxe;
	public static Item emerald_pickaxe;
	public static Item reinforced_amethyst_pickaxe;
	
	// Axes
	public static Item sapphire_axe;
	public static Item ruby_axe;
	public static Item amethyst_axe;
	public static Item emerald_axe;
	public static Item reinforced_amethyst_axe;
	
	// Shovels
	public static Item sapphire_spade;
	public static Item ruby_spade;
	public static Item amethyst_spade;
	public static Item emerald_spade;
	public static Item reinforced_amethyst_spade;
	
	// Hoes
	public static Item sapphire_hoe;
	public static Item ruby_hoe;
	public static Item amethyst_hoe;
	public static Item emerald_hoe;
	public static Item reinforced_amethyst_hoe;
	
	// Sapphire Armor
	public static ItemArmor sapphire_helmet;
	public static ItemArmor sapphire_chestplate;
	public static ItemArmor sapphire_leggings;
	public static ItemArmor sapphire_boots;
	
	// Ruby Armor
	public static ItemArmor ruby_helmet;
	public static ItemArmor ruby_chestplate;
	public static ItemArmor ruby_leggings;
	public static ItemArmor ruby_boots;
	
	// Amethyst Armor
	public static ItemArmor amethyst_helmet;
	public static ItemArmor amethyst_chestplate;
	public static ItemArmor amethyst_leggings;
	public static ItemArmor amethyst_boots;
	
	// Emerald Armor
	public static ItemArmor emerald_helmet;
	public static ItemArmor emerald_chestplate;
	public static ItemArmor emerald_leggings;
	public static ItemArmor emerald_boots;
	
	// Gem Armor
	public static ItemArmor gem_helmet;
	public static ItemArmor gem_chestplate;
	public static ItemArmor gem_leggings;
	public static ItemArmor gem_boots;

	// Basic rings
	public static Item basic_ring;
	public static Item torch_ring;
	public static Item water_ring;
	public static Item lava_ring;
	public static Item void_ring;
	
	// Average rings
	public static Item average_ring;
	public static Item lightning_ring;
	public static Item speed_ring;
	public static Item haste_ring;
	public static Item strength_ring;
	public static Item jump_ring;
	public static Item regen_ring;
	public static Item resistance_ring;
	public static Item fresistance_ring;
	public static Item wresistance_ring;
	public static Item nightvision_ring;
	public static Item growth_ring;
	
	// Advanced rings
	public static Item advanced_ring;
	public static Item blink_ring;
	public static Item flight_ring;
	public static Item time_ring;
	
	public static void init(){
		sapphire = new ItemSapphire();
		ruby = new ItemRuby();
		amethyst = new ItemAmethyst();
		whitegold_ingot = new ItemModMaterials("whitegold_ingot");
		whitegold_nugget = new ItemModMaterials("whitegold_nugget");
		reinforced_amethyst = new ItemModMaterials("reinforced_amethyst");
		armor_core = new ItemModMaterials("armor_core");
		
		sapphire_sword = new ItemModSword("sapphire_sword", ToolMaterials.SAPPHIRE);
		ruby_sword = new ItemModSword("ruby_sword", ToolMaterials.RUBY);
		amethyst_sword = new ItemModSword("amethyst_sword", ToolMaterials.AMETHYST);
		emerald_sword = new ItemModSword("emerald_sword", ToolMaterials.EMERALD);
		reinforced_amethyst_sword = new ItemModSword("reinforced_amethyst_sword", ToolMaterials.REINFORCED);
		
		sapphire_pickaxe = new ItemModPickaxe("sapphire_pickaxe", ToolMaterials.SAPPHIRE);
		ruby_pickaxe = new ItemModPickaxe("ruby_pickaxe", ToolMaterials.RUBY);
		amethyst_pickaxe = new ItemModPickaxe("amethyst_pickaxe", ToolMaterials.AMETHYST);
		emerald_pickaxe = new ItemModPickaxe("emerald_pickaxe", ToolMaterials.EMERALD);
		reinforced_amethyst_pickaxe = new ItemModPickaxe("reinforced_amethyst_pickaxe", ToolMaterials.REINFORCED);
		
		sapphire_axe = new ItemModAxe("sapphire_axe", ToolMaterials.SAPPHIRE);
		ruby_axe = new ItemModAxe("ruby_axe", ToolMaterials.RUBY);
		amethyst_axe = new ItemModAxe("amethyst_axe", ToolMaterials.AMETHYST);
		emerald_axe = new ItemModAxe("emerald_axe", ToolMaterials.EMERALD);
		reinforced_amethyst_axe = new ItemModAxe("reinforced_amethyst_axe", ToolMaterials.REINFORCED);
		
		sapphire_spade = new ItemModSpade("sapphire_spade", ToolMaterials.SAPPHIRE);
		ruby_spade = new ItemModSpade("ruby_spade", ToolMaterials.RUBY);
		amethyst_spade = new ItemModSpade("amethyst_spade", ToolMaterials.AMETHYST);
		emerald_spade = new ItemModSpade("emerald_spade", ToolMaterials.EMERALD);
		reinforced_amethyst_spade = new ItemModSpade("reinforced_amethyst_spade", ToolMaterials.REINFORCED);
		
		sapphire_hoe = new ItemModHoe("sapphire_hoe", ToolMaterials.SAPPHIRE);
		ruby_hoe = new ItemModHoe("ruby_hoe", ToolMaterials.RUBY);
		amethyst_hoe = new ItemModHoe("amethyst_hoe", ToolMaterials.AMETHYST);
		emerald_hoe = new ItemModHoe("emerald_hoe", ToolMaterials.EMERALD);
		reinforced_amethyst_hoe = new ItemModHoe("reinforced_amethyst_hoe", ToolMaterials.REINFORCED);
		
		sapphire_helmet = new ItemModArmor("sapphire_helmet", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.HEAD);
		sapphire_chestplate = new ItemModArmor("sapphire_chestplate", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.CHEST);
		sapphire_leggings = new ItemModArmor("sapphire_leggings", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.LEGS);
		sapphire_boots = new ItemModArmor("sapphire_boots", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.FEET);
		
		ruby_helmet = new ItemModArmor("ruby_helmet", ArmorMaterials.RUBY, EntityEquipmentSlot.HEAD);
		ruby_chestplate = new ItemModArmor("ruby_chestplate", ArmorMaterials.RUBY, EntityEquipmentSlot.CHEST);
		ruby_leggings = new ItemModArmor("ruby_leggings", ArmorMaterials.RUBY, EntityEquipmentSlot.LEGS);
		ruby_boots = new ItemModArmor("ruby_boots", ArmorMaterials.RUBY, EntityEquipmentSlot.FEET);
		
		amethyst_helmet = new ItemModArmor("amethyst_helmet", ArmorMaterials.AMETHYST, EntityEquipmentSlot.HEAD);
		amethyst_chestplate = new ItemModArmor("amethyst_chestplate", ArmorMaterials.AMETHYST, EntityEquipmentSlot.CHEST);
		amethyst_leggings = new ItemModArmor("amethyst_leggings", ArmorMaterials.AMETHYST, EntityEquipmentSlot.LEGS);
		amethyst_boots = new ItemModArmor("amethyst_boots", ArmorMaterials.AMETHYST, EntityEquipmentSlot.FEET);
		
		emerald_helmet = new ItemModArmor("emerald_helmet", ArmorMaterials.EMERALD, EntityEquipmentSlot.HEAD);
		emerald_chestplate = new ItemModArmor("emerald_chestplate", ArmorMaterials.EMERALD, EntityEquipmentSlot.CHEST);
		emerald_leggings = new ItemModArmor("emerald_leggings", ArmorMaterials.EMERALD, EntityEquipmentSlot.LEGS);
		emerald_boots = new ItemModArmor("emerald_boots", ArmorMaterials.EMERALD, EntityEquipmentSlot.FEET);
		
		gem_helmet = new ItemModArmor("gem_helmet", ArmorMaterials.GEM, EntityEquipmentSlot.HEAD);
		gem_chestplate = new ItemModArmor("gem_chestplate", ArmorMaterials.GEM, EntityEquipmentSlot.CHEST);
		gem_leggings = new ItemModArmor("gem_leggings", ArmorMaterials.GEM, EntityEquipmentSlot.LEGS);
		gem_boots = new ItemModArmor("gem_boots", ArmorMaterials.GEM, EntityEquipmentSlot.FEET);
		
		basic_ring = new ItemRing("basic_ring");
		average_ring = new ItemRing("average_ring");
		advanced_ring = new ItemRing("advanced_ring");
		
		// Basic Rings
		torch_ring = new ItemTorchRing("torch_ring");
		water_ring = new ItemWaterRing("water_ring");
		lava_ring = new ItemLavaRing("lava_ring");
		void_ring = new ItemVoidRing("void_ring");
		
		// Average Rings
		lightning_ring = new ItemLightningRing("lightning_ring");
		speed_ring = new ItemPotionRing("speed_ring");
		haste_ring = new ItemPotionRing("haste_ring");
		strength_ring = new ItemPotionRing("strength_ring");
		jump_ring = new ItemPotionRing("jump_ring");
		regen_ring = new ItemPotionRing("regen_ring");
		resistance_ring = new ItemPotionRing("resistance_ring");
		fresistance_ring = new ItemPotionRing("fresistance_ring");
		wresistance_ring = new ItemPotionRing("wresistance_ring");
		nightvision_ring = new ItemPotionRing("nightvision_ring");
		growth_ring = new ItemGrowthRing("growth_ring");
		
		// Advanced Rings
		blink_ring = new ItemBlinkRing("blink_ring");
		flight_ring = new ItemFlightRing("flight_ring");
		time_ring = new ItemTimeRing("time_ring");
		
	}
	
	public static void register(){
		GameRegistry.register(sapphire);
		GameRegistry.register(ruby);
		GameRegistry.register(amethyst);
		GameRegistry.register(whitegold_ingot);
		GameRegistry.register(whitegold_nugget);
		GameRegistry.register(reinforced_amethyst);
		GameRegistry.register(armor_core);
		
		GameRegistry.register(sapphire_sword);
		GameRegistry.register(ruby_sword);
		GameRegistry.register(amethyst_sword);
		GameRegistry.register(emerald_sword);
		GameRegistry.register(reinforced_amethyst_sword);
		
		GameRegistry.register(sapphire_pickaxe);
		GameRegistry.register(ruby_pickaxe);
		GameRegistry.register(amethyst_pickaxe);
		GameRegistry.register(emerald_pickaxe);
		GameRegistry.register(reinforced_amethyst_pickaxe);
		
		GameRegistry.register(sapphire_axe);
		GameRegistry.register(ruby_axe);
		GameRegistry.register(amethyst_axe);
		GameRegistry.register(emerald_axe);
		GameRegistry.register(reinforced_amethyst_axe);
		
		GameRegistry.register(sapphire_spade);
		GameRegistry.register(ruby_spade);
		GameRegistry.register(amethyst_spade);
		GameRegistry.register(emerald_spade);
		GameRegistry.register(reinforced_amethyst_spade);
		
		GameRegistry.register(sapphire_hoe);
		GameRegistry.register(ruby_hoe);
		GameRegistry.register(amethyst_hoe);
		GameRegistry.register(emerald_hoe);
		GameRegistry.register(reinforced_amethyst_hoe);
		
		GameRegistry.register(sapphire_helmet);
		GameRegistry.register(sapphire_chestplate);
		GameRegistry.register(sapphire_leggings);
		GameRegistry.register(sapphire_boots);
		
		GameRegistry.register(ruby_helmet);
		GameRegistry.register(ruby_chestplate);
		GameRegistry.register(ruby_leggings);
		GameRegistry.register(ruby_boots);
		
		GameRegistry.register(amethyst_helmet);
		GameRegistry.register(amethyst_chestplate);
		GameRegistry.register(amethyst_leggings);
		GameRegistry.register(amethyst_boots);
		
		GameRegistry.register(emerald_helmet);
		GameRegistry.register(emerald_chestplate);
		GameRegistry.register(emerald_leggings);
		GameRegistry.register(emerald_boots);
		
		GameRegistry.register(gem_helmet);
		GameRegistry.register(gem_chestplate);
		GameRegistry.register(gem_leggings);
		GameRegistry.register(gem_boots);
		
		GameRegistry.register(basic_ring);
		GameRegistry.register(average_ring);
		GameRegistry.register(advanced_ring);
		
		GameRegistry.register(torch_ring);
		GameRegistry.register(water_ring);
		GameRegistry.register(lava_ring);
		GameRegistry.register(void_ring);
		
		GameRegistry.register(lightning_ring);
		GameRegistry.register(speed_ring);
		GameRegistry.register(haste_ring);
		GameRegistry.register(strength_ring);
		GameRegistry.register(jump_ring);
		GameRegistry.register(regen_ring);
		GameRegistry.register(resistance_ring);
		GameRegistry.register(fresistance_ring);
		GameRegistry.register(wresistance_ring);
		GameRegistry.register(nightvision_ring);
		GameRegistry.register(growth_ring);
		
		GameRegistry.register(blink_ring);
		GameRegistry.register(flight_ring);
		GameRegistry.register(time_ring);
		
	}
	
	public static void registerRenders(){
		registerRender(sapphire);
		registerRender(ruby);
		registerRender(amethyst);
		registerRender(whitegold_ingot);
		registerRender(whitegold_nugget);
		registerRender(reinforced_amethyst);
		registerRender(armor_core);
		
		registerRender(sapphire_sword);
		registerRender(ruby_sword);
		registerRender(amethyst_sword);
		registerRender(emerald_sword);
		registerRender(reinforced_amethyst_sword);
		
		registerRender(sapphire_pickaxe);
		registerRender(ruby_pickaxe);
		registerRender(amethyst_pickaxe);
		registerRender(emerald_pickaxe);
		registerRender(reinforced_amethyst_pickaxe);
		
		registerRender(sapphire_axe);
		registerRender(ruby_axe);
		registerRender(amethyst_axe);
		registerRender(emerald_axe);
		registerRender(reinforced_amethyst_axe);
		
		registerRender(sapphire_spade);
		registerRender(ruby_spade);
		registerRender(amethyst_spade);
		registerRender(emerald_spade);
		registerRender(reinforced_amethyst_spade);
		
		registerRender(sapphire_hoe);
		registerRender(ruby_hoe);
		registerRender(amethyst_hoe);
		registerRender(emerald_hoe);
		registerRender(reinforced_amethyst_hoe);
		
		registerRender(sapphire_helmet);
		registerRender(sapphire_chestplate);
		registerRender(sapphire_leggings);
		registerRender(sapphire_boots);
		
		registerRender(ruby_helmet);
		registerRender(ruby_chestplate);
		registerRender(ruby_leggings);
		registerRender(ruby_boots);
		
		registerRender(amethyst_helmet);
		registerRender(amethyst_chestplate);
		registerRender(amethyst_leggings);
		registerRender(amethyst_boots);
		
		registerRender(emerald_helmet);
		registerRender(emerald_chestplate);
		registerRender(emerald_leggings);
		registerRender(emerald_boots);
		
		registerRender(gem_helmet);
		registerRender(gem_chestplate);
		registerRender(gem_leggings);
		registerRender(gem_boots);
		
		registerRender(basic_ring);
		registerRender(average_ring);
		registerRender(advanced_ring);
		
		registerRender(torch_ring);
		registerRender(water_ring);
		registerRender(lava_ring);
		registerRender(void_ring);
		
		registerRender(lightning_ring);
		registerRender(speed_ring);
		registerRender(haste_ring);
		registerRender(strength_ring);
		registerRender(jump_ring);
		registerRender(regen_ring);
		registerRender(resistance_ring);
		registerRender(fresistance_ring);
		registerRender(wresistance_ring);
		registerRender(nightvision_ring);
		registerRender(growth_ring);
		
		registerRender(blink_ring);
		registerRender(flight_ring);
		registerRender(time_ring);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
