package net.rayandev.specialtridents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rayandev.specialtridents.SpecialTridents;

public class ModItemGroup {
    // Define your custom item group
    public static final ItemGroup TRIDENTS = FabricItemGroup.builder(
            )
            .displayName(Text.translatable("itemGroup.specialtridents.tridents"))
            .icon(() -> new ItemStack(ModItems.FIRE_TRIDENT)) // Icon for the tab
            .build();
}
