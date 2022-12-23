package com.github.angeschossen.pluginframework.api.configuration;

import org.jetbrains.annotations.NotNull;

public interface CommonConfiguration {
    @NotNull String getString(@NotNull String key);
}
