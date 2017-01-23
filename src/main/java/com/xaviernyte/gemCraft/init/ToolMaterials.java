package com.xaviernyte.gemCraft.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterials {

		public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 1500, 10.0F, 3.5F, 20);
		public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 750, 12.0F, 3.5F, 5);
		public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 2000, 10.0F, 5.0F, 10);
		public static ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 3, 4000, 15.0F, 8.0F, 25);
		public static ToolMaterial REINFORCED = EnumHelper.addToolMaterial("REINFORCED", 3, 8000, 20.0F, 15.0F, 50);
}
