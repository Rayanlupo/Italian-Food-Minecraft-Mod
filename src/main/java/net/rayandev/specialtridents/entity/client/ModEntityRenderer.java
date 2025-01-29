package net.rayandev.specialtridents.entity.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.TridentEntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.rayandev.specialtridents.entity.ModEntities;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

public class ModEntityRenderer extends EntityRenderer{
    private static EntityRendererFactory<? super FireTridentProjectileEntity> EntityRenderer;

    protected ModEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    public static void registerEntityRenderers() {
        EntityRendererRegistry.register(ModEntities.FIRE_TRIDENT, EntityRenderer);
    }


    @Override
    public EntityRenderState createRenderState() {
        return null;
    }
}
