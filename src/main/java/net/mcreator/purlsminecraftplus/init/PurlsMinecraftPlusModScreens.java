
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purlsminecraftplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.purlsminecraftplus.client.gui.BackpacksmallScreen;
import net.mcreator.purlsminecraftplus.client.gui.BackpackregularScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PurlsMinecraftPlusModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PurlsMinecraftPlusModMenus.BACKPACKSMALL.get(), BackpacksmallScreen::new);
			MenuScreens.register(PurlsMinecraftPlusModMenus.BACKPACKREGULAR.get(), BackpackregularScreen::new);
		});
	}
}
