package com.roman.arraytask4.creator;

import com.roman.arraytask4.entity.CustomArray;

import java.util.List;

public interface CustomArrayCreator {
    public List<CustomArray> createCustomArrayList(List<int[]> arrayList);
    public CustomArray createCustomArray(int[] array);
}
