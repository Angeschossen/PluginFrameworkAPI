package com.github.angeschossen.pluginframework.api.blockutil.impl;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BlockKey implements com.github.angeschossen.pluginframework.api.blockutil.BlockKey {
    private final int x, y, z;
    private final World world;

    public BlockKey(@NotNull World world, int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.world = world;
    }

    public BlockKey(@NotNull Location location) {
        this(Objects.requireNonNull(location.getWorld(), "world must not be null"), location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }


    @NotNull
    public final Location toLocation() {
        return new Location(world, x, y, z);
    }

    @Override
    public final int getChunkX() {
        return x >> 4;
    }

    @Override
    public final int getChunkZ() {
        return z >> 4;
    }

    @NotNull
    public World getWorld() {
        return world;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BlockKey)) {
            return false;
        }

        BlockKey coordinate = (BlockKey) object;
        return coordinate.x == x && coordinate.y == y && coordinate.z == z;
    }
}
