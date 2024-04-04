package com.github.angeschossen.pluginframework.api.handler;

import org.jetbrains.annotations.NotNull;

public class APIHandler {
    private final String serverName;
    private static APIHandler instance;
    private final MultiPaperHandler multiPaperHandler;

    public APIHandler(@NotNull String serverName, @NotNull MultiPaperHandler multiPaperHandler) {
        if (APIHandler.instance != null) {
            throw new IllegalStateException("Already initialized");
        }

        APIHandler.instance = this;
        this.serverName = serverName;
        this.multiPaperHandler = multiPaperHandler;
    }

    public static APIHandler getInstance() {
        return instance;
    }

    @NotNull
    public final MultiPaperHandler getMultiPaperHandler() {
        return multiPaperHandler;
    }

    public String getServerName() {
        return serverName;
    }
}
