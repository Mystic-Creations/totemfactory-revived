package net.mysticcreations.totemfactory.init;

import net.mysticcreations.totemfactory.TotemFactory;
import net.mysticcreations.totemfactory.item.TotemHead;
import net.mysticcreations.totemfactory.item.TotemHeadCasing;
import net.mysticcreations.totemfactory.item.TotemBody;
import net.mysticcreations.totemfactory.item.TotemBodyCasing;
import net.mysticcreations.totemfactory.item.IncompleteTotemHead;
import net.mysticcreations.totemfactory.item.IncompleteTotemHeadCasing;
import net.mysticcreations.totemfactory.item.IncompleteTotemBody;
import net.mysticcreations.totemfactory.item.IncompleteTotemBodyCasing;
import net.mysticcreations.totemfactory.item.InactiveTotem;

public class TfItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, TotemFactory.MODID);

    public static final RegistryObject<Item> TOTEM_HEAD = REGISTER.register("totem_head", TotemHead::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_HEAD = REGISTER.register("incomplete_totem_head", IncompleteTotemHead::new);
    public static final RegistryObject<Item> TOTEM_HEAD_CASING = REGISTER.register("totem_head_casing", TotemHeadCasing::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_HEAD_CASING = REGISTER.register("incomplete_totem_head_casing", IncompleteTotemHeadCasing::new);
    public static final RegistryObject<Item> TOTEM_BODY = REGISTER.register("totem_body", TotemBody::new);
    public static final RegistryObject<Item> TOTEM_BODY_CASING = REGISTER.register("totem_body_casing", TotemBodyCasing::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_BODY = REGISTER.register("incomplete_totem_body", IncompleteTotemBody::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_BODY_CASING = REGISTER.register("incomplete_totem_body_casing", IncompleteTotemBodyCasing::new);
    public static final RegistryObject<Item> INACTIVE_TOTEM = REGISTER.register("inactive_totem", InactiveTotem::new);
}
