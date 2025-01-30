package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.rayandev.specialtridents.SpecialTridents;


public class ModItems {


        public static Item register(Item item, RegistryKey<Item> registryKey) {
            Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
            return registeredItem;
        }

    public static final RegistryKey<Item> TRIDENT_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpecialTridents.MOD_ID, "fire_trident"));






    public static void registerModItems() {
        Item FIRE_TRIDENT = register(new Item(new Item.Settings()
                .rarity(Rarity.RARE)
                .maxDamage(250)
                .attributeModifiers(TridentItem.createAttributeModifiers())
                .component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
                .enchantable(1)
                .maxCount(1)
                .fireproof()
                .registryKey(TRIDENT_KEY)), TRIDENT_KEY);


        Identifier id = Identifier.of("specialtridents", "fire_trident");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(TRIDENT_KEY);




        SpecialTridents.LOGGER.info("Registering Mod Items for " + SpecialTridents.MOD_ID);







        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FIRE_TRIDENT);
        });

    }
}
