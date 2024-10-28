package com.github.angeschossen.pluginframework.api.player;

import com.github.angeschossen.pluginframework.api.configuration.gui.GUIConfiguration;
import com.github.angeschossen.pluginframework.api.configuration.messages.Messages;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.UUID;

public interface OnlinePlayerData extends PlayerData {
    @NotNull CommandSender getCommandSender();

    Player getPlayer();
}
