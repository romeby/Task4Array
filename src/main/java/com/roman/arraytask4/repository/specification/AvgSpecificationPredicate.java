package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgSpecificationPredicate implements SpecificationPredicate{
    private OptionalDouble average;

    public AvgSpecificationPredicate() {
    }

    public AvgSpecificationPredicate(OptionalDouble average) {
        this.average = average;
    }

    @Override
    public boolean test(CustomArray array) {
        return Arrays.stream(array.getArray()).average().equals(average);
    }
}
