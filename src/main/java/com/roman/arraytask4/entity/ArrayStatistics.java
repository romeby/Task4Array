package com.roman.arraytask4.entity;

import com.roman.arraytask4.service.calculation.impl.CalculationServiceImpl;
import com.roman.arraytask4.service.search.impl.SearchServiceImpl;
import com.roman.arraytask4.util.MinMax;

import java.util.OptionalDouble;
import java.util.StringJoiner;

public class ArrayStatistics {
    OptionalDouble average;
    int sum, max, min;


    public ArrayStatistics(CustomArray customArray) {
        CalculationServiceImpl service = new CalculationServiceImpl();
        this.average = service.averageStream(customArray);
        this.sum = service.sumStream(customArray);
        SearchServiceImpl searchService = new SearchServiceImpl();
        this.min = searchService.searchMinMax(MinMax.MIN, customArray);
        this.max = searchService.searchMinMax(MinMax.MAX, customArray);
    }

    public int getSum() {
        return sum;
    }

    public OptionalDouble getAverage() {
        return average;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayStatistics.class.getSimpleName() + "[", "]")
                .add("average=" + average)
                .add("sum=" + sum)
                .add("max=" + max)
                .add("min=" + min)
                .toString();
    }
}
