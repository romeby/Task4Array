package com.roman.arraytask4.reader.impl;

import com.roman.arraytask4.entity.CustomArray;
import com.roman.arraytask4.exception.CustomException;
import com.roman.arraytask4.reader.ReadFromFile;
import com.roman.arraytask4.validator.StringValidator;
import com.roman.arraytask4.validator.impl.StringValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class ReadFromFileImpl implements ReadFromFile {
    static Logger logger = LogManager.getLogger();
    private static final String ARRAY_INPUT_FILE_PATH = "data\\dataArray.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public CustomArray arrayReader(String filename) throws CustomException {
        CustomArray array = new CustomArray();
        int[] ints;
        Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            logger.log(Level.WARN, "File does not exist.");
            filename = ARRAY_INPUT_FILE_PATH;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            String stringTmp = bufferedReader.readLine();
            if (stringTmp != null) {
                String[] splitedString = stringTmp.split(SEPARATOR);
                ints = new int[splitedString.length];
                int intCounter = 0;
                StringValidator stringValidator = new StringValidatorImpl();
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateNumber(splitedString[i])) {
                        ints[intCounter] = Integer.parseInt(splitedString[i]);
                        intCounter++;
                    }
                }
                int[] tempArr = Arrays.copyOf(ints, intCounter);
                array.setArray(tempArr);
            } else {
                logger.log(Level.WARN, "No data. File is empty");
            }

        } catch (IOException ex){
            ex.printStackTrace(System.out);
            throw new CustomException("File is empty or File not Found");
        }
        return array;
    }
}
