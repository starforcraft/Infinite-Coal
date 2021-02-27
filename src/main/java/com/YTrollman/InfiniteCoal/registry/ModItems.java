package com.YTrollman.InfiniteCoal.registry;

import com.YTrollman.InfiniteCoal.InfiniteCoal;
import com.YTrollman.InfiniteCoal.item.InfiniteCoalItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniteCoal.MOD_ID);

    public static final RegistryObject<Item> INFINITE_COAL = ITEMS.register("infinite_coal", () -> new InfiniteCoalItem(new Item.Properties().group(ItemGroupInfiniteCoal.INFINITE_COAL)));
}