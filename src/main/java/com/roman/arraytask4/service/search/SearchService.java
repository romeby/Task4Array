package com.roman.arraytask4.service.search;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.util.EvenOdd;
import com.roman.arraytask4.util.MinMax;

public interface SearchService {
    int searchMinMax(MinMax value, CustomArray arrayClass);
    int[] changeToEvenOdd(EvenOdd value, CustomArray arrayClass);
}
