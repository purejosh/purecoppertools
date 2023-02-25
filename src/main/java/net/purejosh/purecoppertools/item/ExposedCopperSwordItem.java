
package net.purejosh.purecoppertools.item;

import net.purejosh.purecoppertools.init.PurecoppertoolsModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ExposedCopperSwordItem extends SwordItem {
	public ExposedCopperSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 218;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurecoppertoolsModItems.EXPOSED_COPPER_INGOT));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
