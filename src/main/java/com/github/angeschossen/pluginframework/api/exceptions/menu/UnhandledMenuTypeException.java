package com.github.angeschossen.pluginframework.api.exceptions.menu;

public class UnhandledMenuTypeException extends RuntimeException{
    public UnhandledMenuTypeException(){
        super("Unhandled menu type");
    }

}
