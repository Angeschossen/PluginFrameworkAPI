package com.github.angeschossen.pluginframework.api.exceptions;

public class NameAlreadyTakenException extends RuntimeException {

    public NameAlreadyTakenException(String errorMessage) {
        super(errorMessage);
    }
}
