package com.roman.arraytask4.service.search.impl;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.search.SearchService;
import com.roman.arraytask4.util.EvenOdd;
import com.roman.arraytask4.util.MinMax;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchServiceImpl implements SearchService {
    static Logger logger = LogManager.getLogger();
    @Override
    public int searchMinMax(MinMax minMax, CustomArray arrayClass) {
        int[] array = arrayClass.getArray();
        int min = array[0];
        int max = array[0];
        int result = 0;
        switch (minMax){
            case MIN -> {
                for (int element : array) {
                    if (element < min) {
                        min = element;
                    }
                }
                result = min;
            }
            case MAX -> {
                for (int element : array) {
                    if (element > max) {
                        max = element;
                    }
                }
                result = max;
            }
            default -> logger.log (Level.INFO, "Oops. Something goes wrong");
        }
        return result;
    }

    @Override
    public int[] changeToEvenOdd(EvenOdd evenOdd, CustomArray arrayClass) {
        int[] array = arrayClass.getArray();
        switch (evenOdd) {
            case EVEN -> {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 != 0) {
                        array[i] = array[i] + 1;
                    }
                }
                return array;
            }
            case ODD -> {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array[i] = array[i] - 1;
                    }
                }
                return array;
            }
        }
        return array;
    }

}
