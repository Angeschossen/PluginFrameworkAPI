package com.github.angeschossen.pluginframework.api.blockutil;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public interface BlockPosition {

    @NotNull
    static com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition of(World world, int x, int y, int z) {
        return new com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition(world, x, y, z);
    }

    @NotNull
    static com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition of(Location location) {
        return new com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition(location.getWorld(), location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    int getChunkX();

    int getChunkZ();

    @NotNull World getWorld();

    int getX();

    int getY();

    int getZ();

    boolean isChunkLoaded();

    @NotNull Location toLocation();
}
