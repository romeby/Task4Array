package com.roman.arraytask4.creator;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.entity.Warehouse;
import com.roman.arraytask4.repository.ArrayRepository;

import java.util.List;

public interface WarehouseCreator {
    Warehouse createArrayFromCustomArrayList(List<CustomArray> customArrayList);
    Warehouse createArrayFromArrayList(List<int[]> arrayList);
}
