package com.github.angeschossen.pluginframework.api.roles.settings;

public interface Setting {
    int getId();

    String getBypassPermission();

    String getName();

    SettingType getType();

    String getTogglePermission();

    String getMessageKey();
}
