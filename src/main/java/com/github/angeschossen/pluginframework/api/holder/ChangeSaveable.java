package com.github.angeschossen.pluginframework.api.holder;

import java.util.concurrent.CompletableFuture;

public interface ChangeSaveable {
    long getLastChangeSave();

    CompletableFuture<Void> save();

    int compareToSave(ChangeSaveable saveable);

    boolean exists();

    void setUserInteractionChange();

    void setSaveChange();

    boolean hasSaveChange();

    CompletableFuture<Void> delete();

    void setChangeSaveTime();
}
