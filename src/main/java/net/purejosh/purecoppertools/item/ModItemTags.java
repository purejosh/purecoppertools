package net.purejosh.purecoppertools.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.PureCopperTools;

public interface ModItemTags {
    public static TagKey<Item> COPPER_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "copper_tool_materials"));
    public static TagKey<Item> EXPOSED_COPPER_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "exposed_copper_tool_materials"));
    public static TagKey<Item> WEATHERED_COPPER_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "weathered_copper_tool_materials"));
    public static TagKey<Item> OXIDIZED_COPPER_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "oxidized_copper_tool_materials"));
    public static TagKey<Item> REPAIRS_COPPER_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "repairs_copper_armor"));
    public static TagKey<Item> REPAIRS_EXPOSED_COPPER_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "repairs_exposed_copper_armor"));
    public static TagKey<Item> REPAIRS_WEATHERED_COPPER_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "repairs_weathered_copper_armor"));
    public static TagKey<Item> REPAIRS_OXIDIZED_COPPER_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(PureCopperTools.MOD_ID, "repairs_oxidized_copper_armor"));

}
