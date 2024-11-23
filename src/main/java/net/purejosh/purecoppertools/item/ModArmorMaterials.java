package net.purejosh.purecoppertools.item;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.purejosh.purecoppertools.PureCopperTools;
import net.purejosh.purecoppertools.sound.ModSounds;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static final ArmorMaterial COPPER = 
            armorMaterial(9, 22, ModSounds.ITEM_ARMOR_EQUIP_COPPER,
                ModItemTags.REPAIRS_COPPER_ARMOR, "copper");

    public static final ArmorMaterial EXPOSED_COPPER = 
            armorMaterial(11, 18, ModSounds.ITEM_ARMOR_EQUIP_EXPOSED_COPPER,
                ModItemTags.REPAIRS_EXPOSED_COPPER_ARMOR, "exposed_copper");

    public static final ArmorMaterial WEATHERED_COPPER = 
            armorMaterial(13, 14, ModSounds.ITEM_ARMOR_EQUIP_WEATHERED_COPPER,
                ModItemTags.REPAIRS_WEATHERED_COPPER_ARMOR, "weathered_copper");

    public static final ArmorMaterial OXIDIZED_COPPER = 
            armorMaterial(15, 10, ModSounds.ITEM_ARMOR_EQUIP_OXIDIZED_COPPER,
                ModItemTags.REPAIRS_OXIDIZED_COPPER_ARMOR, "oxidized_copper");
    
    private static ArmorMaterial armorMaterial(int durability,
            int enchantmentValue,SoundEvent equipSound,TagKey<Item> repairIngredient,String modelId) {
        return new ArmorMaterial(durability, Util.make(new EnumMap<>(EquipmentType.class), map -> {
            map.put(EquipmentType.HELMET, 2);
            map.put(EquipmentType.CHESTPLATE, 5);
            map.put(EquipmentType.LEGGINGS, 4);
            map.put(EquipmentType.BOOTS, 2);
            map.put(EquipmentType.BODY, 7);
        }), enchantmentValue, RegistryEntry.of(equipSound),
            0.0F, 0.0F, repairIngredient, Identifier.of(PureCopperTools.MOD_ID,modelId));
    }

    // Initialization called from the entrypoint, as this armor material needs to be added to the registry.
    public static void init() {
    }
}
