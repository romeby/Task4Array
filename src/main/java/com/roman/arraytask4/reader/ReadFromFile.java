package com.roman.arraytask4.reader;

import com.roman.arraytask4.entity.OwnArray;
import com.roman.arraytask4.exception.CustomException;

public interface ReadFromFile {
    OwnArray arrayReader(String filename) throws CustomException;

}
