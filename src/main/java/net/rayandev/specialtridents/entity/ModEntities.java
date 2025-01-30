package net.rayandev.specialtridents.entity;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.SpecialTridents;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

public class ModEntities {
    public static final EntityType<FireTridentProjectileEntity> FIRE_TRIDENT = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(SpecialTridents.MOD_ID, "fire_trident"),
            EntityType.Builder.<FireTridentProjectileEntity>create(FireTridentProjectileEntity::new, SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(0.5F, 0.5F)
                    .eyeHeight(0.13F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(20)
                    .build(keyOf("fire_trident"))
    );

    private static RegistryKey<EntityType<?>> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(SpecialTridents.MOD_ID, id));
    }

    public static void registerEntities() {
        System.out.println("Registering Mod Entities for Special Tridents"); // Debug opzionale
    }
}
