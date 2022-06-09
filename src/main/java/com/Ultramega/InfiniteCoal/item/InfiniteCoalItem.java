package com.Ultramega.InfiniteCoal.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class InfiniteCoalItem extends Item {
	public InfiniteCoalItem(Properties properties) {
		super(properties);
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 2147483647;
	}

	public boolean isFoil(ItemStack stack) {
		return true;
	}
}
