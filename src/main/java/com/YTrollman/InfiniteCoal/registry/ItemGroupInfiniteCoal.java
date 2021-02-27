package com.YTrollman.InfiniteCoal.registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

import com.YTrollman.InfiniteCoal.InfiniteCoal;

public class ItemGroupInfiniteCoal{

	public static final ItemGroup INFINITE_COAL = (new ItemGroup(InfiniteCoal.MOD_ID) {

		@Override
		@Nonnull
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(ModItems.INFINITE_COAL.get());
		}
	});
	
}
