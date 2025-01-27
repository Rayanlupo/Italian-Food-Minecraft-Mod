package net.rayandev.specialtridents;

import net.fabricmc.api.ClientModInitializer;
import net.rayandev.specialtridents.entity.client.ModEntityRenderer;

public class SpecialTridentsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModEntityRenderer.registerEntityRenderers();

    }
}
