package com.YTrollman.InfiniteCoal.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfiniteCoalItem extends Item {

	public InfiniteCoalItem(Properties properties) {
		super(properties);
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 2147483647;
	}
	
	public boolean hasEffect(ItemStack effect) {
		return true;
	}
}
