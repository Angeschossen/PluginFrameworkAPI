package com.github.angeschossen.pluginframework.api.utils;

import java.util.Objects;

public class Checks {

    public static void nonNull(Object o, String key) {
        Objects.requireNonNull(o, key + " can't be null");
    }
}
