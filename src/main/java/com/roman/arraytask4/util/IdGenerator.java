package com.roman.arraytask4.util;

public class IdGenerator {
    private static int ArrayId;

    private IdGenerator() {
    }

    public static int generateArrayId() {
        return ++ArrayId;
    }
}
