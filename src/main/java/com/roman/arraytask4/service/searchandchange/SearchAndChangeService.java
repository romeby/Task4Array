package com.roman.arraytask4.service.searchandchange;

import com.roman.arraytask4.entity.ArrayClass;
import com.roman.arraytask4.util.EvenOdd;
import com.roman.arraytask4.util.MinMax;

public interface SearchAndChangeService {
    public int searchMinMax(MinMax value, ArrayClass arrayClass);
    public int[] changeToEvenOdd(EvenOdd value, ArrayClass arrayClass);
}
