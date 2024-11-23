package net.purejosh.purecoppertools.item;

import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.PureCopperTools;

import java.util.List;
import java.util.function.Function;

public class ModItems {
    // Swords and tools
    public static final Item COPPER_SWORD = register("copper_sword", settings -> new SwordItem(ModToolMaterials.COPPER, 3, -2.4f, settings));
    public static final Item EXPOSED_COPPER_SWORD = register("exposed_copper_sword", settings -> new SwordItem(ModToolMaterials.EXPOSED_COPPER, 3, -2.4f, settings));
    public static final Item WEATHERED_COPPER_SWORD = register("weathered_copper_sword", settings -> new SwordItem(ModToolMaterials.WEATHERED_COPPER,3, -2.4f, settings));
    public static final Item OXIDIZED_COPPER_SWORD = register("oxidized_copper_sword", settings -> new SwordItem(ModToolMaterials.OXIDIZED_COPPER,3, -2.4f, settings));

    // Tools
    public static final Item COPPER_SHOVEL = register("copper_shovel", settings -> new ShovelItem(ModToolMaterials.COPPER,1.5f, -3.0f, settings));
    public static final Item COPPER_PICKAXE = register("copper_pickaxe", settings -> new PickaxeItem(ModToolMaterials.COPPER,1.0f, -2.8f,settings));
    public static final Item COPPER_AXE = register("copper_axe", settings -> new AxeItem(ModToolMaterials.COPPER,6.0f, -3.1f,settings));
    public static final Item COPPER_HOE = register("copper_hoe", settings -> new HoeItem(ModToolMaterials.COPPER,-2.0f, -1.0f,settings));
    public static final Item EXPOSED_COPPER_SHOVEL = register("exposed_copper_shovel", settings -> new ShovelItem(ModToolMaterials.EXPOSED_COPPER,1.5f, -3.0f,settings));
    public static final Item EXPOSED_COPPER_PICKAXE = register("exposed_copper_pickaxe", settings -> new PickaxeItem(ModToolMaterials.EXPOSED_COPPER,1.0f, -2.8f, settings));
    public static final Item EXPOSED_COPPER_AXE = register("exposed_copper_axe", settings -> new AxeItem(ModToolMaterials.EXPOSED_COPPER,6.0f, -3.1f, settings));
    public static final Item EXPOSED_COPPER_HOE = register("exposed_copper_hoe", settings -> new HoeItem(ModToolMaterials.EXPOSED_COPPER,-2.0f, -1.0f, settings));
    public static final Item WEATHERED_COPPER_SHOVEL = register("weathered_copper_shovel", settings -> new ShovelItem(ModToolMaterials.WEATHERED_COPPER,1.5f, -3.0f, settings));
    public static final Item WEATHERED_COPPER_PICKAXE = register("weathered_copper_pickaxe", settings -> new PickaxeItem(ModToolMaterials.WEATHERED_COPPER,1.0f, -2.8f, settings));
    public static final Item WEATHERED_COPPER_AXE = register("weathered_copper_axe", settings -> new AxeItem(ModToolMaterials.WEATHERED_COPPER,6.0f, -3.1f, settings));
    public static final Item WEATHERED_COPPER_HOE = register("weathered_copper_hoe", settings -> new HoeItem(ModToolMaterials.WEATHERED_COPPER,-2.0f, -1.0f, settings));
    public static final Item OXIDIZED_COPPER_SHOVEL = register("oxidized_copper_shovel", settings -> new ShovelItem(ModToolMaterials.OXIDIZED_COPPER,1.5f, -3.0f, settings));
    public static final Item OXIDIZED_COPPER_PICKAXE = register("oxidized_copper_pickaxe", settings -> new PickaxeItem(ModToolMaterials.OXIDIZED_COPPER,1.0f, -2.8f, settings));
    public static final Item OXIDIZED_COPPER_AXE = register("oxidized_copper_axe", settings -> new AxeItem(ModToolMaterials.OXIDIZED_COPPER,6.0f, -3.1f, settings));
    public static final Item OXIDIZED_COPPER_HOE = register("oxidized_copper_hoe", settings -> new HoeItem(ModToolMaterials.OXIDIZED_COPPER,-2.0f, -1.0f, settings));

    // Armor
    public static final Item COPPER_HELMET = register("copper_helmet", settings -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentType.HELMET, settings));
    public static final Item COPPER_CHESTPLATE = register("copper_chestplate", settings -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentType.CHESTPLATE, settings));
    public static final Item COPPER_LEGGINGS = register("copper_leggings", settings -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentType.LEGGINGS, settings));
    public static final Item COPPER_BOOTS = register("copper_boots", settings -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentType.BOOTS, settings));
    public static final Item EXPOSED_COPPER_HELMET = register("exposed_copper_helmet", settings -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, EquipmentType.HELMET, settings));
    public static final Item EXPOSED_COPPER_CHESTPLATE = register("exposed_copper_chestplate", settings -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, EquipmentType.CHESTPLATE, settings));
    public static final Item EXPOSED_COPPER_LEGGINGS = register("exposed_copper_leggings", settings -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, EquipmentType.LEGGINGS, settings));
    public static final Item EXPOSED_COPPER_BOOTS = register("exposed_copper_boots", settings -> new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, EquipmentType.BOOTS, settings));
    public static final Item WEATHERED_COPPER_HELMET = register("weathered_copper_helmet", settings -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, EquipmentType.HELMET, settings));
    public static final Item WEATHERED_COPPER_CHESTPLATE = register("weathered_copper_chestplate", settings -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, EquipmentType.CHESTPLATE, settings));
    public static final Item WEATHERED_COPPER_LEGGINGS = register("weathered_copper_leggings", settings -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, EquipmentType.LEGGINGS, settings));
    public static final Item WEATHERED_COPPER_BOOTS = register("weathered_copper_boots", settings -> new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, EquipmentType.BOOTS, settings));
    public static final Item OXIDIZED_COPPER_HELMET = register("oxidized_copper_helmet", settings -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.HELMET, settings));
    public static final Item OXIDIZED_COPPER_CHESTPLATE = register("oxidized_copper_chestplate", settings -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.CHESTPLATE, settings));
    public static final Item OXIDIZED_COPPER_LEGGINGS = register("oxidized_copper_leggings", settings -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.LEGGINGS, settings));
    public static final Item OXIDIZED_COPPER_BOOTS = register("oxidized_copper_boots", settings -> new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.BOOTS, settings));

    // Horse Armor
    private static AnimalArmorItem animalArmorItem(ArmorMaterial material,Item.Settings settings) {
        return new AnimalArmorItem(material, AnimalArmorItem.Type.EQUESTRIAN,material.equipSound(),false, settings.maxCount(1));
    }
    public static final Item COPPER_HORSE_ARMOR = register(
            "copper_horse_armor", settings -> animalArmorItem(ModArmorMaterials.COPPER, settings));
    public static final Item EXPOSED_COPPER_HORSE_ARMOR = register(
            "exposed_copper_horse_armor",  settings -> animalArmorItem(ModArmorMaterials.EXPOSED_COPPER, settings));
    public static final Item WEATHERED_COPPER_HORSE_ARMOR = register(
            "weathered_copper_horse_armor",  settings -> animalArmorItem(ModArmorMaterials.WEATHERED_COPPER, settings));
    public static final Item OXIDIZED_COPPER_HORSE_ARMOR = register(
            "oxidized_copper_horse_armor",  settings -> animalArmorItem(ModArmorMaterials.OXIDIZED_COPPER, settings));

    // Miscellaneous items
    public static final Item EXPOSED_COPPER_INGOT = register("exposed_copper_ingot", settings -> new Item(settings));
    public static final Item WEATHERED_COPPER_INGOT = register("weathered_copper_ingot", settings -> new Item(settings));
    public static final Item OXIDIZED_COPPER_INGOT = register("oxidized_copper_ingot", settings -> new Item(settings));
    public static final Item COPPER_NUGGET = register("copper_nugget", settings -> new Item(settings));
    public static final Item EXPOSED_COPPER_NUGGET = register("exposed_copper_nugget", settings -> new Item(settings));
    public static final Item WEATHERED_COPPER_NUGGET = register("weathered_copper_nugget", settings -> new Item(settings));
    public static final Item OXIDIZED_COPPER_NUGGET = register("oxidized_copper_nugget", settings -> new Item(settings));
    public static final Item EXPOSED_COPPER_BRUSH = register("exposed_copper_brush", settings -> new Item(settings.maxDamage(96)));
    public static final Item WEATHERED_COPPER_BRUSH = register("weathered_copper_brush", settings -> new Item(settings.maxDamage(128)));
    public static final Item OXIDIZED_COPPER_BRUSH = register("oxidized_copper_brush", settings -> new Item(settings.maxDamage(160)));
    public static final Item COPPER_UPGRADE_SMITHING_TEMPLATE = register("copper_upgrade_smithing_template", settings -> new Item(settings){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item EXPOSED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("exposed_copper_upgrade_smithing_template", settings -> new Item(settings){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.exposed_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.exposed_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WEATHERED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("weathered_copper_upgrade_smithing_template", settings -> new Item(settings){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.weathered_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.weathered_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item OXIDIZED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("oxidized_copper_upgrade_smithing_template", settings -> new Item(settings){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.oxidized_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.oxidized_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    // Helper method for registering an item.
    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, id));
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        return Registry.register(Registries.ITEM, key, item);
    }

    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, keyOf(id), item);
    }

    public static Item register(String id, Function<Item.Settings, Item> factory) {
        var key = keyOf(id);
        Item item = factory.apply(new Item.Settings().registryKey(key));
        return register(key, item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
