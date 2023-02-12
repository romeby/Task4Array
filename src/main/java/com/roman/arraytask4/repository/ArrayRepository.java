package com.roman.arraytask4.repository;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.repository.specification.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepository(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    public void setCustomArrays(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> resultArray = new ArrayList<>();
        for (CustomArray array: customArrays) {
            if (specification.specify(array)){
                resultArray.add(array);
            }
        }
        return resultArray;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("customArrays=" + customArrays)
                .toString();
    }
}
