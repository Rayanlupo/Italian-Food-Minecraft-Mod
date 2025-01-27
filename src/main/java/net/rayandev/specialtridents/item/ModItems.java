package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.TridentItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.rayandev.specialtridents.SpecialTridents;
import net.rayandev.specialtridents.item.custom.FireTridentItem;

import static net.minecraft.item.Items.register;

public class ModItems {



    public static void registerModItems() {
        SpecialTridents.LOGGER.info("Registering Mod Items for " + SpecialTridents.MOD_ID);

        // Add FIRE_TRIDENT to TRIDENTS group
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.TRIDENTS).register(entries -> {
            entries.add(FIRE_TRIDENT);
        });
    }

public static final Item FIRE_TRIDENT = register(
        "trident",
        TridentItem::new,
        new Item.Settings()
                .rarity(Rarity.RARE)
                .maxDamage(250)
                .attributeModifiers(TridentItem.createAttributeModifiers())
                .component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
                .enchantable(1)
);}