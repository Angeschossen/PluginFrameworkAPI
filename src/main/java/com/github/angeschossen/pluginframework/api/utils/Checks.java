package com.github.angeschossen.pluginframework.api.utils;

import org.bukkit.Bukkit;

import java.util.Objects;

public class Checks {

    public static <T> T requireNonNull(T o, String key) {
        Objects.requireNonNull(o, key + " can't be null");
        return o;
    }

    public static void isSync() {
        if (!Bukkit.isPrimaryThread()) {
            throw new IllegalStateException("Must be called sync");
        }
    }
}
