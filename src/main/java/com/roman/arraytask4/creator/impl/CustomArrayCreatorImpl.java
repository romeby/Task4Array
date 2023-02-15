package com.roman.arraytask4.creator.impl;

import com.roman.arraytask4.creator.CustomArrayCreator;
import com.roman.arraytask4.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    @Override
    public List<CustomArray> createCustomArrayList(List<int[]> arrayList) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] array: arrayList) {
            customArrayList.add(new CustomArray(array));
        }
        return customArrayList;
    }

    @Override
    public CustomArray createCustomArray(int[] array) {
        return new CustomArray(array);
    }
}
