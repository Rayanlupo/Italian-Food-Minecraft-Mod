package net.rayandev.specialtridents.entity.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.rayandev.specialtridents.entity.ModEntities;

public class ModEntityRenderer {
    public static void registerEntityRenderers() {
        EntityRendererRegistry.register(ModEntities.FIRE_TRIDENT, FireTridentEntityRenderer::new);
    }
}
