
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purlsminecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.purlsminecraftplus.item.StoneArmorItem;
import net.mcreator.purlsminecraftplus.item.MinershelmetItem;
import net.mcreator.purlsminecraftplus.item.FlightshoesItem;
import net.mcreator.purlsminecraftplus.item.BackpackitemsmallItem;
import net.mcreator.purlsminecraftplus.item.BackpackitemregularItem;
import net.mcreator.purlsminecraftplus.PurlsMinecraftPlusMod;

public class PurlsMinecraftPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PurlsMinecraftPlusMod.MODID);
	public static final RegistryObject<Item> BACKPACKITEMSMALL = REGISTRY.register("backpackitemsmall", () -> new BackpackitemsmallItem());
	public static final RegistryObject<Item> BACKPACKITEMREGULAR = REGISTRY.register("backpackitemregular", () -> new BackpackitemregularItem());
	public static final RegistryObject<Item> STONE_ARMOR_HELMET = REGISTRY.register("stone_armor_helmet", () -> new StoneArmorItem.Helmet());
	public static final RegistryObject<Item> STONE_ARMOR_CHESTPLATE = REGISTRY.register("stone_armor_chestplate", () -> new StoneArmorItem.Chestplate());
	public static final RegistryObject<Item> STONE_ARMOR_LEGGINGS = REGISTRY.register("stone_armor_leggings", () -> new StoneArmorItem.Leggings());
	public static final RegistryObject<Item> STONE_ARMOR_BOOTS = REGISTRY.register("stone_armor_boots", () -> new StoneArmorItem.Boots());
	public static final RegistryObject<Item> MINERSHELMET_HELMET = REGISTRY.register("minershelmet_helmet", () -> new MinershelmetItem.Helmet());
	public static final RegistryObject<Item> FLIGHTSHOES_BOOTS = REGISTRY.register("flightshoes_boots", () -> new FlightshoesItem.Boots());
}
