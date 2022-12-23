package com.github.angeschossen.pluginframework.api.configuration;

import org.jetbrains.annotations.NotNull;

public interface Configuration {

    boolean getBoolean(@NotNull String key);

    double getDouble(@NotNull String key);

    int getInt(@NotNull String key);
}
