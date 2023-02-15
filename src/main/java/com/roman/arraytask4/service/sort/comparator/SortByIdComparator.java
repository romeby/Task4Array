package com.roman.arraytask4.service.sort.comparator;

import com.roman.arraytask4.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class SortByIdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArrayId() - o2.getArrayId();
    }
}
