package com.roman.arraytask4.main;

import com.roman.arraytask4.entity.ArrayClass;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;
import com.roman.arraytask4.util.PositivNegative;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        int[] array = {2, 18, 92, -6};
        ArrayClass arrayClass = new ArrayClass(array);
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        calculationService.average(arrayClass);
        calculationService.sumOfElements(arrayClass);
        calculationService.countPositiveNegative(PositivNegative.NEGATIVE, arrayClass);
    }


}
