package com.roman.arraytask4.observer.impl;

import com.roman.arraytask4.entity.ArrayStatistics;
import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.entity.Warehouse;
import com.roman.arraytask4.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {
    @Override
    public void changeElementArray(CustomArray customArray) {
        ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
        int arrayId = customArray.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.add(arrayId, arrayStatistics);
    }
}
