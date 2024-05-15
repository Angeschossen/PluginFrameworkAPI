package com.github.angeschossen.pluginframework.api.blockutil;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface UnloadedPosition {
    boolean isTargetServer();

    int getBlockX();

    int getBlockY();

    int getBlockZ();

    int getChunkX();

    int getChunkZ();

    @Nullable
    Location toLocation();

    @Nullable
    World getWorld();

    @NotNull
    String getWorldName();

    double getX();

    double getY();

    double getZ();

    String getServerName();

    float getYaw();

    float getPitch();

    boolean isChunkLoaded();

    boolean isWorldLoaded();

    boolean isSameWorld(@NotNull String worldName);
}
