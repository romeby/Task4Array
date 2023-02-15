package com.roman.arraytask4.service.sort.comparator;

import com.roman.arraytask4.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class SortByAverageComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return (int) (Arrays.stream(o1.getArray()).average().getAsDouble()
                        - Arrays.stream(o2.getArray()).average().getAsDouble());
    }
}
