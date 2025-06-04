package net.justmili.totemfactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.justmili.totemfactory.init.TotemFactoryTabs;
import net.justmili.totemfactory.init.TotemFactoryItems;

import net.fabricmc.api.ModInitializer;

public class TotemFactory implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "totemfactory";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Create: Totem Factory...");

		TotemFactoryTabs.load();

		TotemFactoryItems.load();

	}
}
