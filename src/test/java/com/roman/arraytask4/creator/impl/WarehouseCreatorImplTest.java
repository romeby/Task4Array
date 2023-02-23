package com.roman.arraytask4.creator.impl;

import com.roman.arraytask4.creator.WarehouseCreator;
import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.reader.impl.ReadFromFileImpl;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class WarehouseCreatorImplTest {

    @Test
    public void testCreateArrayFromCustomArrayList() throws CustomException {
        ReadFromFileImpl readFromFile = new ReadFromFileImpl();
        CustomArray customArray = readFromFile.arrayReader("data\\dataArray.txt");
        List<CustomArray> customArrays = Arrays.asList(customArray);
        WarehouseCreator warehouseCreator =  new WarehouseCreatorImpl();
        warehouseCreator.createArrayFromCustomArrayList(customArrays);
    }

    @Test
    public void testCreateArrayFromArrayList() {
        WarehouseCreator warehouseCreator = new WarehouseCreatorImpl();
        List<int[]> array = new ArrayList<>();
        warehouseCreator.createArrayFromArrayList(array);
    }
}