package net.mysticcreations.totemfactory;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mysticcreations.totemfactory.init.TfItems;
import net.mysticcreations.totemfactory.init.TfTabs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;

@Mod("totemfactory")
public class TotemFactory {
	public static final Logger LOGGER = LogManager.getLogger(TotemFactory.class);
	public static final String MODID = "totemfactory";

	public TotemFactory() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		TfItems.REGISTER.register(modEventBus);
		TfTabs.REGISTER.register(modEventBus);
	}
}
