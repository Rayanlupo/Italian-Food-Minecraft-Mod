package net.rayandev.specialtridents.entity.client;

import net.minecraft.client.model.ModelPart;

import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.util.Identifier;


public class FireTridentEntityModel extends TridentEntityModel{

    public static final Identifier TEXTURE = Identifier.of("specialtridents","textures/entity/fire_trident.png");
    public FireTridentEntityModel(ModelPart root) {
        super(root); // Pass the ModelPart to the parent constructor
    }
}
