package com.github.angeschossen.pluginframework.api.holder;

import org.jetbrains.annotations.NotNull;

public interface SQLNameable {

    @NotNull
    String getTableName();

    @NotNull
    String getName();
}
