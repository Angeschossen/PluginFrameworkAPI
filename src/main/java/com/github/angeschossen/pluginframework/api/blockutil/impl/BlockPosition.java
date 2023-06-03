package com.github.angeschossen.pluginframework.api.blockutil.impl;

import com.google.gson.JsonObject;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockPosition implements com.github.angeschossen.pluginframework.api.blockutil.BlockPosition {
    public final World world;
    public final int x, y, z;

    public BlockPosition(World world, int x, int y, int z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BlockPosition(Location location) {
        this(location.getWorld(), location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    @Nullable
    public static BlockPosition fromJson(JsonObject jsonObject) {
        World world = Bukkit.getWorld(jsonObject.get("world").getAsString());
        if (world == null) {
            return null;
        }

        return new BlockPosition(world, jsonObject.get("x").getAsInt(), jsonObject.get("y").getAsInt(), jsonObject.get("z").getAsInt());
    }

    public final boolean equals(World world, int x, int y, int z) {
        return this.world.equals(world) && this.x == x && this.y == y && this.z == z;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof BlockPosition)) {
            return false;
        }

        BlockPosition coordinate = (BlockPosition) object;
        return coordinate.world.equals(this.world) && coordinate.x == x && coordinate.z == z && coordinate.y == y;
    }

    public final boolean equals(int x, int y, int z) {
        return this.x == x && this.z == z && this.y == y;
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
    @Override
    public final Location toLocation() {
        return new Location(world, x, y, z);
    }

    @NotNull
    @Override
    public final World getWorld() {
        return world;
    }

    @Override
    public final int getX() {
        return x;
    }

    @Override
    public final int getY() {
        return y;
    }

    @Override
    public final int getZ() {
        return z;
    }

    @Override
    public final int hashCode() {
        int hash = 17;
        hash = hash * 31 + x;
        hash = hash * 31 + y;
        hash = hash * 31 + z;
        return hash;
    }

    @Override
    public final boolean isChunkLoaded() {
        return world.isChunkLoaded(x >> 4, z >> 4);
    }

    @NotNull
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("world", world.getName());
        jsonObject.addProperty("x", x);
        jsonObject.addProperty("y", y);
        jsonObject.addProperty("z", z);

        return jsonObject;
    }

    @Override
    public final String toString() {
        return "BlockPosition{world=" + world + ",x=" + this.x + ",y=" + this.y + ",z=" + this.z + '}';
    }
}
