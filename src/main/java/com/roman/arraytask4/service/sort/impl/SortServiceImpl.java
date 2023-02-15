package com.roman.arraytask4.service.sort.impl;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.service.sort.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortServiceImpl implements SortService {
    static Logger logger = LogManager.getLogger();
    String emptyMsg = "Empty array";
    String noElementMsg = "No elements for sorting";
    @Override
    public void bubbleSort(CustomArray array) throws CustomException {
        int[] sortArray = array.getArray();
        int swap;
        if (sortArray == null) {
            throw new CustomException(emptyMsg);
        }
        if (sortArray.length > 1) {
            for (int i = 0; i < sortArray.length; i++) {
                if (sortArray[i] <= sortArray[i + 1]) {
                    swap = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = swap;
                }
            }
            array.setArray(sortArray);
        } else {
            logger.log(Level.INFO, noElementMsg, sortArray);
        }
    }


    @Override
    public void insertionSort(CustomArray array) throws CustomException {
        int[] sortArray = array.getArray();
        if (sortArray == null) {
            throw new CustomException(emptyMsg);
        }
        int j;
        if (sortArray.length > 1) {
            for (int i = 1; i < sortArray.length; i++) {
                int swap = sortArray[i];
                for ( j = i; j > 0 && swap < sortArray[j - 1] ; j--) {
                    sortArray[j] = sortArray[j - 1];
                }
                sortArray[j] = swap;
            }
            array.setArray(sortArray);
        } else {
            logger.log(Level.INFO, noElementMsg, sortArray);
        }
    }

    @Override
    public void selectionSort(CustomArray array) throws CustomException {
        int[] sortArray = array.getArray();
        if (sortArray == null){
            throw new CustomException(emptyMsg);
        }
        if (sortArray.length > 1) {
            for (int i = 0; i < sortArray.length; i++) {
                int position = i;
                int min = sortArray[i];
                for (int j = 1 + i; j < sortArray.length; j++) {
                    if (sortArray[j] < min) {
                        position = j;
                        min = sortArray[j];
                    }
                }
                sortArray[position] = sortArray[i];
                sortArray[i] = min;
            }
            array.setArray(sortArray);
        } else {
            logger.log(Level.INFO, noElementMsg, sortArray);
        }
    }

    @Override
    public void streamSort(CustomArray array) throws CustomException {
        int[] sortArray = array.getArray();
        if (sortArray == null){
            throw new CustomException(emptyMsg);
        }
        if (sortArray.length > 1) {
            array.setArray(Arrays.stream(array.getArray()).sorted().toArray());
        } else {
            logger.log(Level.INFO, noElementMsg, sortArray);
        }
    }

    @Override
    public List<CustomArray> sortByComparator(Comparator<CustomArray> comparator, List<CustomArray> customArrayList) {
        Collections.sort(customArrayList,comparator);
        return customArrayList;
    }
}
