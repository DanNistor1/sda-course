package com.sda.solid.open_close.after;

// classes (or methods) should be open for extension
// once written they should only be touched to fix errors
// new functionality should go into new derived classes
public class DemoOpenClosed {

    public static void main(String[] args) {

        IOperation addition = new Addition(1, 2);
        IOperation subtraction = new Subtraction(4, 2);
        IOperation multiplication = new Multiplication(3, 3);

        ICalculator calculator = new SimpleCalculator();
        calculator.calculate(addition);
        calculator.calculate(subtraction);
        calculator.calculate(multiplication);
    }
}
