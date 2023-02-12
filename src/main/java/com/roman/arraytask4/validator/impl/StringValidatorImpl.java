package com.roman.arraytask4.validator.impl;

import com.roman.arraytask4.validator.StringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidatorImpl implements StringValidator {
    static Logger logger = LogManager.getLogger();
    private static final String INT_REG_EX = "\\d+";

    @Override
    public boolean validateNumber(String string) {
        boolean matchInt = string.matches(INT_REG_EX);
        if (!matchInt) {
            logger.log(Level.WARN, "Bad match int");
        }
        return matchInt;
    }
}
