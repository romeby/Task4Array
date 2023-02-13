package com.roman.arraytask4.reader;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;

public interface ReadFromFile {
    CustomArray arrayReader(String filename) throws CustomException;

}
