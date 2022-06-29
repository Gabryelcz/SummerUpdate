
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.summerupdate.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SummerupdateModTabs {
	public static CreativeModeTab TAB_SUMMER_UPDATE;

	public static void load() {
		TAB_SUMMER_UPDATE = new CreativeModeTab("tabsummer_update") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SAND);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
