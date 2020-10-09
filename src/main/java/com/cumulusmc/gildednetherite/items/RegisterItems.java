package com.cumulusmc.gildednetherite.items;

import com.cumulusmc.gildednetherite.GildedNetherite;
import com.cumulusmc.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final ArmorMaterial gildedNetheriteArmorMaterial = new GildedNetheriteArmorMaterial();
    public static final Item GILDED_NETHERITE = new GildedNetheriteItem(new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP));
    public static final Item GILDED_NETHERITE_HELMET = new ArmorItem(gildedNetheriteArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP));
    public static final Item GILDED_NETHERITE_CHESTPLATE = new ArmorItem(gildedNetheriteArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP));
    public static final Item GILDED_NETHERITE_LEGGINGS = new ArmorItem(gildedNetheriteArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP));
    public static final Item GILDED_NETHERITE_BOOTS = new ArmorItem(gildedNetheriteArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite"), GILDED_NETHERITE);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);
    }
}
