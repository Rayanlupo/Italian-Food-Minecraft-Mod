package net.rayandev.specialtridents.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.TridentEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

public class FireTridentEntityRenderer extends TridentEntityRenderer {
    public static final Identifier TEXTURE = Identifier.of("specialtridents", "textures/entity/fire_trident.png");
    private final FireTridentEntityModel model;

    public FireTridentEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new FireTridentEntityModel(context.getPart(EntityModelLayers.TRIDENT));
    }



}