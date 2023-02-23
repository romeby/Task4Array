package com.roman.arraytask4.entity;

import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.observer.ArrayStatisticsObserver;
import com.roman.arraytask4.observer.impl.ArrayStatisticsObserverImpl;
import com.roman.arraytask4.util.IdGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class CustomArray {
    private int arrayId;
    private int[] array;
    private ArrayStatisticsObserver observer;


    public CustomArray() {
        this.arrayId = IdGenerator.generateArrayId();
        observer = new ArrayStatisticsObserverImpl();
    }

    public CustomArray(int[] array) {
        this.arrayId = IdGenerator.generateArrayId();
        this.array = array;
        observer = new ArrayStatisticsObserverImpl();
    }

    public void addObserver(){
        observer = new ArrayStatisticsObserverImpl();
    }

    public void removeObserver(){
        observer = null;
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

    public void setElement(int index, int value) throws CustomException {
        array[index] = value;
        notifyObserver();
    }

    public void setArray(int[] array) throws CustomException {
        if(array != null && array.length > 0) {
            this.array = array;
        } else {
            this.array = new int[]{0};
        }
        notifyObserver();
    }

    private void notifyObserver() throws CustomException {
        if (observer != null) {
            observer.changeElementArray(this);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("arrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
