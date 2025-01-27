
package net.rayandev.specialtridents.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.ProjectileEntityRenderState;
import net.rayandev.specialtridents.entity.client.FireTridentEntityRenderState;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

public class FireTridentEntityRenderer extends TridentEntityRenderer{

    public static final Identifier TEXTURE = Identifier.of("specialtridents","textures/entity/fire_trident.png");
    private final FireTridentEntityModel model;


    public FireTridentEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new FireTridentEntityModel(context.getPart(EntityModelLayers.TRIDENT));
    }
    public void render(FireTridentEntityRenderState tridentEntityRenderState, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(tridentEntityRenderState.yaw - 90.0F));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(tridentEntityRenderState.pitch + 90.0F));
        VertexConsumer vertexConsumer = ItemRenderer.getItemGlintConsumer(
                vertexConsumerProvider, this.model.getLayer(TEXTURE), false, tridentEntityRenderState.enchanted
        );
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
        matrixStack.pop();
        super.render(tridentEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }
    public FireTridentEntityRenderState createRenderState() {
        return new FireTridentEntityRenderState();
    }

    public void updateRenderState(FireTridentProjectileEntity tridentEntity, FireTridentEntityRenderState tridentEntityRenderState, float f) {
        super.updateRenderState(tridentEntity, FireTridentEntityRenderState, f);
        tridentEntityRenderState.yaw = tridentEntity.getLerpedYaw(f);
        tridentEntityRenderState.pitch = tridentEntity.getLerpedPitch(f);
        tridentEntityRenderState.enchanted = tridentEntity.isEnchanted();
    }



    protected Identifier getTexture(ProjectileEntityRenderState state) {
        return Identifier.of("specialtridents", "texture/entity/fire_trident.png");
    }

}
