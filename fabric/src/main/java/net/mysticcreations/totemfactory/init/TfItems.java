package net.mysticcreations.totemfactory.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mysticcreations.totemfactory.item.TotemHead;
import net.mysticcreations.totemfactory.item.TotemHeadCasing;
import net.mysticcreations.totemfactory.item.TotemBody;
import net.mysticcreations.totemfactory.item.TotemBodyCasing;
import net.mysticcreations.totemfactory.item.IncompleteTotemHead;
import net.mysticcreations.totemfactory.item.IncompleteTotemHeadCasing;
import net.mysticcreations.totemfactory.item.IncompleteTotemBody;
import net.mysticcreations.totemfactory.item.IncompleteTotemBodyCasing;
import net.mysticcreations.totemfactory.item.InactiveTotem;
import net.mysticcreations.totemfactory.TotemFactory;

public class TfItems {
	public static Item INACTIVE_TOTEM;
	public static Item TOTEM_HEAD;
	public static Item TOTEM_BODY;
	public static Item INCOMPLETE_TOTEM_BODY;
	public static Item INCOMPLETE_TOTEM_HEAD;
	public static Item TOTEM_HEAD_CASING;
	public static Item TOTEM_BODY_CASING;
	public static Item INCOMPLETE_TOTEM_HEAD_CASING;
	public static Item INCOMPLETE_TOTEM_BODY_CASING;

	public static void load() {
		TOTEM_HEAD = register("totem_head", new TotemHead());
		INCOMPLETE_TOTEM_HEAD = register("incomplete_totem_head", new IncompleteTotemHead());
		TOTEM_HEAD_CASING = register("totem_head_casing", new TotemHeadCasing());
		INCOMPLETE_TOTEM_HEAD_CASING = register("incomplete_totem_head_casing", new IncompleteTotemHeadCasing());
		TOTEM_BODY = register("totem_body", new TotemBody());
		TOTEM_BODY_CASING = register("totem_body_casing", new TotemBodyCasing());
		INCOMPLETE_TOTEM_BODY = register("incomplete_totem_body", new IncompleteTotemBody());
		INCOMPLETE_TOTEM_BODY_CASING = register("incomplete_totem_body_casing", new IncompleteTotemBodyCasing());
		INACTIVE_TOTEM = register("inactive_totem", new InactiveTotem());
	}

	public static void clientLoad() {}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.parse(TotemFactory.MODID+":"+registryName), item);
	}
}
