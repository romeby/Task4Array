package com.roman.arraytask4.service.calculation.impl;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.calculation.CalculationService;
import com.roman.arraytask4.util.PositivNegative;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculationServiceImpl implements CalculationService {

    static Logger logger = LogManager.getLogger();
    @Override
    public int sumOfElements(CustomArray arrayClass) {
        int[] array = arrayClass.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public int sumStream(CustomArray arrayClass) {
        return Arrays.stream(arrayClass.getArray()).sum();
    }

    @Override
    public double average(CustomArray arrayClass) {
        int[] array = arrayClass.getArray();
        double average = 0;
        int sum = sumOfElements(arrayClass);
        average = (double) sum / array.length;
        return average;
    }

    @Override
    public OptionalDouble averageStream(CustomArray arrayClass) {
        return Arrays.stream(arrayClass.getArray()).average();
    }

    @Override
    public int countPositiveNegative(PositivNegative sign, CustomArray arrayClass) {
        PositivNegative positivNegative = sign;
        int[] array = arrayClass.getArray();
        int count = 0;
        switch (positivNegative) {
            case NEGATIVE -> {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        count += 1;
                    }
                }
                logger.log(Level.INFO, "Negative numbers {} = ", count);
                return count;
            }
            case POSITIV -> {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > 0) {
                        count += 1;
                    }
                }
                logger.log(Level.INFO, "Positive numbers {} = ", count);
                return count;
            }
        }
        return count;
    }

    @Override
    public int countPositiveNegativeStream(PositivNegative sign, CustomArray arrayClass) {
        int count = 0;
        if (sign == PositivNegative.NEGATIVE) {
            count = Math.toIntExact(Arrays.stream(arrayClass.getArray()).filter(i -> i < 0).count());
            return count;
        } else if (sign == PositivNegative.POSITIV) {
            count = Math.toIntExact(Arrays.stream(arrayClass.getArray()).filter(i -> i > 0).count());
            return count;
        }
        return count;
    }
}
