package net.mysticcreations.totemfactory;

import net.mysticcreations.totemfactory.init.TfItems;
import net.mysticcreations.totemfactory.init.TfTabs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;

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
