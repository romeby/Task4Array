package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;

import java.util.OptionalDouble;

public class AvgSpecification implements Specification{
    private OptionalDouble averageInput;

    public AvgSpecification(OptionalDouble averageInput) {
        this.averageInput = averageInput;
    }

    @Override
    public boolean specify(CustomArray array) {
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        OptionalDouble average = calculationService.averageStream(array);
        return averageInput.getAsDouble() > average.getAsDouble();
    }
}
