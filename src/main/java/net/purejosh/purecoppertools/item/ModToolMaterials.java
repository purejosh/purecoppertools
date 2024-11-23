package net.purejosh.purecoppertools.item;

import net.minecraft.item.ToolMaterial;

public interface ModToolMaterials {
    public static final ToolMaterial COPPER = new ToolMaterial(ModBlockTags.INCORRECT_FOR_COPPER_TOOL, 150, 6.0F, 2.0F, 22,
            ModItemTags.COPPER_TOOL_MATERIALS);
    public static final ToolMaterial EXPOSED_COPPER = new ToolMaterial(ModBlockTags.INCORRECT_FOR_COPPER_TOOL, 183, 6.0F,
            2.0F,
            18, ModItemTags.EXPOSED_COPPER_TOOL_MATERIALS);
    public static final ToolMaterial WEATHERED_COPPER = new ToolMaterial(ModBlockTags.INCORRECT_FOR_COPPER_TOOL, 217, 6.0F,
            2.0F,
            14, ModItemTags.WEATHERED_COPPER_TOOL_MATERIALS);
    public static final ToolMaterial OXIDIZED_COPPER = new ToolMaterial(ModBlockTags.INCORRECT_FOR_COPPER_TOOL, 250, 6.0F,
            2.0F,
            10, ModItemTags.OXIDIZED_COPPER_TOOL_MATERIALS);
}