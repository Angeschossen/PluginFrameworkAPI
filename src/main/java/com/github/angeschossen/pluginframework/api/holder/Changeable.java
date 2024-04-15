package com.github.angeschossen.pluginframework.api.holder;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public interface Changeable {

    @NotNull
    CompletableFuture<Void> saveAndPublishToRedis();
}
