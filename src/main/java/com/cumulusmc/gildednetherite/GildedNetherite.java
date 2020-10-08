package com.cumulusmc.gildednetherite;

import com.cumulusmc.gildednetherite.items.RegisterItems;
import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class GildedNetherite implements ModInitializer {

    public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
            // All the damage sources we should be immune to

            DamageSource.HOT_FLOOR,
            DamageSource.IN_FIRE,
            DamageSource.LAVA,
            DamageSource.LIGHTNING_BOLT,
            DamageSource.ON_FIRE
    );

    public static final ItemGroup GILDED_NETHERITE_GROUP = FabricItemGroupBuilder.create(
            new Identifier("gildednetherite", "gilded_netherite_group"))
            .icon(() -> new ItemStack(RegisterItems.GILDED_NETHERITE))
            .build();

    @Override
    public void onInitialize() {
        RegisterItems.register();
    }
}
