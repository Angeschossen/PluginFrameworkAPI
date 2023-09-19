package com.github.angeschossen.pluginframework.api.player;

import com.github.angeschossen.pluginframework.api.configuration.gui.GUIConfiguration;
import com.github.angeschossen.pluginframework.api.configuration.messages.Messages;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public interface PlayerData {
    @NotNull CommandSender getCommandSender();

    @NotNull
    Messages getMessages();

    GUIConfiguration getGUIConfig();

    @NotNull Locale getLocale();
}
