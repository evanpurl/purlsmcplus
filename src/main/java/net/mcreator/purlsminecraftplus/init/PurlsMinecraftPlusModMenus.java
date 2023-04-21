
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purlsminecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.purlsminecraftplus.world.inventory.BackpacksmallMenu;
import net.mcreator.purlsminecraftplus.world.inventory.BackpackregularMenu;
import net.mcreator.purlsminecraftplus.PurlsMinecraftPlusMod;

public class PurlsMinecraftPlusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PurlsMinecraftPlusMod.MODID);
	public static final RegistryObject<MenuType<BackpacksmallMenu>> BACKPACKSMALL = REGISTRY.register("backpacksmall", () -> IForgeMenuType.create(BackpacksmallMenu::new));
	public static final RegistryObject<MenuType<BackpackregularMenu>> BACKPACKREGULAR = REGISTRY.register("backpackregular", () -> IForgeMenuType.create(BackpackregularMenu::new));
}
