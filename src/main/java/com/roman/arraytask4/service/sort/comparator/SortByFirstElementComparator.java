package com.roman.arraytask4.service.sort.comparator;

import com.roman.arraytask4.entity.CustomArray;

import java.util.Comparator;

public class SortByFirstElementComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArray()[0] - o2.getArray()[0];
    }
}
