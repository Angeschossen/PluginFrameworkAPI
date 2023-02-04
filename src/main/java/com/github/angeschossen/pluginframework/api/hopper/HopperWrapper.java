package com.github.angeschossen.pluginframework.api.hopper;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public interface HopperWrapper {

    @Nullable ItemStack addItem(ItemStack item, boolean delete);

    boolean isFull();
}
