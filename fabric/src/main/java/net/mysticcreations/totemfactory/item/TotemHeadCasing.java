package net.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TotemHeadCasing extends Item {
	public TotemHeadCasing() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
