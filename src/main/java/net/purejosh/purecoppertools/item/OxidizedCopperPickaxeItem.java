
package net.purejosh.purecoppertools.item;

import net.purejosh.purecoppertools.init.PurecoppertoolsModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OxidizedCopperPickaxeItem extends PickaxeItem {
	public OxidizedCopperPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 304;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurecoppertoolsModItems.OXIDIZED_COPPER_INGOT));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
