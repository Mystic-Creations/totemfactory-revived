package net.mysticcreations.totemfactory;

import net.mysticcreations.totemfactory.init.TfItems;
import net.mysticcreations.totemfactory.init.TfTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod("totemfactory")
public class TotemFactory {
	public static final Logger LOGGER = LogManager.getLogger(TotemFactory.class);
	public static final String MODID = "totemfactory";

	public TotemFactory(IEventBus modBus) {
		NeoForge

		// register DeferredRegister objects to the mod's event bus
		TfItems.REGISTER.register(modEventBus);
		TfTabs.REGISTER.register(modEventBus);
	}
}
