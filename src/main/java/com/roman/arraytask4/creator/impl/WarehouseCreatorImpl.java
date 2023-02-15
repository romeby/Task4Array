package com.roman.arraytask4.creator.impl;

import com.roman.arraytask4.creator.WarehouseCreator;
import com.roman.arraytask4.entity.ArrayStatistics;
import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.entity.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseCreatorImpl implements WarehouseCreator {
    @Override
    public Warehouse createArrayFromCustomArrayList(List<CustomArray> customArrayList) {
        Warehouse warehouse = Warehouse.getInstance();
        for (CustomArray customArray : customArrayList) {
            ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
            warehouse.add(customArray.getArrayId(), arrayStatistics);
        }
        return warehouse;
    }

    @Override
    public Warehouse createArrayFromArrayList(List<int[]> arrayList) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] element : arrayList) {
            customArrayList.add(new CustomArray(element));
        }
        Warehouse warehouse = Warehouse.getInstance();
        for (CustomArray customArray : customArrayList) {
            ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
            warehouse.add(customArray.getArrayId(), arrayStatistics);
        }
        return warehouse;
    }
}
