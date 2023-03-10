package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.search.impl.SearchServiceImpl;
import com.roman.arraytask4.util.MinMax;

public class MaxSpecification implements Specification{
    private int maxInput;
    private MinMax minMax = MinMax.MAX;

    public MaxSpecification(int maxInput) {
        this.maxInput = maxInput;
    }

    @Override
    public boolean specify(CustomArray array) {
        SearchServiceImpl searchService = new SearchServiceImpl();
        int resultMax = searchService.searchMinMax(minMax, array);
        return resultMax < maxInput;
    }
}
