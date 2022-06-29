
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.summerupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.summerupdate.item.SnorkelsItem;
import net.mcreator.summerupdate.item.FinsItem;
import net.mcreator.summerupdate.SummerupdateMod;

public class SummerupdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SummerupdateMod.MODID);
	public static final RegistryObject<Item> CRAB = REGISTRY.register("crab_spawn_egg", () -> new ForgeSpawnEggItem(SummerupdateModEntities.CRAB,
			-26368, -3394816, new Item.Properties().tab(SummerupdateModTabs.TAB_SUMMER_UPDATE)));
	public static final RegistryObject<Item> SNORKELS_HELMET = REGISTRY.register("snorkels_helmet", () -> new SnorkelsItem.Helmet());
	public static final RegistryObject<Item> FINS_BOOTS = REGISTRY.register("fins_boots", () -> new FinsItem.Boots());
}
