package com.Ultramega.InfiniteCoal.registry;

import com.Ultramega.InfiniteCoal.InfiniteCoal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class ItemGroupInfiniteCoal{

	public static final CreativeModeTab INFINITE_COAL = (new CreativeModeTab(InfiniteCoal.MOD_ID) {

		@Override
		@Nonnull
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.INFINITE_COAL.get());
		}
	});
}
