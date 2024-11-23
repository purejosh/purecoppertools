package net.purejosh.purecoppertools.item;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.PureCopperTools;

public interface ModBlockTags {
    public static TagKey<Block> INCORRECT_FOR_COPPER_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PureCopperTools.MOD_ID, "incorrect_for_copper_tool"));
}
