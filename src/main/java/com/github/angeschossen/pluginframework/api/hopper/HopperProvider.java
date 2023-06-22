package com.github.angeschossen.pluginframework.api.hopper;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HopperProvider {

    @NotNull String getName();

    boolean isEnabled();

    @Nullable
    HopperWrapper getHopper(@NotNull World world, int x, int y, int z);
}
