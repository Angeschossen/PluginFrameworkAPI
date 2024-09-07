package com.github.angeschossen.pluginframework.api.scheduling.task;

public interface Task {

    boolean isCancelled();

    boolean isSync();

    void cancel();
}
