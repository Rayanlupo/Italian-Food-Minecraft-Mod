package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.rayandev.specialtridents.SpecialTridents;
import net.rayandev.specialtridents.item.custom.FireTridentItem;

public class ModItems {

    // Define item group key
    public static final RegistryKey<ItemGroup> TRIDENTS_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(SpecialTridents.MOD_ID, "item_group")
    );

    // Register Fire Trident item
    public static final Item FIRE_TRIDENT = new FireTridentItem(new Item.Settings()
            .rarity(Rarity.RARE)
            .maxDamage(250)
    );

    public static void registerModItems() {
        // Log registration
        SpecialTridents.LOGGER.info("Registering Mod Items for " + SpecialTridents.MOD_ID);

        // Register the Fire Trident item
        Registry.register(Registries.ITEM,Identifier.of(SpecialTridents.MOD_ID, "fire_trident"), FIRE_TRIDENT);

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
