package com.roman.arraytask4.reader.impl;

import com.roman.arraytask4.entity.OwnArray;
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
    public OwnArray arrayReader(String filename) throws CustomException {
        OwnArray array = new OwnArray();
        StringValidator stringValidator = new StringValidatorImpl();
        int[] ints;
        int[] tempArr = {};
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
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateNumber(splitedString[i])) {
                        ints[i] = Integer.parseInt(splitedString[i]);
                        logger.log(Level.INFO, ints[i]);
                        intCounter++;
                    }
                }
                tempArr = Arrays.copyOfRange(ints,0,intCounter);
            } else {
                logger.log(Level.WARN, "No data. File is empty");
            }
            array.setArray(tempArr);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
            throw new CustomException("File is empty or File not Found");
        }
        return array;
    }
}
