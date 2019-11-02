package com.sda.solid.open_close.after;

import java.security.InvalidParameterException;

public class SimpleCalculator implements ICalculator {

    @Override
    public void calculate(IOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("some message");
        }

        operation.performOperation();
    }
}
