package net.rayandev.specialtridents.item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;




public enum ModToolMaterials implements ToolMaterial {

    FIRE_TRIDENT(
             1561, 2.0F, 3.0F, 10, Ingredient.ofItems(Items.BLAZE_POWDER));

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.miningLevel = 0; // Assuming miningLevel is not being used specifically
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }


}
