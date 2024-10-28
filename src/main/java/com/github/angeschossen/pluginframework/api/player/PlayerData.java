package com.github.angeschossen.pluginframework.api.player;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface PlayerData extends PlayerDataBase {
    @NotNull CommandSender getCommandSender();

    Player getPlayer();
}
