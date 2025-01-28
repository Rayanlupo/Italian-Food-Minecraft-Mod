package net.rayandev.specialtridents.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

public class ModEntities {

    public static final EntityType<FireTridentProjectileEntity> FIRE_TRIDENT= Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("specialtridents", "fire_trident"),
            EntityType.Builder.create(
                    FireTridentProjectileEntity::new, SpawnGroup.MISC
            )
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)) // Dimensioni del proiettile
                    .trackRangeBlocks(4) // Distanza a cui il server traccia il proiettile
                    .trackedUpdateRate(10)
                    .build()

    );
    public static void registerEntities() {
        System.out.println("Registering Mod Entities for Special Tridents"); // Debug opzionale
    }
}
