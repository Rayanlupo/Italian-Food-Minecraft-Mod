package net.rayandev.specialtridents.entity.custom;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class FireTridentProjectileEntity extends TridentEntity  {


    public FireTridentProjectileEntity(EntityType<? extends TridentEntity> entityType, World world) {
        super(entityType, world);
    }

    public FireTridentProjectileEntity(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }

    public FireTridentProjectileEntity(World world, double x, double y, double z, ItemStack stack) {
        super(world, x, y, z, stack);
    }
}


