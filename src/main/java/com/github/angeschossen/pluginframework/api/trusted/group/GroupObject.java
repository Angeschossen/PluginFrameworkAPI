package com.github.angeschossen.pluginframework.api.trusted.group;

import org.bukkit.inventory.ItemStack;

public interface GroupObject {
    String getName();

    Enum<?> getKey();

    ItemStack getIcon();
}
