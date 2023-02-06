package com.roman.arraytask4.service.calculation.impl;

import com.roman.arraytask4.entity.ArrayClass;
import com.roman.arraytask4.service.calculation.CalculationService;
import com.roman.arraytask4.util.PositivNegative;

public class CalculationServiceImpl implements CalculationService {

    @Override
    public int sumOfElements(ArrayClass arrayClass) {
        int[] array = arrayClass.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public double average(ArrayClass arrayClass) {
        int[] array = arrayClass.getArray();
        double average = 0;
        int sum = sumOfElements(arrayClass);
        average = (double) sum / array.length;
        return average;
    }

    @Override
    public int countPositiveNegative(PositivNegative sign, ArrayClass arrayClass) {
        PositivNegative positivNegative = sign;
        int[] array = arrayClass.getArray();
        int negativeCount = 0;
        int positiveCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCount += 1;
            } else if (array[i] > 0) {
                positiveCount += 1;
            }
        }
        return switch (positivNegative){
            case NEGATIVE -> negativeCount;
            case POSITIV -> positiveCount;
            };
        }

}
