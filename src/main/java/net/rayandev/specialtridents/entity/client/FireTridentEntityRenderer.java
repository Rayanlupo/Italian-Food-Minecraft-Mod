package net.rayandev.specialtridents.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.TridentEntityRenderState;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.rayandev.specialtridents.SpecialTridents;
import net.rayandev.specialtridents.entity.custom.FireTridentProjectileEntity;

@Environment(EnvType.CLIENT)
public class FireTridentEntityRenderer extends EntityRenderer<FireTridentProjectileEntity, TridentEntityRenderState> {
    public static final Identifier TEXTURE = Identifier.of(SpecialTridents.MOD_ID,"textures/entity/fire_trident.png");
    private final FireTridentEntityModel model;

    public FireTridentEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new FireTridentEntityModel(context.getPart(EntityModelLayers.TRIDENT));
    }

    public void render(TridentEntityRenderState tridentEntityRenderState, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(tridentEntityRenderState.yaw - 90.0F));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(tridentEntityRenderState.pitch + 90.0F));
        VertexConsumer vertexConsumer = ItemRenderer.getItemGlintConsumer(vertexConsumerProvider, this.model.getLayer(TEXTURE), false, tridentEntityRenderState.enchanted);
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
        matrixStack.pop();
        super.render(tridentEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }

    public TridentEntityRenderState createRenderState() {
        return new TridentEntityRenderState();
    }

    public void updateRenderState(FireTridentProjectileEntity fireTridentEntity, TridentEntityRenderState tridentEntityRenderState, float f) {
        super.updateRenderState(fireTridentEntity, (FireTridentEntityRenderState) tridentEntityRenderState, f);
        tridentEntityRenderState.yaw = fireTridentEntity.getLerpedYaw(f);
        tridentEntityRenderState.pitch = fireTridentEntity.getLerpedPitch(f);
        tridentEntityRenderState.enchanted = fireTridentEntity.isEnchanted();
    }
}