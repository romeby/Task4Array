package com.roman.arraytask4.creator.impl;

import com.roman.arraytask4.creator.RepositoryCreator;
import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.repository.ArrayRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCreatorImpl implements RepositoryCreator {
    @Override
    public ArrayRepository createArrayFromCustomArrayList(List<CustomArray> customArrayList) {
        return new ArrayRepository(customArrayList);
    }

    @Override
    public ArrayRepository createArrayFromArrayList(List<int[]> arrayList) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] array: arrayList) {
            customArrayList.add(new CustomArray(array));
        }
        return new ArrayRepository(customArrayList);
    }
}
