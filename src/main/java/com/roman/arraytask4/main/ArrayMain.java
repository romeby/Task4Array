package com.roman.arraytask4.main;

import com.roman.arraytask4.creator.WarehouseCreator;
import com.roman.arraytask4.creator.impl.WarehouseCreatorImpl;
import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.entity.Warehouse;
import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.reader.ReadFromFile;
import com.roman.arraytask4.reader.impl.ReadFromFileImpl;
import com.roman.arraytask4.repository.specification.AvgSpecificationPredicate;
import com.roman.arraytask4.repository.specification.SpecificationPredicate;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;
import com.roman.arraytask4.util.PositivNegative;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ArrayMain {
    static  Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        int count;
        CustomArray customArray = new CustomArray();
        ReadFromFileImpl readFromFile = new ReadFromFileImpl();
        customArray = readFromFile.arrayReader("data\\dataArray.txt");
        List<CustomArray> customArrays = Arrays.asList(customArray);
        logger.log(Level.INFO, "Array is {}",customArrays);
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        calculationService.average(customArray);
        OptionalDouble testAvg = calculationService.averageStream(customArray);
        SpecificationPredicate predicate = new AvgSpecificationPredicate(testAvg);
        logger.log(Level.INFO, "Test result is {} ", predicate.test(customArray));
        calculationService.sumOfElements(customArray);
        count = calculationService.countPositiveNegative(PositivNegative.POSITIV, customArray);
        System.out.println(count);
        WarehouseCreator warehouseCreator = new WarehouseCreatorImpl();
        System.out.println(warehouseCreator.createArrayFromCustomArrayList(customArrays));
    }


}
