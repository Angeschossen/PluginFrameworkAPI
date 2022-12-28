package com.github.angeschossen.pluginframework.api.utils;

import java.util.Locale;

public interface StringUtils {

    static String toUpperCase(String s) {
        return s.toUpperCase(Locale.ENGLISH);
    }

    static String toLowerCase(String s) {
        return s.toLowerCase(Locale.ENGLISH);
    }

    String colorize(String s);
}
