package net.mysticcreations.totemfactory;

import net.mysticcreations.totemfactory.init.TfItems;
import net.mysticcreations.totemfactory.init.TfTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod("totemfactory")
public class TotemFactory {
	public static final Logger LOGGER = LogManager.getLogger(TotemFactory.class);
	public static final String MODID = "totemfactory";

	public TotemFactory(FMLJavaModLoadingContext modContext) {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus EVENT_BUS = modContext.getModEventBus();

		TfItems.REGISTER.register(EVENT_BUS);
		TfTabs.REGISTER.register(EVENT_BUS);
	}
}
