package com.sda.solid.open_close.before;

public class Subtraction implements IOperation {

    public double firstOperand;
    public double secondOperand;
    public double result;

    public Subtraction(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
