package net.rayandev.specialtridents.entity.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FireTridentEntityRenderer;
import net.rayandev.specialtridents.entity.ModEntities;

public class ModEntityRenderer {
    public static void registerEntityRenderers() {
        EntityRendererFactory.register(ModEntities.FIRE_TRIDENT, FireTridentEntityRenderer::new);
    }
}
