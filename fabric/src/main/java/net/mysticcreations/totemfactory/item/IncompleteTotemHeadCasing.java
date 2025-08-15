package net.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.mysticcreations.totemfactory.init.TfTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class IncompleteTotemHeadCasing extends Item {
	public IncompleteTotemHeadCasing() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
		ItemGroupEvents.modifyEntriesEvent(TfTabs.TAB_TOTEM_FACTORY).register(content -> content.accept(this));
	}
}
