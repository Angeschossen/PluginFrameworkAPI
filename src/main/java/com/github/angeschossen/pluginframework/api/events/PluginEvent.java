package com.github.angeschossen.pluginframework.api.events;

import com.google.common.collect.ImmutableMap;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;

public abstract class PluginEvent extends Event {

    public PluginEvent() {
        super(!Bukkit.isPrimaryThread());
    }

    public abstract void setAffectedPlayers(ImmutableMap.@NotNull Builder<String, Collection<UUID>> builder);

    public abstract void setExpressionVariables(ImmutableMap.@NotNull Builder<String, Object> builder);

    @Nullable
    public String getLogInfo() {
        return null;
    }
}
