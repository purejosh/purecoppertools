
package net.purejosh.purecoppertools.item;

import net.purejosh.purecoppertools.init.PurecoppertoolsModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class ExposedCopperAxeItem extends AxeItem {
	public ExposedCopperAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 218;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurecoppertoolsModItems.EXPOSED_COPPER_INGOT));
			}
		}, 1, -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
