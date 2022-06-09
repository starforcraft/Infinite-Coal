package com.Ultramega.InfiniteCoal.registry;

import com.Ultramega.InfiniteCoal.InfiniteCoal;
import com.Ultramega.InfiniteCoal.item.InfiniteCoalItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfiniteCoal.MOD_ID);

    public static final RegistryObject<Item> INFINITE_COAL = ITEMS.register("infinite_coal", () -> new InfiniteCoalItem(new Item.Properties().tab(ItemGroupInfiniteCoal.INFINITE_COAL)));
}