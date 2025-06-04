package net.justmili.totemfactory.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.justmili.totemfactory.init.TotemFactoryTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class TotemBody extends Item {
	public TotemBody() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
		ItemGroupEvents.modifyEntriesEvent(TotemFactoryTabs.TAB_TOTEM_FACTORY).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
