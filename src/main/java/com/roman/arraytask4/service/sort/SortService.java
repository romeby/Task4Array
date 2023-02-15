package com.roman.arraytask4.service.sort;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;

import java.util.Comparator;
import java.util.List;

public interface SortService {

    void bubbleSort(CustomArray array) throws CustomException;
    void insertionSort(CustomArray array) throws CustomException;
    void selectionSort(CustomArray array) throws CustomException;
    void streamSort(CustomArray array) throws CustomException;
    public List<CustomArray> sortByComparator(Comparator<CustomArray> comparator, List<CustomArray> customArray);

}
