package com.roman.arraytask4.service.calculation;

import com.roman.arraytask4.entity.ArrayClass;
import com.roman.arraytask4.util.PositivNegative;

public interface CalculationService {

    public int sumOfElements(ArrayClass arrayClass);
    public double average(ArrayClass arrayClass);
    public int countPositiveNegative(PositivNegative sign, ArrayClass arrayClass);
}
