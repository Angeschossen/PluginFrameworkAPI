package com.github.angeschossen.pluginframework.api.blockutil.impl;

import java.util.Objects;

public class BlockKey implements com.github.angeschossen.pluginframework.api.blockutil.BlockKey {
    private final int x, y, z;

    public BlockKey(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
