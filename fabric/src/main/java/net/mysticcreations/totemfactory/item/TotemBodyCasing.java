package net.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.mysticcreations.totemfactory.init.Tabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TotemBodyCasing extends Item {
	public TotemBodyCasing() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
		ItemGroupEvents.modifyEntriesEvent(Tabs.TAB_TOTEM_FACTORY).register(content -> content.accept(this));
	}
}
