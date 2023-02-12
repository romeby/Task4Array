package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.service.search.impl.SearchServiceImpl;
import com.roman.arraytask4.util.MinMax;

public class ByMinSpecification implements Specification{
    private int minInput;
    private MinMax minMax = MinMax.MIN;

    public ByMinSpecification(int minInput) {
        this.minInput = minInput;
    }

    @Override
    public boolean specify(CustomArray array) {
        SearchServiceImpl searchService = new SearchServiceImpl();
        int resultMin = searchService.searchMinMax(minMax, array);
        return resultMin > minInput;
    }
}
