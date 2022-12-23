package com.github.angeschossen.pluginframework.api.exceptions;

public class NoAccessException extends RuntimeException {
    public NoAccessException(String errorMessage) {
        super(errorMessage);
    }

}
