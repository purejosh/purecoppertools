
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purecoppertools.init;

import net.purejosh.purecoppertools.item.WeatheredCopperSwordItem;
import net.purejosh.purecoppertools.item.WeatheredCopperShovelItem;
import net.purejosh.purecoppertools.item.WeatheredCopperPickaxeItem;
import net.purejosh.purecoppertools.item.WeatheredCopperNuggetItem;
import net.purejosh.purecoppertools.item.WeatheredCopperItem;
import net.purejosh.purecoppertools.item.WeatheredCopperIngotItem;
import net.purejosh.purecoppertools.item.WeatheredCopperHoeItem;
import net.purejosh.purecoppertools.item.WeatheredCopperAxeItem;
import net.purejosh.purecoppertools.item.OxidizedCopperSwordItem;
import net.purejosh.purecoppertools.item.OxidizedCopperShovelItem;
import net.purejosh.purecoppertools.item.OxidizedCopperPickaxeItem;
import net.purejosh.purecoppertools.item.OxidizedCopperNuggetItem;
import net.purejosh.purecoppertools.item.OxidizedCopperItem;
import net.purejosh.purecoppertools.item.OxidizedCopperIngotItem;
import net.purejosh.purecoppertools.item.OxidizedCopperHoeItem;
import net.purejosh.purecoppertools.item.OxidizedCopperAxeItem;
import net.purejosh.purecoppertools.item.ExposedCopperSwordItem;
import net.purejosh.purecoppertools.item.ExposedCopperShovelItem;
import net.purejosh.purecoppertools.item.ExposedCopperPickaxeItem;
import net.purejosh.purecoppertools.item.ExposedCopperNuggetItem;
import net.purejosh.purecoppertools.item.ExposedCopperItem;
import net.purejosh.purecoppertools.item.ExposedCopperIngotItem;
import net.purejosh.purecoppertools.item.ExposedCopperHoeItem;
import net.purejosh.purecoppertools.item.ExposedCopperAxeItem;
import net.purejosh.purecoppertools.item.CopperSwordItem;
import net.purejosh.purecoppertools.item.CopperShovelItem;
import net.purejosh.purecoppertools.item.CopperPickaxeItem;
import net.purejosh.purecoppertools.item.CopperNuggetItem;
import net.purejosh.purecoppertools.item.CopperItem;
import net.purejosh.purecoppertools.item.CopperHoeItem;
import net.purejosh.purecoppertools.item.CopperAxeItem;
import net.purejosh.purecoppertools.PurecoppertoolsMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PurecoppertoolsModItems {
	public static Item COPPER_SHOVEL;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_AXE;
	public static Item COPPER_HOE;
	public static Item EXPOSED_COPPER_SHOVEL;
	public static Item EXPOSED_COPPER_PICKAXE;
	public static Item EXPOSED_COPPER_AXE;
	public static Item EXPOSED_COPPER_HOE;
	public static Item WEATHERED_COPPER_SHOVEL;
	public static Item WEATHERED_COPPER_PICKAXE;
	public static Item WEATHERED_COPPER_AXE;
	public static Item WEATHERED_COPPER_HOE;
	public static Item OXIDIZED_COPPER_SHOVEL;
	public static Item OXIDIZED_COPPER_PICKAXE;
	public static Item OXIDIZED_COPPER_AXE;
	public static Item OXIDIZED_COPPER_HOE;
	public static Item COPPER_SWORD;
	public static Item COPPER_HELMET;
	public static Item COPPER_CHESTPLATE;
	public static Item COPPER_LEGGINGS;
	public static Item COPPER_BOOTS;
	public static Item EXPOSED_COPPER_SWORD;
	public static Item EXPOSED_COPPER_HELMET;
	public static Item EXPOSED_COPPER_CHESTPLATE;
	public static Item EXPOSED_COPPER_LEGGINGS;
	public static Item EXPOSED_COPPER_BOOTS;
	public static Item WEATHERED_COPPER_SWORD;
	public static Item WEATHERED_COPPER_HELMET;
	public static Item WEATHERED_COPPER_CHESTPLATE;
	public static Item WEATHERED_COPPER_LEGGINGS;
	public static Item WEATHERED_COPPER_BOOTS;
	public static Item OXIDIZED_COPPER_SWORD;
	public static Item OXIDIZED_COPPER_HELMET;
	public static Item OXIDIZED_COPPER_CHESTPLATE;
	public static Item OXIDIZED_COPPER_LEGGINGS;
	public static Item OXIDIZED_COPPER_BOOTS;
	public static Item COPPER_NUGGET;
	public static Item EXPOSED_COPPER_INGOT;
	public static Item EXPOSED_COPPER_NUGGET;
	public static Item WEATHERED_COPPER_INGOT;
	public static Item WEATHERED_COPPER_NUGGET;
	public static Item OXIDIZED_COPPER_INGOT;
	public static Item OXIDIZED_COPPER_NUGGET;

	public static void load() {
		COPPER_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_shovel"), new CopperShovelItem());
		COPPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_pickaxe"), new CopperPickaxeItem());
		COPPER_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_axe"), new CopperAxeItem());
		COPPER_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_hoe"), new CopperHoeItem());
		EXPOSED_COPPER_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_shovel"),
				new ExposedCopperShovelItem());
		EXPOSED_COPPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_pickaxe"),
				new ExposedCopperPickaxeItem());
		EXPOSED_COPPER_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_axe"),
				new ExposedCopperAxeItem());
		EXPOSED_COPPER_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_hoe"),
				new ExposedCopperHoeItem());
		WEATHERED_COPPER_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_shovel"),
				new WeatheredCopperShovelItem());
		WEATHERED_COPPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_pickaxe"),
				new WeatheredCopperPickaxeItem());
		WEATHERED_COPPER_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_axe"),
				new WeatheredCopperAxeItem());
		WEATHERED_COPPER_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_hoe"),
				new WeatheredCopperHoeItem());
		OXIDIZED_COPPER_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_shovel"),
				new OxidizedCopperShovelItem());
		OXIDIZED_COPPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_pickaxe"),
				new OxidizedCopperPickaxeItem());
		OXIDIZED_COPPER_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_axe"),
				new OxidizedCopperAxeItem());
		OXIDIZED_COPPER_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_hoe"),
				new OxidizedCopperHoeItem());
		COPPER_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_sword"), new CopperSwordItem());
		COPPER_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_helmet"), new CopperItem.Helmet());
		COPPER_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_chestplate"),
				new CopperItem.Chestplate());
		COPPER_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_leggings"),
				new CopperItem.Leggings());
		COPPER_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_boots"), new CopperItem.Boots());
		EXPOSED_COPPER_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_sword"),
				new ExposedCopperSwordItem());
		EXPOSED_COPPER_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_helmet"),
				new ExposedCopperItem.Helmet());
		EXPOSED_COPPER_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_chestplate"),
				new ExposedCopperItem.Chestplate());
		EXPOSED_COPPER_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_leggings"),
				new ExposedCopperItem.Leggings());
		EXPOSED_COPPER_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_boots"),
				new ExposedCopperItem.Boots());
		WEATHERED_COPPER_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_sword"),
				new WeatheredCopperSwordItem());
		WEATHERED_COPPER_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_helmet"),
				new WeatheredCopperItem.Helmet());
		WEATHERED_COPPER_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_chestplate"),
				new WeatheredCopperItem.Chestplate());
		WEATHERED_COPPER_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_leggings"),
				new WeatheredCopperItem.Leggings());
		WEATHERED_COPPER_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_boots"),
				new WeatheredCopperItem.Boots());
		OXIDIZED_COPPER_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_sword"),
				new OxidizedCopperSwordItem());
		OXIDIZED_COPPER_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_helmet"),
				new OxidizedCopperItem.Helmet());
		OXIDIZED_COPPER_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_chestplate"),
				new OxidizedCopperItem.Chestplate());
		OXIDIZED_COPPER_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_leggings"),
				new OxidizedCopperItem.Leggings());
		OXIDIZED_COPPER_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_boots"),
				new OxidizedCopperItem.Boots());
		COPPER_NUGGET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "copper_nugget"), new CopperNuggetItem());
		EXPOSED_COPPER_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_ingot"),
				new ExposedCopperIngotItem());
		EXPOSED_COPPER_NUGGET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "exposed_copper_nugget"),
				new ExposedCopperNuggetItem());
		WEATHERED_COPPER_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_ingot"),
				new WeatheredCopperIngotItem());
		WEATHERED_COPPER_NUGGET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "weathered_copper_nugget"),
				new WeatheredCopperNuggetItem());
		OXIDIZED_COPPER_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_ingot"),
				new OxidizedCopperIngotItem());
		OXIDIZED_COPPER_NUGGET = Registry.register(Registry.ITEM, new ResourceLocation(PurecoppertoolsMod.MODID, "oxidized_copper_nugget"),
				new OxidizedCopperNuggetItem());
	}
}
