package com.roman.arraytask4.repository.specification;

import com.roman.arraytask4.entity.CustomArray;

public class IdSpecification implements Specification{
    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() == id;
    }
}
