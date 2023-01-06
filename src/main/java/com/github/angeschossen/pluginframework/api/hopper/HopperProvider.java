package com.github.angeschossen.pluginframework.api.hopper;

import com.github.angeschossen.pluginframework.api.hopper.HopperWrapper;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HopperProvider {

    @NotNull Plugin getPlugin();

    @Nullable
    HopperWrapper getHopper(@NotNull World world, int x, int y, int z);
}
