package net.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TotemBodyCasing extends Item {
	public TotemBodyCasing() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
