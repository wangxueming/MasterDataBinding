package com.sample.databindingsample.utils;

/**
 * Created by magic on 2016/9/27.
 */

public class MyStringUtils {
    public static String replaceSpecValus(String value) {
        return value.replace("-", "???");
    }
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}
