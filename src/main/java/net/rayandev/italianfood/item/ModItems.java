package net.rayandev.italianfood.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.rayandev.italianfood.ItalianFood;
import net.rayandev.italianfood.item.custom.*;

import java.util.List;


public class ModItems {
    public static final ConsumableComponent PIZZA_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 3), 1.0f))
            .build();
    public static final ConsumableComponent MOZZARELLA_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent TARALLO_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 60 * 20, 1), 1.0f))
            .build();
    public static final ConsumableComponent FOCACCIA_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 60 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent ESPRESSO_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent TIRAMISU_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 60 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent GRISSINO_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 30 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent LASAGNA_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 90 * 20, 2), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 90 * 20, 2), 1.0f))
            .build();

    public static final FoodComponent POISON_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .build();

        public static Item register(Item item, RegistryKey<Item> registryKey) {
            Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
            return registeredItem;
        }

    public static final RegistryKey<Item> PIZZA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "pizza"));
    public static final Item PIZZA = register(
            new PizzaItem(new Item.Settings().registryKey(PIZZA_KEY).food(POISON_FOOD_COMPONENT, PIZZA_FOOD_CONSUMABLE_COMPONENT)),
            PIZZA_KEY
    );
    public static final RegistryKey<Item> LASAGNA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "lasagna"));
    public static final Item LASAGNA = register(
            new LasagnaItem(new Item.Settings().registryKey(LASAGNA_KEY).food(POISON_FOOD_COMPONENT, LASAGNA_FOOD_CONSUMABLE_COMPONENT)),
            LASAGNA_KEY
    );
    public static final RegistryKey<Item> FOCACCIA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "focaccia"));
    public static final Item FOCACCIA = register(
            new FocacciaItem(new Item.Settings().registryKey(FOCACCIA_KEY).food(POISON_FOOD_COMPONENT, FOCACCIA_FOOD_CONSUMABLE_COMPONENT)),
            FOCACCIA_KEY
    );
    public static final RegistryKey<Item> MOZZARELLA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "mozzarella"));
    public static final Item MOZZARELLA = register(
            new MozzarellaItem(new Item.Settings().registryKey(MOZZARELLA_KEY).food(POISON_FOOD_COMPONENT, MOZZARELLA_FOOD_CONSUMABLE_COMPONENT)),
            MOZZARELLA_KEY
    );
    public static final RegistryKey<Item> GRISSINO_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "grissino"));
    public static final Item GRISSINO = register(
            new GrissinoItem(new Item.Settings().registryKey(GRISSINO_KEY).food(POISON_FOOD_COMPONENT, GRISSINO_FOOD_CONSUMABLE_COMPONENT)),
            GRISSINO_KEY
    );
    public static final RegistryKey<Item> TARALLO_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "tarallo"));
    public static final Item TARALLO = register(
            new TaralloItem(new Item.Settings().registryKey(TARALLO_KEY).food(POISON_FOOD_COMPONENT, TARALLO_FOOD_CONSUMABLE_COMPONENT)),
            TARALLO_KEY
    );

    public static final RegistryKey<Item> ESPRESSO_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "espresso"));
    public static final Item ESPRESSO = register(
            new EspressoItem(new Item.Settings().registryKey(ESPRESSO_KEY).food(POISON_FOOD_COMPONENT, ESPRESSO_FOOD_CONSUMABLE_COMPONENT)),
            ESPRESSO_KEY
    );
    public static final RegistryKey<Item> TIRAMISU_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.rayandev.italianfood.ItalianFood.MOD_ID, "tiramisu"));
    public static final Item TIRAMISU = register(
            new TiramisuItem(new Item.Settings().registryKey(TIRAMISU_KEY).food(POISON_FOOD_COMPONENT, TIRAMISU_FOOD_CONSUMABLE_COMPONENT)),
            TIRAMISU_KEY
    );

    public static void registerModItems() {
        new Item.Settings().food(new FoodComponent.Builder().build());
        net.rayandev.italianfood.ItalianFood.LOGGER.info("Registering Mod Items for " + net.rayandev.italianfood.ItalianFood.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(PIZZA);
            entries.add(MOZZARELLA);
            entries.add(GRISSINO);
            entries.add(TARALLO);
            entries.add(FOCACCIA);
            entries.add(ESPRESSO);
            entries.add(TIRAMISU);
            entries.add(LASAGNA);

        });

    }
}
