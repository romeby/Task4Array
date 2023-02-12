package com.roman.arraytask4.service.sort;

import com.roman.arraytask4.entity.OwnArray;
import com.roman.arraytask4.exception.CustomException;

public interface SortService {

    void bubbleSort(OwnArray array) throws CustomException;
    void insertionSort(OwnArray array) throws CustomException;
    void selectionSort(OwnArray array) throws CustomException;
}
