package com.roman.arraytask4.service.calculation;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.util.PositivNegative;

import java.util.OptionalDouble;

public interface CalculationService {

    int sumOfElements(CustomArray arrayClass);
    int sumStream(CustomArray arrayClass);
    double average(CustomArray arrayClass);
    OptionalDouble averageStream(CustomArray arrayClass);
    int countPositiveNegative(PositivNegative sign, CustomArray arrayClass);
    int countPositiveNegativeStream(PositivNegative sign, CustomArray arrayClass);

}
