package com.github.angeschossen.pluginframework.api.blockutil;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public interface Coordinate {
    int getX();

    int getY();

    int getZ();

    int getChunkX();

    int getChunkZ();

    @NotNull World getWorld();

    @NotNull Location getLocation();
}
