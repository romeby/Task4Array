package com.roman.arraytask4.service.sort;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;

public interface SortService {

    void bubbleSort(CustomArray array) throws CustomException;
    void insertionSort(CustomArray array) throws CustomException;
    void selectionSort(CustomArray array) throws CustomException;
    void streamSort(CustomArray array) throws CustomException;
}
