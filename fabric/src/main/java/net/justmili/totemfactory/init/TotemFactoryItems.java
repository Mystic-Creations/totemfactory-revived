/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.justmili.totemfactory.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.justmili.totemfactory.item.TotemHead;
import net.justmili.totemfactory.item.TotemHeadCasing;
import net.justmili.totemfactory.item.TotemBody;
import net.justmili.totemfactory.item.TotemBodyCasing;
import net.justmili.totemfactory.item.IncompleteTotemHead;
import net.justmili.totemfactory.item.IncompleteTotemHeadCasing;
import net.justmili.totemfactory.item.IncompleteTotemBody;
import net.justmili.totemfactory.item.IncompleteTotemBodyCasing;
import net.justmili.totemfactory.item.InactiveTotem;
import net.justmili.totemfactory.TotemFactory;

public class TotemFactoryItems {
	public static Item TOTEM_HEAD;
	public static Item INCOMPLETE_TOTEM_HEAD;
	public static Item TOTEM_HEAD_CASING;
	public static Item INCOMPLETE_TOTEM_HEAD_CASING;
	public static Item TOTEM_BODY;
	public static Item TOTEM_BODY_CASING;
	public static Item INCOMPLETE_TOTEM_BODY;
	public static Item INCOMPLETE_TOTEM_BODY_CASING;
	public static Item INACTIVE_TOTEM;

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

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TotemFactory.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
