package com.github.angeschossen.pluginframework.api.blockutil;

import com.google.gson.JsonObject;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IBlockPosition {
    public final World world;
    public int x, y, z;

    public IBlockPosition(World world, int x, int y, int z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public IBlockPosition(Location location) {
        this(location.getWorld(), location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    @Nullable
    public static IBlockPosition fromJson(JsonObject jsonObject) {
        World world = Bukkit.getWorld(jsonObject.get("world").getAsString());
        if (world == null) {
            return null;
        }

        return new IBlockPosition(world, jsonObject.get("x").getAsInt(), jsonObject.get("y").getAsInt(), jsonObject.get("z").getAsInt());
    }

    public final boolean equals(World world, int x, int y, int z) {
        return this.world.equals(world) && this.x == x && this.y == y && this.z == z;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof IBlockPosition)) {
            return false;
        }

        IBlockPosition coordinate = (IBlockPosition) object;
        return coordinate.world.equals(this.world) && coordinate.x == x && coordinate.z == z && coordinate.y == y;
    }

    public final boolean equals(int x, int y, int z) {
        return this.x == x && this.z == z && this.y == y;
    }

    public final int getChunkX() {
        return x >> 4;
    }

    public final int getChunkZ() {
        return z >> 4;
    }

    @NotNull
    public final Location getLocation() {
        return new Location(world, x, y, z);
    }

    @NotNull
    public final World getWorld() {
        return world;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

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

    public final boolean isChunkLoaded() {
        return world.isChunkLoaded(x >> 4, z >> 4);
    }

    public final void set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public final Location toLocation() {
        return new Location(world, x, y, z);
    }

    @Override
    public final String toString() {
        return "Coordinate{world=" + world + ",x=" + this.x + ",y=" + this.y + ",z=" + this.z + '}';
    }
}
