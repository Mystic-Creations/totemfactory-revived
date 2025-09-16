package net.mysticcreations.totemfactory;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = CreateTotemFactory.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = CreateTotemFactory.MODID, value = Dist.CLIENT)
public class CreateTotemFactoryClient {
    public CreateTotemFactoryClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        CreateTotemFactory.LOGGER.info("HELLO FROM CLIENT SETUP");
        CreateTotemFactory.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
