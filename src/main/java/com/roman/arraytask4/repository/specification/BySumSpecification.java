package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;

public class BySumSpecification implements Specification{
    private int sumInput;

    public BySumSpecification(int sumInput) {
        this.sumInput = sumInput;
    }

    @Override
    public boolean specify(CustomArray array) {
        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        int sum = calculationService.sumStream(array);
        return sum < sumInput;
    }
}
