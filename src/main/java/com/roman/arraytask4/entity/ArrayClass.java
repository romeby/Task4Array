package com.roman.arraytask4.entity;

import com.roman.arraytask4.util.IdGenerator;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayClass {
    private int ArrayId;
    private int[] array;

    public ArrayClass() {
        this.ArrayId = IdGenerator.generateArrayId();
    }

    public ArrayClass(int[] array) {
        this.ArrayId= IdGenerator.generateArrayId();
        this.array = array;
    }

    public int getArrayId() {
        return ArrayId;
    }

    public void setArrayId(int arrayId) {
        ArrayId = arrayId;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayClass.class.getSimpleName() + "[", "]")
                .add("ArrayId=" + ArrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
