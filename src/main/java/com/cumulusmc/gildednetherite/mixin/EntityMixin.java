package com.cumulusmc.gildednetherite.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.util.Nameable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
abstract class EntityMixin implements Nameable, CommandOutput {
    @Inject(method = "isInvulnerableTo", at = @At(value = "TAIL", target = "net/minecraft/entity/Entity.isInvulnerableTo(Lnet/minecraft/entity/damage/DamageSource;)Z"))
    private void injectInvulnerability(DamageSource inFire, CallbackInfoReturnable<Boolean> cir) {

    }

}
