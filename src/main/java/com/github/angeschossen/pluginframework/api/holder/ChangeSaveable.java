package com.github.angeschossen.pluginframework.api.holder;

public interface ChangeSaveable {
    long getLastChangeSave();

    void save();

    int compareToSave(ChangeSaveable saveable);

    boolean saveChanges();

    void setUserInteractionChange();

    void setSaveChange();

    boolean hasSaveChange();

    void setChangeSaveTime();
}
