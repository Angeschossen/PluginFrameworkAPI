package com.github.angeschossen.pluginframework.api.player;

import com.github.angeschossen.pluginframework.api.configuration.gui.GUIConfiguration;
import com.github.angeschossen.pluginframework.api.configuration.messages.Messages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.UUID;

public interface PlayerData {

    @NotNull
    Messages getMessages();

    Object sendMessage(String message, @Nullable String[] p, @Nullable String[] v, int in, int stay, int out,
                       boolean checkLastMsg);

    UUID getUUID();

    GUIConfiguration getGUILocale();

    GUIConfiguration getBedrockGUILocale();

    @NotNull Locale getLocale();
}
