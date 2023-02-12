package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;

public class BetweenSpecification implements Specification{
    private int begin;
    private int end;

    public BetweenSpecification(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public boolean specify(CustomArray array) {
        return (array.getArrayId() >= begin) && (array.getArrayId() <= end);
    }
}
