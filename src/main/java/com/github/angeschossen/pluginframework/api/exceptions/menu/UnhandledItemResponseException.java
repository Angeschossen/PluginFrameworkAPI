package com.github.angeschossen.pluginframework.api.exceptions.menu;

public class UnhandledItemResponseException extends RuntimeException {

    public UnhandledItemResponseException(){
        super("Unhandled item response");
    }
}
