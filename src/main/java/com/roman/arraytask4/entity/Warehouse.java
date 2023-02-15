package com.roman.arraytask4.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    public static final Warehouse instance = new Warehouse();
    private Map<Integer, ArrayStatistics> map = new HashMap<>();

    public Warehouse() {
    }

    public static Warehouse getInstance(){
        return instance;
    }

    public ArrayStatistics add(Integer key, ArrayStatistics value){
        return map.put(key, value);
    }

    public ArrayStatistics delete(Integer key){
        return map.remove(key);
    }
}
