package net.mysticcreations.totemfactory.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.justmili.trueend.TrueEnd;

public class TfTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrueEnd.MODID);
    public static final RegistryObject<CreativeModeTab> TRUE_END = REGISTRY.register("true_end",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.true_end.true_end")).icon(() -> new ItemStack(Blocks.GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
                tabData.accept(TfItems.ITEM.get());
            }).withSearchBar().build()
    );
}
