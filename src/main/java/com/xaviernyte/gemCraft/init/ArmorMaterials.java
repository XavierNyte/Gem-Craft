package com.xaviernyte.gemCraft.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {

	public static ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial("SAPPHIRE", "gemcraft:sapphire", 20, new int[]{2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
	public static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", "gemcraft:ruby", 30, new int[]{3, 5, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
	public static ArmorMaterial AMETHYST = EnumHelper.addArmorMaterial("AMETHYST", "gemcraft:amethyst", 60, new int[]{3, 6, 8, 3}, 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3);
	public static ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", "gemcraft:emerald", 33, new int[]{3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
	public static ArmorMaterial GEM = EnumHelper.addArmorMaterial("GEM", "gemcraft:gem", 100, new int[]{4, 6, 8, 4}, 45, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
}
