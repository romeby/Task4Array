package com.roman.arraytask4.entity;

import com.roman.arraytask4.util.IdGenerator;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class CustomArray {
    private int arrayId;
    private int[] array;

    public CustomArray() {
        this.arrayId = IdGenerator.generateArrayId();
    }

    public CustomArray(int[] array) {
        this.arrayId = IdGenerator.generateArrayId();
        this.array = array;
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        if(this.arrayId > 0) {
            this.arrayId = arrayId;
        } else {
            this.arrayId = new Random().nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("ArrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
