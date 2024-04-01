package com.github.angeschossen.pluginframework.api.blockutil.impl;

import com.github.angeschossen.pluginframework.api.handler.APIHandler;
import com.google.gson.JsonObject;
import jdk.tools.jlink.internal.Jlink;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OfflineBlockCoordinate {

    private String worldName, serverName;
    private float yaw, pitch;
    private double x, y, z;

    public OfflineBlockCoordinate(String serverName, String worldName, double x, double y, double z) {
        this(serverName, worldName, x, y, z, 0, 0);
    }

    public OfflineBlockCoordinate(Position position) {
        this(APIHandler.getInstance().getServerName(), position.world.getName(), position.x, position.y, position.z);
    }

    public OfflineBlockCoordinate(String serverName, String worldName, double x, double y, double z, float yaw, float pitch) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.serverName = serverName;
        this.worldName = worldName;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public OfflineBlockCoordinate() {

    }

    public final boolean isTargetServer() {
        return APIHandler.getInstance().getServerName().equals(serverName);
    }

    public OfflineBlockCoordinate(@NotNull Location location) {
        this(APIHandler.getInstance().getServerName(), location.getWorld().getName(), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public static OfflineBlockCoordinate fromJson(@NotNull JsonObject jsonObject) {
        return new OfflineBlockCoordinate(jsonObject.has("server") ? jsonObject.get("server").getAsString() : APIHandler.getInstance().getServerName(), jsonObject.get("world").getAsString(), jsonObject.get("x").getAsDouble(), jsonObject.get("y").getAsDouble(), jsonObject.get("z").getAsDouble(), jsonObject.get("yaw").getAsFloat(), jsonObject.get("pitch").getAsFloat());
    }

    public boolean equals(String serverName, World world, int x, int y, int z) {
        if (!serverName.equals(this.serverName) || !world.equals(getWorld())) {
            return false;
        }

        return x == this.x && y == this.y && z == this.z;
    }

    public int getBlockX() {
        return (int) x;
    }

    public int getBlockY() {
        return (int) y;
    }

    public int getBlockZ() {
        return (int) z;
    }

    public int getChunkX() {
        return (int) x >> 4;
    }

    public int getChunkZ() {
        return (int) z >> 4;
    }

    @Nullable
    public final Location toLocation() {
        if (!isTargetServer()) {
            return null;
        }

        World world = getWorld();
        return world == null ? null : new Location(world, x, y, z, yaw, pitch);
    }

    @Nullable
    public final World getWorld() {
        return Bukkit.getWorld(getWorldName());
    }

    @NotNull
    public String getWorldName() {
        return worldName;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getServerName() {
        return serverName;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public boolean isChunkLoaded() {
        World world = getWorld();
        if (world == null) {
            return false;
        }

        return world.isChunkLoaded(getChunkX(), getChunkZ());
    }

    public boolean isLoaded() {
        return getWorld() != null;
    }

    public JsonObject toJsonObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("server", serverName);
        jsonObject.addProperty("world", worldName);
        jsonObject.addProperty("x", x);
        jsonObject.addProperty("y", y);
        jsonObject.addProperty("z", z);
        jsonObject.addProperty("yaw", yaw);
        jsonObject.addProperty("pitch", pitch);
        return jsonObject;
    }
}
