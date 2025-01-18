package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.SpecialTridents;

import static net.minecraft.registry.Registry.register;


public class ModItems {

    public static final RegistryKey<ItemGroup> TRIDENTS_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(SpecialTridents.MOD_ID, "item_group"));
    public static final ItemGroup TRIDENTS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.FIRE_TRIDENT))
            .displayName(Text.translatable("itemGroup.special-tridents"))
            .build();

// Register items to the custom item group.
ItemGroupEvents.modifyEntriesEvent(TRIDENTS_GROUP_KEY).register(itemGroup -> {
        itemGroup.add(ModItems.FIRE_TRIDENT);

    });
    public static final ModToolMaterials FIRE_TRIDENT_TOOL_MATERIAL = new ModToolMaterials.FIRE_TRIDENT (
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561,
            2.0F,
            3.0F,
            10,
            EMPTY
    );
    public static final RegistryKey<Item> FIRE_TRIDENT_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpecialTridents.MOD_ID, "fire_trident"));
public static final Item FIRE_TRIDENT = register(new SwordItem(FIRE_TRIDENT_TOOL_MATERIAL, 1f, 1f, new Item.Settings().registryKey(FIRE_TRIDENT_KEY)), FIRE_TRIDENT_KEY);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpecialTridents.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpecialTridents.LOGGER.info("Registering Mod items for..." + SpecialTridents.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FIRE_TRIDENT);
        } );
    }

}
