package com.github.angeschossen.pluginframework.api.hopper;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public interface HopperWrapper {

    @Nullable ItemStack addItem(ItemStack item, boolean delete);

    boolean isFull();
}
