package com.roman.arraytask4.service.sort.comparator;

import com.roman.arraytask4.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class SortByNumberOfElementsComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArray().length - o2.getArray().length;
    }
}
