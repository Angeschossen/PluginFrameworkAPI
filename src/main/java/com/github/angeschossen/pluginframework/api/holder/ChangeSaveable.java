package com.github.angeschossen.pluginframework.api.holder;

import java.util.concurrent.CompletableFuture;

public interface ChangeSaveable extends Changeable{
    long getLastChangeSave();

    CompletableFuture<Void> save();

    boolean forceSaveOnShutdown();

    int compareToSave(ChangeSaveable saveable);

    boolean exists();

    void setSaveChange();

    boolean hasSaveChange();

    CompletableFuture<Void> delete();

    void setChangeSaveTime();
}
