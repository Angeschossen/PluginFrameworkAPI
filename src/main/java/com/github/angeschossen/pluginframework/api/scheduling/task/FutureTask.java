package com.github.angeschossen.pluginframework.api.scheduling.task;

import java.util.concurrent.CompletableFuture;

public interface FutureTask<T> extends Task {
    CompletableFuture<T> getCompletableFuture();
}
