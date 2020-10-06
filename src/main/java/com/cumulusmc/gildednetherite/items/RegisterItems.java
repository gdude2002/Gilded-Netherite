package com.cumulusmc.gildednetherite.items;

import com.cumulusmc.gildednetherite.materials.GildedNetheriteArmorMaterial;
import com.cumulusmc.gildednetherite.materials.GildedNetheriteMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final ToolMaterial gildedNetheriteMaterial = new GildedNetheriteMaterial();
    public static final ArmorMaterial gildedNetheriteMaterial = new GildedNetheriteArmorMaterial();
    public static final Item RUBY = new Ruby_Item(new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_HELMET = new ArmorItem(rubyArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(rubyArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_LEGGINGS = new ArmorItem(rubyArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_BOOTS = new ArmorItem(rubyArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(RubyMod.RUBY_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite"), RUBY);
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite_block"), new BlockItem(RegisterBlocks.RUBY_BLOCK, new Item.Settings().group(RubyMod.RUBY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gilded_netherite_mod", "gilded_netherite_boots"), RUBY_BOOTS);
    }
}
}
