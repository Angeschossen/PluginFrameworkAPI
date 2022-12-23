package com.github.angeschossen.pluginframework.api.economy;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface EconomyIntegration {
    boolean bankCreate(@NotNull String id, @NotNull OfflinePlayer offlinePlayer);

    boolean bankDeposit(@NotNull String id, double d);

    double getBalance(@NotNull UUID uuid);

    double getBalance(@NotNull OfflinePlayer op);

    @NotNull
    String getServerBankId();

    boolean give(@NotNull UUID playerUUID, double value);

    boolean give(@NotNull OfflinePlayer op, double value);

    boolean has(@NotNull UUID playerUUID, double value);

    boolean has(@NotNull OfflinePlayer op, double value);

    @NotNull String getName();

    boolean pay(@NotNull OfflinePlayer from, double value, @NotNull OfflinePlayer to);

    boolean take(@NotNull UUID playerUUID, double value);

    boolean take(@NotNull OfflinePlayer op, double value);

    @NotNull Plugin getPlugin();
}
