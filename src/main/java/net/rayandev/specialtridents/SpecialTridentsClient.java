package net.rayandev.specialtridents;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.rayandev.specialtridents.entity.ModEntities;
import net.rayandev.specialtridents.entity.client.FireTridentEntityRenderer;
import net.rayandev.specialtridents.entity.client.ModEntityRenderer;

public class SpecialTridentsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.FIRE_TRIDENT, (context) -> new FireTridentEntityRenderer(context));
        ModEntityRenderer.registerEntityRenderers();

    }
}
