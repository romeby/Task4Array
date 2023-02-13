package com.roman.arraytask4.main;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.reader.ReadFromFile;
import com.roman.arraytask4.reader.impl.ReadFromFileImpl;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;
import com.roman.arraytask4.util.PositivNegative;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        int[] array = {2, -18, 92, -6, 0, 33};
        CustomArray customArray = new CustomArray(array);
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        ReadFromFileImpl readFromFile = new ReadFromFileImpl();
        customArray =  readFromFile.arrayReader("data\\dataArray.txt");
        logger.log(Level.INFO, "Array is {}",customArray);
//        calculationService.average(customArray);
//        calculationService.sumOfElements(customArray);
//        int count = calculationService.countPositiveNegative(PositivNegative.POSITIV, customArray);
//        logger.log(Level.INFO,  + count);
    }


}
