package com.github.angeschossen.pluginframework.api.handler;

import org.jetbrains.annotations.NotNull;

public class APIHandler {
    private final String serverName;
    private static APIHandler instance;

    public APIHandler(@NotNull String serverName) {
        if (APIHandler.instance != null) {
            throw new IllegalStateException("Already initialized");
        }

        APIHandler.instance = this;
        this.serverName = serverName;
    }

    public static APIHandler getInstance() {
        return instance;
    }

    public String getServerName() {
        return serverName;
    }
}
