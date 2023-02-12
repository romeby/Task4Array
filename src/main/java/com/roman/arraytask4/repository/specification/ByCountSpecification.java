package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;
import com.roman.arraytask4.util.PositivNegative;

public class ByCountSpecification implements Specification{
    private int countInput;
    private PositivNegative positivNegative;

    public ByCountSpecification(int countInput, PositivNegative positivNegative) {
        this.countInput = countInput;
        this.positivNegative = positivNegative;
    }

    @Override
    public boolean specify(CustomArray array) {
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        int count = calculationService.countPositiveNegativeStream(positivNegative,array);
            return countInput > count;
    }
}
