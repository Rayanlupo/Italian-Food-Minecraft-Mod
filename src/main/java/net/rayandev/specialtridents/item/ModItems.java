package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
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
    public static final RegistryKey<ItemGroup> TRIDENTS_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(SpecialTridents.MOD_ID, "item_group")
    );


    public static final Item FIRE_TRIDENT = register(new Item(new Item.Settings()
            .rarity(Rarity.RARE)
            .maxDamage(250)
            .attributeModifiers(TridentItem.createAttributeModifiers())
            .component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
            .enchantable(1)
    .maxCount(1)
            .fireproof()
            .registryKey(TRIDENT_KEY)), TRIDENT_KEY);




    public static void registerModItems() {
        Identifier id = Identifier.of("specialtridents", "fire_trident");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = new Item.Settings().registryKey(key);

        // Log registration
        SpecialTridents.LOGGER.info("Registering Mod Items for " + SpecialTridents.MOD_ID);



        // Register item group
        ItemGroup tridents = FabricItemGroup.builder()
                .icon(() -> new ItemStack(FIRE_TRIDENT)) // FIRE_TRIDENT is now already registered
                .displayName(Text.translatable("itemGroup.specialtridents"))
                .build();

        Registry.register(Registries.ITEM_GROUP, TRIDENTS_GROUP_KEY, tridents);

        // Add items to the custom item group
        ItemGroupEvents.modifyEntriesEvent(TRIDENTS_GROUP_KEY).register(entries -> {
            entries.add(FIRE_TRIDENT);
        });

    }
}
