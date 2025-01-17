package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.SpecialTridents;

import static net.minecraft.registry.Registry.register;

public class SpecialTridentsItem {

    public static final Item FIRE_TRIDENT = registerItem("fire_trident", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpecialTridents.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpecialTridents.LOGGER.info("Registering Mod items for..." + SpecialTridents.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FIRE_TRIDENT);
        } );
    }

}
