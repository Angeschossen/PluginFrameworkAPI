package com.github.angeschossen.pluginframework.api.blockutil;

import org.jetbrains.annotations.NotNull;

public interface ChunkCoordinate {
    int getX();

    int getZ();

    @NotNull
    static com.github.angeschossen.pluginframework.api.blockutil.impl.ChunkCoordinate of(int x, int z) {
        return new com.github.angeschossen.pluginframework.api.blockutil.impl.ChunkCoordinate(x, z);
    }
}
