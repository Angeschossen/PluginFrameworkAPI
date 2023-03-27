package com.github.angeschossen.pluginframework.api.hopper;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public interface PluginHopperProvider extends HopperProvider {

    @NotNull Plugin getPlugin();
}
