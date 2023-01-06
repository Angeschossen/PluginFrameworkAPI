package com.github.angeschossen.pluginframework.api.hopper;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public interface HopperWrapper {
    @NotNull
    HashMap<Integer, ItemStack> addItem(ItemStack... item);

    boolean isFull();
}
