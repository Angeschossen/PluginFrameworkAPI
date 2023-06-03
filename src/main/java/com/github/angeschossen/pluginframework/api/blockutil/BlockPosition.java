package com.github.angeschossen.pluginframework.api.blockutil;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public interface BlockPosition {

    static com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition of(World world, int x, int y, int z) {
        return new com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition(world, x, y, z);
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
