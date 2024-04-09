package com.github.angeschossen.pluginframework.api.holder;

import java.util.concurrent.CompletableFuture;

public interface ChangeSaveable {
    long getLastChangeSave();

    CompletableFuture<Void> save();

    boolean forceSaveOnShutdown();

    int compareToSave(ChangeSaveable saveable);

    boolean exists();

    void setUserInteractionChange();

    void setSaveChange(boolean publishRedisImmediately);

    boolean hasSaveChange();

    CompletableFuture<Void> delete();

    void setChangeSaveTime();
}
